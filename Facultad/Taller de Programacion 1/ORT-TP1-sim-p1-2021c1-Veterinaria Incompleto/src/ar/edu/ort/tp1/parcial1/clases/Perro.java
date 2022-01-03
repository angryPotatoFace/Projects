package ar.edu.ort.tp1.parcial1.clases;

public class Perro extends Mascota {
	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;

	public Perro(String nombre,double peso,boolean vacunado,Estado estado){
		super(nombre,peso,vacunado,estado);
	}
	
	public void comer(double comida){
		mostrarEstado();
		actualizarPeso(comida*MULT_ALIMENTACION);
	}

	public void defecar() {
		System.out.println("Perro defeco");
		actualizarPeso(PORC_DESC_PESO);
	}
	
}
