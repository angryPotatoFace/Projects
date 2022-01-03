package ar.edu.ort.tp1.pacial2.clases;
import java.util.ArrayList;
import java.util.Iterator;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Pizzeria {

	private static final String MSG_PIZZA_TOPPINGS_NULO = "No se pudo fabricar Pizza o Topping nulo.";
	private static final String MSG_TOPPINGS = "Error de parámetros incorporando toppings";
	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private static final int FILA_TRADICIONAL = 0;
	private static final int FILA_ESPECIAL = 1;
	private static final int FILA_RECTANGULAR = 2;
	private String nombre;
	private Extra toppings [][];
	private ArrayList<Pizza> pizzas;
	private Pila<String> pilaErrores;

	public Pizzeria(String nombre) {
		setNombre(nombre);
		toppings = new Extra[3][5];
		inicializarMatriz();
		this.pizzas = new ArrayList<>();
		pilaErrores = new PilaNodos<String>();
	}
	
	private void inicializarMatriz() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				toppings[i][j] = new Extra();
			}
		}
	}

	private void setNombre(String p) {
		if(p != null && !p.isBlank())
			this.nombre=p;
		else
			throw new IllegalArgumentException("Nombre no puede ser ni nulo ni vacio");
	}

	public void incorporarTopping(TipoPizza tipoPizza, Topping topping, int cantidad) {	
		
		if( tipoPizza != null && topping != null && cantidad > 0 ){
			int fila = buscarFila(tipoPizza);
			for (int i = 0; i < cantidad; i++) {
				boolean condicion = toppings[fila][i].estoyVacia();
				if(condicion){
					this.toppings[fila][i] = new Extra(cantidad, topping);
				}
				boolean condicion2 = toppings[fila][i].miTipo(topping);
				if(condicion2) {
					toppings[fila][i].agregarStock(i);
				}
			}
		}else {
			pilaErrores.push(MSG_TOPPINGS);
			throw new IllegalArgumentException(MSG_TOPPINGS);
		}
	}
	
	private int buscarFila(TipoPizza tipoPizza) {
		int fila = 0;
		if(tipoPizza == TipoPizza.ESPECIAL){
			fila=1;
		}else if(tipoPizza == TipoPizza.RECTANGULAR) {
			fila=2;
		}
		return fila;
	}
	
	private int buscarFila(TipoPizza pizza, Topping topi) {
		int fila = buscarFila(pizza);
		int i=0,retorno=-1;
		while(retorno == -1 && i<5) {
			if(this.toppings[fila][i].miTipo(topi)) {
				retorno = i;
			}
			i++;
		}
		return retorno;
	}
	

	public void ingresarPedido(Pizza p, Topping topping) {
		/*if( p != null && topping != null ){
			int alto = this.buscarFila(p.tipo());
			int ancho = this.buscarFila(p.tipo(), topping);
			if(!this.toppings[alto][ancho].estoyVacia()){
				this.pizzas.add(p);
			}
		}else {
			pilaErrores.push(MSG_TOPPINGS);
			throw new IllegalArgumentException(MSG_PIZZA_TOPPINGS_NULO);
		}*/
	}

	public String importeTotalVentasPorNombrePizza(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}
