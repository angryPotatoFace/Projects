package ar.edu.ort.tp1.examen.clases;

public abstract class Producto implements Mostrable {
	private static final String MSG_MARCA_INVALIDA = "La marca no puede ser nula ni vacía";
	private static final String MSG_ID_INVALIDO = "El id no puede ser menor a 1";

	private int id ;
	private String marca;

	public Producto(int id, String marca) {
		setId(id);
		setMarca(marca);
	}

	private void setId(int id) {
		if( id >0)
			this.id = id;
		else
			throw new IllegalArgumentException(MSG_ID_INVALIDO);
	}

	private void setMarca(String marca) {
		if( !marca.isBlank() && marca != null)
			this.marca = marca;		
		else
			throw new IllegalArgumentException(MSG_MARCA_INVALIDA);
		
	}

	protected int getId() {
		return id;
	}

	protected String getMarca() {
		return marca;
	}
	
}
