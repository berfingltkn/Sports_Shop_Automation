package application;

import java.io.File;
import java.net.URL;
import javafx.collections.FXCollections;
import java.util.ResourceBundle;

import com.IsteMySQL.Util.VeritabaniUtil;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.sql.*;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AdminController {
	public AdminController() {
        baglanti=VeritabaniUtil.Baglan();
    }

    Connection baglanti=null;
    PreparedStatement sorguIfadesi=null;
    ResultSet getirilen=null;
    String sql;
    String sqlemployee;
    String sqltotal;
    String sqlincome;
    private Image image;
    String dosyaURL;
    
    @FXML
    private Button button_orderCancel;
    
    @FXML
    private Button AddOrders_btn;
    
    @FXML
    private SplitPane splitpane1;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Anchor_Customer;

    @FXML
    private Label Income_number;
    @FXML
    private Label lbl_id;
    
    
    @FXML
    private Button Picture;

    @FXML
    private TextField aIDtxt;

    @FXML
    private TextField aMailtxt;

    @FXML
    private TextField aNametxt;

    @FXML
    private TextField aPasstxt;

    @FXML
    private TextField aPhonetxt;

    @FXML
    private TextField aSurnametxt;
    @FXML
    private Button addProduct;

    @FXML
    private AnchorPane anchor_Ana;
    
    @FXML
    private AnchorPane anchor_orders;

    @FXML
    private AnchorPane anchor_Employees;

    @FXML
    private AnchorPane anchor_Products;

    @FXML
    private AnchorPane anchor_Statistics;

    @FXML
    private AnchorPane anchor_dekor;

    @FXML
    private AnchorPane anchor_giris;

    @FXML
    private AnchorPane anchor_setting;

    @FXML
    private AnchorPane anchor_sol;

    @FXML
    private Button btn_Employees;

    @FXML
    private Button btn_costumer;

    @FXML
    private Button btn_orders;

    @FXML
    private Button btn_products;

    @FXML
    private Button btn_statistics;

    @FXML
    private Button btn_statistics1;

    @FXML
    private Button button_Add;

    @FXML
    private Button button_Cinsert;

    @FXML
    private Button button_Cupdate;

    @FXML
    private Button button_Delete;

    @FXML
    private Button button_cDelete;

    @FXML
    private Button button_out;

    @FXML
    private Button button_save;

    @FXML
    private Button button_update;
    @FXML
    private TableColumn<tableview_gettersetter, String> column_adress;

    @FXML
    private TableColumn<tableview_gettersetter, String> column_birth;

    @FXML
    private TableColumn<tableview_gettersetter, String> column_city;

    @FXML
    private TableColumn<tableview_gettersetter, String> column_email;

    @FXML
    private TableColumn<tableview_gettersetter, Integer> column_idN;

    @FXML
    private TableColumn<tableview_gettersetter,String> column_name;

    @FXML
    private TableColumn<tableview_gettersetter, String> column_password;

    @FXML
    private TableColumn<tableview_gettersetter, Integer> column_phone;
    
  
    @FXML
    private TableColumn<gettersetter_products, Integer> column_quentity;

    @FXML
    private TableColumn<gettersetter_products, String> column_size;
    
    @FXML
    private Button deleteProduct;

    @FXML
    private TableColumn<gettersetter_products, Integer> column_pID;
    @FXML
    private TableColumn<gettersetter_products, String> columnimage_products;

    @FXML
    private TableColumn<gettersetter_products, String> column_image; 
    @FXML
    private TableColumn<gettersetter_products, String> column_Pname;

    @FXML
    private TableColumn<gettersetter_products, String> column_category;
    @FXML
    private TableColumn<gettersetter_products, Integer> column_Price;

    @FXML
    private TextField eAdress_txt;

    @FXML
    private TextField eDepaartment_txt;

    @FXML
    private TextField eId_txt;

    @FXML
    private TextField eMail_txt;

    @FXML
    private TextField eName_txt;

    @FXML
    private TextField ePass_txt;

    @FXML
    private TextField ePhone_txt;

    @FXML
    private Label employee_number;

    @FXML
    private TextField fiel_email;

    @FXML
    private TextField field_adress;

    @FXML
    private TextField field_birth;
    

    @FXML
    private TextField field_city;

    @FXML
    private TextField field_id;

    @FXML
    private TextField field_name;

    @FXML
    private TextField field_phone;

    @FXML
    private TextField field_surname;

    @FXML
    private AnchorPane giris1;

    @FXML
    private AnchorPane giris2;
    @FXML
    private LineChart<String,Float> lineChartDaily;

    @FXML
    private AnchorPane giris3;
    @FXML
    private ImageView imageboxP;

    @FXML
    private TextField pImage;

    @FXML
    private TextField pName;

    @FXML
    private TextField pPrice;

    @FXML
    private TextField pQR;

    @FXML
    private TextField pQuentity;

    @FXML
    private TextField pSize;
    @FXML
    private Label product_ID;

    @FXML
    private Button product_update;

    @FXML
    private Label label_id;
    
    @FXML
    private TableView<gettersetter_products> tableview_P;

    @FXML
    private TableColumn<gettersetter_admin2, Integer> idColumn;

    @FXML
    private TableColumn<gettersetter_admin2, String> mailColumn;

    @FXML
    private TableColumn<gettersetter_admin2, String> nameColumn;

    @FXML
    private TableColumn<gettersetter_admin2, String> passColumn;

    @FXML
    private TableColumn<gettersetter_admin2, Integer> phoneColumn;
    @FXML
    private TableColumn<gettersetter_admin2, String> departmentColumn;
    @FXML
    private TableColumn<gettersetter_admin2, String> adressColumn;

    @FXML
    private TableView<tableview_gettersetter> tableView;
    @FXML
    private TableView<gettersetter_admin2> tableview2;

    @FXML
    private Label totalIncome_number;
    @FXML
    private TextField txt_customerID;

    @FXML
    private TextField txt_customerIDNo;

    @FXML
    private TextField txt_customerName;
    @FXML
    private TextField txt_customerIDNo1;

    @FXML
    private TextField txt_orderDate;

    @FXML
    private TextField txt_orderFee;

    @FXML
    private TextField txt_orderStatus;

    @FXML
    private TextField txt_productCategory;

    @FXML
    private TextField txt_productName;
 
    @FXML
    private TableView<gettersetter_orders> view_orders;
    @FXML
    private TableColumn<gettersetter_orders, String> Category_name;

    @FXML
    private TableColumn<gettersetter_orders, Integer> Fee_column;

    @FXML
    private TableColumn<gettersetter_orders, Integer> Id_column;
    
    @FXML
    private TableColumn<gettersetter_orders, String> Pname_column;
    @FXML
    private TableColumn<gettersetter_orders, Integer> cID_Column;

    @FXML
    private TableColumn<gettersetter_orders, Integer> cIDno_column;

    @FXML
    private TableColumn<gettersetter_orders, String> cName_column;

    @FXML
    private TableColumn<gettersetter_orders, Integer> cPhone_column;
    @FXML
    private TableColumn<gettersetter_orders, String> orderDate_column;
    @FXML
    TableColumn<gettersetter_orders, String> status_column;
    
   
    @FXML
    private TextField category_fileld;
    
    @FXML
    void CancelAction(ActionEvent event) {

    	sql="update orders set orderStatus=? where ordersID=?";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1,"order cancel");
			sorguIfadesi.setString(2, lbl_id.getText().trim());
			
		
			
			 int rowsAffected = sorguIfadesi.executeUpdate();
		        if (rowsAffected == 0) {
		            // Güncelleme işlemi başarısız oldu
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
		            alert.setContentText("Successful");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		OrdersDoldur();
    }
    @FXML
    void AddOrderAction(ActionEvent event) {
    	sql="INSERT INTO orders (CustomerName,CustomerID,CustomerIDNo,CustomerPhone,orderDate,orderStatus,orderFee,productName,productCategory) VALUES (?, ?, ?, ?, ?, ?, ?,?,?);";
		
    	try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, txt_customerName.getText().trim());
			sorguIfadesi.setString(2, txt_customerID.getText().trim());
			sorguIfadesi.setString(3, txt_customerIDNo.getText().trim());
			sorguIfadesi.setString(4, txt_customerIDNo1.getText().trim());
			sorguIfadesi.setString(5, txt_orderDate.getText().trim());
			sorguIfadesi.setString(6, txt_orderStatus.getText().trim());
			sorguIfadesi.setString(7, txt_orderFee.getText().trim());
			sorguIfadesi.setString(8, txt_productName.getText().trim());
			sorguIfadesi.setString(9, txt_productCategory.getText().trim());
		
			
			
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
		OrdersDoldur();
		eName_txt.clear();
		eAdress_txt.clear();
		eDepaartment_txt.clear();
		eId_txt.clear();
		eMail_txt.clear();
		ePass_txt.clear();
		ePhone_txt.clear();
    }
 
    
    @FXML
    void PictureAction(ActionEvent event) {
    	
    	FileChooser openfile=new FileChooser();
    	openfile.getExtensionFilters().add(new ExtensionFilter("Open Image File","*png","*jpg"));
    	
    	File file=openfile.showOpenDialog(anchor_Products.getScene().getWindow());
    	if(file!=null) {
    		data.path=file.getAbsolutePath();
    		image=new Image(file.toURI().toString(),75,75,false,true);
    		imageboxP.setImage(image);
    	}

    }
    
    
    @FXML
    void addProductAction(ActionEvent event) {

if(pName.getText().isEmpty()||pPrice.getText().isEmpty()||pQuentity.getText().isEmpty()
		||data.path==null) {

    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Information Message");
    alert.setHeaderText(null);
    alert.setContentText("Please fill all blank fields");
    alert.show();
}
else {
	sql="insert into products (Pname,price,quantity,image,qrcode,category,size) values(?,?,?,?,?,?,?)";
	try {
		
		sorguIfadesi=baglanti.prepareStatement(sql);
		
		sorguIfadesi.setString(1, pName.getText().trim());
		sorguIfadesi.setString(2, pPrice.getText().trim());
		sorguIfadesi.setString(3, pQuentity.getText().trim());
		String path=data.path;
		path=path.replace("\\", "\\\\");
		sorguIfadesi.setString(4, path);
		
		sorguIfadesi.setString(5, pQR.getText().trim());
		sorguIfadesi.setString(6, category_fileld.getText().trim());
		sorguIfadesi.setString(7, pSize.getText().trim());
			
		
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
	            alert.setContentText("Product added.");
	            alert.show();
	        }
	    } catch (SQLException e) {
	        System.err.println("Hata nın ayrıntısı:");
	        e.printStackTrace();
	    }
	
	ProductsDoldur();
	
}
    	
    	
    }
    
    
   
    @FXML
    void clearAction(ActionEvent event) {
label_id.setText("");
pName.clear();
pPrice.clear();
pQR.clear();
pQuentity.clear();
pSize.clear();
pImage.clear();
category_fileld.clear();
imageboxP.setImage(null);
    }
    @FXML
    void pUpdateAction(ActionEvent event) {

    	
    	sql="update products set Pname=?,price=?,quantity=?, image=?, qrcode=?,category=?,size=? where productID=?";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1, pName.getText().trim());
			sorguIfadesi.setString(2, pPrice.getText().trim());
			sorguIfadesi.setString(3, pQuentity.getText().trim());
			
			Image image = imageboxP.getImage();
			String path = image.getUrl(); 
			
			sorguIfadesi.setString(4, path);
			
			sorguIfadesi.setString(5, pQR.getText().trim());
			sorguIfadesi.setString(6, category_fileld.getText().trim());
			sorguIfadesi.setString(7, pSize.getText().trim());
			sorguIfadesi.setString(8, label_id.getText().trim());
			
			 int rowsAffected = sorguIfadesi.executeUpdate();
		        if (rowsAffected == 0) {
		            // Güncelleme işlemi başarısız oldu
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
		            alert.setContentText("Successful");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		ProductsDoldur();
    	
    	
    }
    @FXML
    void tableviewP_Clicked(MouseEvent event) {
    	gettersetter_products kayit=new gettersetter_products();
    	kayit=(gettersetter_products) tableview_P.getItems().get(tableview_P.getSelectionModel().getSelectedIndex());
    	label_id.setText(String.valueOf(kayit.getProductID()));
    	pName.setText(kayit.getName());
    	pQuentity.setText(String.valueOf(kayit.getQuentity()));
    	pPrice.setText(String.valueOf(kayit.getPrice()));
    	pImage.setText(kayit.getImage());    	
    	pQR.setText(kayit.getQrcode());
    	pSize.setText(kayit.getSize());
    	category_fileld.setText(kayit.getCategory());
    	String path = pImage.getText();
    	Image image = new Image(path);
    	imageboxP.setImage(image);
    }
    
    @FXML
    void deleteProductAction(ActionEvent event) {
    	sql="delete from products where productID=?";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1, label_id.getText().trim());
			
			
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
		            alert.setContentText("Deleted");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		ProductsDoldur();
    	
    }

    @FXML
    void EmployeesAction(ActionEvent event) {
    	ViewDoldur(tableview2);
    anchor_giris.setVisible(false);
    anchor_Products.setVisible(false);
    anchor_setting.setVisible(false);
    anchor_Statistics.setVisible(false);
    Anchor_Customer.setVisible(false);
    anchor_orders.setVisible(false);
    anchor_Employees.setVisible(true);
    
    
    }
    


    @FXML
    void SignOut(MouseEvent event) {

    }

    @FXML
    void StatisticsAction(ActionEvent event) {
CreateChart();
   anchor_giris.setVisible(false);
   anchor_Statistics.setVisible(true);
   anchor_Employees.setVisible(false);
   anchor_Products.setVisible(false);
   Anchor_Customer.setVisible(false);
   anchor_setting.setVisible(false);
   anchor_orders.setVisible(false);
   LineChartGrafik();
   
    }

    @FXML
    void cDeleteAction(ActionEvent event) {
    	sql="delete from customer where Cname=? AND CIdNumber=?";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1, field_name.getText().trim());
			sorguIfadesi.setString(2, field_id.getText().trim());
			
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
		            alert.setContentText("Deleted");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		FetchValues(tableView);
		
		field_name.clear();
		field_surname.clear();
		field_id.clear();
		field_birth.clear();
		field_adress.clear();
		field_city.clear();
		field_phone.clear();
		fiel_email.clear();
    }

    @FXML
    void cInsertAction(ActionEvent event) {
    	sql="INSERT INTO customer (Csurname, Cgender, Cname, Cpassword, CIDNumber, Cbirth, Ccity, adress, CphoneNumber, Cemail) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1,"");
			sorguIfadesi.setString(2,"");
			sorguIfadesi.setString(3, field_name.getText().trim());
			sorguIfadesi.setString(4, field_surname.getText().trim());
			sorguIfadesi.setString(5, field_id.getText().trim());
			sorguIfadesi.setString(6, field_birth.getText().trim());
			sorguIfadesi.setString(7, field_city.getText().trim());
			sorguIfadesi.setString(8, field_adress.getText().trim());
			sorguIfadesi.setString(9, field_phone.getText().trim());
			sorguIfadesi.setString(10, fiel_email.getText().trim());
			
			
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
		            alert.setContentText("Customer added.");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		FetchValues(tableView);
		field_name.clear();
		field_surname.clear();
		field_id.clear();
		field_birth.clear();
		field_adress.clear();
		field_city.clear();
		field_phone.clear();
		fiel_email.clear();
    }

    @FXML
    void cUpdateAction(ActionEvent event) {
    	sql="update customer set Cpassword=?,CIDNumber=?,Cbirth=?, Ccity=?, adress=?,CphoneNumber=?,Cemail=? where Cname=?";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1, field_surname.getText().trim());
			sorguIfadesi.setString(2, field_id.getText().trim());
			sorguIfadesi.setString(3, field_birth.getText().trim());
			sorguIfadesi.setString(4, field_city.getText().trim());
			sorguIfadesi.setString(5, field_adress.getText().trim());
			sorguIfadesi.setString(6, field_phone.getText().trim());
			sorguIfadesi.setString(7, fiel_email.getText().trim());
			sorguIfadesi.setString(8, field_name.getText().trim());
			
			 int rowsAffected = sorguIfadesi.executeUpdate();
		        if (rowsAffected == 0) {
		            // Güncelleme işlemi başarısız oldu
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
		            alert.setContentText("Successful");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		FetchValues(tableView);
		field_name.clear();
		field_surname.clear();
		field_id.clear();
		field_birth.clear();
		field_adress.clear();
		field_city.clear();
		field_phone.clear();
		fiel_email.clear();
    }

    @FXML
    void customerAction(ActionEvent event) {
    	anchor_giris.setVisible(false);
        Anchor_Customer.setVisible(true);
        FetchValues(tableView);
        anchor_Statistics.setVisible(false);
        anchor_Employees.setVisible(false);
        anchor_Products.setVisible(false);
        anchor_setting.setVisible(false);
        anchor_orders.setVisible(false);
    }

    @FXML
    void ordersAction(ActionEvent event) {
    	anchor_giris.setVisible(false);
	    anchor_Employees.setVisible(false);
	    anchor_Products.setVisible(false);
	    Anchor_Customer.setVisible(false);
	    anchor_Statistics.setVisible(false);
	    anchor_setting.setVisible(false);
	    anchor_orders.setVisible(true);
	    OrdersDoldur();
    }

    @FXML
    void outAction(ActionEvent event) {
    	 Stage AdminStage=(Stage) button_out.getScene().getWindow();
         AdminStage.close();
    }

    
    @FXML
    void productAction(ActionEvent event) {
    anchor_giris.setVisible(false);
    anchor_Products.setVisible(true);
    anchor_Employees.setVisible(false);
    Anchor_Customer.setVisible(false);
    anchor_Statistics.setVisible(false);
    anchor_setting.setVisible(false);
    anchor_orders.setVisible(false);
    

    	ProductsDoldur();
    	
    }
    

    @FXML
    void tableview_clicked(MouseEvent event) {
 // Bu kodda, mevcut bir tableView nesnesinin seçili olan satırındaki verileri, tableview_gettersetter sınıfından bir nesne oluşturarak kayit değişkenine atamaya çalışılmış.
//İkinci satırda, tableView nesnesinden getItems() metodu çağrılarak tablonun veri kaynağı alınıyor. Daha sonra, getSelectedIndex() metodu çağrılarak seçili olan satırın dizin numarası alınıyor. Bu dizi numarası, get() metodu kullanılarak tableView nesnesinin veri kaynağındaki ilgili öğeye karşılık gelen veriler alınıyor.
//Son olarak, alınan veriler tableview_gettersetter sınıfından bir nesne olarak kabul edilerek kayit değişkenine atanıyor.
    	tableview_gettersetter kayit=new tableview_gettersetter();
    	kayit=(tableview_gettersetter) tableView.getItems().get(tableView.getSelectionModel().getSelectedIndex());
    	field_name.setText(kayit.getName());
    	field_surname.setText(kayit.getPassword());
    	field_id.setText(String.valueOf( kayit.getIdN()));
    	field_birth.setText(kayit.getBirthday());
    	field_city.setText(kayit.getCity());
    	field_adress.setText(kayit.getAdress());
    	field_phone.setText(String.valueOf(kayit.getPhoneN()));
    	fiel_email.setText(kayit.getEmail());
    }
    @FXML
    void view2_Clicked(MouseEvent event) {
    	gettersetter_admin2 kayit=new gettersetter_admin2();
    	kayit=(gettersetter_admin2) tableview2.getItems().get(tableview2.getSelectionModel().getSelectedIndex());
    	eName_txt.setText(kayit.getName());
    	eId_txt.setText(String.valueOf(kayit.getIdN()));
    	ePass_txt.setText(kayit.getPassword());
    	ePhone_txt.setText(String.valueOf(kayit.getPhoneN()));
    	eMail_txt.setText(kayit.getEmail());
    	eDepaartment_txt.setText(kayit.getDepartment());
    	eAdress_txt.setText(kayit.getAdress());
    	
    }
    @FXML
    void eAddAction(ActionEvent event) {
    	sql="INSERT INTO employee (eName,eIDnumber,ePassword,ePhone,eEmail,eDepartman,adressE,eSurname,eGender,eBirth,eCity) VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?,?);";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, eName_txt.getText().trim());
			sorguIfadesi.setString(2, eId_txt.getText().trim());
			sorguIfadesi.setString(3, ePass_txt.getText().trim());
			sorguIfadesi.setString(4, ePhone_txt.getText().trim());
			sorguIfadesi.setString(5, eMail_txt.getText().trim());
			sorguIfadesi.setString(6, eDepaartment_txt.getText().trim());
			sorguIfadesi.setString(7, eAdress_txt.getText().trim());
			sorguIfadesi.setString(8,"");
			sorguIfadesi.setString(9,"");
			sorguIfadesi.setString(10,"1980-06-06");
			sorguIfadesi.setString(11,"");
			
			
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
		            alert.setContentText("Employee added.");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		ViewDoldur(tableview2);
		eName_txt.clear();
		eAdress_txt.clear();
		eDepaartment_txt.clear();
		eId_txt.clear();
		eMail_txt.clear();
		ePass_txt.clear();
		ePhone_txt.clear();
    }

    @FXML
    void eDeleteAction(ActionEvent event) {
//delete from customer where Cname=? AND CIdNumber=?
    	sql="DELETE FROM  employee where eName=? AND eIDnumber=?";
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			
			sorguIfadesi.setString(1, eName_txt.getText().trim());
			sorguIfadesi.setString(2, eId_txt.getText().trim());
			
			
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
		            alert.setContentText("Deleted");
		            alert.show();
		        }
		    } catch (SQLException e) {
		        System.err.println("Hata nın ayrıntısı:");
		        e.printStackTrace();
		    }
		ViewDoldur(tableview2);
		eName_txt.clear();
		eAdress_txt.clear();
		eDepaartment_txt.clear();
		eId_txt.clear();
		eMail_txt.clear();
		ePass_txt.clear();
		ePhone_txt.clear();
    }

    @FXML
    void eUpdateAction(ActionEvent event) {
    	sql="Update employee set eIDnumber=?,ePassword=?,ePhone=?,eEmail=?,eDepartman=?,adressE=? where eName=?;";
    	
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			
			
			sorguIfadesi.setString(1, eId_txt.getText().trim());
			sorguIfadesi.setString(2, ePass_txt.getText().trim());
			sorguIfadesi.setString(3, ePhone_txt.getText().trim());
			sorguIfadesi.setString(4, eMail_txt.getText().trim());
			sorguIfadesi.setString(5, eDepaartment_txt.getText().trim());
			sorguIfadesi.setString(6, eAdress_txt.getText().trim());
			sorguIfadesi.setString(7, eName_txt.getText().trim());
			
			
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
		ViewDoldur(tableview2);
		eName_txt.clear();
		eAdress_txt.clear();
		eDepaartment_txt.clear();
		eId_txt.clear();
		eMail_txt.clear();
		ePass_txt.clear();
		ePhone_txt.clear();
    }

    @FXML
    void saveAction(ActionEvent event) {
sql="Update admin set aSurname=?,aIDNumber=?,aPassword=?,aPhone=?,aEmail=? where aName=?;";
    	
		try {
			
			sorguIfadesi=baglanti.prepareStatement(sql);
			
			
			sorguIfadesi.setString(1, aSurnametxt.getText().trim());
			sorguIfadesi.setString(2, aIDtxt.getText().trim());
			sorguIfadesi.setString(3, aPasstxt.getText().trim());
			sorguIfadesi.setString(4, aPhonetxt.getText().trim());
			sorguIfadesi.setString(5, aMailtxt.getText().trim());
			sorguIfadesi.setString(6, aNametxt.getText().trim());
			
			
			
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
		  sql = "select * from admin";
		     ObservableList<gettersetterInformatinA> kayitlarliste = FXCollections.observableArrayList();
		     try {
		         sorguIfadesi = baglanti.prepareStatement(sql);
		         getirilen = sorguIfadesi.executeQuery();
		         while (getirilen.next()) {
		             gettersetterInformatinA kayit = new gettersetterInformatinA(getirilen.getString("aName"), getirilen.getString("aSurname"), getirilen.getInt("aIDNumber"), getirilen.getString("aPassword"), getirilen.getInt("aPhone"), getirilen.getString("aEmail"));
		             kayitlarliste.add(kayit);
		         }

		         if (!kayitlarliste.isEmpty()) {
		             gettersetterInformatinA kayit = kayitlarliste.get(0);
		             aNametxt.setText(kayit.getName());
		             aSurnametxt.setText(kayit.getSurname());
		             aIDtxt.setText(String.valueOf(kayit.getIdN()));
		             aPasstxt.setText(kayit.getPass());
		             aPhonetxt.setText(String.valueOf(kayit.getPhone()));
		             aMailtxt.setText(kayit.getEmail());
		         }
		     } catch (Exception e) {
		         System.out.println(e.getMessage().toString());
		     }
		     
    }

  
    @FXML
    void initialize() {
    	
    	girisLabelDoldur();
    	column_name.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("Name"));
        column_adress.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("Adress"));
        column_birth.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("birthday"));
        column_city.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("City"));
        column_email.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("Email"));
        column_idN.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, Integer>("ID"));
        column_password.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("Password"));
        column_phone.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, Integer>("Phone"));
        
      
    }
