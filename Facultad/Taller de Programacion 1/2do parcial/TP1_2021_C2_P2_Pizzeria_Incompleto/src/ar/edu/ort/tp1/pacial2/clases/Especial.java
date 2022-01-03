package ar.edu.ort.tp1.pacial2.clases;

public class Especial extends Pizza {

	private final int PRECIO_UNITARIO_FAINA =38;
	private TamanioDePizza tamanio;
	private int faina;
	
	public Especial(String nombre, float costoDeProduccion, float porcentajeGanancia,int faina,TamanioDePizza tamanio) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		setTamanio(tamanio);
		setFaina(faina);
	}	

	private void setFaina(int f) {
		if(f>=0) 
			this.faina=f;
		else
			throw new IllegalArgumentException("Numero de faina no puede ser negativo");
	}
	private void setTamanio(TamanioDePizza t) {
		if(t != null)
			this.tamanio=t;
		else
			throw new IllegalArgumentException("Tamanio de la pizza no puede ser nulo");
	}

	@Override
	public void mostrar() {
		System.out.println("Especial" + " - " + this.getNombre() + " - " + this.getPrecioDeCosto());
	}

	@Override
	public float getPrecioDeCosto() {
		return ( this.faina * PRECIO_UNITARIO_FAINA + this.getCostoDeProduccion() * this.tamanio.getPorcentaje());
	}

	@Override
	public TipoPizza tipo() {	
		return TipoPizza.ESPECIAL;
	}

	
	
}
