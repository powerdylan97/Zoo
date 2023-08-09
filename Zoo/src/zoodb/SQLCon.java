package zoodb;
import java.sql.*;

public class SQLCon {
	private String url = "jdbc:mysql://localhost:3306/Zoo?characterEncoding=utf8";
	private String user = "root";
	private String pass = "password";
	protected String query = "";
	private Connection con;

	SQLCon() {
		setConnection();
	}

	SQLCon(String query) {
		setQuery(query);
		setConnection();
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

	public Connection getConnection() {
		return con;
	}

	public void setConnection() {
		try {
			int counter = 1;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			this.con = con;
			System.out.println("connection successful");
			if (!query.isBlank()) {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next())
					System.out.print(rs.getString(counter++) + "           ");
				con.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}