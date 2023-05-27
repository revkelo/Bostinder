/**
 * Paquete que pertenece al modelo el cual se encarga de la representacion de objetos 
 */
package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import co.edu.unbosque.model.persistance.FileHandler;
import co.edu.unbosque.util.CaracteresException;
import co.edu.unbosque.util.CorreoException;
import co.edu.unbosque.util.LetrasException;
import co.edu.unbosque.util.FechaException;

/**
 * Clase PersonaDAOImpl del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolns
 */

public class PersonaDAOImpl implements PersonaDAO {

	/**
	 * Atributo tipo ArrayList para la lista general
	 */
	private ArrayList<PersonaDTO> list;
	/**
	 *
	 */
	private ArrayList<Integer> concat;
	private ArrayList<Integer> concat2;
	private ArrayList<PersonaDTO> listHombre;
	private ArrayList<PersonaDTO> listMujer;
	private int ayuda1 = 0;
	private String a = "";

	/**
	 * Metodo Constructor
	 */
	public PersonaDAOImpl() {
		list = new ArrayList<>();
		concat = new ArrayList<>();
		concat2 = new ArrayList<>();
		listHombre = new ArrayList<>();
		listMujer = new ArrayList<>();
		loadFile();
		edades();
	}

	/**
	 * Metodo tipo String
	 * 
	 * @return variable tipo String res
	 */
	public String contentBase() {
		String res = "";
		for (PersonaDTO s : list) {
			res += s.toString();
		}
		return res;
	}

	/**
	 * Metodo encargado de escribir en la base de datos
	 */
	public void writeFile() {
		String content = contentBase();
		FileHandler.writeFile("datos.csv", content);
	}

	/**
	 * Metodo encargado de subir la informacion a la base de datos
	 */
	public void loadFile() {
		String content = FileHandler.loadFile("datos.csv");
		String[] lines = content.split("\n");
		for (String s : lines) {
			if (s.equals(""))
				continue;
			String[] columnas = s.split(";");
			list.add(new PersonaDTO(columnas[0], columnas[1], columnas[2], columnas[3], columnas[4], columnas[5],
					columnas[6], columnas[7], columnas[8], Integer.parseInt(columnas[9]),
					Double.parseDouble(columnas[10]), columnas[11], Integer.parseInt(columnas[12]),
					Integer.parseInt(columnas[13]), Integer.parseInt(columnas[14]), columnas[15]));

		}

	}

	/**
	 * Metodo tipo String encargado de mostrar los contactos
	 * 
	 * @param x variable tipo int
	 * @return tempText
	 */
	public String mostrarContactos(int x) {
		String tempText = "";

		for (int i = 0; i < list.size(); i++) {
			if (list.get(x).getEstado().equals("Disponible")) {
				tempText = list.get(x).a();
			} else {

				return "xf";
			}
		}

		return tempText;
	}

