package tp1.examenfinal.test;

import java.util.ArrayList;

import tp1.examenfinal.clases.Origen;
import tp1.examenfinal.clases.MarketOnline;

public class Main {

	private static final int CANTIDAD_PRODUCTOS = 10;

	public static void main(String[] args) {

		System.out.println("---------------------------------- Se crea el mercado ---------------------------------- ");
		MarketOnline mo = new MarketOnline("SupermercadORT", CANTIDAD_PRODUCTOS);
		System.out.println(
				"---------------------------------- Se agregan productos al mercado ---------------------------------- ");
		agregarProductos(mo);
		System.out
				.println("---------------------------------- Se compran productos ---------------------------------- ");
		realizarPedido(mo);
		System.out.println("---------------------------------- FIN ---------------------------------- ");

	}

	private static void agregarProductos(MarketOnline mo) {

		agregarProducto(mo, 1, "blanclaflor pizza", "harina leudante", "blancaflor", Origen.ARGENTINA, 1);

		agregarProducto(mo, -1, "id invalido", "id invalido", "id invalido", Origen.ARGENTINA, 13);

		agregarProducto(mo, 2, "cocinero mezcla", "aceite mezcla", "cocinero", Origen.ARGENTINA, 3);

		agregarProducto(mo, 3, "", "sin nombre", "sin nombre", Origen.ARGENTINA, 4);

		agregarProducto(mo, 4, "sin descripcion", "", "sin descripcion", Origen.ARGENTINA, 1);

		agregarProducto(mo, 5, "sin origen", "sin origen", "sin origen", null, 2);

		agregarProducto(mo, 6, "casancrem", "queso untable", "casanto", Origen.ARGENTINA, 1);

		agregarProducto(mo, 7, "quesabores", "queso en hebras", "sancor", Origen.ARGENTINA,
				11);

		agregarProducto(mo, 8, "cantidadXBulto invalida", "cantidadXBulto invalida", "cantidadXBulto invalida", Origen.ARGENTINA, 0);

		agregarProducto(mo, 9, "yogs", "yogur bebible", "sancor", Origen.ARGENTINA, 1);

		agregarProducto(mo, 10, "yogurisimo", "yogur bebible", "la serenisima", Origen.ARGENTINA, 1);

		agregarProducto(mo, 11, "jugos exprimidos", "jugos exprimidos", "Citric", Origen.BRASILERA, 14);

		agregarProducto(mo, 12, "capeletinis", "pastas secas", "giacomo", Origen.COLOMBIANA, 1);

	}

	private static void agregarProducto(MarketOnline mo, int id, String nombreProducto, String descripcion, String nombreMarca,
			Origen nacionalidad, int cantidadXBulto) {
			
			try {
				mo.agregarProducto(id, nombreProducto, descripcion, nombreMarca, nacionalidad, cantidadXBulto);
				System.out.println("Producto agregado (" + nombreProducto + " - " + nombreMarca + " ID: " + id + ")");
			}
			catch(IllegalArgumentException e){
				System.out.println("Error agregando producto al mercado:"+e.getMessage());
			}
			catch(IllegalAccessError e) {
				System.out.println("Error agregando producto al mercado:"+e.getMessage());

			}

	}

	private static void realizarPedido(MarketOnline mo) {

		System.out.println("---------------------------------- Se genera Lista de IDs a pedir ----------------------------------");
		ArrayList<Integer> ids = obtenerListaIds(mo);

		System.out.println("---------------------------------- Se ordenan los productos con los IDs deseados ----------------------------------");
		mo.ordenarProductos(ids);

	}

	private static ArrayList<Integer> obtenerListaIds(MarketOnline mo) {
		ArrayList<Integer> ids = new ArrayList<Integer>();

		agregarIdProdALista("blancaflor pizza", "blancaflor", mo, ids);

		agregarIdProdALista("", "sin nombre", mo, ids);

		agregarIdProdALista("yogs", "sancor", mo, ids);

		agregarIdProdALista("yogurisimo", "la serenisima", mo, ids);

		agregarIdProdALista("quesabores", "sancor", mo, ids);

		ids.add(77);

		agregarIdProdALista("casancrem", "casanto", mo, ids);

		agregarIdProdALista("sin marca", "", mo, ids);

		return ids;
	}

	private static void agregarIdProdALista(String nombre, String marca, MarketOnline mo, ArrayList<Integer> ids) {
		try {
			ids.add(mo.buscarIdProd(nombre, marca));
		}
		catch(RuntimeException e){
			System.out.println("Error seleccionando producto: "+e.getMessage());
		}
		
	}
}
