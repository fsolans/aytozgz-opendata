package es.open4job.aytozgz.opendata.model.dao.presupuesto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

public class GenericDAO {

	private String driver;

	private String url;

	private String user;

	private String password;

	protected Connection connection = null;

	public GenericDAO(String driver, String url, String user, String password) {

		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;

	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void abrirConexion() throws SQLException, ClassNotFoundException {

		try {

			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}

	}

	public void prueba() throws SQLException, ClassNotFoundException {

		this.abrirConexion();
		
		Statement stmt = null;
		
		String query = "SELECT * FROM APARCAMIENTOSPERDISCAP";
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt(1);
				System.out.println ("id = " + id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}

		this.cerrarConexion();
		
	}

	public void cerrarConexion() {

		if (connection != null) {

			try {
				connection.close();
			} catch (SQLException e) {
			}

		}
	}

}
