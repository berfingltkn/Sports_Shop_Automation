package application;

public class gettersetter_customer {
String Cname;
String Csurname;
int CIdNumber;
String Cpassword;
String Cgender;
String birth;
String Ccity;
int CphoneNumber;
String Cemail;
String adress;
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	this.Cname = cname;
}
public String getCsurname() {
	return Csurname;
}
public void setCsurname(String csurname) {
	Csurname = csurname;
}
public int getCIdNumber() {
	return CIdNumber;
}
public void setCIdNumber(int cIdNumber) {
	CIdNumber = cIdNumber;
}
public String getCpassword() {
	return Cpassword;
}
public void setCpassword(String cpassword) {
	Cpassword = cpassword;
}
public String getCgender() {
	return Cgender;
}
public void setCgender(String cgender) {
	Cgender = cgender;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getCcity() {
	return Ccity;
}
public void setCcity(String ccity) {
	Ccity = ccity;
}
public int getCphoneNumber() {
	return CphoneNumber;
}
public void setCphoneNumber(int cphoneNumber) {
	CphoneNumber = cphoneNumber;
}
public String getCemail() {
	return Cemail;
}
public void setCemail(String cemail) {
	Cemail = cemail;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}


public gettersetter_customer() {
	
}
public gettersetter_customer(String name) {
	this.Cname=name;
}
public gettersetter_customer(String Cname,String Csurname,int CIdNumber,String Cpassword,String Cgender,
		String birth,String Ccity,int CphoneNumber,String Cemail,String adress) {
	this.adress=adress;
	this.birth=birth;
	this.Ccity=Ccity;
	this.Cemail=Cemail;
	this.Cgender=Cgender;
	this.CIdNumber=CIdNumber;
	this.Cname=Cname;
	this.Cpassword=Cpassword;
	this.CphoneNumber=CphoneNumber;
	this.Csurname=Csurname;
}
}
