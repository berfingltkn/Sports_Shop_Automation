package application;

public class tableview_gettersetter {

	private String Name;
	private String password;
	private int idN;
	private String birthday;
	private String City;
	private String Adress;
	private int phoneN;
	private String email;
	
	

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdN() {
		return idN;
	}

	public void setIdN(int idN) {
		this.idN = idN;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
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
public tableview_gettersetter() {
	
}
	public tableview_gettersetter(String Name) {
		this.Name = Name;
	}
	public tableview_gettersetter(String Name,int idN,String password,String birthday,String City,int phoneN,String email,String Adress){
		this.Name=Name;
		this.Adress=Adress;
		this.birthday=birthday;
		this.City=City;
		this.email=email;
		this.idN=idN;
		this.password=password;
		this.phoneN=phoneN;
		
	}
}
