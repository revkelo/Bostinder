/**
 * Clase que pertenece al paquete util
 */
package co.edu.unbosque.util;

/**
 * Clase de excepcion para evitar letras
 *
 * @author Nicolas Machado
 */
public class LetrasException extends Exception {

	/**
	 * Este es el metodo constructor de la clase <b> pre </b> Se tiene que extender
	 * la clase a la interface exception <br>
	 * <b> post </b> Se inicializa lel super. <br>
	 */
	public LetrasException() {
		super();
	}

	/**
	 * Este es el metodo constructor de la clase <b> pre </b> Se tiene que extender
	 * la clase a la interface exception <br>
	 * <b> pre </b> Se indica que recibe un parametro tipo string <br>
	 * <b> post </b> Se inicializa el super, con el parametro string <br>
	 * 
	 * @param mensaje es el string mensaje !=null, mensaje!= ""
	 */
	public LetrasException(String mensaje) {
		super(mensaje);
	}
}
