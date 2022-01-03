package ar.edu.ort.tp1.pacial2.clases;

public class Especial extends Pizza {
	
	private final int PRECIO_UNITARIO_FAINA = 38;
	private TamanioDePizza tamanio;
	private int cantFaina;
	
	public Especial(String nombre, float costoDeProduccion, float porcentajeGanancia, TamanioDePizza tamanio, int faina) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		setTamanio(tamanio);
		setCantFaina(faina);
	}
	private void setTamanio(TamanioDePizza tamanio2) {
		if(tamanio2 != null)
			this.tamanio = tamanio2;
		else
			throw new IllegalArgumentException("El tamaño de la pizza no puede ser nulo");
	}
	private void setCantFaina(int faina) {
		if(faina>=0) 
			this.cantFaina = faina;
		else
			throw new  IllegalArgumentException("La cantidad de faina no puede ser negativa");
	}
		

	@Override
	public void mostrar() {
		System.out.println("Especial - "+ this.getNombre()+ " - Precio de Venta : "+ getPrecioDeVenta() + " - "+ cantFaina+ " fainas "+tamanio.getDescripcion() );
	}

	@Override
	public float getPrecioDeCosto() {
		return (cantFaina*PRECIO_UNITARIO_FAINA) + (getCostoDeProduccion()*tamanio.getPorcentaje());
	}

	@Override
	public TipoPizza tipo() {
		return TipoPizza.ESPECIAL;
	}
		                              
}
