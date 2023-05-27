/**
 * Clase que pertenece al paquete test
 */
package co.edu.unbosque.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.jupiter.api.Test;

import co.edu.unbosque.model.PersonaDAOImpl;
import co.edu.unbosque.util.CaracteresException;
import co.edu.unbosque.util.CorreoException;
import co.edu.unbosque.util.FechaException;
import co.edu.unbosque.util.LetrasException;

/**
 * Clase que testea el controller
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolns
 */

class PersonaDAOImplTest {
	
	/**
	 * Metodo tipo void para testear cargar archivo
	 */
	
	@Test
	void testLoadFile() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		sdi.loadFile();
	}
	
	/**
	 * Metodo tipo void para testear escribir archivo
	 */
	
	@Test
	void testWriteFile() {
		
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		sdi.writeFile();
	
	}

	/**
	 * Metodo tipo void para testear repartir los generos a los usuarios
	 */
	@Test
	void testRepartir() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		sdi.repartir();
	}

	/**
	 * Metodo tipo void para testear buscar usuario
	 */
	@Test
	void testBuscarpersonas() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		sdi.buscarpersonas("Unai", sdi.getList());
	}

	/**
	 * Metodo tipo void para testear crear
	 */
	@Test
	void testCreate() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		try {
			sdi.create((1 + sdi.getList().size())+"", "test", "test", "test", "H", "test1231231", "Testadmin123121", "test@gmail.com", "01/02/2000", 21, 10,"No Aplica", "Inactivo");
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CaracteresException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LetrasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CorreoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FechaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
