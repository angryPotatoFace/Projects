package ar.edu.ort.tp1.pacial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;
import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;

public class PizzasOrdenadaPorPrecio extends ListaOrdenadaNodos<Float,Pizza> implements ListaOrdenada<Float, Pizza>{

	@Override
	public int compare(Pizza dato1, Pizza dato2) {
		Float valor1 = dato1.getPrecioDeVenta();
		Float valor2 = dato2.getPrecioDeVenta();
		return valor2.compareTo(valor1);
	}

	@Override
	public int compareByKey(Float clave,Pizza elemento) {
		return -1*clave.compareTo(elemento.getPrecioDeCosto());
	}
}
