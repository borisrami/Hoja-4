/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 */
public abstract class AbstractPilas<E> implements ADTStack<E>{
		/**
		 *pre: verificar si lista esta vacia
		 *post: true si lista vacia, false si lista llena
		 */
		public boolean isEmpty(){
			if(size()>0)
				return true;
			else
				return false;
		}
}
