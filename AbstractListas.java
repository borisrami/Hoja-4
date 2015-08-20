/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 * Clase abstracta para las listas
 */

public abstract class AbstractListas<E> implements listaEnlazada<E> {
	
	protected int count;

	public AbstractListas(){
		count = 0;
	}
	
	public int size(){
		return count;
	}

}
