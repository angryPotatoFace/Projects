package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private int largo,ancho;
	private TipoMesa tipoMesa;
	
	public Mesa(String modelo,int largo, int ancho,TipoMesa mesa){
		super(modelo);
		setLargo(largo);
		setAncho(ancho);
		setTipoMesa(mesa);
		
	}
	


	private int getLargo() {
		return largo;
	}

	private void setLargo(int largo) {
		this.largo = largo;
	}

	private int getAncho() {
		return ancho;
	}

	private void setAncho(int ancho) {
		this.ancho = ancho;
	}

	private TipoMesa getTipoMesa() {
		return tipoMesa;
	}

	private void setTipoMesa(TipoMesa tipoMesa) {
		this.tipoMesa = tipoMesa;
	}
	
	


}
