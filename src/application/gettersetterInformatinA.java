package application;

public class gettersetterInformatinA {
private String Name;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public Integer getIdN() {
	return idN;
}
public void setIdN(Integer idN) {
	this.idN = idN;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public Integer getPhone() {
	return phone;
}
public void setPhone(Integer phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String Surname;
private Integer idN;
private String pass;
private Integer phone;
private String email;
public gettersetterInformatinA(){
	
}
public gettersetterInformatinA(String name) {
	this.Name=name;
}
public gettersetterInformatinA(String name,String surname,Integer idN,String pass,Integer phone,String email) {
	this.Name=name;
	this.Surname=surname;
	this.idN=idN;
	this.pass=pass;
	this.phone=phone;
	this.email=email;
}
}
