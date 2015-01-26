package es.open4job.aytozgz.opendata.model.dao.presupuesto;

import java.util.Date;
import java.util.List;

import es.open4job.aytozgz.opendata.model.vo.presupuesto.GastoCorrienteVO;

public class GastoCorrienteDAO {

	// Listado de gastos
	public List<GastoCorrienteVO> getListadoGastos() {
		
		List<GastoCorrienteVO> gastos = null;
		
		// TODO
		
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
