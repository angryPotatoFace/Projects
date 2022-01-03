package ar.edu.ort.tp1.pacial2.clases;

public class Rectangular extends Pizza {
	
	private static final int PRECIO_UNITARIO_PORCION = 52;
	private long largoPorciones;
	private long anchoPorciones;
	private AdicionalQueso adicional;
	
	
	public Rectangular(String nombre, float costoDeProduccion, float porcentajeGanancia, long largo,
		long ancho, AdicionalQueso adicional) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		setLargoPorciones(largo);
		setAnchoPorciones(ancho);
		setAdicional(adicional);
	}
		
	private void setLargoPorciones(long largo) {
		if(largo>0)
			this.largoPorciones = largo;
		else
			throw new IllegalArgumentException("Largo de porcion no puede ser 0 o menor");
	}

	private void setAnchoPorciones(long ancho) {
		if(ancho>0)
			this.anchoPorciones = ancho;
		else
			throw new IllegalArgumentException("Ancho de porcion no puede ser 0 o menor");
	}

	private void setAdicional(AdicionalQueso adicional) {
		if(adicional != null)
			this.adicional = adicional;
		else
			throw new IllegalArgumentException("Adicional de queso no puede ser null");
	}

	@Override
	public void mostrar() {
		System.out.println("Rectangular" + " - " + this.getNombre() + " - " + this.getPrecioDeCosto());
		
	}
	@Override
	public float getPrecioDeCosto() {
		
		return  this.getCostoDeProduccion() + ((largoPorciones*anchoPorciones * PRECIO_UNITARIO_PORCION) * this.adicional.getMultiplicadorQueso());
	}
	
	@Override
	public TipoPizza tipo() {
		return TipoPizza.RECTANGULAR;
	}
	
	

}
