package tp1.parcial1.clases;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {
	
	private int horas;
	
	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int horas){
		super(descripcion,porcentajeGanancia,patente);
		this.horas=horas;
	}
	
	@Override
	public void detallar() {
		//System.out.println("Se agrego el servicio: " + this.descripcion );
		System.out.println("servicio de " + getClass().getSimpleName());
		System.out.println("Patente "+ this.patente + " Precio: "+ this.calcularPrecioVenta());
	}

	@Override
	public double calcularCostoMateriales() {
		// TODO Auto-generated method stub
		return COSTOMATERIAL1+COSTOMATERIAL2;
	}

	@Override
	public double calcularCostoHoras() {
		return horas*COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		// TODO Auto-generated method stub
		return calcularCostoMateriales()+calcularCostoHoras();
	}
	
	
}
