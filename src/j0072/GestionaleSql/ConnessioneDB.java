package j0072.GestionaleSql;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB {
	static Connection conn;

	//Incapsulamento di conn
	public Connection openConn() {
		return conn;
	}

	//Costruttore
	public ConnessioneDB() {
		try {
			Properties prop = new Properties();
			InputStream input = null;
			input = new FileInputStream("src/j0072/GestionaleSql/config.properties");
			prop.load(input);
			conn = DriverManager.getConnection(prop.getProperty("ConnectionString"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}	
	}


}
