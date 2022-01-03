package tp1.examenfinal.clases;
//TODO COMPLETAR
public class Marca implements Mostrable {
	
	private static final String MSG_ORIGEN_INVALIDO = "Origen de la marca inválida";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre de la marca inválido";
	
	private String nombre;
	private Origen origen;

	public Marca(String nombMarca, Origen origen) {
		setNombre(nombMarca);
		setOrigen(origen);
	}

	private void setNombre(String nombre) {
		if(nombre != null && !nombre.isBlank())
			this.nombre = nombre;
		else
			throw new IllegalArgumentException(MSG_NOMBRE_INVALIDO) ;
	}

	private void setOrigen(Origen origen) {
		if(origen != null)
			this.origen = origen;
		else
			throw new IllegalArgumentException(MSG_ORIGEN_INVALIDO);
	}

	@Override
	public String mostrar() {
		return	this.toString();
	}
	
	public boolean esMiNombre(String nombre) {
		return nombre.equals(this.nombre);
	}
	
	@Override
	public String toString() {
		return "Marca nombre: " + nombre + ", origen: " + origen;
	}
	
	
	
	

	
			
	

}
