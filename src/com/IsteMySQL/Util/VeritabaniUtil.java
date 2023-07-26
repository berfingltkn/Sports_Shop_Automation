package com.IsteMySQL.Util;
import java.sql.*;// bunu her tarafa import etmemiz lazım. Kodları yazdığımız kısımda dahil 

public class VeritabaniUtil {

	static Connection conn=null;// Veritabanına bağlanmak için bir Connection nesnesi oluşturduk.
	
	// veritabanı bağlantısının açılıp açılmadığını kontrol edelim;
	
	public static Connection Baglan() {
		
		
		try {
   //"jdbc:mysql ://ServerIPAdresi/db_name","kullaniciadi","sifre"
  //--> JavaFX, veritabanı işlemleri yapmak için JDBC (Java Database Connectivity)
  //API'sini kullanır. Bu API, veritabanına bağlanmak için bir Connection nesnesi oluşturmanızı gerektirir.
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost/berfstore","root","");
			return conn;
		
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return null;
		}
	}


}
