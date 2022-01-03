package ar.edu.ort.tp1.recuperatorio.parte1.clases;

import java.util.ArrayList;

public class CentroBuceo {

	private static final int CANTIDAD_BUCEOS = 10;
	private String nombre;
	private ArrayList<Reserva> reservas;

	public CentroBuceo(String nombre) {
		this.nombre=nombre;
		this.reservas=new ArrayList<Reserva>();
	}

	/**
	 * Carga las reservas pasadas por parámetro en la estructura correspondiente del centro de buceo.
	 * @param reservas
	 */
	public void cargarReservas(ArrayList<Reserva> reservas) {
		for (Reserva reserva : reservas) {
			this.reservas.add(reserva);
		}
		System.out.println("Se procesaron " + reservas.size() + " reservas");
	}

	public void mostrarEstadisticas() {
		System.out.println("Estadisticas del centro de buceo: " + nombre);

		this.mostrarCantidadDeReservasPorMes();
		this.mostrarPromedioDeReservasPorBuceo();

	}

	private void mostrarCantidadDeReservasPorMes() {
		int enero=0,febrero=0,marzo=0,abril=0,mayo=0,julio=0,junio=0,agosto=0,septiembre=0,octubre=0,noviembre=0,diciembre=0;
		for (Reserva reserva : reservas) {
				
			switch (reserva.getMes().getNombre()) { 
					case "Enero":
									enero++;
									break;
					case "Febrero":
									febrero++;
									break;
					case "Marzo": 
									marzo++;
									break;
					case "Abril": 
									abril++;
									break;
					case "Mayo":
									mayo++;
									break;
					case "Junio": 
									junio++;
									break;
					case "Julio":
									julio++;
									break;
					case "Agosto": 
									agosto++;
									break;
					case "Septiembre": 
									septiembre++;
									break;
					case "Octubre": 
									octubre++;
									break;
					case "Noviembre": 
									noviembre++;
									break;
					case "Diciembre": 
									diciembre++;
									break;				
				}				
		}
		System.out.println("El mes de enero tiene una cantidad de reservas de :"+enero);
		System.out.println("El mes de febrero tiene una cantidad de reservas de :"+febrero);
		System.out.println("El mes de marzo tiene una cantidad de reservas de :"+marzo);
		System.out.println("El mes de abril tiene una cantidad de reservas de :"+abril);
		System.out.println("El mes de mayo tiene una cantidad de reservas de :"+mayo);
		System.out.println("El mes de junio tiene una cantidad de reservas de :"+junio);
		System.out.println("El mes de julio tiene una cantidad de reservas de :"+julio);
		System.out.println("El mes de agosto tiene una cantidad de reservas de :"+agosto);
		System.out.println("El mes de septiembre tiene una cantidad de reservas de :"+septiembre);
		System.out.println("El mes de octubre tiene una cantidad de reservas de :"+octubre);
		System.out.println("El mes de noviembre tiene una cantidad de reservas de :"+noviembre);
		System.out.println("El mes de diciembre tiene una cantidad de reservas de :"+diciembre);
	}

	private void mostrarPromedioDeReservasPorBuceo() {
		
	}

	public void mostrarCantidadMesesConReservasPorNombreBuceo(String nombreBuceo) {
		// TODO A completar
	}
	
	public void mostrarCantidadBuceosConReservasPorNombreMes(String nombreMes) {
		// TODO A completar
	}

}
