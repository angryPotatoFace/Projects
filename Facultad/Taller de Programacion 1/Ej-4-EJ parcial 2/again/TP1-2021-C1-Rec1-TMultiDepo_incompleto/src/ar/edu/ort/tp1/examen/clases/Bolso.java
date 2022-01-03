package ar.edu.ort.tp1.examen.clases;

public class Bolso extends Producto {
	private static final String MODELO_DE_BOLSO_INVÁLIDO = "Modelo de bolso inválido.";
	private static final String MSG_MODELO = 
			"El bolso es de modelo %s es de la marca %s y tiene un id %d\n";
	private String modelo;
	
	public Bolso(int id, String marca, String modelo) {
		super(id, marca);
		setModelo(modelo);
	}
	private void setModelo(String modelo) {
		if(modelo != null && !modelo.isBlank())
			this.modelo = modelo;
		else
			throw new IllegalArgumentException(MODELO_DE_BOLSO_INVÁLIDO);		
	}

	@Override
	public void mostrar() {
		System.out.printf(String.format(MODELO_DE_BOLSO_INVÁLIDO,this.modelo,this.getMarca(),this.getId()));
	}
	
	
	

}
