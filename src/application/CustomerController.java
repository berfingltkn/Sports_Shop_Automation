package application;

import java.awt.Label;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.IsteMySQL.Util.VeritabaniUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CustomerController {
	
		public CustomerController() {
	        baglanti=VeritabaniUtil.Baglan();
	    }

		 Connection baglanti=null;
		    PreparedStatement sorguIfadesi=null;
		    ResultSet getirilen=null;
		    String sql;
	  
	    
	   
	 
	 private ObservableList<gettersetter_products> cardListData=FXCollections.observableArrayList();
	 
    @FXML
    private ResourceBundle resources;

  
    @FXML
    private AnchorPane anchor_aboutus;

    @FXML
    private AnchorPane anchor_ana;

    @FXML
    private AnchorPane anchor_badminton;

    @FXML
    private AnchorPane anchor_basketball;

    @FXML
    private AnchorPane anchor_bicycle;

    @FXML
    private AnchorPane anchor_cart;

    @FXML
    private AnchorPane anchor_football;

    @FXML
    private AnchorPane anchor_girisCategory;

    @FXML
    private AnchorPane anchor_historyorders;

    @FXML
    private AnchorPane anchor_pilates;

    @FXML
    private AnchorPane anchor_setting;

    @FXML
    private AnchorPane anchor_swimming;

    @FXML
    private AnchorPane anchor_tennis;

    @FXML
    private AnchorPane anchor_voleyball;
    @FXML
    private AnchorPane anchor_all;

    @FXML
    private GridPane menu_gridpane;

    @FXML
    private GridPane menu_gridpane1;

    @FXML
    private GridPane menu_gridpane11;

    @FXML
    private GridPane menu_gridpane12;

    @FXML
    private GridPane menu_gridpane13;

    @FXML
    private GridPane menu_gridpane14;

    @FXML
    private GridPane menu_gridpane15;

    @FXML
    private GridPane menu_gridpane16;

    @FXML
    private GridPane menu_gridpane17;
    @FXML
    private Button button_save;
    @FXML
    private Button btn_aboutus;

    @FXML
    private Button btn_all;

    @FXML
    private Button btn_badminton;

    @FXML
    private Button btn_basketball;

    @FXML
    private Button btn_bicycle;

    @FXML
    private Button btn_cart;

    @FXML
    private Button btn_football;

    @FXML
    private Button btn_history;

    @FXML
    private Button btn_pilates;

    @FXML
    private Button btn_products;

    @FXML
    private Button btn_setting;

    @FXML
    private Button btn_swimm;

    @FXML
    private Button btn_tennis;

    @FXML
    private Button btn_voleyball;

    @FXML
    private Button button_out;

    @FXML
    private Button btn_deleteSelected;
    @FXML
    private Button btn_remove;
    @FXML
    private Button btn_pay;
    @FXML
    private TextField txt_adressC;

    @FXML
    private TextField txt_birthC;

    @FXML
    private TextField txt_cityC;

    @FXML
    private TextField txt_emailC;

    @FXML
    private TextField txt_genderC;

    @FXML
    private TextField txt_idNoc;

    @FXML
    private TextField txt_nameC;

    @FXML
    private TextField txt_passC;

    @FXML
    private TextField txt_phanoenoC;

    @FXML
    private TextField txt_surnameC;

    @FXML
    private TableColumn<gettersetter_historyorder, String> column_categoryproduct;

    @FXML
    private TableColumn<gettersetter_historyorder, Integer> column_orderFee;

    @FXML
    private TableColumn<gettersetter_historyorder, String> column_orderdate;

    @FXML
    private TableColumn<gettersetter_historyorder, String> column_orderstatus;

    @FXML
    private TableColumn<gettersetter_historyorder, String> column_productname;
    
    @FXML
    private TableView<gettersetter_historyorder> view_history;
    @FXML
    private TableColumn<gettersetter_cart, String> column_pname;

    @FXML
    private TableColumn<gettersetter_cart, Integer> column_price;
    @FXML
    private TableColumn<gettersetter_cart, String> column_image;

    @FXML
    private TableColumn<gettersetter_cart, String> column_size;

    @FXML
    private TableView<gettersetter_cart> viewCart;
    
    @FXML
    private ImageView imageInstagram;

    @FXML
    private ImageView imageMail;

    @FXML
    private ImageView imageview_location;
  

    //@FXML
   // private Label label_total;
    
    public TextField getTextField() {
        if (txt_nameC == null) {
            txt_nameC = new TextField();
        }
        return txt_nameC;
    }
    @FXML
    void payAction(ActionEvent event) {

    }
    @FXML
    void removeAction(ActionEvent event) {

    }
    @FXML
    void deleteSelectedAction(ActionEvent event) {

    }
  
    @FXML
    void viewCartClicked(MouseEvent event) {
     gettersetter_cart selectedProduct = viewCart.getSelectionModel().getSelectedItem();
     String imageName=selectedProduct.getImage();
     Image image=new Image(imageName);
     imageview_cart.setImage(image);
    }

    @FXML
    void SaveButtonAction(ActionEvent event) {
sql="Update customer set Csurname=?,CIdNumber=?,Cpassword=?,Cgender=?,Cbirth=?,Ccity=?,CphoneNumber=?,Cemail=?,adress=? where Cname=?;";
    	
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			
			
			sorguIfadesi.setString(1, txt_surnameC.getText().trim());
			sorguIfadesi.setString(2, txt_idNoc.getText().trim());
			sorguIfadesi.setString(3, txt_passC.getText().trim());
			sorguIfadesi.setString(4, txt_genderC.getText().trim());
			sorguIfadesi.setString(5, txt_birthC.getText().trim());
			sorguIfadesi.setString(6, txt_cityC.getText().trim());
			sorguIfadesi.setString(7, txt_phanoenoC.getText().trim());
			sorguIfadesi.setString(8, txt_emailC.getText().trim());
			sorguIfadesi.setString(9, txt_adressC.getText().trim());
			sorguIfadesi.setString(10, txt_nameC.getText().trim());
			
			
			 int rowsAffected = sorguIfadesi.executeUpdate();
		        if (rowsAffected == 0) {
		           
		            System.out.println("The entered information is incorrect.");
		            Alert alert = new Alert(AlertType.INFORMATION);
		            alert.setTitle("Information Message");
		            alert.setHeaderText(null);
		            alert.setContentText("Error!");
		            alert.show();
		        }
		        else {
		        	System.out.println("The password was changed.");
		            Alert alert = new Alert(AlertType.INFORMATION);
		            alert.setTitle("Information Message");
		            alert.setHeaderText(null);
		            alert.setContentText("Successfull.");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		// bu kısım update olduktan sonra bilgilerin guncel haliyle goruntulenmesini saglar
		  sql = "select * from customer";
		     ObservableList<gettersetter_customer> kayitlarliste = FXCollections.observableArrayList();
		     try {
		         sorguIfadesi = baglanti.prepareStatement(sql);
		         getirilen = sorguIfadesi.executeQuery();
		         while (getirilen.next()) {
		             gettersetter_customer kayit = new gettersetter_customer(getirilen.getString("Cname"), getirilen.getString("Csurname"), getirilen.getInt("CIdNumber"), getirilen.getString("Cpassword"),getirilen.getString("Cgender"),getirilen.getString("Cbirth"), getirilen.getString("Ccity"),getirilen.getInt("CphoneNumber"), getirilen.getString("Cemail"),getirilen.getString("adress"));
		             kayitlarliste.add(kayit);
		         }

		         if (!kayitlarliste.isEmpty()) {
		             gettersetter_customer kayit = kayitlarliste.get(0);
		             txt_nameC.setText(kayit.getCname());
		             txt_surnameC.setText(kayit.getCsurname());
		             txt_idNoc.setText(String.valueOf(kayit.getCIdNumber()));
		             txt_passC.setText(kayit.getCpassword());
		             
		             txt_genderC.setText(kayit.getCgender());
		             txt_birthC.setText(kayit.getBirth());
		             txt_cityC.setText(kayit.getCcity());
		             txt_phanoenoC.setText(String.valueOf(kayit.getCphoneNumber()));
		             txt_emailC.setText(kayit.getCemail());
		             txt_adressC.setText(kayit.getAdress());
		         }
		     } catch (Exception e) {
		         System.out.println(e.getMessage().toString());
		     }

    }
    
    public ObservableList<gettersetter_products> menuGetData(String sqla){
    	
    	
    	ObservableList<gettersetter_products> listData=FXCollections.observableArrayList();
    	try {
 	       
			sorguIfadesi=baglanti.prepareStatement(sqla);
		getirilen=sorguIfadesi.executeQuery();
			
			gettersetter_products prod;
			while(getirilen.next()) {
				
				prod=new gettersetter_products(getirilen.getString("Pname"),
						getirilen.getInt("price"),
						getirilen.getString("image"),
						getirilen.getString("category"),
						getirilen.getString("size"));
				
				      listData.add(prod);
			}
		   
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
    	
    	return listData;
    }
    public void menuDisplayCard(String sql, GridPane gridpane) {
        cardListData.clear();
        cardListData.addAll(menuGetData(sql));

        int row = 0;
        int column = 0;

        gridpane.getRowConstraints().clear();
        gridpane.getColumnConstraints().clear();
        for (int q = 0; q < cardListData.size(); q++) {
            try {
                FXMLLoader load = new FXMLLoader();
                load.setLocation(getClass().getResource("cartProduct.fxml"));
                AnchorPane pane = load.load();
                cartProductController cardC = load.getController();
                cardC.setData(cardListData.get(q));

                if (column == 2) {
                    column = 0;
                    row += 1;
                }
                gridpane.add(pane, column++, row);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }
    	

    @FXML
    void ProductsButtonAction(ActionEvent event) {
anchor_girisCategory.setVisible(true);
anchor_aboutus.setVisible(false);
anchor_all.setVisible(false);
anchor_badminton.setVisible(false);
anchor_basketball.setVisible(false);
anchor_bicycle.setVisible(false);
anchor_cart.setVisible(false);
anchor_football.setVisible(false);
anchor_historyorders.setVisible(false);
anchor_pilates.setVisible(false);
anchor_setting.setVisible(false);
anchor_swimming.setVisible(false);
anchor_tennis.setVisible(false);
anchor_voleyball.setVisible(false);

    }

    @FXML
    void SignOut(MouseEvent event) {

    }

    @FXML
    void aboutusButtonAction(ActionEvent event) {
    	anchor_aboutus.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	
    	anchor_all.setVisible(false);
    	anchor_badminton.setVisible(false);
    	anchor_basketball.setVisible(false);
    	anchor_bicycle.setVisible(false);
    	anchor_cart.setVisible(false);
    	anchor_football.setVisible(false);
    	anchor_historyorders.setVisible(false);
    	anchor_pilates.setVisible(false);
    	anchor_setting.setVisible(false);
    	anchor_swimming.setVisible(false);
    	anchor_tennis.setVisible(false);
    	anchor_voleyball.setVisible(false);
    }

    @FXML
    void allAction(ActionEvent event) {
    	anchor_all.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	menuDisplayCard("SELECT * FROM products WHERE category='Clothes-Basketball' OR category='Clothes-Bicylce' OR category='Clothes-Voleyball' OR category='Clothes-Swimm' OR category='Clothes-Tennis' OR category='Clothes-Yoga' OR category='Clothes-Futboll'",menu_gridpane);
    
    }

    @FXML
    void badmintonButtonAction(ActionEvent event) {
anchor_badminton.setVisible(true);
anchor_girisCategory.setVisible(false);
menuDisplayCard("SELECT * FROM products where category='Badminton'",menu_gridpane17);
    }

    @FXML
    void basketballButtonAction(ActionEvent event) {
    	anchor_basketball.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	
    	menuDisplayCard("SELECT * FROM products where category='Basketball'",menu_gridpane14);
    }

    @FXML
    void bicycleButtonAction(ActionEvent event) {
    	anchor_bicycle.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	menuDisplayCard("SELECT * FROM products where category='Bicycle'",menu_gridpane16);
    }

    @FXML
    void cartButtonAction(ActionEvent event) {
    	anchor_cart.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	anchor_aboutus.setVisible(false);
    	anchor_all.setVisible(false);
    	anchor_badminton.setVisible(false);
    	anchor_basketball.setVisible(false);
    	anchor_bicycle.setVisible(false);
    	
    	anchor_football.setVisible(false);
    	anchor_historyorders.setVisible(false);
    	anchor_pilates.setVisible(false);
    	anchor_setting.setVisible(false);
    	anchor_swimming.setVisible(false);
    	anchor_tennis.setVisible(false);
    	anchor_voleyball.setVisible(false);
    	CartDoldur();
    }

    @FXML
    void footballButtonAction(ActionEvent event) {
    	anchor_football.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	menuDisplayCard("SELECT * FROM products where category='Football'",menu_gridpane15);
    }

    @FXML
    void historyButtonAction(ActionEvent event) {
    	anchor_historyorders.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	anchor_aboutus.setVisible(false);
    	anchor_all.setVisible(false);
    	anchor_badminton.setVisible(false);
    	anchor_basketball.setVisible(false);
    	anchor_bicycle.setVisible(false);
    	anchor_cart.setVisible(false);
    	anchor_football.setVisible(false);
    	
    	anchor_pilates.setVisible(false);
    	anchor_setting.setVisible(false);
    	anchor_swimming.setVisible(false);
    	anchor_tennis.setVisible(false);
    	anchor_voleyball.setVisible(false);
    }

    @FXML
    void outAction(ActionEvent event) {
    	 Stage AdminStage=(Stage) button_out.getScene().getWindow();
         AdminStage.close();
    }

    @FXML
    void pilatesButtonAction(ActionEvent event) {
    	anchor_pilates.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	menuDisplayCard("SELECT * FROM products where category='Yoga'",menu_gridpane12);
  
    }

    @FXML
    void settingButtonAction(ActionEvent event) {
    	anchor_setting.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	anchor_aboutus.setVisible(false);
    	anchor_all.setVisible(false);
    	anchor_badminton.setVisible(false);
    	anchor_basketball.setVisible(false);
    	anchor_bicycle.setVisible(false);
    	anchor_cart.setVisible(false);
    	anchor_football.setVisible(false);
    	anchor_historyorders.setVisible(false);
    	anchor_pilates.setVisible(false);
    	
    	anchor_swimming.setVisible(false);
    	anchor_tennis.setVisible(false);
    	anchor_voleyball.setVisible(false);
    	
    	
    }

    @FXML
    void swimmButtonAction(ActionEvent event) {
    	anchor_swimming.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	menuDisplayCard("SELECT * FROM products where category='Swimm'",menu_gridpane1);
  
    }

    @FXML
    void tennisButtonAction(ActionEvent event) {
    	anchor_tennis.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	menuDisplayCard("SELECT * FROM products where category='Tennis'",menu_gridpane13);
  
    }

    @FXML
    void voleyballButtonAction(ActionEvent event) {
    	anchor_voleyball.setVisible(true);
    	anchor_girisCategory.setVisible(false);
    	menuDisplayCard("SELECT * FROM products where category='Voleyball'",menu_gridpane11);
  
    }
    public void OrdersHistoryDoldur() {

    	sql="select orderDate,orderStatus,orderFee,productName,productCategory from orders where CustomerIDno=?";
    	ObservableList<gettersetter_historyorder> kayitlarliste = FXCollections.observableArrayList();

    	try {
    		
    	
    	    LoginController loginController = new LoginController();
    	    
    	    
    	    sorguIfadesi = baglanti.prepareStatement(sql);
    	    sorguIfadesi.setString(1, loginController.getTextField().getText().trim());
    	    ResultSet getirilen = sorguIfadesi.executeQuery(); // sorguyu çalıştırıyoruz
    	    
    	    while (getirilen.next()) {
    		    kayitlarliste.add(new gettersetter_historyorder(getirilen.getString("orderDate"),getirilen.getString("orderStatus"), getirilen.getInt("orderFee"), 
        	            getirilen.getString("productName"), getirilen.getString("productCategory")));	

    	     
    	        
    	    }
    	    column_orderdate.setCellValueFactory(new PropertyValueFactory<gettersetter_historyorder, String>("orderDate"));
    	    column_orderstatus.setCellValueFactory(new PropertyValueFactory<gettersetter_historyorder, String>("orderStatus"));
    	    column_orderFee.setCellValueFactory(new PropertyValueFactory<gettersetter_historyorder, Integer>("orderFee"));
    	    column_productname.setCellValueFactory(new PropertyValueFactory<gettersetter_historyorder, String>("productName"));
    	    column_categoryproduct.setCellValueFactory(new PropertyValueFactory<gettersetter_historyorder, String>("productCategory"));
    	    view_history.setItems(kayitlarliste);
    	}
    	catch (Exception e) {
    	    System.out.print(e.getMessage().toString());
    	}
    	
    	}
    public void CartDoldur() {

    	sql="select Pname,price,image,size from cart where CidNo=? OR Cname=?";
    	ObservableList<gettersetter_cart> kayitlarliste = FXCollections.observableArrayList();

    	try {
    		
    	
    	    LoginController loginController = new LoginController();
    	    
    	    
    	    sorguIfadesi = baglanti.prepareStatement(sql);
    	    sorguIfadesi.setString(1, loginController.getTextField().getText().trim());
    	    sorguIfadesi.setString(2, txt_nameC.getText().trim());
    	    ResultSet getirilen = sorguIfadesi.executeQuery(); // sorguyu çalıştırıyoruz
    	    
    	    while (getirilen.next()) {
    		    kayitlarliste.add(new gettersetter_cart(getirilen.getString("Pname"), getirilen.getInt("price"), 
        	            getirilen.getString("image"), getirilen.getString("size")));	

    	     
    	        
    	    }
    	    column_pname.setCellValueFactory(new PropertyValueFactory<gettersetter_cart, String>("Pname"));
    	    column_price.setCellValueFactory(new PropertyValueFactory<gettersetter_cart, Integer>("price"));
    	    column_image.setCellValueFactory(new PropertyValueFactory<gettersetter_cart, String>("image"));
    	    column_size.setCellValueFactory(new PropertyValueFactory<gettersetter_cart, String>("size"));
    	    
    	    viewCart.setItems(kayitlarliste);
    	}
    	catch (Exception e) {
    	    System.out.print(e.getMessage().toString());
    	}
    	
    	}
    @FXML
    void initialize() {
    	OrdersHistoryDoldur();
    	LoginController loginController = new LoginController();
    	sql = "select * from customer where CIdNumber=?";
        ObservableList<gettersetter_customer> kayitlarliste = FXCollections.observableArrayList();
        try {
        	sorguIfadesi = baglanti.prepareStatement(sql);
        	sorguIfadesi.setString(1, loginController.getTextField().getText().trim());
        	System.out.println(loginController.getTextField().getText().trim());
        	getirilen = sorguIfadesi.executeQuery();
            while (getirilen.next()) {
            	gettersetter_customer kayit = new gettersetter_customer(getirilen.getString("Cname"), getirilen.getString("Csurname"), getirilen.getInt("CIdNumber"), getirilen.getString("Cpassword"),  getirilen.getString("Cgender"),getirilen.getString("Cbirth"), getirilen.getString("Ccity"),getirilen.getInt("CphoneNumber"),getirilen.getString("Cemail"),getirilen.getString("adress"));
                kayitlarliste.add(kayit);
            }

            if (!kayitlarliste.isEmpty()) {
                gettersetter_customer kayit = kayitlarliste.get(0);
                txt_nameC.setText(kayit.getCname());
                txt_surnameC.setText(kayit.getCsurname());
                txt_idNoc.setText(String.valueOf(kayit.getCIdNumber()));
                txt_passC.setText(kayit.getCpassword());
                txt_genderC.setText(kayit.getCgender());
                txt_birthC.setText(kayit.getBirth());
                txt_cityC.setText(kayit.getCcity());
                txt_phanoenoC.setText(String.valueOf(kayit.getCphoneNumber()));
                txt_emailC.setText(kayit.getCemail());
                txt_adressC.setText(kayit.getAdress());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
    	
    	
    }
    @FXML
    private ImageView imageview_cart;


}
