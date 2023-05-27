/**
 * Paquete que pertenece al modelo el cual se encarga de la representacion de objetos 
 */
package co.edu.unbosque.model;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import co.edu.unbosque.util.CaracteresException;
import co.edu.unbosque.util.CorreoException;
import co.edu.unbosque.util.LetrasException;
import co.edu.unbosque.util.FechaException;

/**
 * Clase Correos del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolns
 */

public interface PersonaDAO {

	/**
	 * Metodo encargado de generar lo parametros necesarios
	 * 
	 * @param Id         String de identificacion
	 * @param Nombre     Variable tipo String
	 * @param Apellido1  Variable tipo String
	 * @param Apellido2  Variable tipo String
	 * @param Sexo       Variable tipo String
	 * @param Usuario    Variable tipo String
	 * @param Contrasena Variable tipo String
	 * @param Correo     Variable tipo String
	 * @param Nacimiento Variable tipo String
	 * @param Edad       Variable tipo int
	 * @param Ingresos   Variable tipo double
	 * @param Divorcio   Variable tipo String
	 * @param Estado     Variable tipo String
	 * @throws CaracteresException   exception de caracteres especiales
	 * @throws LetrasException       exception de letras
	 * @throws CorreoException       exceptiones aplicadas al correo
	 * @throws FechaException        exception de la fecha de nacimiento
	 * @throws AddressException      exceptiones aplicadas al correo
	 * @throws MessagingException    exceptiones en el mensaje del correo
	 * @throws NumberFormatException exceptiones aplicadas en numeros
	 */
	public void create(String Id, String Nombre, String Apellido1, String Apellido2, String Sexo, String Usuario,
			String Contrasena, String Correo, String Nacimiento, int Edad, double Ingresos, String Divorcio,
			String Estado) throws CaracteresException, LetrasException, CorreoException, FechaException,
			AddressException, MessagingException, NumberFormatException;

	/**
	 * 
	 * @param index variable tipo int
	 * @return true/false
	 */
	public boolean deleteByIndex(int index);

	/**
	 * 
	 * @param id variable tipo int
	 */
	public void deleteByName(int id);

	/**
	 * 
	 * @param index variable tipo int
	 * @param name  variable tipo String
	 * @param age   variable tipo int
	 * @return true/false
	 */
	public boolean updateByIndex(int index, String name, int age);

	/**
	 * 
	 * @param name variable tipo String
	 * @param age  variable tipo int
	 * @return true/false
	 */
	public boolean updateByName(String name, int age);

	/**
	 * 
	 * @return true/false
	 */
	public String showAll();
}
