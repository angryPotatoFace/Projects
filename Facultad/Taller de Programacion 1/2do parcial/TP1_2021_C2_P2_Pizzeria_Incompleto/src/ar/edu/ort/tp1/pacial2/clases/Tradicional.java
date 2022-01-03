package ar.edu.ort.tp1.pacial2.clases;

public class Tradicional extends Pizza {
	
	private TipoDeMasa tipo;
	
	public Tradicional(String nombre, float costoDeProduccion, float porcentajeGanancia, TipoDeMasa tipo) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		setTipo(tipo);
	}
	
	private void setTipo(TipoDeMasa tipo) {
		if(tipo != null)
			this.tipo = tipo;
		else
			throw new IllegalArgumentException("Tipo de masa no puede ser nulo");
	}

	@Override
	public void mostrar() {
		System.out.println("Tradicional" + " - " + this.getNombre() + " - " + this.getPrecioDeCosto());		
	}

	@Override
	public float getPrecioDeCosto() {
		return this.getCostoDeProduccion()* tipo.getPorcentaje();
	}

	@Override
	public TipoPizza tipo() {
		return TipoPizza.TRADICIONAL;
	}

}
