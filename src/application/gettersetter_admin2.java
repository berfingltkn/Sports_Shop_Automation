package application;

public class gettersetter_admin2 {
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getIdN() {
		return idN;
	}
	public void setIdN(int idN) {
		this.idN = idN;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhoneN() {
		return phoneN;
	}
	public void setPhoneN(int phoneN) {
		this.phoneN = phoneN;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	private String Name;
	private int idN;
	private String password;
	private int phoneN;
	private String email;
	private String department;
	private String Adress;
	
	public gettersetter_admin2() {
		
	}
public gettersetter_admin2(String Name) {
		this.Name=Name;
	}
public gettersetter_admin2(String Name,int idN,String pass,int phoneN,String email,String department,String Adress) {
	this.Adress=Adress;
	this.department=department;
	this.email=email;
	this.idN=idN;
	this.Name=Name;
	this.password=pass;
	this.phoneN=phoneN;
}
}
