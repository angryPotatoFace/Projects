package ar.edu.ort.tp1.pacial1.clases;

public enum MaterialSilla {
	
	MADERA(3), METAL(5) ,PLASTICO(12);
	
	private float multiplicadoValor;
	
	private MaterialSilla(float multi){
		this.multiplicadoValor=multi;
	}

	public float getMultiplicadoValor() {
		return multiplicadoValor;
	}

	
}
