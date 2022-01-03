package ar.edu.ort.tp1.pacial2.clases;

public class Rectangular extends Pizza {
	
		private static final int PRECIO_UNITARIO_PORCION = 52;
		private long largoPorc;
		private long anchoPorc;
		private AdicionalQueso adicional;
		
		public Rectangular(String nombre, float costoDeProduccion, float porcentajeGanancia,long largo,long ancho ,AdicionalQueso adicional) {
			super(nombre, costoDeProduccion, porcentajeGanancia);
			setLargoPorc(largo);
			setAnchoPorc(ancho);
			setAdicionalQueso(adicional);
		}

		private void setAdicionalQueso(AdicionalQueso adicional2) {
			if(adicional2 != null) 
				this.adicional = adicional2;
			else
				throw new IllegalArgumentException("El adicional de queso no puede ser nulo");
		}

		private void setAnchoPorc(long ancho) {
			if(ancho>0)
				this.anchoPorc = ancho;
			else
				throw new IllegalArgumentException("El ancho no puede ser negativo");
		}

		private void setLargoPorc(long largo) {
			if(largo>0) 
				this.largoPorc = largo;
			else
				throw new IllegalArgumentException("El largo no puede ser negativo");
		}

		@Override
		public void mostrar() {
			System.out.println("Rectangular - "+ this.getNombre()+ " - Precio de Venta : "+ getPrecioDeVenta() + " - " + largoPorc*anchoPorc + " Porciones - " + adicional.getDescripcion() );
		}

		@Override
		public float getPrecioDeCosto() {
			return ( getCostoDeProduccion() + (this.largoPorc*this.anchoPorc*PRECIO_UNITARIO_PORCION))*this.adicional.getMultiplicadorQueso(); 
		}

		@Override
		public TipoPizza tipo() {
			return TipoPizza.RECTANGULAR;
		}                              
		
		
		
		
}
