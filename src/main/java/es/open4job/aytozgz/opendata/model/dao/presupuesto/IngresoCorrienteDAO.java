package es.open4job.aytozgz.opendata.model.dao.presupuesto;

import java.util.Date;
import java.util.List;

import es.open4job.aytozgz.opendata.model.vo.presupuesto.GastoCorrienteVO;
import es.open4job.aytozgz.opendata.model.vo.presupuesto.IngresoCorrienteVO;

public class IngresoCorrienteDAO extends AbstractDAO {

	public IngresoCorrienteDAO(String driver, String url, String user, String password) {
		super(driver, url, user, password);
	}

	// Listado de ingresos
	public List<IngresoCorrienteVO> getListadoIngresos() {
	
		List<IngresoCorrienteVO> ingresos = null;
		
		// TODO
		
		return ingresos;

	}

	// Obtiene los datos de un registro en concreto
	public IngresoCorrienteVO getDatosIngreso(int idIngreso) {

		IngresoCorrienteVO ingreso = null;
		
		// TODO
		
		return ingreso;

	}

	// Obtiene las fechas de las que se tienen registros
	public List<Date> getFechasConIngresos(Date fecha) {
		
		List<Date> fechas = null;
		
		// TODO
		
		return fechas;

	}

	// Obtiene los datos de los registros en una fecha determinada
	public List<IngresoCorrienteVO> getListadoIngresosPorFecha(Date fecha) {
		
		List<IngresoCorrienteVO> ingresos = null;
		
		// TODO
		
		return ingresos;
	
	}

}
