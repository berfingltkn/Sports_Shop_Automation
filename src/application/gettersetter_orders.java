package application;

public class gettersetter_orders {
private int ordersID;
private String CustomerName;
private int customerID;
private int customerIDno;
private int customerPhone;
private String orderDate;
private String orderStatus;
private int orderFee;
private String productName;
private String productCategory;
public int getOrdersID() {
	return ordersID;
}
public void setOrdersID(int ordersID) {
	this.ordersID = ordersID;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public int getCustomerIDno() {
	return customerIDno;
}
public void setCustomerIDno(int customerIDno) {
	this.customerIDno = customerIDno;
}
public int getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(int customerPhone) {
	this.customerPhone = customerPhone;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}
public int getOrderFee() {
	return orderFee;
}
public void setOrderFee(int orderFee) {
	this.orderFee = orderFee;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}


public gettersetter_orders() {
	
}
public gettersetter_orders(String date,String status,int fee,String pName,String pCategory) {
	
	this.orderDate=date;
	this.orderFee=fee;
	this.orderStatus=status;
	this.productCategory=pCategory;
	this.productName=pName;
}
public gettersetter_orders(String name) {
	this.CustomerName=name;
}
public gettersetter_orders(int id,String cname,int cid,int cidNo,int cphone,String date,
		String status,int fee,String pName,String pCategory) {
	this.customerID=cid;
	this.customerIDno=cidNo;
	this.CustomerName=cname;
	this.customerPhone=cphone;
	this.orderDate=date;
	this.orderFee=fee;
	this.ordersID=id;
	this.orderStatus=status;
	this.productCategory=pCategory;
	this.productName=pName;
}


}
