/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 */

public class DobleNodo<E>{
	private E valor; 
	private DobleNodo<E> next; 
	private DobleNodo<E> prev; 
	
	/**
	 * @param valor
	 * @param next
	 * @param prev
	 * Contructor con tres parametros
	 */
	public DobleNodo(E valor, DobleNodo<E> next,DobleNodo<E> prev){
		this.valor=valor;
		this.next=next; 
		this.prev=prev;
	}
	
	/**
	 * @param valor
	 * Cambia el valor de un nodo
	 */
	public void setValor(E valor){
		this.valor=valor;
	}
	
	/**
	 * @param next
	 * cambia el nodo siguiente de un nodo
	 */
	public void setNext(DobleNodo<E> next){
		this.next=next;
	}
	
	/**
	 * @param prev
	 * cambia el nodo anterior de un nodo
	 */
	public void setPrev(DobleNodo<E> prev){
		this.prev=prev;
	}
	
	/**
	 * @return valor de un nodo
	 */
	public E valor(){
		return valor;
	}
	
	/**
	 * @return nodo siguiente
	 */
	public DobleNodo<E> next(){
		return next;
	}
	
	/**
	 * @return nodo anterior
	 */
	public DobleNodo<E> prev(){
		return prev; 
	}
}