	/**
	 * Metodo encargado de asignar el genero a cada usuario
	 */
	public void repartir() {

		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getSexo().equals("M")) {
				listMujer.add(new PersonaDTO(list.get(j).getId(), list.get(j).getNombre(), list.get(j).getApellido1(),
						list.get(j).getApellido2(), list.get(j).getSexo(), list.get(j).getUsuario(),
						list.get(j).getContrasena(), list.get(j).getCorreo(), list.get(j).getNacimiento(),
						list.get(j).getEdad(), list.get(j).getIngresos(), list.get(j).getDivorcio(),
						list.get(j).getNumeroLikesRecibidos(), list.get(j).getNumeroLikesOtorgados(),
						list.get(j).getNumeroMatches(), list.get(j).getEstado()));

			} else if (list.get(j).getSexo().equals("H")) {
				listHombre.add(new PersonaDTO(list.get(j).getId(), list.get(j).getNombre(), list.get(j).getApellido1(),
						list.get(j).getApellido2(), list.get(j).getSexo(), list.get(j).getUsuario(),
						list.get(j).getContrasena(), list.get(j).getCorreo(), list.get(j).getNacimiento(),
						list.get(j).getEdad(), list.get(j).getIngresos(), list.get(j).getDivorcio(),
						list.get(j).getNumeroLikesRecibidos(), list.get(j).getNumeroLikesOtorgados(),
						list.get(j).getNumeroMatches(), list.get(j).getEstado()));
			}

		}

	}

	/**
	 * Metodo tipo String showAll
	 * 
	 * @return res variable String vacia
	 */

	@Override
	public String showAll() {
		String res = "";

		return res;
	}

	/**
	 * Metodo tipo boolean para eliminar el indice
	 * 
	 * @param index variable tipo int
	 */
	@Override
	public boolean deleteByIndex(int index) {
		boolean found = false;
		try {
			list.remove(index);
			found = true;
		} catch (Exception e) {
			found = false;
		}
		writeFile();
		return found;
	}

	/**
	 * Metodo encargado de buscar usuarios
	 * 
	 * @param nombre  variable tipo String
	 * @param list ArrayList con lista de usuarios
	 * @return encontrado el usuario
	 */
	public PersonaDTO buscarpersonas(String nombre, ArrayList<PersonaDTO> list) {
		PersonaDTO encontrado = null;
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNombre().equals(nombre)) {
					encontrado = list.get(i);
					return encontrado;
				}
			}
		}

		return encontrado;
	}

	/**
	 * Metodo tipo void crear
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
	@Override
	public void create(String Id, String Nombre, String Apellido1, String Apellido2, String Sexo, String Usuario,
			String Contrasena, String Correo, String Nacimiento, int Edad, double Ingresos, String Divorcio,
			String Estado) throws CaracteresException, LetrasException, CorreoException, FechaException,
			AddressException, MessagingException, NumberFormatException {

		String n = "";
		String a1 = "";
		String a2 = "";
		String cor = "";
		String contra = "";
		String nac = "";
		String e = "";
		String in = "";
		String es = "";
		String est = "";
		String d = "";

		for (int i = 0; i < Nombre.length(); i++) {

			if (Character.isLetter(Nombre.charAt(i)) || Nombre.charAt(i) == ' ') {

				n = Nombre;

			} else {
				throw new CaracteresException("No ingresar caracteres especiales, ni numeros en el nombre");
			}
		}
		for (int i = 0; i < Contrasena.length(); i++) {
			if (Contrasena.charAt(i) != ';') {
				contra = Contrasena;
			} else {
				throw new CaracteresException("no ingresar ; en la contrasena");
			}
		}

		for (int i = 0; i < Apellido1.length(); i++) {
			if (Character.isLetter(Apellido1.charAt(i)) || Apellido1.charAt(i) == ' ') {

				a1 = Apellido1;

			} else {
				throw new CaracteresException("No ingresar caracteres especiales, ni numeros en el primer apellido");
			}

		}

		for (int i = 0; i < Apellido2.length(); i++) {
			if (Character.isLetter(Apellido2.charAt(i)) || Apellido2.charAt(i) == ' ') {

				a2 = Apellido2;

			} else {
				throw new CaracteresException("No ingresar caracteres especiales, ni numeros en el primer apellido");
			}

		}

		for (int i = 0; i < Estado.length(); i++) {

			if (Character.isLetter(Estado.charAt(i)) || Estado.charAt(i) == ' ') {

				est = Estado;

			} else {
				throw new LetrasException("No ingresar caracteres especiales, ni numeros en el esatdo");
			}
		}

//		if (Edad.matches("[0-9]*")) {
//
//			e = Edad;
//		} else {
//			throw new Letras_Exception("No poner Letras en el telefono");
//		}

		Pattern pattern2 = Pattern.compile("[0-9]+/+[0-9]+/+[0-9]");
		Matcher matcher2 = pattern2.matcher(Nacimiento);

		if (matcher2.find() == true) {

			nac = Nacimiento;

		} else {
			throw new CorreoException("Correo invalido");
		}

//		if (Ingresos.matches("[0-9]*")) {
//			in = ingresos;
//		} else {
//			throw new Letras_Exception("No poner Letras en los ingresos");
//		}
//
//		if (Estatura.matches("[0-9]*")) {
//			es = Estatura;
//		} else {
//			throw new Letras_Exception("No poner Letras en la estatura");
//		}

		Pattern pattern = Pattern.compile("[_A-Za-z0-9-]+@+[_A-Za-z0-9-]+.+[A-Za-z]{2,}");
		Matcher matcher = pattern.matcher(Correo);

		if (matcher.find() == true) {

			cor = Correo;

		} else {
			throw new CorreoException("Correo invalido");
		}

		list.add(
				new PersonaDTO(Id, n, a1, a2, Sexo, Usuario, contra, cor, nac, Edad, Ingresos, Divorcio, 0, 0, 0, est));
		writeFile();
	}

	/**
	 * Metodo tipo boolean para subir el indice
	 * 
	 * @param index variable tipo int
	 * @param name  variable tipo String
	 * @param age   variable tipo int
	 * @return false
	 */
	@Override
	public boolean updateByIndex(int index, String name, int age) {
		return false;
	}

	/**
	 * Metodo tipo boolean para subir el nombre
	 * 
	 * @param name variable tipo String
	 * @param age  variable tipo int
	 * @return false
	 */
	@Override
	public boolean updateByName(String name, int age) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Metodo tipo void para eliminar por nombre
	 * 
	 * @param id variable tipo int
	 */
	@Override
	public void deleteByName(int id) {
		boolean resp = false;

		try {
			if (list.get(id).getEstado().equals("Disponible")) {
				list.get(id).setEstado("Inactivo");
				resp = true;
			}
		} catch (Exception e) {

		}
		writeFile();

	}

	/**
	 * Variable tipo int para calcular la moda
	 * 
	 * @return moda el valor correspondiente
	 */
	public int moda() {
		int max = 0;
		int moda = 0;

		for (int i = 0; i < list.size(); i++) {
			int repeticiones = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getEdad() == list.get(j).getEdad()) {
					repeticiones++;
				}
				if (repeticiones > max) {
					moda = (int) list.get(i).getEdad();
					max = repeticiones;
				}
			}
		}
		return moda;
	}

	/**
	 * Metodo tipo void para calcular las repeticiones de las edades
	 */
	public void edades() {

		char b = '*';
		int q = 0;

		boolean repetidos[] = new boolean[list.size()];
		for (int i = 0; i < list.size(); i++) {

			if (repetidos[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getEdad() == list.get(j).getEdad()) {
					repetidos[j] = true;
					ayuda1++;

				}
			}
			for (int k = 0; k < count; k++) {
				a += b;

			}

			concat2.add(list.get(i).getEdad());

			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == '*') {
					ayuda1++;
				}
			}

			concat.add(ayuda1);
			a = "";
			ayuda1 = 0;
		}
	}

	/**
	 * Metodo tipo double para calcular el promedio
	 * 
	 * @return rta con el promedio correspondiente
	 */
	public double promedio() {
		double suma = 0;
		double rta = 0;
		double a = 223;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIngresos() != 0.0) {

				rta = suma + list.get(i).getIngresos();
				rta = rta / a;
			}
		}
		return rta;
	}

	/**
	 * Metodo tipo double para calcular la mediana de los ingresos
	 * 
	 * @return rta con la respuesta correspondiente
	 */
	public double mediana() {
		double rta = 0;
		double a = 247;
		int ajam = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIngresos() != 0.0) {
				ajam = (int) (a / 2);
				rta = list.get(ajam).getNumeroLikesRecibidos() + list.get(ajam - 1).getNumeroLikesRecibidos() / 2;

			}
		}
		return rta;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the list
	 */
	public ArrayList<PersonaDTO> getList() {
		return list;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param list the list to set
	 */
	public void setList(ArrayList<PersonaDTO> list) {
		this.list = list;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the concat
	 */
	public ArrayList<Integer> getConcat() {
		return concat;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param concat the concat to set
	 */
	public void setConcat(ArrayList<Integer> concat) {
		this.concat = concat;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the concat2
	 */
	public ArrayList<Integer> getConcat2() {
		return concat2;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param concat2 the concat2 to set
	 */
	public void setConcat2(ArrayList<Integer> concat2) {
		this.concat2 = concat2;
	}

}
