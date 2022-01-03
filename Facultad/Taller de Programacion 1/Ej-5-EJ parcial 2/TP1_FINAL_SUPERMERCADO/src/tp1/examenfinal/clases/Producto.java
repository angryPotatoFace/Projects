package tp1.examenfinal.clases;
//TODO COMPLETAR
public abstract class Producto implements Pedible,Mostrable,Identificable {
	
	private static final String MSG_NOMBRE_INVALIDO = "Nombre del producto inválido";
	private static final String MSG_DESCRIPCION_INVALIDO = "Descripcián del producto inválido";
	private static final String MSG_ID_INVALIDO = "ID del producto inválido";

	private int id;
	private String nombre;
	private String descripcion;
	private Marca marca;
	
	
	public Producto(int id, String nombre, String descripcion, String nombMarca , Origen origen) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setMarca(nombMarca, origen);
	}


	private void setId(int id) {
		if( id > 0)
			this.id = id;
		else
			throw new IllegalArgumentException(MSG_ID_INVALIDO);
	}

	private void setNombre(String nombre) {
		if(nombre!=null && !nombre.isBlank())
			this.nombre = nombre;
		else
			throw new IllegalArgumentException(MSG_NOMBRE_INVALIDO);

	}


	private void setDescripcion(String descripcion) {
		if(descripcion != null && !descripcion.isBlank())
			this.descripcion = descripcion;
		else
			throw new IllegalArgumentException(MSG_DESCRIPCION_INVALIDO);

	}


	private void setMarca(String nombMarca , Origen origen) {
		this.marca = new Marca(nombMarca, origen);
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public boolean soyYo(Integer id) {
		return this.id == id;
	}
	
	public boolean soyYo(String nombre, String nombreMarca) {
		return  nombre.equals(this.nombre) && this.marca.esMiNombre(nombreMarca);
	}

	protected String getNombre() {
		return nombre;
	}


	protected String getDescripcion() {
		return descripcion;
	}


	protected Marca getMarca() {
		return marca;
	}
	
	

	@Override
	public void pedir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + "]";
	}	
		
}
