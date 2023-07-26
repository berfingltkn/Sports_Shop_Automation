package application;

import java.math.BigDecimal;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class cartProductController {
	
		public cartProductController() {
	        baglanti=VeritabaniUtil.Baglan();
	    }

	    Connection baglanti=null;
	    PreparedStatement sorguIfadesi=null;
	    ResultSet getirilen=null;
	    String sql;
	 
	    
	    gettersetter_products prodData;
	    private Image image;
	    
	    public void setData(gettersetter_products prodData) {
	    	this.prodData=prodData;
	    	
	    	label_productName.setText(prodData.getName());
	    	label_productprice.setText(String.valueOf(prodData.getPrice()));
	    	String path="File:"+ prodData.getImage();
	    	image=new Image(path,123,80,false,true);
	    	imageviewAna.setImage(image);
	    	
	    }
	 
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchor_cartPage;

    @FXML
    private Button btn_addcart;

    @FXML
    private ChoiceBox<String> choice_Size;

    @FXML
    private ImageView imageviewAna;

    @FXML
    private Label label_productName;

    @FXML
    private Label label_productprice;

    @FXML
    void ChoiceSizeAction(MouseEvent event) {

    }

    @FXML
    void addcartButtonAction(ActionEvent event) {
        
        gettersetter_customer a=new gettersetter_customer();
sql="INSERT INTO cart(Pname,price,image,size,Cname) values (Pname=?,price=?,image=?,size=?,Cname=?)";
try {
	Image image=imageviewAna.getImage();
	String imageurl=image.getUrl();
	sorguIfadesi=baglanti.prepareStatement(sql);
	CustomerController customer=new CustomerController();
	LoginController login=new LoginController();

	sorguIfadesi.setString(1, label_productName.getText().trim());
	BigDecimal price = new BigDecimal(label_productprice.getText().trim());
	sorguIfadesi.setBigDecimal(2, price);
	sorguIfadesi.setString(3, imageurl);
	sorguIfadesi.setString(4, choice_Size.getValue().trim());
	String customerText=a.getCname();
	//String loginText=login.getTextField().getText().trim();
	sorguIfadesi.setString(5,customerText);
	//sorguIfadesi.setString(6,loginText);
	

	System.out.println(label_productprice.getText().trim());
	System.out.println(imageurl);
	System.out.println(label_productName.getText().trim());
	System.out.println(choice_Size.getValue().trim());
	System.out.println(customerText);
	//System.out.println(loginText);
	
	 int rowsAffected = sorguIfadesi.executeUpdate();
        if (rowsAffected == 0) {
           
            
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Error!");
            alert.show();
        }
        else {
        	
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Employee added.");
            alert.show();
        }
    } catch (SQLException e) {
        System.err.println("Hata nın ayrıntısı:");
        e.printStackTrace();
    }
    }

    @FXML
    void initialize() {
    	String sql1="SELECT size from products where size='standart' AND Pname=?";
    	
try {
	       
			sorguIfadesi=baglanti.prepareStatement(sql1);
			sorguIfadesi.setString(1, label_productName.getText().trim());
			
			if(sorguIfadesi.equals("standart")) {
				 ObservableList<String> sizes = FXCollections.observableArrayList("standart");
			        choice_Size.setItems(sizes);
			}
			else {
				ObservableList<String> sizes = FXCollections.observableArrayList(
			            "XXS","XS", "S", "M", "L", "XL", "XXL"
			        );
			        choice_Size.setItems(sizes);
			}
			
		   
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
    	
    }
       

    }

