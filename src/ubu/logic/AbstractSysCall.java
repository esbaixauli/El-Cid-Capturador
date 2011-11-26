package ubu.logic;

import java.util.List;

       interface AbstractSysCall {
	
	/**
	 * Devuelve el titulo de la ventana activa.
	 */
	public abstract String getCurrentWindowTitle ();
	
	/**
	 * Devuelve una lista con los títulos de las ventanas.
	 */
	 public abstract List<String> getWindowTitleList ();
	
}
