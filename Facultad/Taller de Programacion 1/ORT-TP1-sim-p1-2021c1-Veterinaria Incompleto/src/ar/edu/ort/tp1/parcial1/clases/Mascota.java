package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenía mucha hambre, pero gracias";
	private static final int CIEN = 100;
	private String nombre;
	private double peso;
	private boolean estoyVacunado;
	private Estado estado;
	public Mascota(String nombre,double peso,boolean vacunado,Estado estado){
		setNombre(nombre);
		setPeso(peso);
		setEstoyVacunado(vacunado);
		setEstado(estado);
	}

	
	//----------------Nombre----------------------
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//-------------Peso------------------
	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	public double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}

	//-------------Vacuna-------------------------
	private boolean isEstoyVacunado() {
		return estoyVacunado;
	}

	private void setEstoyVacunado(boolean vacunado) {
		this.estoyVacunado = vacunado;
	}
	
	public void vacunarMascota(){
		if(this.estoyVacunado==false) {
			this.estoyVacunado =true;
			System.out.println("Mascota vacunada");
		}else {
			System.out.println("Mascota ya tenia la vacuna");
		}
	}
	
	//-------------Estado------------------------

	private Estado getEstado() {
		return estado;
	}

	private void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void mostrarEstado() {
		System.out.println("Estado Mascota "+estado);
		System.out.println("Respuesta Mascota "+estado.getDescripcion());
	}
	
	//-------------------------------------------
	
	
}
