package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private String nombre;
	
	public FabricaDeMuebles(String nombre) {
		this.nombre=nombre;
	}

	public boolean fabricar(Mueble m) {

		boolean retorno = false;
		//TODO A completar
		return retorno;
	}

	@Override
	public void mostrar() {
		//TODO A completar
	}

	public boolean seHaFabricado(String modelo) {

		boolean seHaFabricado = false;
		//TODO A completar
		return seHaFabricado;
	}
}
