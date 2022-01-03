package ar.edu.ort.tp1.examen.clases;

public class Raqueta extends Producto {


	private static final String MSG_TAMANIO_ARO_INVALIDO = "Tama�o de aro inv�lido.";
	private static final String MSG_RAQUETA = "La raqueta tiene un tama�o de aro %d es de la marca %s y tiene un id %d\n";
	private static final int MIN_TAMANIO_ARO = 93;
	private static final int MAX_TAMANIO_ARO = 120;
	private int tama�oAro;
	
	public Raqueta(int id, String marca,int tama�oAro) {
		super(id, marca);
		setTama�oAro(tama�oAro);
		
	}

	private void setTama�oAro(int tamanioAro) {
		if( MIN_TAMANIO_ARO < tamanioAro && tamanioAro < MAX_TAMANIO_ARO )
			this.tama�oAro = tama�oAro;
		else
			throw new IllegalArgumentException(MSG_TAMANIO_ARO_INVALIDO);
	}
	
	public void mostrar() {
	  System.out.printf(MSG_RAQUETA, this.tama�oAro, this.getMarca(),this.getId()); 
	}
	
	
}
