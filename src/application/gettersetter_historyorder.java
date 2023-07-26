package application;

public class gettersetter_historyorder {
	private String orderDate;
	private String orderStatus;
	private int orderFee;
	private String productName;
	private String productCategory;
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

	
	public gettersetter_historyorder(){
		
	}

public gettersetter_historyorder(String orderDate,String orderStatus,int orderFee,String productName,String productCategory){
	this.orderDate=orderDate;
	this.orderStatus=orderStatus;
	this.orderFee=orderFee;
	this.productCategory=productCategory;
	this.productName=productName;
}
}
