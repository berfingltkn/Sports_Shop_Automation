package application;

public class gettersetter_cart {
	String Pname;
	int price;
	String image;
	String size;
	//String Cname;
	//int CidNo;
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		this.Pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	/*public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getCidNo() {
		return CidNo;
	}
   public void setCidNo(int cidNo) {
		CidNo = cidNo;
	}
	*/
	
	public gettersetter_cart() {
		
	}
public gettersetter_cart(String Pname) {
		this.Pname=Pname;
	}
public gettersetter_cart(String pname,int price,String image,String size) {
	this.Pname=pname;
	this.image=image;
	this.size=size;
	this.price=price;
}


}
