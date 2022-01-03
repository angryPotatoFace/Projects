package tp1.examenfinal.clases;
//TODO COMPLETAR
public class ProductoBulto extends Producto{

	private static final String TXT_MOSTRAR = "Ordenando las %d unidades del producto %s, Descripción: %s, con marca %s\n";
	private int cantidadXBulto;
	
	public ProductoBulto(int id, String nombre, String descripcion, String nomMarca , Origen origen,int cant) {
		super(id,nombre,descripcion,nomMarca,origen);
		cantidadXBulto=cant;
	}
	public String mostrar() {
		return String.format(TXT_MOSTRAR,this.getNombre(),this.getDescripcion(),this.getMarca(),this.cantidadXBulto);
	}
}
