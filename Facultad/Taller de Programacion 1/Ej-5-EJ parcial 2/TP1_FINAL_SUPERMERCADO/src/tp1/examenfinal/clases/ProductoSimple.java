package tp1.examenfinal.clases;

public class ProductoSimple extends Producto {

	private static final String TXT_MOSTRAR = "Ordenando el producto %s, Descripción: %s, con marca %s\n";

	public ProductoSimple(int id, String nombre, String descripcion, String nombMarca , Origen origen) {
		super(id,nombre,descripcion,nombMarca,origen);
	
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return String.format(TXT_MOSTRAR, this.getNombre(),this.getDescripcion(), this.getMarca().mostrar());
	}

	

}
