package ar.edu.ort.tp1.examen.clases;

import java.util.Iterator;

import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;

public class Deposito implements Depositante<Producto, Integer> {

	private static final String MSG_TIPO_PROD_INVALIDO = "Tipo de producto inválido";
	private static final String MSG_NO_PUDO_DEPOSITAR = "No se pudo depositar el producto.";
	private static final String MSG_PROF_INVALIDO = "Profundidad de estantería inválido";
	private static final int ALTO_ESTANTERIA = 3;
	private static final int ANCHO_ESTANTERIA = 4;
	private static final int PROFUNDIDAD_ESTANTERIA_MAX = 10;
	private static final int PROFUNDIDAD_ESTANTERIA_MIN = 2;
	private static final int FILA_PELOTA = 0;
	private static final int FILA_RAQUETA = 1;
	private static final int FILA_BOLSO = 2;
	private ListaOrdenada<Integer, Producto> productosDepositados;
	private Estante estanteria[][];
	
	
	public Deposito(int profundidadEstanteria) {
		this.estanteria= new Estante[ALTO_ESTANTERIA][ANCHO_ESTANTERIA];
		inicializarEstanteria(profundidadEstanteria);
	}

	private void inicializarEstanteria(int p) {
		for (int i = 0; i < ALTO_ESTANTERIA; i++) {
			for (int j = 0; j < ANCHO_ESTANTERIA; j++) {
				if(PROFUNDIDAD_ESTANTERIA_MIN <p && p<PROFUNDIDAD_ESTANTERIA_MAX)
					estanteria[i][j] = new Estante(p);
				else
					throw new IllegalArgumentException(MSG_PROF_INVALIDO);
			}
		}
		
	}

	@Override
	public void depositar(Producto elemento) 
	{
		if(elemento != null) 
		{
			int fila = calcularFila(elemento);
			int i=0;
			boolean depositado = false;
			while(i< ANCHO_ESTANTERIA && depositado == false) {
				try {
				estanteria[fila][i].depositar(elemento);
				depositado =true;
				}
				catch(RuntimeException e){
					i++;
				}
			}
			if(depositado == false) {
				throw new RuntimeException(MSG_NO_PUDO_DEPOSITAR);
			}
		}else 
		{
			throw new IllegalArgumentException(MSG_NO_PUDO_DEPOSITAR);
		}
	}

	private int calcularFila(Producto elemento) {
		int i=0;
		if(elemento instanceof Pelota) 
		{
			i = FILA_PELOTA;
		}else if(elemento instanceof Raqueta) 
				{
					i = FILA_RAQUETA;
				}else if(elemento instanceof Bolso) 
					{
						i = FILA_BOLSO;
					}else{
						throw new IllegalArgumentException(MSG_TIPO_PROD_INVALIDO);
					}
		return i;
	}

	@Override
	public Producto retirarPorId(Integer id) {
		Producto retorno = null;
		int i=0;
		while(retorno == null && i<ALTO_ESTANTERIA) {
			int j=0;
			while(retorno == null && j<ANCHO_ESTANTERIA) {
				Producto p = estanteria[i][j].retirarPorId(id);
				if(p != null){
					retorno = p;
				}
				j++;
			}
			i++;
		}
		return retorno;
	}

	public boolean productoDepositado(int unId) {
		boolean retorno = false;
		int i=0;
		while(!retorno && i<ALTO_ESTANTERIA){
			int j=0;
			while(!retorno && j<ANCHO_ESTANTERIA) {
				Producto p = estanteria[i][j].retirarPorId(unId);
				if(p != null){
					retorno = true;
					estanteria[i][j].depositar(p);
				}
				j++;
			}
			i++;
		}
		return retorno;
	}
	
	private void sacarDeLaEstanteria(Producto p) {
		
	}
}
