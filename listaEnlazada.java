/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 */
public interface listaEnlazada<E> {
	/**
	 *pre: Contador de datos de lista
	 *post: cantidad de datos en la lista
	 */
	public int size();
	/**
	 *pre: valor a agregar en la lista
	 *post: agrega valor a la lista
	 */
	public void addFirst(E value);
	/**
	 *pre: Retira el primer valor de la lista
	 *post: devuelve el ultimo valor de la lista
	 */
	public E removeFirst();
	/**
	 *pre: lee el primer valor de la lista
	 *post: devuelve el ultimo valor de la lista
	 */
	public E getFirst();
}



