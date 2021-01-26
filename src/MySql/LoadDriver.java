package MySql;

import java.sql.*;

public class LoadDriver {

	public static void main(String[] args) {
		try {
			
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/testDB?",
					"root","Password01@");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Utente");  
			
			while(rs.next()) System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
			rs.close();
			stmt.close();
			con.close();  
		
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}
