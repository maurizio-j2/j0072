package MySql;

import java.sql.*;

public class EsercizioMySql1 {

	static Connection conn;
	static PreparedStatement pstmt;
	static Statement stmt;
	static ResultSet rs;
	public static void main(String[] args) {

		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gestionale?" +
					"user=root&password=Password01@");

			// Se la query è pronta si può usare la java.sql.Statement
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery("SELECT menu.vocemenu FROM menu " + 
//									"INNER JOIN utente " + 
//									"ON menu.idutente = utente.id " + 
//									"WHERE utente.username = 'alessio' ");

			// Se la query va preparata con il passaggio di parametri,
			// occorre usare la java.sql.PreparedStatement
			pstmt = conn.prepareStatement("SELECT menu.vocemenu FROM menu " + 
										"INNER JOIN utente " + 
										"ON menu.idutente = utente.id " + 
										"WHERE utente.username = ? ");
			pstmt.setString(1, "alessio");
		    rs = pstmt.executeQuery();
		    
			while(rs.next()) System.out.println(rs.getString(1));  

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) { }
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) { }
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException sqlEx) { }
				conn = null;
			}
		}
	}


}
