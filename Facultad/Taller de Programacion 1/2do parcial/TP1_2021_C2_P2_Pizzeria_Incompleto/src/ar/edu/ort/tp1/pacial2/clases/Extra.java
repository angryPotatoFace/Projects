package ar.edu.ort.tp1.pacial2.clases;

import java.util.ArrayList;

public class Extra {
	
	private ArrayList<Topping>lista;
	private Topping tipo;
	
	public Extra(int cantidad,Topping topping ) {
		lista = new ArrayList<>();
		tipo = topping;
		agregarToppings(cantidad,topping);
	}
	
	public Extra(){
		lista = new ArrayList<>();
	}

	private void agregarToppings(int cantidad,Topping topping) {
		for (int i = 0; i < cantidad; i++){
			lista.add(topping);
		}
	}	
	
	public boolean estoyVacia() {
		return lista.isEmpty();
	}
	
	public int cantStock() {
		return lista.size();
	}
	
	public boolean miTipo(Topping tipo) {
		return this.tipo == tipo;
	}
	
	public void agregarStock(int i ) {
		this.agregarToppings(i, tipo);
	}
	
	public void removerTopping() {
	}
}
