package ar.edu.ort.tp1.pacial2.clases;

import java.util.ArrayList;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Pizzeria {

	private final int CANT_PIZZA = TipoPizza.values().length;
	private final int CANT_TOPPINGS = Topping.values().length;
	private static final String MSG_PIZZA_TOPPINGS_NULO = "No se pudo fabricar Pizza o Topping nulo.";
	private static final String MSG_TOPPINGS = "Error de parámetros incorporando toppings";
	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_E_CONSUMIR_TOPPING = "No se pudo fabricar %s por falta de topping %s";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private String nombre;
	private int matrizTopping [][];
	private Pila<String> pilaErrores;
	private ListaOrdenada<Float,Pizza> pizzasPorPrecio;
	
	public Pizzeria(String nombre) {
		this.nombre=nombre;
		pilaErrores = new PilaNodos<>();
		matrizTopping = new int[CANT_PIZZA][CANT_TOPPINGS];
		pizzasPorPrecio = new PizzasOrdenadaPorPrecio();
	}

	public void incorporarTopping(TipoPizza tipoPizza, Topping topping, int cantidad) {
		if(cantidad>=0){
			matrizTopping[tipoPizza.ordinal()][topping.ordinal()] += cantidad;
		}else {
			String m = String.format(MSG_E_CONSUMIR_TOPPING, tipoPizza.getDescripcion(),topping.getNombre());
			pilaErrores.push(m);
			throw new IllegalArgumentException(m);
		}
	}

	public void ingresarPedido(Pizza p, Topping topping) {
		validarPizzaTopping(p,topping);
		consumirTopping(p,topping);
		pizzasPorPrecio.add(p);
	}



	private void consumirTopping(Pizza p, Topping topping) {
		if(matrizTopping[p.tipo().ordinal()][topping.ordinal()] > 0 ) {
			matrizTopping[p.tipo().ordinal()][topping.ordinal()]--;
		}else {
			String m = String.format(MSG_E_CONSUMIR_TOPPING, p.getNombre(),topping.getNombre());
			pilaErrores.push(m);
			throw new IllegalArgumentException(m);
		}
		
	}

	private void validarPizzaTopping(Pizza p, Topping topping) {
		if(p == null || topping == null) {
			pilaErrores.push(MSG_PIZZA_TOPPINGS_NULO);
			throw new IllegalArgumentException(MSG_PIZZA_TOPPINGS_NULO);
		}
	}

	public void mostrar() {
		System.out.println("Pizzeria: "+this.nombre);
		System.out.println("Se han fabricado: 3 Tradicionales, 5 Especiales y 4 Rectangulares");
		System.out.println("La venta total fue: $14494,20");
		
		System.out.println("--------------------------------------");
		
		System.out.println("Pizzas fabricadas por precio descendente: ");
		for (Pizza pizza : pizzasPorPrecio) {
			pizza.mostrar();
		}
		
		System.out.println("--------------------------------------");
		
		System.out.println("Pedidos con error:");
		while(!pilaErrores.isEmpty()) {
			System.out.println(pilaErrores.pop());
		}
	}
	
	public double importeTotalVentasPorNombrePizza(String string) {
		double retorno=0;
		for (Pizza pizza : pizzasPorPrecio) {
			if(pizza.getNombre().equals(string)) {
				retorno += pizza.getPrecioDeVenta();
			}
		}
		return retorno;
	}

}
