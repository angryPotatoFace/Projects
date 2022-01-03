package tp1.examenfinal.clases;

public class ProductoSimple extends Producto {

	private static final String TXT_MOSTRAR = "Ordenando el producto %s, Descripción: %s, con marca %s\n";

	public ProductoSimple(int id, String nombre, String descripcion, String nomMarca , Origen origen) {
		super(id,nombre,descripcion,nomMarca,origen);
	}

	public String mostrar() {
		return String.format(TXT_MOSTRAR,this.getNombre(),this.getDescripcion(),this.getMarca());
	}
	

}
