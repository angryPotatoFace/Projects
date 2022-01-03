package Tp1.ejercicio2;

public class Corredor {
	
	private String nombreApellido;
	private	float	tiempo;
	
	public Corredor(String nombreApellido,float tiempo) {
		this.nombreApellido=nombreApellido;
		this.tiempo=tiempo;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public float getTiempo() {
		return tiempo;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}
	
	

}
