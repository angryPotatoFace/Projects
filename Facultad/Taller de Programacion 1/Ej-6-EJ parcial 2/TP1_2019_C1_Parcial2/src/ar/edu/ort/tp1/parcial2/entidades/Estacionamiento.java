/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import java.util.ArrayList;

import ar.edu.ort.tp1.parcial2.entidades.tad.Pila;
import ar.edu.ort.tp1.parcial2.entidades.tad.PilaNodos;

/**
 * Entidad que engloba el funcionamiento de un estacionamiento de autos y
 * motocicletas. cada tipo de vehículo será estacionado de la forma determinada
 * y en base a su capacidad asignada al momento de la creación del
 * estacionamiento.
 * 
 * Se debe tene en cuenta que el funcionamiento del estacionamiento para cada
 * tipo de vehículo es del tipo LIFO Utilizar la implementación de TAD que
 * corresponda
 */
public class Estacionamiento {

	// COMPLETAR / CORREGIR
	/**
	 * TAD para alojar las motocicletas estacionadas.
	 */
	
	private float recaudacionTotalAutosEstacionados;
	private float recaudacionTotalMotocicletaEstacionados;

	
	private Pila<Vehiculo> tadMotos;
	/**
	 * TAD para alojar los autos estacionados.
	 */
	private Pila<Vehiculo> tadAutos;

	/**
	 * Precio de la hora completa para motocicletas
	 */
	private float precioMotocicletasPorHora;
	/**
	 * Precio de la hora completa para autos
	 */
	private float precioAutosPorHora;
	
	private ArrayList<RegistroVehiculoEstacionado> autosEstacionados;
	private ArrayList<RegistroVehiculoEstacionado> motosEstacionados;
	/**
	 * Constructor del estacionamiento, recibe las capacidades de autos y motos y
	 * los precios por hora completas.
	 * 
	 * @param capacidadAutos
	 * @param capacidadMotocicletas
	 * @param precioAutosPorHora
	 * @param precioMotocicletasPorHora
	 */
	public Estacionamiento(int capacidadAutos, int capacidadMotocicletas, float precioAutosPorHora,
			float precioMotocicletasPorHora) {
		this.tadAutos = new PilaNodos<>(capacidadAutos);
		this.tadMotos = new PilaNodos<>(capacidadMotocicletas);
		this.autosEstacionados = new ArrayList<>();
		this.motosEstacionados = new ArrayList<>();
		setPrecioAutosPorHora(precioAutosPorHora);
		setPrecioMotocicletasPorHora(precioMotocicletasPorHora);
	}

	/**
	 * Setea el precio de la hora de auto, debe ser mayor a 0
	 * 
	 * @param precioAutos the precioAutos to set
	 */
	private void setPrecioAutosPorHora(float precioAutosPorHora) {
		if(precioAutosPorHora > 0)
			this.precioAutosPorHora = precioAutosPorHora;
	}

	/**
	 * Setea el precio de la hora de la motocicleta , debe ser mayor a 0
	 * 
	 * @param precioMotocicletas the precioMotocicletas to set
	 */
	private void setPrecioMotocicletasPorHora(float precioMotocicletasPorHora) {
		if(this.precioMotocicletasPorHora > 0)
			this.precioMotocicletasPorHora = precioMotocicletasPorHora;
	}

	/**
	 * Permite estacionar un vehículo en el estacionamiento. La patente debe ser
	 * válida segun el tipo de vehículo el horario de ingreso debe ser válido
	 * 
	 * @param tipo
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	public void estacionar(TipoVehiculo tipo, String patente, int horaIngreso, int minutosIngreso) {		
		if(tipo == TipoVehiculo.AUTO)
			this.estacionarAuto(patente, horaIngreso, minutosIngreso);
		else 
			this.estacionarMoto(patente, horaIngreso, minutosIngreso);
	}

	/**
	 * Permite estacionar una motocicleta.
	 * 
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	private void estacionarMoto(String patente, int horaIngreso, int minutosIngreso) throws RuntimeException {
		Motocicleta moto = new Motocicleta(patente, horaIngreso, horaIngreso, precioAutosPorHora);
		this.tadMotos.push(moto);
		this.motosEstacionados.add(new RegistroVehiculoEstacionado(patente, moto.calcularImporte(horaIngreso, minutosIngreso)));
	}

	/**
	 * permite estacionar un auto
	 * 
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	private void estacionarAuto(String patente, int horaIngreso, int minutosIngreso) throws RuntimeException {
		Auto auto = new Auto(patente, horaIngreso, horaIngreso, precioAutosPorHora);
		this.tadAutos.push(auto);
		this.autosEstacionados.add(new RegistroVehiculoEstacionado(patente, auto.calcularImporte(horaIngreso, minutosIngreso)));
	}

	/**
	 * Retira un vehículo del estacionamiento. debe detectar el tipo de vehículo en
	 * base a su patente (ver diferencias entre la patente de los autos y las motos)
	 * el horario de egreso debe ser válido si el vehículo no está estacionado debe
	 * lanzar una excepción.
	 * 
	 * @param patente
	 * @param horaEgreso
	 * @param minutosEgreso
	 * @return
	 */
	public float retirar(String patente, int horaEgreso, int minutosEgreso) {
		float importe = 0;
		Vehiculo.validarPatente(patente);
		return importe;
	}

	/**
	 * Retira el vehículo de la TAD especificada
	 * 
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	private Vehiculo retirar(String patente, Pila<Vehiculo> elemento) {
		Vehiculo encontrado = null;
		Pila<Vehiculo> aux = new PilaNodos<>();
		while(!elemento.isEmpty()&& encontrado ==null ) {
			Vehiculo v = elemento.pop();
			if(patente.equals(v.getPatente())){
				encontrado = v;
			}
			aux.push(v);
		}
		
		while(!aux.isEmpty()) {
			elemento.push(aux.pop());
		}
		
		if(encontrado == null) {
			throw new RuntimeException("Vehículo con patente "+ patente +" No encontrado");
		}

		return encontrado;
	}
}
