package tp1.examenfinal.clases;
//TODO COMPLETAR
public abstract class Producto implements Pedible,Identificable,Mostrable{

	private static final String MSG_NOMBRE_INVALIDO = "Nombre del producto inválido";
	private static final String MSG_DESCRIPCION_INVALIDO = "Descripcián del producto inválido";
	private static final String MSG_ID_INVALIDO = "ID del producto inválido";

	private int id;
	private String nombre;
	private String descripcion;
	private Marca marca;
	
	public Producto(int id, String nombre, String descripcion, String nomMarca , Origen origen) {
		
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		marca = new Marca(nomMarca,origen);
	}

	private void setId(int id) {
		if(id>0)
			this.id = id;
		else 
			throw new IllegalArgumentException("Error agregando producto del mercado : ID del producto invalido" );
	}

	private void setNombre(String nombre) {
		if(nombre != null && nombre!="")
			this.nombre = nombre;
		else
			throw new IllegalArgumentException("Error agregando producto del mercado : Nombre del producto invalido");
	}

	private void setDescripcion(String descripcion) {
		if(descripcion != null && descripcion!="")
			this.descripcion = descripcion;
		else 
			throw new IllegalArgumentException("Error agregando producto del mercado : Descripcion del producto invalido");
	}

	public Integer getId() {
		return id;
	}
	
	public void pedir() {
		
	}
	
	public boolean soyYo(int a) {
		return id == a ;
	}
	
	public boolean soyYo(String nombre,String marca) {
		
		return ( this.nombre.equals(nombre) && this.marca.getNombre().equals(marca)) ;
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
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + "]";
	}
	
}
