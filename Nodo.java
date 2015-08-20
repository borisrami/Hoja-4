/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 */

public class Nodo<E> {
	private E valor;
	private Nodo<E> next;
	
	/**
	 * @param valor
	 * @param next
	 * constructor con tres parametros
	 */
	public Nodo(E valor, Nodo<E> next){
		this.valor=valor;
		this.next=next;
	}
	
	/**
	 * @param valor
	 * contructor con un parametro
	 */
	public Nodo(E valor){
		this(valor, null);
	}
	
	/**
	 * @return el nodo siguiente
	 */
	public Nodo<E> next(){
		return next;
	}
	
	/**
	 * @param next
	 * Cambia el valor del nodo siguente
	 */
	public void setNext(Nodo<E> next){
		this.next=next;
	}
	
	/**
	 * @return valor del nodo
	 */
	public E valor(){
		return valor;
	}
	
	/**
	 * @param valor
	 * Cambia el valor de un nodo
	 */
	public void setValor(E valor){
		this.valor = valor;
	}
}
