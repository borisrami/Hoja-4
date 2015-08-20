/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 */
public class SimplementeEnlazada<E> extends AbstractListas<E>{
	protected Nodo<E> cabeza;
	 
	/**
	 * Contructor
	 */
	public SimplementeEnlazada(){
		super();
		cabeza = null;
	}
	
	/** 
	 * Agrega un nodo a la lista
	 */
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		cabeza = new Nodo<E>(value, cabeza);
		count++;
	}

	
	/** 
	 * @return valor del nodo removido
	 */
	public E removeFirst() {
		// TODO Auto-generated method stub
		Nodo<E> temporal = cabeza;
		cabeza = cabeza.next();
		count--;
		return temporal.valor();
	}

	
	/** 
	 * @return valor del nodo removido
	 */
	public E getFirst() {
		// TODO Auto-generated method stub
		return cabeza.valor();
	}

}
