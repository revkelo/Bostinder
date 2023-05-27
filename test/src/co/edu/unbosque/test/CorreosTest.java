/**
 * Clase que pertenece al paquete test
 */
package co.edu.unbosque.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.unbosque.model.Correos;

/**
 * Clase que testea el correo
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolás
 */

class CorreosTest {

	/**
	 * Metodo tipo void para testear los correos
	 */
	@Test
	void testCorreo() {
		Correos correo = new Correos();
		correo.Correo("123@gmail.com", "usuario", "contrasela");

	}

}
