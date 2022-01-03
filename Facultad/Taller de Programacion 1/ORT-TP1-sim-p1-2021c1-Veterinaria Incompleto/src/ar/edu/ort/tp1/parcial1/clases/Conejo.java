package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	public Conejo(String nombre,double peso,boolean vacunado,Estado estado){
		super(nombre,peso,vacunado,estado);
	}
	
	public void comer(double comida){
		mostrarEstado();
		actualizarPeso(comida*MULT_ALIMENTACION);
	}

	public void defecar() {
		System.out.println("Conejo defeco");
		actualizarPeso(PORC_DESC_PESO);
	}
	

}
