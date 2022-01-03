/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

/**
 * Representa un auto a ser estacionado. el precio de los autos se fracciona
 * cada 10 minutos.
 */
public class Auto extends Vehiculo {

	// Completar

	/**
	 * Constructor de auto
	 * 
	 * @param patente       patente del auto
	 * @param horaIngreso   hora del ingreso
	 * @param minutoIngreso minutos del ingreso
	 * @param precioPorHora precio de la hora completa de los autos
	 */
	private float precioDiezMinutos;
	
	public Auto(String patente, int horaIngreso, int minutoIngreso, float precioPorHora) {
		super(patente,horaIngreso,minutoIngreso);
		setPrecioDiezMinutos(precioPorHora);
	}

	private void setPrecioDiezMinutos(float precioPorHora) {
		if(precioPorHora > 0) 
			this.precioDiezMinutos = precioPorHora;
	}

	/**
	 * Valida que una patente sea válida para el tipo de vehiculo auto. debe tener
	 * formato de tres letras y tres números por ejemplo 'DSA182'.
	 */
	public void validarPatente(String patente) throws IllegalArgumentException {
		if( !(patente.matches(this.REGEX_SOLO_LETRAS))){
			throw new IllegalArgumentException("Patente errónea");
		}
	}

	/**
	 * Calcula el importe de la estadia del auto, recibiendo la hora y minutos de
	 * salida. Debe redondearse a 10 minutos la cantidad de minutos de la estadía,
	 * si la duración da 7 minutos, se deben cobrar 10.
	 */
	@Override
	
	public float calcularImporte(int horasEgreso, int minutosEgreso) throws IllegalArgumentException {
		Hora tiempo = this.calcularTiempoEstadia(horasEgreso, redondear(minutosEgreso, DIEZ));
		float importe = this.calcularImporte(tiempo.getHora(), tiempo.getMinuto());
		return importe;
	}
}
