
class PilasFactory<E> {


	//returns an instance of LastFirst or FirstFirst
	//depending on whether a comma is found
	   public AbstractPilas<E> getTipoLista(int seleccion) {
		   if(seleccion==1)
			   return new CtrlStackArrey<E>();
		   else if(seleccion==2)
			   return new CtrlStackVector<E>();
		   else if(seleccion==3)
			   return new CtrlStackVector<E>();
		   else if(seleccion==4)
			   return new CtrlStackVector<E>();
		   else
			   return new CtrlStackVector<E>();
	   }
}
