package application;

public class gettersetter_products {
private Integer productID;
private String name;
private Integer price;
private Integer quentity;
private String image;
private String qrcode;
private String category;
private String size;

public Integer getProductID() {
	return productID;
}
public void setProductID(Integer productID) {
	this.productID = productID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public Integer getQuentity() {
	return quentity;
}
public void setQuentity(Integer quentity) {
	this.quentity = quentity;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getQrcode() {
	return qrcode;
}
public void setQrcode(String qrcode) {
	this.qrcode = qrcode;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}

public gettersetter_products() {
	
}
public gettersetter_products(String name) {
	this.name=name;
}
public gettersetter_products(String name,int price,String image,String category,String size) {
	this.name=name;
	this.price=price;
	this.image=image;
	this.category=category;
	this.size=size;
}
public gettersetter_products(int productID,String name,int price,int quentity,String image,String qr,String category,String size) {
	this.category=category;
	this.image=image;
	this.name=name;
	this.price=price;
	this.productID=productID;
	this.qrcode=qr;
	this.quentity=quentity;
	this.size=size;
}
}