public void FetchValues(TableView tableV) {
    	
    	sql="select Cname,CIdNumber,Cpassword,Cbirth,Ccity,CphoneNumber,Cemail,adress from customer";
    	ObservableList<tableview_gettersetter> kayitlarliste=FXCollections.observableArrayList();
    	
    	try {
    		sorguIfadesi=baglanti.prepareStatement(sql);
    		ResultSet getirilen=sorguIfadesi.executeQuery();//sorguyu çalıştırıyoruz
    		while(getirilen.next()) {
    		    kayitlarliste.add(new tableview_gettersetter(getirilen.getString("Cname"),getirilen.getInt("CIdNumber"), getirilen.getString("Cpassword"),getirilen.getString("Cbirth"), getirilen.getString("Ccity"), getirilen.getInt("CphoneNumber"), getirilen.getString("Cemail"), getirilen.getString("adress")));	
    		}
    		//burası ders kaydında hata veriyor.
    		//column_name.setCellValueFactory(new PropertyValueFactory<>("name"));//buradaki name tableview_gettersetter class dosyasında tanımladığımız değer.
    		//column_idN.setCellValueFactory(new PropertyValueFactory<>("idN"));
    		column_name.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("Name"));
    		column_adress.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("Adress"));
    		column_birth.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("birthday"));
    		column_city.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("City"));
    		column_email.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("email"));
    		column_idN.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, Integer>("idN"));
    		column_password.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, String>("password"));
    		column_phone.setCellValueFactory(new PropertyValueFactory<tableview_gettersetter, Integer>("phoneN"));
    	
    		
    	
            tableView.setItems(kayitlarliste);
    	} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
    	
    }
