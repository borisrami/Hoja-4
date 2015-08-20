import java.util.Vector;

/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 * @param <E>
 */
public class CtrlStackVector<E> extends AbstractPilas<E>{
	
	private Vector<E> list;
	
	public CtrlStackVector(){
		list = new Vector<E>();
	}

	@Override
	/**
	 *podemos limpiar la pila con este metodo
	 *pre: lista puede o no contener datos
	 *post: Lista vacia
	 */
	public void empty() {
		// TODO Auto-generated method stub
		list.clear();
		
	}

	@Override
	/**
	 *puede colocar en la pila un valor determinado, mandarlo hacia abajo
	 *pre: recibe dato
	 *post: agrega dato a la lista
	 */
	public void push(E x) {
		// TODO Auto-generated method stub
		list.add(x);
	}

	@Override
	/**
	 *puede sacar un elemento de la pila, lo manda haci arriba
	 *pre: retira el ultimo valor ingresado de la lista
	 *post: regresa el valor retirado de la lista
	 */
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		E n= null;
		if(list.size()>0){	
			n = list.get(list.size()-1);
			list.remove(list.size()-1);
		}
		return n;
	}

	@Override
	/**
	 *este provee el tamaño de la pila
	 *pre: cuanta cantidad de datos en la lista
	 *post: Devuelve cantidad de datos en la lista
	 */
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	/**
	 *se puede verficar el dato de hasta arriba
	 *pre: lee el ultimo valor ingresado
	 *post: devuelve el ultimo valor ingresado
	 */
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		if(list.size()>0){
			return list.get(list.size()-1);
			
		}
			
		return null;
	}
}