package ar.edu.ort.tp1.examen.clases;

import javax.management.RuntimeErrorException;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

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
	private Estante estanteria[][];  
	private ProductosPorId lista;  


	// TODO Completar
	public Deposito(int profundidadEstanteria) {
		validarProfundidaEstanteria(profundidadEstanteria);
		crearEstanteria(profundidadEstanteria);
		lista = new ProductosPorId();
	}
	
	private void crearEstanteria(int p) {
		this.estanteria = new Estante[ALTO_ESTANTERIA][ANCHO_ESTANTERIA];	
		
		for (int i = 0; i < ALTO_ESTANTERIA; i++) {
			for (int j = 0; j < ANCHO_ESTANTERIA; j++) {
				estanteria[i][j] = new Estante(p);
			}
		}
		
	}

	private void validarProfundidaEstanteria(int p) {
		if(! ( PROFUNDIDAD_ESTANTERIA_MIN< p && p < PROFUNDIDAD_ESTANTERIA_MAX )) 
			throw new IllegalArgumentException(MSG_TIPO_PROD_INVALIDO);
	}

	// TODO Completar
	/**
	 * Deposita el producto recibido en la estantería, en la fila que le corresponde
	 * según su producto, en el el primer estante que tenga lugar.
	 */
	
	@Override
	public void depositar(Producto elemento) 
	{
		int fila = buscarNumFila(elemento);
		boolean deposite = false; 
		int i=0;
		while(!deposite && i<ANCHO_ESTANTERIA)
		{
			try 
			{
				estanteria[fila][i].depositar(elemento);
				deposite=true;
				this.lista.add(elemento);
			}
			catch(RuntimeException e)
			{
				i++;
			}
		}
		if(!deposite) 
			throw new RuntimeException(MSG_NO_PUDO_DEPOSITAR);
	}
	
	private int buscarNumFila(Producto elemento)
	{
		int i = FILA_PELOTA;
		if(elemento instanceof Raqueta) 
		{
			i = FILA_RAQUETA;
		}else if(elemento instanceof Bolso) 
			{
				i = FILA_BOLSO;
			}
		return i;
	}

	/**
	 * Retira un producto en base a su ID
	 */

	@Override
	public Producto retirarPorId(Integer id) {
		
		Producto result=null;
		
		int i = 0 ;
		int j = 0;
		while(result == null && i< ALTO_ESTANTERIA) {
			while( result == null && j< ANCHO_ESTANTERIA) {
				result = estanteria[i][j].retirarPorId(id); 
				j++;
			}
			i++;
			j=0;
		}
		
		return result;
	}
	
	/**
	 * Indica si un producto se encuentra depositado
	 * @param idProducto
	 * @return
	 */
		
	public void registroProductosAlojados() {
		// devuelve una lista ordenada de los productos alojados.
	}

	public boolean productoDepositado(int unId) {
		// TODO Auto-generated method stub
		return false;
	}



}
