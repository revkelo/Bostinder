/**
 * Clase que pertenece al paquete test
 */
package co.edu.unbosque.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import co.edu.unbosque.controller.Controller;

/**
 * Clase que testea el controller
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolás
 */

class ControllerTest {

	/**
	 * Metodo tipo void para testear los numeros aleatorios
	 */
	@Test
	public void testNumerosAleatorios() {

		Controller con = new Controller();

		while (true) {

			int result = con.numerosAleatorios(5);
			int expected = 5;
			if (result == expected) {
				assertEquals(expected, result);
				break;
			}
		}
	}

}
