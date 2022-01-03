package ar.edu.ort.tp1.parcial1.clases;
import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private ArrayList<Mascota>mascotas;
	private Doctor doctor;

	public Veterinaria(String nombre, Doctor doctor) {
		mascotas = new ArrayList<Mascota>();
		setDoctor(doctor);
		
	}

	public void admitirMascota(Mascota mascota) {
		boolean condicion = buscarMascota(mascota.getNombre())==null; 
		if(condicion) {
			this.mascotas.add(mascota);
			System.out.println("Mascota Ingresada :"+mascota.getNombre());
		}else{
			System.out.println("Mascota ya existente");
		}
	}

	public Mascota buscarMascota(String nombreDeMascota){
		int i=0;
		Mascota resultado=null;
		boolean aux=false;
		while(i<mascotas.size() && resultado==null){
			aux = mascotas.get(i).getNombre().equals(nombreDeMascota);
			if(aux){
				resultado = mascotas.get(i);
			}
			i++;
		}
		return resultado;
	}

	public void vacunar() {
		for (Mascota mascota : mascotas) {
			mascota.vacunarMascota();
		}
	}
	
	public void mostrar(){
		int p=0,g=0,c=0;
		String tipoMascota="";
		System.out.println("Doctor encargado "+this.doctor.getNombre());
		System.out.println("Cantidad de mascotas alojadas "+this.mascotas.size());
		for (Mascota mascota : mascotas) {
			tipoMascota=mascota.getClass().getSimpleName();
			if(tipoMascota.equals("Perro")){
				p++;
			}
			if(tipoMascota.equals("Gato")) {
				g++;
			}
				
			if(tipoMascota.equals("Conejo")) {
				c++;
			}
		}
		System.out.println("Perros "+p+" Gatos "+g+" Conejos "+c);
	}

	private void setDoctor(Doctor doctor) {
		if(doctor !=null) 
			this.doctor = doctor;
	}
	
	

}