public void ViewDoldur(TableView tableV) {
	
	sql="select eName,eIDnumber,ePassword,ePhone,eEmail,eDepartman,adressE from employee";
	ObservableList<gettersetter_admin2> kayitlarliste=FXCollections.observableArrayList();
	
	try {
		sorguIfadesi=baglanti.prepareStatement(sql);
		ResultSet getirilen=sorguIfadesi.executeQuery();//sorguyu çalıştırıyoruz
		while(getirilen.next()) {
		    kayitlarliste.add(new gettersetter_admin2(getirilen.getString("eName"),getirilen.getInt("eIDnumber"), getirilen.getString("ePassword"),getirilen.getInt("ePhone"), getirilen.getString("eEmail"),getirilen.getString("eDepartman"), getirilen.getString("adressE")));	
		}
	
		nameColumn.setCellValueFactory(new PropertyValueFactory<gettersetter_admin2, String>("Name"));
		idColumn.setCellValueFactory(new PropertyValueFactory<gettersetter_admin2, Integer>("idN"));
		passColumn.setCellValueFactory(new PropertyValueFactory<gettersetter_admin2, String>("password"));
		phoneColumn.setCellValueFactory(new PropertyValueFactory<gettersetter_admin2, Integer>("phoneN"));
		mailColumn.setCellValueFactory(new PropertyValueFactory<gettersetter_admin2, String>("email"));
		departmentColumn.setCellValueFactory(new PropertyValueFactory<gettersetter_admin2, String>("department"));
		adressColumn.setCellValueFactory(new PropertyValueFactory<gettersetter_admin2, String>("Adress"));
	
		
		tableview2.setItems(kayitlarliste);
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	
}
public void ProductsDoldur() {

sql="select * from products";
ObservableList<gettersetter_products> kayitlarliste=FXCollections.observableArrayList();

try {
	sorguIfadesi=baglanti.prepareStatement(sql);
	ResultSet getirilen=sorguIfadesi.executeQuery();//sorguyu çalıştırıyoruz
	while(getirilen.next()) {
	    kayitlarliste.add(new gettersetter_products(getirilen.getInt("productID"),getirilen.getString("Pname"), getirilen.getInt("price"),getirilen.getInt("quantity"),getirilen.getString("image"), getirilen.getString("qrcode"),getirilen.getString("category"), getirilen.getString("size")));	
	}

	column_pID.setCellValueFactory(new PropertyValueFactory<gettersetter_products, Integer>("productID"));
	column_Pname.setCellValueFactory(new PropertyValueFactory<gettersetter_products, String>("name"));
	column_Price.setCellValueFactory(new PropertyValueFactory<gettersetter_products, Integer>("price"));
	column_quentity.setCellValueFactory(new PropertyValueFactory<gettersetter_products, Integer>("quentity"));
	columnimage_products.setCellValueFactory(new PropertyValueFactory<gettersetter_products, String>("image"));
	column_image.setCellValueFactory(new PropertyValueFactory<gettersetter_products, String>("qrcode"));
	column_category.setCellValueFactory(new PropertyValueFactory<gettersetter_products, String>("category"));
	column_size.setCellValueFactory(new PropertyValueFactory<gettersetter_products, String>("size"));

	

    tableview_P.setItems(kayitlarliste);
} catch (Exception e) {
	System.out.println(e.getMessage().toString());
}	}

public void SettingAction(ActionEvent event) {
    anchor_giris.setVisible(false);
    anchor_Employees.setVisible(false);
    anchor_Products.setVisible(false);
    Anchor_Customer.setVisible(false);
    anchor_orders.setVisible(false);
    anchor_Statistics.setVisible(false);
    anchor_setting.setVisible(true);
    
    
    sql = "select * from admin";
    ObservableList<gettersetterInformatinA> kayitlarliste = FXCollections.observableArrayList();
    try {
        sorguIfadesi = baglanti.prepareStatement(sql);
        getirilen = sorguIfadesi.executeQuery();
        while (getirilen.next()) {
            gettersetterInformatinA kayit = new gettersetterInformatinA(getirilen.getString("aName"), getirilen.getString("aSurname"), getirilen.getInt("aIDNumber"), getirilen.getString("aPassword"), getirilen.getInt("aPhone"), getirilen.getString("aEmail"));
            kayitlarliste.add(kayit);
        }

        if (!kayitlarliste.isEmpty()) {
            gettersetterInformatinA kayit = kayitlarliste.get(0);
            aNametxt.setText(kayit.getName());
            aSurnametxt.setText(kayit.getSurname());
            aIDtxt.setText(String.valueOf(kayit.getIdN()));
            aPasstxt.setText(kayit.getPass());
            aPhonetxt.setText(String.valueOf(kayit.getPhone()));
            aMailtxt.setText(kayit.getEmail());
        }
    } catch (Exception e) {
        System.out.println(e.getMessage().toString());
    }
    
}
public void girisLabelDoldur() {
	sqlemployee="SELECT COUNT(*) FROM employee";
	sqlincome="SELECT SUM(orderFee) FROM orders WHERE orderDate = CURDATE();";
	sqltotal="SELECT SUM(orderFee) FROM orders;";

	try {
        sorguIfadesi=baglanti.prepareStatement(sqlemployee);
        getirilen=sorguIfadesi.executeQuery();
        getirilen.next();
        double employee=getirilen.getDouble(1);
        employee_number.setText(String.valueOf(employee));
    } catch (SQLException e) {
        // SQLException istisnası burada işlenir veya yönlendirilir.
        e.printStackTrace();
    }
	try {
        sorguIfadesi=baglanti.prepareStatement(sqlincome);
        getirilen=sorguIfadesi.executeQuery();
        getirilen.next();
        double income=getirilen.getDouble(1);
        Income_number.setText(String.valueOf(income));
    } catch (SQLException e) {
        // SQLException istisnası burada işlenir veya yönlendirilir.
        e.printStackTrace();
    }
	try {
        sorguIfadesi=baglanti.prepareStatement(sqltotal);
        getirilen=sorguIfadesi.executeQuery();
        getirilen.next();
        double total=getirilen.getDouble(1);
        totalIncome_number.setText(String.valueOf(total));
    } catch (SQLException e) {
        // SQLException istisnası burada işlenir veya yönlendirilir.
        e.printStackTrace();
    }
}

public void OrdersDoldur() {

sql="select * from orders";
ObservableList<gettersetter_orders> kayitlarliste=FXCollections.observableArrayList();

try {
	sorguIfadesi=baglanti.prepareStatement(sql);
	ResultSet getirilen=sorguIfadesi.executeQuery();//sorguyu çalıştırıyoruz
	while(getirilen.next()) {
	    kayitlarliste.add(new gettersetter_orders(getirilen.getInt("ordersID"),getirilen.getString("CustomerName"), getirilen.getInt("CustomerID"),getirilen.getInt("CustomerIDno"),getirilen.getInt("CustomerPhone"),getirilen.getString("orderDate"), getirilen.getString("orderStatus"),getirilen.getInt("orderFee"), getirilen.getString("productName"),getirilen.getString("productCategory")));	
	}
	
	Id_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, Integer>("customerID"));
	cName_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, String>("CustomerName"));
	cID_Column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, Integer>("customerID"));
	cIDno_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, Integer>("customerIDno"));
	cPhone_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, Integer>("customerPhone"));
	orderDate_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, String>("orderDate"));
	status_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, String>("orderStatus"));
	Fee_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, Integer>("orderFee"));
	Pname_column.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, String>("productName"));
	Category_name.setCellValueFactory(new PropertyValueFactory<gettersetter_orders, String>("productCategory"));
	
	
	view_orders.setItems(kayitlarliste);
} catch (Exception e) {
	System.out.println(e.getMessage().toString());
}	
}


 public void LineChartGrafik() {
	 
}
 @FXML
 void view_ordersClick(MouseEvent event) {
 	
 	
 	gettersetter_orders kayit=new gettersetter_orders();
 	kayit=(gettersetter_orders) view_orders.getItems().get(view_orders.getSelectionModel().getSelectedIndex());
 	lbl_id.setText(String.valueOf(kayit.getOrdersID()));
 	txt_customerName.setText(kayit.getCustomerName());
 	txt_customerID.setText(String.valueOf(kayit.getCustomerID()));
 	txt_customerIDNo.setText(String.valueOf(kayit.getCustomerIDno()));
 	txt_customerIDNo1.setText(String.valueOf(kayit.getCustomerPhone()));
 	txt_orderDate.setText(kayit.getOrderDate());    	
 	txt_orderStatus.setText(kayit.getOrderStatus());
 	txt_orderFee.setText(String.valueOf(kayit.getOrderFee()));
 	txt_productName.setText(kayit.getProductName());
 	txt_productCategory.setText(kayit.getProductCategory());
 
 }
 
 public void CreateChart() {
	 lineChartDaily.getData().clear();
	 String sql = "SELECT orderDate,SUM(orderFee) FROM orders GROUP BY orderDate ORDER BY TIMESTAMP(orderDate)";
	XYChart.Series chart=new XYChart.Series();
	 try {
			sorguIfadesi=baglanti.prepareStatement(sql);
			ResultSet getirilen=sorguIfadesi.executeQuery();//sorguyu çalıştırıyoruz
			
		while(getirilen.next()) {
			chart.getData().add(new XYChart.Data<>(getirilen.getString(1),getirilen.getFloat(2)));
			
		}
		lineChartDaily.getData().add(chart);
	 }	
			catch (Exception e) {
				  e.printStackTrace();
			}
	
 }
}