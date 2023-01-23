package linkcode.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ShopDb {
	public static Connection getConnection() {
		//2------->connection to database
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("CONNECTION TO DATABASE");
		return con;
	}
}