package tp1.examenfinal.clases;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import tp1.examenfinal.tad.Cola;
import tp1.examenfinal.tad.Pila;
import tp1.examenfinal.tad.implementaciones.arraylist.ColaAL;
import tp1.examenfinal.tad.implementaciones.arraylist.PilaAL;
import tp1.examenfinal.tad.implementaciones.nodo.ColaNodos;
import tp1.examenfinal.tad.implementaciones.nodo.PilaNodos;

public class MarketOnline {

	private static final String MSG_PROD_NO_ENCONTRADO = "Producto no encontrado";
	private static final String MSG_CANT_PRODS_INVALIDA = " La cantidad de productos indicada es erronea";
	private static final String MSG_NOMBRE_INVALIDO = "El nombre del mercado es invalido";
	private static final int CANT_PRODS_MINIMO = 5;
	private static final int CANT_PRODS_MAXIMO = 30;
	private String nombre;
	private Pila<Producto> productos;
	
	public MarketOnline(String nombre, int numero) {
		setNombre(nombre);
		setProductos(numero);
	}

	private void setProductos(int n) {
		if(CANT_PRODS_MINIMO < n && n < CANT_PRODS_MAXIMO )
			productos = new PilaNodos<Producto>( n);
		else
			throw new IllegalArgumentException(MSG_CANT_PRODS_INVALIDA);
	}

	private void setNombre(String nombre) {
		if(nombre != null && !nombre.isBlank())
			this.nombre = nombre;
		else
			throw new IllegalArgumentException(MSG_NOMBRE_INVALIDO);
	}
	
	public void agregarProducto(int id, String nombre, String descripcion, String nombMarca, Origen origen, int cantidadXBulto) {
		if(cantidadXBulto > 1) {
			productos.push(new ProductoBulto(id, nombre, descripcion, nombMarca, origen, cantidadXBulto));
		} else if(cantidadXBulto == 1) {
			productos.push(new ProductoSimple(id, nombre, descripcion, nombMarca, origen));
		} else {
			throw new IllegalArgumentException(MSG_CANT_PRODS_INVALIDA);
		}
	}
	
	public void ordenarProductos(ArrayList<Integer> l) {
		System.out.println("El mercado SupermercadORT ordenara los productos seleccionados");
		Cola <Producto> lista = buscarProds(l);
		lista.add(null);
		Producto p = lista.remove();
		while(p != null) {
			System.out.println(p.mostrar());
			lista.add(p);
			p = lista.remove();
		}		
	}
	
	private Cola<Producto> buscarProds(ArrayList<Integer> lista){
		Cola<Producto> retorno = new ColaNodos<Producto>();
		for (Integer integer : lista) {
			Producto p = buscarProdPorId(integer);
			if(p != null) {
				retorno.add(p);
			}else {
				System.out.println("Prod Id "+integer+" no encontrado");
			}
		}
		return retorno;
	}
	
	private Producto buscarProdPorId(Integer id) {

		Producto retorno = null;
		Pila<Producto> aux = new PilaNodos<Producto>();
		
		while(!productos.isEmpty() && retorno ==null) {
			Producto p = productos.pop();
			if(p.soyYo(id)) {
				retorno = p ;
			}else {
				aux.push(p);
			}
		}
		
		while(!aux.isEmpty()) {
			productos.push(aux.pop());
		}
		
		return retorno;
	}

	public Integer buscarIdProd(String nombre, String marca) {
		int retorno = -1;
		Pila<Producto> aux = new PilaNodos<Producto>();
		
		while(!productos.isEmpty() && retorno == -1) {
			Producto p = productos.pop();
			if(p.soyYo(nombre,marca)) {
				retorno = p.getId();
			}
			aux.push(p);
		}
		while(!aux.isEmpty()) {
			productos.push(aux.pop());
		}
		
		if(retorno == -1)
			throw new RuntimeException(MSG_PROD_NO_ENCONTRADO);
		
		return retorno;
	}
}
