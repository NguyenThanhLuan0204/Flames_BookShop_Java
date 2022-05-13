package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance =new ConnectDB();
	public static ConnectDB getInstance() {
		return instance;
	}
	public void connect() throws Exception {
		String url = "jdbc:sqlserver://localhost:1433;databasename = Flames";
		String user  = "sa";
		String password = "Password.1";
		con = DriverManager.getConnection(url,user,password);
	}
	public void disconnect() {
		if(con != null) {
			try {
				con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
