package ar.edu.ort.tp1.examen.clases;

public class Raqueta extends Producto {

	private static final String MSG_TAMANIO_ARO_INVALIDO = "Tamaño de aro inválido.";
	private static final String MSG_RAQUETA = 
			"La raqueta tiene un tamaño de aro %d es de la marca %s y tiene un id %d\n";
	private static final int TAMANIO_MINIMO = 93;
	private static final int TAMANIO_MAXIMO = 120;
	private int tamanioAro;
	
	public Raqueta(int id, String marca, int tamanioAro) {
		super(id, marca);
		setTamanioAro(tamanioAro);
	}
	private void setTamanioAro(int Aro) {
		if(TAMANIO_MINIMO<Aro && Aro<TAMANIO_MAXIMO)
			this.tamanioAro = Aro;
		else
			throw new IllegalArgumentException(MSG_TAMANIO_ARO_INVALIDO);
	}
	
	@Override
	public void mostrar() {
		System.out.printf(String.format(MSG_RAQUETA,this.tamanioAro,this.getMarca(),this.getId()));
	}

}
