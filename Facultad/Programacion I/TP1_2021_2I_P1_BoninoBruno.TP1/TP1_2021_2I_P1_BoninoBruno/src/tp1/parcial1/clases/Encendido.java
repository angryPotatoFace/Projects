package tp1.parcial1.clases;

public class Encendido extends Servicio implements CotizablePorMateriales {

	
	
	public Encendido(String descripcion, double porcentajeGanancia, String patente) {
		super(descripcion,porcentajeGanancia,patente);
		
	}

	@Override
	public void detallar() {
		//System.out.println("Se agrego el servicio: " + this.descripcion );
		System.out.println("servicio de " + getClass().getSimpleName());
		System.out.println("Patente "+ this.patente + " Precio: "+ this.calcularPrecioVenta());
	}

	@Override
	public double calcularCostoMateriales() {
		
		return COSTOMATERIAL1+COSTOMATERIAL2;
	}

	@Override
	public double calcularPrecioCosto() {
		return calcularCostoMateriales();
	}
	
	

}
