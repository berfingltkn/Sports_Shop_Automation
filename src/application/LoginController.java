package application;

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.*;

import com.IsteMySQL.Util.VeritabaniUtil;
public class LoginController {
	
	//baglanti yapilsin.
	public  LoginController() {
		baglanti=VeritabaniUtil.Baglan();
		
	}
	
	public TextField getTextField() {
	    if (txt_idN == null) {
	        txt_idN = new TextField();
	    }
	    return txt_idN;
	}

    @FXML
    private AnchorPane anchor;

    @FXML
    private AnchorPane anchor_alt;

    @FXML
    private AnchorPane anchor_create;

    @FXML
    private AnchorPane anchor_enalt;

    @FXML
    private AnchorPane anchor_forgottenPass;

    @FXML
    private AnchorPane anchor_ust;

    @FXML
    private Button btn_change;

    @FXML
    private Button button_create;

    @FXML
    private Button button_login;

    @FXML
    private Button button_signin;

    @FXML
    private Button button_turnback;

    @FXML
    private Button button_turnback1;

    @FXML
    private ComboBox<String> combo_gender;

    @FXML
    private ComboBox<String> combo_who;

    @FXML
    private Text forgottenPass;

    @FXML
    private Text labelID;

    @FXML
    private Text labelWho;

    @FXML
    private Text labelpass;

    @FXML
    private TextField txt_CidNumber;

    @FXML
    private TextField txt_Cmail;

    @FXML
    private TextField txt_Cname;

    @FXML
    private PasswordField txt_Cpass;

    @FXML
    private TextField txt_Cphone;

    @FXML
    private TextField txt_Csurname;

    @FXML
    private TextField txt_birth;

    @FXML
    private TextField txt_city;

    @FXML
    private PasswordField txt_cnewpass;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_idN;
    

    @FXML
    private TextField txt_name;

    @FXML
    private TextField txt_number;

    @FXML
    private PasswordField txt_pass;

    @FXML
    private TextField txt_surname;

    Connection baglanti=null;
    PreparedStatement sorguIfadesi=null;
    ResultSet getirilen=null;
    String sql;
//PreparedStatement nesnesi, önişlemeli SQL ifadelerini yürütmek için kullanılır.
//Bu ifadeler, veri tabanına göndermeden önce bir veya daha fazla parametre ile değiştirilmesi gereken SQL ifadeleridir.    
   
    //ResultSet varolan sonuçları getirir. c# daki dataset gibidir.
    //ResultSet kullanılarak veritabanından getirilen veriler işlenir. Veriler ResultSet e yazılır.
    
    
    
    @FXML
    void ChangeClicked(MouseEvent event) {
    	
    	if(combo_who.getValue().equals("Admin")) {
    		sql="update admin set aPassword=? where aName=? AND aSurname=? AND aIDNumber=? AND aPhone=? AND aEmail=?";
    		try {
    			
				sorguIfadesi=baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_cnewpass.getText().trim());
				sorguIfadesi.setString(2, txt_Cname.getText().trim());
				sorguIfadesi.setString(3, txt_Csurname.getText().trim());
				sorguIfadesi.setString(4, txt_CidNumber.getText().trim());
				sorguIfadesi.setString(5, txt_Cphone.getText().trim());
				sorguIfadesi.setString(6, txt_Cmail.getText().trim());
				
				 int rowsAffected = sorguIfadesi.executeUpdate();
			        if (rowsAffected == 0) {
			            // Güncelleme işlemi başarısız oldu
			            System.out.println("The entered information is incorrect.");
			            Alert alert = new Alert(AlertType.INFORMATION);
			            alert.setTitle("Information Message");
			            alert.setHeaderText(null);
			            alert.setContentText("The entered information is incorrect.");
			            alert.show();
			        }
			        else {
			        	System.out.println("The password was changed.");
			            Alert alert = new Alert(AlertType.INFORMATION);
			            alert.setTitle("Information Message");
			            alert.setHeaderText(null);
			            alert.setContentText("The password was changed.");
			            alert.show();
			        }
			    } catch (SQLException e) {
			        System.err.println("Hata nın ayrıntısı:");
			        e.printStackTrace();
			    }
    	}
    	
    	
    	
