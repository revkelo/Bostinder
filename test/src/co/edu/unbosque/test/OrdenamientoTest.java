/**
 * Clase que pertenece al paquete test
 */
package co.edu.unbosque.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.model.PersonaDAOImpl;

/**
 * Clase que testea los ordenamientos
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolás
 */

class OrdenamientoTest {

	/**
	 * Metodo tipo void que testea organizar el dinero de manera descendente con
	 * burbuja
	 */
	@Test
	void testBurbujaDineroDescendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.burbujaDineroDescendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el dinero de manera ascendente con
	 * burbuja
	 */
	@Test
	void testBurbujaDineroAscendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.burbujaDineroAscendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar los de manera descendente con burbuja
	 */
	@Test
	void testBurbujaNumeroLikesDescendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.burbujaNumeroLikesDescendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar los likes de manera ascendente con
	 * burbuja
	 */
	@Test
	void testBurbujaNumeroLikesAscendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.burbujaNumeroLikesAscendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar la edad de manera descendente con
	 * burbuja
	 */
	@Test
	void testBurbujaEdadDescendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.burbujaEdadDescendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar la edad de manera ascendente con
	 * burbuja
	 */
	@Test
	void testBurbujaEdadAscendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.burbujaEdadAscendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el nombre de manera ascendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoNombreAscendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoNombreAscendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el nombre de manera descendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoNombreDescendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoNombreDescendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el apellido de manera ascendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoApellidoAscendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoApellidoAscendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el apellido de manera descendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoApellidoDescendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoApellidoDescendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el alias de manera ascendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoAliasAscendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoAliasAscendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el alias de manera descendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoAliasDescendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoAliasDescendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el genero de manera ascendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoGeneroAscendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoGeneroAscendente(sdi.getList());
	}

	/**
	 * Metodo tipo void que testea organizar el genero de manera descendente con
	 * CollectionsSort
	 */
	@Test
	void testOrdenamientoGeneroDescendente() {
		PersonaDAOImpl sdi = new PersonaDAOImpl();
		Ordenamiento ord = new Ordenamiento();
		ord.ordenamientoGeneroDescendente(sdi.getList());
	}

}
