package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {

	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;

	public Gato(String nombre,double peso,boolean vacunado,Estado estado){
		super(nombre,peso,vacunado,estado);
	}
	
	public void comer(double comida){
		mostrarEstado();
		actualizarPeso(comida*MULT_ALIMENTACION);
	}

	public void defecar(){
		System.out.println("Gato defeco");
		actualizarPeso(PORC_DESC_PESO);
	}
}