    		else if(combo_who.getValue().equals("Customer")) {
    			sql="update customer set Cpassword=? where Cname=? AND Csurname=? AND CIdNumber=? AND CphoneNumber=? AND Cemail=?";
    			try {
        			
    				sorguIfadesi=baglanti.prepareStatement(sql);
    				sorguIfadesi.setString(1, txt_cnewpass.getText().trim());
    				sorguIfadesi.setString(2, txt_Cname.getText().trim());
    				sorguIfadesi.setString(3, txt_Csurname.getText().trim());
    				sorguIfadesi.setString(4, txt_CidNumber.getText().trim());
    				sorguIfadesi.setString(5, txt_Cphone.getText().trim());
    				sorguIfadesi.setString(6, txt_Cmail.getText().trim());
    				
    				 int rowsAffected = sorguIfadesi.executeUpdate();
    			        if (rowsAffected == 0) {
    			            // Güncelleme işlemi başarısız oldu
    			            System.out.println("The entered information is incorrect.");
    			            Alert alert = new Alert(AlertType.INFORMATION);
    			            alert.setTitle("Information Message");
    			            alert.setHeaderText(null);
    			            alert.setContentText("The entered information is incorrect.");
    			            alert.show();
    			        }
    			        else {
    			        	System.out.println("The password was changed.");
    			            Alert alert = new Alert(AlertType.INFORMATION);
    			            alert.setTitle("Information Message");
    			            alert.setHeaderText(null);
    			            alert.setContentText("The password was changed.");
    			            alert.show();
    			        }
    			    } catch (SQLException e) {
    			        System.err.println("Hata nın ayrıntısı:");
    			        e.printStackTrace();
    			    }
    	}
    	
    	
    		
    }
    
    
    @FXML
    void ChangeAction(ActionEvent event) {
    	
    }

    @FXML
    void CreateAction(ActionEvent event) {
    	if(combo_who.getValue().equals("Customer")) {
    			sql="insert into customer(Cname,Csurname,CIdNumber,Cpassword,Cgender,Cbirth,Ccity,CphoneNumber,Cemail) values(?,?,?,?,?,?,?,?,?)";
    			try {
    				String selectedGender = combo_gender.getValue();
    				sorguIfadesi=baglanti.prepareStatement(sql);
    				sorguIfadesi.setString(1, txt_name.getText().trim());
    				sorguIfadesi.setString(2, txt_surname.getText().trim());
    				sorguIfadesi.setString(3, txt_id.getText().trim());
    				sorguIfadesi.setString(4, txt_Cpass.getText().trim());
    				sorguIfadesi.setString(5, selectedGender);
    				sorguIfadesi.setString(6, txt_birth.getText().trim());
    				sorguIfadesi.setString(7, txt_city.getText().trim());
    				sorguIfadesi.setString(8, txt_number.getText().trim());
    				sorguIfadesi.setString(9, txt_email.getText().trim());
    				
    				 int rowsAffected = sorguIfadesi.executeUpdate();
    			        if (rowsAffected == 0) {
    			            // Güncelleme işlemi başarısız oldu
    			            System.out.println("The entered information is incorrect.");
    			            Alert alert = new Alert(AlertType.INFORMATION);
    			            alert.setTitle("Information Message");
    			            alert.setHeaderText(null);
    			            alert.setContentText("Failed");
    			            alert.show();
    			        }
    			        else {
    			        	System.out.println("Update Successful");
    			            Alert alert = new Alert(AlertType.INFORMATION);
    			            alert.setTitle("Information Message");
    			            alert.setHeaderText(null);
    			            alert.setContentText("Update Successful");
    			            alert.show();
    			        }
    			    } catch (SQLException e) {
    			        System.err.println("Hata nın ayrıntısı:");
    			        e.printStackTrace();
    			    }
    	}
    	
    }

    @FXML
    void ForgottenPassClick(MouseEvent event) {
    	anchor_forgottenPass.setVisible(true);
    	combo_who.setVisible(false);
    	txt_idN.setVisible(false);
    	txt_pass.setVisible(false);
    	labelWho.setVisible(false);
    	labelID.setVisible(false);
    	labelpass.setVisible(false);
    	button_login.setVisible(false);
    	button_signin.setVisible(false);
    	forgottenPass.setVisible(false);
    	
    	
    	}

    @FXML
    void Login_action(ActionEvent event) {
 
    	if(combo_who.getValue().equals("Admin")) {
    		sql="select * from admin where aIDNumber=? AND aPassword=?";
    		try {
				sorguIfadesi=baglanti.prepareStatement(sql);//belirtilen sql sorgusunu
				//veritabanına gönderir.
				sorguIfadesi.setString(1, txt_idN.getText().trim());
				//trim() bir String nesnesinin başındaki ve sonundaki boşlukları (whitespace karakterleri) kaldırmak için kullanılan bir yöntemdir.
				sorguIfadesi.setString(2, txt_pass.getText().trim());
				//setString() yöntemi, PreparedStatement nesnesindeki parametre değerlerini belirlemek için kullanılır.
				
			    ResultSet getirilen=sorguIfadesi.executeQuery();
			    //PreparedStatement sınıfı ile hazırlanan bir SQL sorgusunu veritabanına göndererek sonuçlarını bir ResultSet nesnesi olarak getirmeyi amaçlar.
			    
    		// herhangi bir yapı geliyor mu gelmiyor mu diye bakmalıyız :
			    
			    if(!getirilen.next()) {
			    	
			    	System.out.println("username or password is incorrect");
			    	Alert alert=new Alert(AlertType.INFORMATION);
			    	alert.setTitle("Information Message");
			    	alert.setHeaderText(null);
			    	alert.setContentText("Username or Password is Incorrect");
			    	alert.show();
			    }
			    else {
			    	// eğer giriş bilgileri doğruysa admin page i aç
			    	Parent root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
			    	Scene newScene = new Scene(root);
			    	
			    	Stage newWindow = new Stage();
			    	newWindow.setTitle("Admin Page");
			    	newWindow.setScene(newScene);

			    	newWindow.show();
			    	
			    }
    		
    		} catch (Exception e) {
    			System.err.println("Hata nın ayrıntısı:");
    		    e.printStackTrace();
    	}
    		
    		txt_idN.clear();
    		txt_pass.clear();
    	}
    	
    	
    	
    		else if(combo_who.getValue().equals("Customer")) {
    		sql="select * from customer where CIdNumber=? AND Cpassword=?";
    		try {
				sorguIfadesi=baglanti.prepareStatement(sql);
				sorguIfadesi.setString(1, txt_idN.getText().trim());
				sorguIfadesi.setString(2, txt_pass.getText().trim());
			    ResultSet getirilen=sorguIfadesi.executeQuery();
			    
			    if(!getirilen.next()) {
			    
			    	System.out.println("username or password is incorrect");
			    	Alert alert=new Alert(AlertType.INFORMATION);
			    	alert.setTitle("Information Message");
			    	alert.setHeaderText(null);
			    	alert.setContentText("Username or Password is Incorrect");
			    	alert.show();
			    }
			    else {
			    	// eğer giriş bilgileri doğruysa Customer page i aç
			    	Parent root = FXMLLoader.load(getClass().getResource("CustomerPage.fxml"));
			    	Scene newScene = new Scene(root);

			    	Stage newWindow = new Stage();
			    	newWindow.setTitle("Customer Page");
			    	newWindow.setScene(newScene);

			    	newWindow.show();
			    }
    		
    		} catch (Exception e) {
    			System.err.println("Hata nın ayrıntısı:");
    		    e.printStackTrace();
			}
    	}
    	
    	
    	
    	
    	else {
    		
    		
    	}
    }
    @FXML
    void SigninAction(ActionEvent event) {
    	if(combo_who.getValue().equals("")) {
    		Alert alert=new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Information Message");
	    	alert.setHeaderText(null);
	    	alert.setContentText("Please select from the 'who' box");
	    	alert.show();
    	}
    	
    	else {
    	if(combo_who.getValue().equals("Admin")) {
    		Alert alert=new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Information Message");
	    	alert.setHeaderText(null);
	    	alert.setContentText("sorry, admin record cannot be created");
	    	alert.show();
    	}
    	
    	}
    	if(!combo_who.getValue().equals("Admin") && !combo_who.getValue().equals("Employee")) {
    	
    	anchor_create.setVisible(true);
    	combo_who.setVisible(false);
    	txt_idN.setVisible(false);
    	txt_pass.setVisible(false);
    	labelWho.setVisible(false);
    	labelID.setVisible(false);
    	labelpass.setVisible(false);
    	button_login.setVisible(false);
    	button_signin.setVisible(false);
    	forgottenPass.setVisible(false);
    }
    }
    @FXML
    void TurnBack_Action(MouseEvent event) {
    	anchor_forgottenPass.setVisible(false);
    	combo_who.setVisible(true);
    	txt_idN.setVisible(true);
    	txt_pass.setVisible(true);
    	labelWho.setVisible(true);
    	labelID.setVisible(true);
    	labelpass.setVisible(true);
    	button_login.setVisible(true);
    	button_signin.setVisible(true);
    	forgottenPass.setVisible(true);
    }

    @FXML
    void turnBack1_Action(MouseEvent event) {
    	anchor_create.setVisible(false);
    	combo_who.setVisible(true);
    	txt_idN.setVisible(true);
    	txt_pass.setVisible(true);
    	labelWho.setVisible(true);
    	labelID.setVisible(true);
    	labelpass.setVisible(true);
    	button_login.setVisible(true);
    	button_signin.setVisible(true);
    	forgottenPass.setVisible(true);
    }

    @FXML
    void initialize() {
        
    	ObservableList<String> items= FXCollections.observableArrayList("Admin","Customer");
        combo_who.setItems(items);
    	
        ObservableList<String> obserL= FXCollections.observableArrayList("Male","Female");
        combo_gender.setItems(obserL);
    	

    }
   

}

