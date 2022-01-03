package tp1.parcial1.clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	static final double EXTRABALANCEO = 500;
	private int cantHoras;
	private boolean balanceo;
	
/*	todo completar */
	public Alineacion(String descripcion, double porcentajeGanancia, String patente, int horas, boolean conBalanceo) {
		super(descripcion,porcentajeGanancia,patente);
		this.cantHoras=horas;
		this.balanceo=conBalanceo;
	}

	@Override
	public void detallar(){
		//System.out.println("Se agrego el servicio: " + this.descripcion );
		System.out.println("servicio de " + getClass().getSimpleName());
		System.out.println("Patente "+ this.patente + " Precio: "+ this.calcularPrecioVenta());
	}
	
	@Override
	public double calcularCostoHoras() {
		
		return cantHoras*COSTOHORA;
	}
	
	@Override
	public double calcularPrecioCosto() {
		
		return this.balanceo? calcularCostoHoras() :  calcularCostoHoras()+EXTRABALANCEO;
	}
	
	

}
