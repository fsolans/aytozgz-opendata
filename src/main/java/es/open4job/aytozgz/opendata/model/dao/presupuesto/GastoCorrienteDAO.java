package es.open4job.aytozgz.opendata.model.dao.presupuesto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import es.open4job.aytozgz.opendata.model.vo.presupuesto.GastoCorrienteVO;

public class GastoCorrienteDAO extends GenericDAO {

	public GastoCorrienteDAO(String driver, String url, String user, String password) {
		super(driver, url, user, password);
	}
	
	// Listado de gastos
	public List<GastoCorrienteVO> getListadoGastos() {
		
		List<GastoCorrienteVO> gastos = null;
		
        ResultSet result = null;
		
        try {
			
			result = connection.createStatement().executeQuery("SELECT 'hola mundo' FROM DUAL");
			result.next();
			
	        System.out.println(result.getString(1));
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		
		return gastos;

	}

	// Obtiene los datos de un registro en concreto
	public GastoCorrienteVO getDatosGasto(int idGasto) {

		GastoCorrienteVO gasto = null;
		
		// TODO
		
		return gasto;
	
	}

	// Obtiene las fechas de las que se tienen registros
	public List<Date> getFechasConGastos(Date fecha) {
		
		List<Date> fechas = null;
		
		// TODO
		
		return fechas;
		
	}

	// Obtiene los datos de los registros en una fecha determinada
	public List<GastoCorrienteVO> getListadoGastosPorFecha(Date fecha) {
		
		List<GastoCorrienteVO> gastos = null;
		
		// TODO
		
		return gastos;
	
	}

}
