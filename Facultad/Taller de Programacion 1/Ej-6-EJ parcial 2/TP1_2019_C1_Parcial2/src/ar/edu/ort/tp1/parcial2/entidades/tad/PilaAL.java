package ar.edu.ort.tp1.parcial2.entidades.tad;

import java.util.ArrayList;

public class PilaAL<TipoElemento> implements Pila<TipoElemento> {

	private ArrayList<TipoElemento> elementos;
	private int limite;

	public PilaAL() {
		this(SIN_LIMITE);
	}

	public PilaAL(int limite) {
		if (limite != SIN_LIMITE && limite < LIMITE_MINIMO_POSIBLE) {
			throw new IllegalArgumentException(ERR_TAM_PILA_ILEGAL);
		}
		this.limite = limite;
		this.elementos = new ArrayList<>();
	}

	@Override
	public void push(TipoElemento elemento) {
		if (isFull()) {
			throw new RuntimeException(ERR_PILA_LLENA);
		}
		elementos.add(elemento);
	}

	@Override
	public TipoElemento pop() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_PILA_VACIA);
		}
		return elementos.remove(elementos.size() - 1);
	}

	@Override
	public TipoElemento peek() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_PILA_VACIA);
		}
		return elementos.get(elementos.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	@Override
	public boolean isFull() {
		return elementos.size() == limite;
	}

	@Override
	public String toString() {
		return this.elementos.toString();
	}
}