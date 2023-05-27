/**
 * Clase que pertenece al paquete test
 */
package co.edu.unbosque.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;

import co.edu.unbosque.model.Pdf;

/**
 * Clase que testea crear la plantilla
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolás
 */

class PdfTest {

	/**
	 * Metodo tipo void para testear los numeros aleatorios
	 */
	@Test
	void testCrearPlantilla() {
		Pdf pdf = new Pdf();

			try {
				pdf.crearPlantilla();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
