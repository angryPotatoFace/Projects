package ar.edu.ort.tp1.pacial2.clases;

public class Tradicional extends Pizza {
	
	private TipoDeMasa tipo;

	public Tradicional(String nombre, float costoDeProduccion, float porcentajeGanancia, TipoDeMasa tipo) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		setTipo(tipo);
	}
	
	private void setTipo(TipoDeMasa tipo2) {
		if(tipo2 != null) 
			this.tipo = tipo2;
		else
			throw new IllegalArgumentException("El tipo de masa no puede ser nulo");
	}

	@Override
	public void mostrar() {
		System.out.println("Tradicional - "+ this.getNombre()+ " - Precio de Venta : "+ getPrecioDeVenta() + " - "+tipo.getDescripcion());
	}

	@Override
	public float getPrecioDeCosto() {
		return this.tipo.getPorcentaje()*getCostoDeProduccion();
	}
	
    @Override
	public TipoPizza tipo() {
    	return TipoPizza.TRADICIONAL;
	}

}
