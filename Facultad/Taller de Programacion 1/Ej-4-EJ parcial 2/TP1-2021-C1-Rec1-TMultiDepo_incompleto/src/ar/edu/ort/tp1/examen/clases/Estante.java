package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Estante implements Depositante<Producto, Integer> {
	
	Pila<Producto> estante;
	private int profundida;
	
	public Estante(int profundida) {
		estante = new PilaNodos<Producto>(profundida);
		this.profundida = profundida;
	}

	@Override
	public void depositar(Producto elemento) {
		if(!estante.isFull())
			estante.push(elemento);
		else
			throw new RuntimeException(" No se pudo depositar el producto. ");
	}

	@Override
	public Producto retirarPorId(Integer id) {
		
		Producto retorno=null;
		Pila<Producto> aux = new PilaNodos<Producto>();
		while(!estante.isEmpty() && retorno == null) {
			Producto p = estante.pop();
			if(p.getId() == id) {
				retorno = p;
			}else {
				aux.push(p);
			}
		}
		
		while(!aux.isEmpty()) {
			estante.push(aux.pop());
		}
		return retorno;
	}

	


}
