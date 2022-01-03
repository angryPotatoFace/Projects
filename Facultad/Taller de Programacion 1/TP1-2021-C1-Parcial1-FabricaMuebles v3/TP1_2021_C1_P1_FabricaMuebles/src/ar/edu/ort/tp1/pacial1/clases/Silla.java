package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla material;

	public Silla(String modelo, float costoBase, float porcentajeGanancia,long alto ,MaterialSilla material) {
		super(modelo,costoBase,porcentajeGanancia);
		setAlto(alto);
		setMaterial(material);
	}
	
	public void mostrar() {
		
	}
	
	public float calcularPrecioCosto(){
		return 0;
	}
	
	///----Setter y Getters-------------

	private long getAlto() {
		return alto;
	}

	private void setAlto(long alto) {
		this.alto = alto;
	}

	private MaterialSilla getMaterial() {
		return material;
	}

	private void setMaterial(MaterialSilla material) {
		this.material = material;
	}
	
	
	

}
