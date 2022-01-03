package tp1.examenfinal.clases;

/**
 * Indica que la clase que implemente devuelva un ID del tipo parametrizado
 * 
 * @param <T> Tipo de dato del identificador
 */
public interface Identificable<T> {
	
	/**
	 * Devuelve el Id del tipo indicado
	 * @return el ID
	 */
	public T getId();
}
