package ar.edu.ort.tp1.examen.clases;

public class Pelota extends Producto {
	
	private static final String LA_SUPERFICIE_NO_PUEDE_SER_NULA = "La superficie no puede ser nula";
	private static final String MSG_PELOTA = "La pelota para superficie %s es de la marca %s y tiene un id %d\n";
	private Superficie superficie;
	
	public Pelota(int id, String marca, Superficie superficie) {
		super(id, marca);
		setSuperficie(superficie); 
	}
	private void setSuperficie(Superficie superficie) {
		if(superficie != null)
			this.superficie = superficie;
		else
			throw new IllegalArgumentException(LA_SUPERFICIE_NO_PUEDE_SER_NULA);
	}
	@Override
	public void mostrar() {
		System.out.printf(String.format(MSG_PELOTA, this.superficie.getDescripcion(),this.getMarca(),this.getId()));
	}
	
	
	
	
	
}
