package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {

	//TODO A completar
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		setModelo(modelo);
		setCostoBase(costoBase);
		setPorcentajeGanancia(porcentajeGanancia);
	}

	//TODO A completar Métodos
	
	public float calcularPrecioVenta() {
		//TODO A completar
		return 0f;
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}

	private String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	private void setPorcentajeGanancia(float porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	private void setCostoBase(float costoBase) {
		this.costoBase = costoBase;
	}
	
	
	

}
