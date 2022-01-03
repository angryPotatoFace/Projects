package ar.edu.ort.tp1.pacial2.clases;

public enum TipoPizza {
	ESPECIAL("Especial"), TRADICIONAL("Tradicional"), RECTANGULAR("Rectangular");

	private String descripcion;
	
	TipoPizza(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}
