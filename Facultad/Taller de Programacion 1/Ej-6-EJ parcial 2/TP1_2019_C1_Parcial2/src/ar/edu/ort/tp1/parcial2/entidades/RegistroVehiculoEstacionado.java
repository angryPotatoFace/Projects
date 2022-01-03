package ar.edu.ort.tp1.parcial2.entidades;

public class RegistroVehiculoEstacionado {
	
	private String patente;
	private float importe;
	
	public RegistroVehiculoEstacionado(String patente, float importe) {
		super();
		this.patente = patente;
		this.importe = importe;
	}

	public String getPatente() {
		return patente;
	}

	public float getImporte() {
		return importe;
	}

	@Override
	public String toString() {
		return "RegistroVehiculoEstacionado [patente=" + patente + ", importe=" + importe + "]";
	}

}
