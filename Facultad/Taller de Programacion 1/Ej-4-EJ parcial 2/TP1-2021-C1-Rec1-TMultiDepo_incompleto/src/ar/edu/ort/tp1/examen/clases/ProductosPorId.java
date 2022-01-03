package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ProductosPorId extends ListaOrdenadaNodos<Integer, Producto> {

	@Override
	public int compare(Producto dato1, Producto dato2) {
		
		return dato1.getId() - dato2.getId() ;
	}

	@Override
	public int compareByKey(Integer clave, Producto elemento) {
		// TODO Auto-generated method stub
		return clave - elemento.getId();
	} 

}
