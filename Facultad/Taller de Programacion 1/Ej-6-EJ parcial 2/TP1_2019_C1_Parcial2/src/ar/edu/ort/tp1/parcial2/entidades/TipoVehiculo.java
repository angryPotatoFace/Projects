/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

public enum TipoVehiculo {
	AUTO("1"), MOTOCICLETA("2");	
	
	private String regex;

	private TipoVehiculo(String regex) {
		this.regex = regex;
	}

	public String getRegex() {
		return regex;
	}
	
}



