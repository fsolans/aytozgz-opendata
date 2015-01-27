package es.open4job.aytozgz.opendata.model.vo.presupuesto;

public class ObjetoVO {

	private String nombre;

	private String valor;

	public ObjetoVO() {
	}

	public ObjetoVO(String nombre, String valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
