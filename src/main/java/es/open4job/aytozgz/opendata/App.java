package es.open4job.aytozgz.opendata;

import java.sql.SQLException;

import es.open4job.aytozgz.opendata.model.dao.presupuesto.GastoCorrienteDAO;
import es.open4job.aytozgz.opendata.model.dao.presupuesto.IngresoCorrienteDAO;

public class App {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";

		String host = "54.154.192.80";
		String puerto = "1521";
		String sid = "xe";

		String user = "open4job";
		String password = "open4job";

		String url = "jdbc:oracle:thin:" + user + "/" + password + "@" + host
				+ ":" + puerto + ":" + sid;

		GastoCorrienteDAO gastoCorrienteDAO = new GastoCorrienteDAO(driver,
				url, user, password);

		IngresoCorrienteDAO ingresoCorrienteDAO = new IngresoCorrienteDAO(
				driver, url, user, password);

		try {
			gastoCorrienteDAO.prueba();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
