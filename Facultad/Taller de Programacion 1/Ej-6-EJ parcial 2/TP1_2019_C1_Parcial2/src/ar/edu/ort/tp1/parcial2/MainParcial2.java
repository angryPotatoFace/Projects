/**
 * 
 */
package ar.edu.ort.tp1.parcial2;

import ar.edu.ort.tp1.parcial2.entidades.Estacionamiento;
import ar.edu.ort.tp1.parcial2.entidades.TipoVehiculo;

public class MainParcial2 {

	private static final int PRECIO_MOTOCICLETAS_POR_HORA = 30;
	private static final int PRECIO_AUTOS_POR_HORA = 60;
	private static final int CAPACIDAD_MOTOCICLETAS = 5;
	private static final int CAPACIDAD_AUTOS = 6;

	public static void main(String[] args) {

		Estacionamiento e = new Estacionamiento(CAPACIDAD_AUTOS, CAPACIDAD_MOTOCICLETAS, PRECIO_AUTOS_POR_HORA,
				PRECIO_MOTOCICLETAS_POR_HORA);

		estacionarAutos(e);

		System.out.println("-------------------------------------------------------------");

		estacionarMotos(e);

		System.out.println("-------------------------------------------------------------");

		retirarAutos(e);

		System.out.println("-------------------------------------------------------------");

		retirarMotos(e);

	}

	private static void retirarAutos(Estacionamiento e) {
		float importe;
		try {
			importe = e.retirar("BGf444", 23, 10);
			System.out.printf("Se retiró correctamente el vehículo patente BGf444, debe abonar $ %4.2f \n", importe);
		} catch (RuntimeException ex) {
			System.out.println("No se pudo retirar el vehículo - " + ex.getMessage());
		}

		try {
			importe = e.retirar("BGf444", 23, 25);
			System.out.printf("Se retiró correctamente el vehículo patente BGf444, debe abonar $ %4.2f \n", importe);
		} catch (RuntimeException ex) {
			System.out.println("No se pudo retirar el vehículo - " + ex.getMessage());
		}

		try {
			importe = e.retirar("LTC824", 2, 25);
			System.out.printf("Se retiró correctamente el vehículo patente LTC824, debe abonar $ %4.2f \n", importe);
		} catch (RuntimeException ex) {
			System.out.println("No se pudo retirar el vehículo - " + ex.getMessage());
		}
	}

	private static void retirarMotos(Estacionamiento e) {
		float importe;
		try {
			importe = e.retirar("432htf", 18, 10);
			System.out.printf("Se retiró correctamente el vehículo patente 432htf, debe abonar $ %4.2f \n", importe);
		} catch (RuntimeException ex) {
			System.out.println("No se pudo retirar el vehículo - " + ex.getMessage());
		}

		try {
			importe = e.retirar("432htf", 18, 25);
			System.out.printf("Se retiró correctamente el vehículo patente 432htf, debe abonar $ %4.2f \n", importe);
		} catch (RuntimeException ex) {
			System.out.println("No se pudo retirar el vehículo - " + ex.getMessage());
		}
	}

	private static void estacionarMotos(Estacionamiento e) {
		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "324ADS", 10, 55);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "654grt", 0, 87);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "444fef", 24, 0);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "432htf", 15, 25);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "2ff444", 12, 5);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "675BGf", 9, 15);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "894NNC", 7, 10);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.MOTOCICLETA, "321HRS", 14, 15);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

	}

	private static void estacionarAutos(Estacionamiento e) {
		try {
			e.estacionar(TipoVehiculo.AUTO, "fff444", 10, 0);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "fff424", 0, 77);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "fef444", 27, 0);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "aff444", 12, 5);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "2ff444", 12, 5);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "BGf444", 20, 55);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "NNC894", 6, 25);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "HRS875", 7, 25);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "LTC824", 11, 25);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}

		try {
			e.estacionar(TipoVehiculo.AUTO, "WRG833", 14, 45);
		} catch (IllegalArgumentException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		} catch (RuntimeException ex) {
			System.out.println("No se pudo estacionar el vehiculo - " + ex.getMessage());
		}
	}
}
