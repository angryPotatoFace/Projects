package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {

	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		//TODO A completar
	}

	//TODO A completar M?todos
	
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
	
	public void mostrar(){
		System.out.println("Tipo de Mueble : "+getClass().getSimpleName());
		System.out.println("Modelo : "+modelo);
		System.out.println("Precio de Venta :");
	}

}
