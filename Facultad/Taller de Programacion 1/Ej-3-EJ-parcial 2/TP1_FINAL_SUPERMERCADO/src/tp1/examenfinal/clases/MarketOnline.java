package tp1.examenfinal.clases;

import java.util.ArrayList;

import tp1.examenfinal.tad.Cola;
import tp1.examenfinal.tad.Pila;
import tp1.examenfinal.tad.implementaciones.arraylist.ColaAL;
import tp1.examenfinal.tad.implementaciones.arraylist.PilaAL;
import tp1.examenfinal.tad.implementaciones.nodo.ColaNodos;
import tp1.examenfinal.tad.implementaciones.nodo.PilaNodos;

public class MarketOnline {

	private static final String MSG_PROD_NO_ENCONTRADO = "Producto no encontrado";
	private static final String MSG_CANT_PRODS_INVALIDA = "La cantidad de productos indicada es erronea";
	private static final String MSG_NOMBRE_INVALIDO = "El nombre del mercado es invalido";
	private static final int CANT_PRODS_MINIMO = 5;
	private static final int CANT_PRODS_MAXIMO = 30;
	private String nombre;
	private Pila<Producto> productos;
	
	public MarketOnline(String a, int cantProd) {
		setNombre(a);
		setProductos(cantProd);
	}

	private void setNombre(String nombre) {
		if(nombre != null && !nombre.isBlank())
			this.nombre = nombre;
		else
			throw new IllegalArgumentException(MSG_NOMBRE_INVALIDO);
	}
	
	private void setProductos(int a) {
		if(CANT_PRODS_MINIMO<a && a<CANT_PRODS_MAXIMO) 
			this.productos = new PilaNodos<Producto>(a);
		else
			throw new IllegalArgumentException(MSG_CANT_PRODS_INVALIDA);
	}
	
	public void agregarProducto(int id, String nombre, String descripcion, String nomMarca , Origen origen,int cant){
		Producto p;
		if(productos.isFull()) {
			throw new RuntimeException("No se pueden agregar mas productos");
		}
		if( cant>1) {
			p = new ProductoBulto(id,nombre,descripcion,nomMarca,origen,cant);
		}else{
			p = new ProductoSimple(id,nombre,descripcion,nomMarca,origen);
		}
		productos.push(p);
	}
	
	public void ordenarProductos(ArrayList<Integer> lista){
		Cola<Producto> cola = buscarProds(lista);
		
	}
	
	private Cola<Producto> buscarProds(ArrayList<Integer> lista){
	
		Cola<Producto> retorno = new ColaNodos<Producto>(); 
		
		for (Integer id : lista) {
			Producto p = buscarProdPorId(id);
			if(p != null) {
				retorno.add(p);
			}else {
				System.out.println("Error seleccionando producto: Producto no encontrado");
			}
		}
		
		return retorno;
	}

	private Producto buscarProdPorId(Integer clave){
		Producto retorno = null;
		
		Pila<Producto> aux = new PilaNodos<Producto>();
		while( !productos.isEmpty() && retorno ==null) {
			Producto p = productos.pop();
			if(p.soyYo(clave)) {
				retorno = p;
			}else{
				aux.push(p);
			} 
		}
		while(!aux.isEmpty()) {
			productos.push(aux.pop());
		}
		return retorno;
	}
	
	public Integer buscarIdProd(String nombre , String marca) {
		
		int retorno = -1;
		Pila<Producto> aux = new PilaNodos<Producto>();
		while( !productos.isEmpty() && retorno ==-1){
			Producto p = productos.pop();
			if(p.soyYo(nombre,marca)){
				retorno = p.getId();
			}
			aux.push(p);
		}
		while(!aux.isEmpty()) {
			productos.push(aux.pop());
		}
		
		return retorno;
	}

	
}
