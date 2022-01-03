package tp1.examenfinal.clases;
//TODO COMPLETAR
public class ProductoBulto extends Producto {

	private static final String TXT_MOSTRAR = "Ordenando las %d unidades del producto %s, Descripción: %s, con marca %s\n";
	private int cantidadXBulto;

	

	public ProductoBulto(int id, String nombre, String descripcion, String nombMarca, Origen origen, int cantidadXBulto) {
		super(id, nombre, descripcion, nombMarca, origen);
		setCantidadXBulto(cantidadXBulto);
	}
		
	private void setCantidadXBulto(int cantidadXBulto) {
		if(cantidadXBulto > 1)
			this.cantidadXBulto = cantidadXBulto;
		else
			throw new IllegalAccessError("Cantidad por Bulto Invalida");
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return String.format(TXT_MOSTRAR,this.cantidadXBulto,this.getNombre(),this.getDescripcion(), this.getMarca().mostrar());
	}
}
