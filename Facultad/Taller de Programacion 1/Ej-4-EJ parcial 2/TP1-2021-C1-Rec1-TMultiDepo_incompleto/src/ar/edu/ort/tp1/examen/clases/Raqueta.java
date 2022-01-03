package ar.edu.ort.tp1.examen.clases;

public class Raqueta extends Producto {


	private static final String MSG_TAMANIO_ARO_INVALIDO = "Tamaño de aro inválido.";
	private static final String MSG_RAQUETA = "La raqueta tiene un tamaño de aro %d es de la marca %s y tiene un id %d\n";
	private static final int MIN_TAMANIO_ARO = 93;
	private static final int MAX_TAMANIO_ARO = 120;
	private int tamañoAro;
	
	public Raqueta(int id, String marca,int tamañoAro) {
		super(id, marca);
		setTamañoAro(tamañoAro);
		
	}

	private void setTamañoAro(int tamanioAro) {
		if( MIN_TAMANIO_ARO < tamanioAro && tamanioAro < MAX_TAMANIO_ARO )
			this.tamañoAro = tamañoAro;
		else
			throw new IllegalArgumentException(MSG_TAMANIO_ARO_INVALIDO);
	}
	
	public void mostrar() {
	  System.out.printf(MSG_RAQUETA, this.tamañoAro, this.getMarca(),this.getId()); 
	}
	
	
}
