package ar.edu.ort.tp1.recuperatorio.parte2.clases;

import ar.edu.ort.tp1.recuperatorio.parte1.clases.Buceo;
import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.ListaOrdenada;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class CentroBuceoAvanzado {

	private static final String BUCEO_INVALIDO = "Buceo Inválido";
	// TODO A completar atribuos.

	public CentroBuceoAvanzado(String nombre) {
		// TODO A completar
	}

	/**
	 * Se registra un buceo para un determinado buzo. si ocurre un error se registra
	 * en el log de errores, pero no se aborta la ejecución.
	 * 
	 * -El buzo no puede ser nulo.
	 * 
	 * -El buceo cuyo id se indica, debe estar en la colección de buceos disponibles.
	 * 
	 * -El buzo debe estar habilitado para realizar el buceo seleccionado.
	 * 
	 * -De poder registrar al buzo, se debe agregar el buceo a su bitacora y
	 * agregarlo a los buzos registrados, que deben estar almacenados de forma
	 * cronológica.
	 * 
	 * @param buzo    Que desea bucear.
	 * @param idBuceo Identificador del buceo que el buzo quiere hacer.
	 */
	public void registrarBuceo(Buzo buzo, Integer idBuceo) {
		// TODO A completar
	}

	public void agregarBuceo(Buceo b) {
		//TODO A completar
		this.buceosDisponibles.add(b);
	}

	public void listarErroresCronologico() {
		System.out.println("Mostrando errores en forma cronoógica");
		// TODO A completar
		System.out.println("------------------");
	}


	public void mostrarCantidadDeBuceosPorBuzoRegistrado() {
		// TODO A completar
		System.out.println("Cantidad de buceos realizados por los buzos registrados en " + this.nombre);
	}
}
