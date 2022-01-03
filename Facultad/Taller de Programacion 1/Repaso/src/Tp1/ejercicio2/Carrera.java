package Tp1.ejercicio2;
import java.util.ArrayList;

public class Carrera {
	
	private String nombre;
	private ArrayList<Corredor>competidores;
	
	public Carrera(String nombre) {
		this.nombre=nombre;
		competidores = new ArrayList<Corredor>();
	}
	
	public boolean agregarCompetidor(String nombreApellido, float tiempo) {
		boolean resultado=false;
		if(nombreApellido != null && tiempo >0){
			if(buscarCorredor(nombreApellido)==null){
				resultado = true;
				this.competidores.add(new Corredor(nombreApellido, tiempo));
			}
		}
		return resultado;
	}
	
	private Corredor buscarCorredor(String nombreApellido){
		int i=0;
		Corredor resultado=null;
		String nombreCorredor;
		boolean aux=false;
		while(i<competidores.size() && resultado==null){
			nombreCorredor = competidores.get(i).getNombreApellido();
			aux = nombreCorredor.equals(nombreCorredor);
			if(aux){
				resultado = competidores.get(i);
			}
		}
		return resultado;
	}
	
	public ArrayList<Corredor> buscarGanador(float tiempo){
		ArrayList<Corredor> resultado = new ArrayList<Corredor>();
		for (Corredor corredor : resultado) {
			if(corredor.getTiempo() == tiempo){
				resultado.add(corredor);
			}
		}
		return resultado;
	}
	
	
}
