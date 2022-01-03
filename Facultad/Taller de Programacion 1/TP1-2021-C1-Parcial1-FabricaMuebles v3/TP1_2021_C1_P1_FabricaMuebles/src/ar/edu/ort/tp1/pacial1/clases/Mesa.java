package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipo;

	public Mesa(String modelo, float costoBase, float porcentajeGanancia,long largo, long ancho,TipoMesa tipo) {
		super(modelo,costoBase,porcentajeGanancia);
		setLargo(largo);
		setAncho(ancho);
		setTipo(tipo);
	}
	
	public void mostrar() {
		
	}
	
	public float calcularPrecioCosto(){
		return 0;
	}
	
	//---------------Seter y Getter-----------------------------
	private long getLargo() {
		return largo;
	}

	private TipoMesa getTipo() {
		return tipo;
	}

	private void setTipo(TipoMesa tipo) {
		this.tipo = tipo;
	}
	private void setLargo(long largo) {
		this.largo = largo;
	}

	private long getAncho() {
		return ancho;
	}

	private void setAncho(long ancho) {
		this.ancho = ancho;
	}
}
