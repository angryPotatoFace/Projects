package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Estante implements Depositante<Producto, Integer> {

	private final int MAX_PROFUNDIDA = 10;
	private final int MIN_PROFUNDIDA = 2;
	private Pila<Producto> ubicaciones;
	private int cantAlojados;
	private int profundidaEstanteria;
	
	public Estante(int profundidadEstanteria) {
		this.ubicaciones = new PilaNodos<>(profundidadEstanteria);
		this.cantAlojados=0;
		this.profundidaEstanteria = profundidadEstanteria;
	}

	@Override
	public void depositar(Producto elemento) {
		if(elemento != null && !ubicaciones.isFull()) {
			ubicaciones.push(elemento);
			cantAlojados++;
		}else {
			throw new RuntimeException();
		}
	}

	@Override
	public Producto retirarPorId(Integer id) {

		Pila<Producto> aux = new PilaNodos<Producto>();
		Producto retorno = null;
		while(!ubicaciones.isEmpty() && retorno == null ){
			Producto p = ubicaciones.pop();
			if(p.coincideId(id)) {
				retorno = p;
				cantAlojados--;
			}else {
				aux.push(p);
			}
		}
		while(!aux.isEmpty()) {
			ubicaciones.push(aux.pop());
		}
		return retorno;
	}

	
}
