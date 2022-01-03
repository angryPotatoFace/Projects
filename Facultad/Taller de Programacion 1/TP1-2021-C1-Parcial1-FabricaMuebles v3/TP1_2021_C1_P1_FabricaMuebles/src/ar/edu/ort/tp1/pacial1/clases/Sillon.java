package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	private int cantCuerpos;
	private TelaSillon tela;

	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cuerpos ,TelaSillon tela) {
		super(modelo,costoBase,porcentajeGanancia);
		this.cantCuerpos=cuerpos;
		this.tela=tela;
	}
	
	public void mostrar() {
		
	}
		
	public float calcularPrecioCosto(){
		return 0;
	}
}
