package MySql;

import java.sql.*;

public class TestProcedure {

		static Connection conn;
		static CallableStatement cs;
		public static void main(String[] args) {

			try {
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/gestionale2?" +
						"user=root&password=Password01@");

				cs = conn.prepareCall("{CALL CreaAmministratore(?, ?, ?)}");
				cs.setString(1, "p.giuseppe");
				cs.setString(2, "Giuseppe");
				cs.setString(3, "Pippo");
				// Se la Store Procedure fornisse un 4° parametro 
				// di tipo CHAR, in uscita, dovremmo eseguire anche questa riga:
				//cs.registerOutParameter(4, Types.VARCHAR);
				cs.executeQuery();
				
				System.out.println("Stored Procedure CreaAmministratore eseguita correttamente.");

			} catch (SQLException ex) {
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
			}
			finally {
				if (cs != null) {
					try {
						cs.close();
					} catch (SQLException sqlEx) { }
					cs = null;
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
