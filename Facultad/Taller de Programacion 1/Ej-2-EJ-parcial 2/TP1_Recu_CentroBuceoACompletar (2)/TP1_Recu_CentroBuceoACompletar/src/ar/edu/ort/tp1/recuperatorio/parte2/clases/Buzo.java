package ar.edu.ort.tp1.recuperatorio.parte2.clases;

import ar.edu.ort.tp1.recuperatorio.parte1.clases.Buceo;
import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public abstract class Buzo implements BuceoProfundo, Bitacorado<Buceo> {

	private static final String NOMBRE_INVALIDO = "Nombre inv?lido";
	private static final String NACIONALIDAD_INVALIDA = "Nacionalidad inv?lida";
	private static final String EDAD_INVALIDA = "Un buzo no puede ser menor de edad";
	private String nombre;
	private String nacionalidad;
	private int edad;

	/**
	 * Constructor del buzo, los buzos deben tener al menos de 18 a?os.
	 * 
	 * @param nombre - No puede estar vac?o ni ser nulo.
	 * @param nacionalidad - No puede estar vac?o ni ser nulo.
	 * @param edad debe ser v?lida.
	 */
	public Buzo(String nombre, String nacionalidad, int edad) {
		//TODO A completar
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Buzo [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + "]";
	}

	public abstract boolean habilitado(int metros);

}
