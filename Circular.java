
/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 */

public class Circular<E> extends AbstractListas<E>{
	private Nodo<E> cabeza;
	
	/**
	 * Método: Circular
	 * Funcionalidad:
	 * Constructor en la primera posición y el count igual a 0
	 */
	public Circular(){
		super();
		cabeza=null;
	}
	
	
	/** Metodo: addFirst
	 *  Funcionalidad:
	 *  Agrega un nuevo nodo como cabeza
	 */
	public void addFirst(E value) {
		Nodo<E> temporal = new Nodo<E>(value);
		if(cabeza == null){
			cabeza = temporal;
			cabeza.setNext(cabeza);
		}
		else{
			temporal.setNext(cabeza);
			cabeza=temporal;
		}
		count++;
	}
	
	/** Metodo: removeFirst
	 *  Funcionalidad:
	 *  Remueve la cabeza de las listas
	 */
	public E removeFirst(){
		//Nodo <E> apuntador = cabeza; //Iniciando el recorrido desde el comienzo
		Nodo <E> temporal= cabeza;
		cabeza = cabeza.next();
		count--;
		return temporal.valor();
		
	}
	/** Metodo: getFirst
	 *  Funcionalidad:
	 *  devuelve el valor de la cabeza de la lista
	 */
	public E getFirst(){
		return cabeza.valor();
	}

}
