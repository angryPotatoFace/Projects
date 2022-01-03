/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

/**
 * Representa una motocicleta a ser estacionada. el precio de los autos se fracciona
 * cada 5 minutos.
 */
public class Motocicleta extends Vehiculo {
	//completar

	/**
	 * Constructor de motocicleta
	 * 
	 * @param patente       patente de la motocicleta
	 * @param horaIngreso   hora del ingreso
	 * @param minutoIngreso minutos del ingreso
	 * @param precioPorHora precio de la hora completa de las motocicletas
	 */
	private float precioCincoMinutos;
	
	public Motocicleta(String patente, int horaIngreso, int minutoIngreso, float precioPorHora) {
		super(patente,horaIngreso,minutoIngreso);
		setPrecioCincoMinutos(precioPorHora);
	}

	private void setPrecioCincoMinutos(float precioPorHora) {
		this.precioCincoMinutos = precioPorHora;
	}
	
	/**
	 * Valida que una patente sea válida para el tipo de vehiculo auto. debe tener
	 * formato de tres números y tres letas por ejemplo '182ABC'.
	 */
	public void validarPatente(String patente) throws IllegalArgumentException {
		if(!(patente.matches(this.REGEX_SOLO_3_NUMEROS))){
			throw new IllegalArgumentException("Patente errónea");
		}	
	}

	/**
	 * Calcula el importe de la estadia del auto, recibiendo la hora y minutos de
	 * salida. Debe redondearse a 5 minutos la cantidad de minutos de la estadía,
	 * si la duración da 12 minutos, se deben cobrar 15.
	 * si la duración da 7 minutos, se deben cobrar 10.
	 */

	@Override
	public float calcularImporte(int horasEgreso, int minutosEgreso) throws IllegalArgumentException {
		//completar
		Hora tiempo = this.calcularTiempoEstadia(horasEgreso, redondear(minutosEgreso, CINCO));
		float importe = 0;
		
		return importe;
	}

}
