/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 */

public class DoblementeEnlazada<E> extends AbstractListas<E>{
	private DobleNodo<E> cabeza;
	private DobleNodo<E> cola; 
	
	/**
	 * Constructor
	 */
	public DoblementeEnlazada(){
		super(); 
		cabeza=null;
		cola=null;
	}
	

	/** 
	 * Agrega nodo a la lista
	 */
	public void addFirst(E value) {
			cabeza= new DobleNodo<E>(value,cabeza,null);
			if(cola==null)
				cola = cabeza;
			count++;
		}
	
	/** 
	 * @return Valor nodo removido
	 * remueve la cabeza de la lista
	 */
	public E removeFirst() {
		// TODO Auto-generated method stub
			DobleNodo<E> temp =cabeza;
			cabeza=cabeza.next();
			cabeza.setPrev(null);
			count--;
			return temp.valor();
		
	}

	/** 
	 * @return Valor de la cabeza
	 */
	public E getFirst() {
		// TODO Auto-generated method stub
		return cabeza.valor();
	}

}
