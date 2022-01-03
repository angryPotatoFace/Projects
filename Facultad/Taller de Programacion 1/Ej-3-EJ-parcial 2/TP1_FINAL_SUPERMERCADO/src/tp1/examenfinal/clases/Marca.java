package tp1.examenfinal.clases;
//TODO COMPLETAR
public class Marca implements Mostrable {

	private static final String MSG_ORIGEN_INVALIDO = "Origen de la marca inválida";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre de la marca inválido";
	private String nombre;
	private Origen origen;
	
	public Marca(String nombre,Origen a) {
		setNombre(nombre);
		setOrigen(a);
	}
	
	public String mostrar() {
		return toString();
	}
	
	public boolean esMiNombre(String nombre) {
		return nombre.equals(nombre);
	}

	private void setNombre(String nombre) {
		if(nombre != null && nombre!="")
			this.nombre = nombre;
		else
			throw new IllegalArgumentException("Error agregando producto al mercado: Origen de la marca inválida");
	}

	private void setOrigen(Origen origen) {
		if(origen!=null)
			this.origen = origen;
		else
			throw new IllegalArgumentException("Error agregando producto al mercado: Origen de la marca inválida");
	}
	

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Marca [nombre=" + nombre + ", origen=" + origen.toString() + "]";
	}

}
