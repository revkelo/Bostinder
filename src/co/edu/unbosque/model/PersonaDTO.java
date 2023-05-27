/**
 * Paquete que pertenece al modelo el cual se encarga de la representacion de objetos 
 */
package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.FileHandler;

/**
 * Clase PersonaDTO del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolns
 */

public class PersonaDTO implements Comparable<PersonaDTO> {
	/**
	 * Atributo tipo String nombrado Id
	 */
	private String Id;
	/**
	 * Atributo tipo String nombrado Nombre
	 */
	private String Nombre;
	/**
	 * Atributo tipo String nombrado Apellido1
	 */
	private String Apellido1;
	/**
	 * Atributo tipo String nombrado Apellido2
	 */
	private String Apellido2;
	/**
	 * Atributo tipo String nombrado Sexo
	 */
	private String Sexo;
	/**
	 * Atributo tipo String nombrado IUsuariod
	 */
	private String Usuario;
	/**
	 * Atributo tipo String nombrado Contrasena
	 */
	private String Contrasena;
	/**
	 * Atributo tipo String nombrado Correo
	 */
	private String Correo;
	/**
	 * Atributo tipo String nombrado Nacimiento
	 */
	private String Nacimiento;
	/**
	 * Atributo tipo int nombrado Edad
	 */
	private int Edad;
	/**
	 * Atributo tipo double nombrado Ingresos
	 */
	private double Ingresos;
	/**
	 * Atributo tipo String nombrado Id
	 */
	private String Divorcio;
	/**
	 * Atributo tipo int nombrado NumeroLikesRecibidos
	 */
	private int NumeroLikesRecibidos;
	/**
	 * Atributo tipo int nombrado NumeroLikesOtorgados
	 */
	private int NumeroLikesOtorgados;
	/**
	 * Atributo tipo int nombrado NumeroMatches
	 */
	private int NumeroMatches;
	/**
	 * Atributo tipo String nombrado Id
	 */
	private String Estado;

	/**
	 * Metodo personaDTO
	 * 
	 * @param id                   variable tipo String
	 * @param nombre               variable tipo String
	 * @param apellido1            variable tipo String
	 * @param apellido2            variable tipo String
	 * @param sexo                 variable tipo String
	 * @param usuario              variable tipo String
	 * @param contrasena           variable tipo String
	 * @param correo               variable tipo String
	 * @param nacimiento           variable tipo String
	 * @param edad                 variable tipo int
	 * @param ingresos             variable tipo double
	 * @param divorcio             variable tipo String
	 * @param numeroLikesRecibidos variable tipo int
	 * @param numeroLikesOtorgados variable tipo int
	 * @param numeroMatches        variable tipo int
	 * @param estado               variable tipo String
	 */
	public PersonaDTO(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contrasena, String correo, String nacimiento, int edad, double ingresos, String divorcio,
			int numeroLikesRecibidos, int numeroLikesOtorgados, int numeroMatches, String estado) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
		Sexo = sexo;
		Usuario = usuario;
		Contrasena = contrasena;
		Correo = correo;
		Nacimiento = nacimiento;
		Edad = edad;
		Ingresos = ingresos;
		Divorcio = divorcio;
		NumeroLikesRecibidos = numeroLikesRecibidos;
		NumeroLikesOtorgados = numeroLikesOtorgados;
		NumeroMatches = numeroMatches;
		Estado = estado;
	}

	/**
	 * Metodo tipo String "ToString"
	 * 
	 * @return res parametros
	 */
	@Override
	public String toString() {
		String res = "";
		res += this.Id + ";" + this.Nombre + ";" + this.Apellido1 + ";" + this.Apellido2 + ";" + this.Sexo + ";"
				+ this.Usuario + ";" + this.Contrasena + ";" + this.Correo + ";" + this.Nacimiento + ";" + this.Edad
				+ ";" + this.Ingresos + ";" + this.Divorcio + ";" + this.NumeroLikesRecibidos + ";"
				+ this.NumeroLikesOtorgados + ";" + this.NumeroMatches + ";" + this.Estado + "\n";
		return res;
	}

	/**
	 * Metodo tipo String a
	 * 
	 * @return Variable tipo String
	 */
	public String a() {
		return "\n" + "  Nombre: " + Nombre + "\n  Primer Apellido: " + Apellido1 + "\n  Segundo Apellido: " + Apellido2
				+ "\n  Sexo: " + Sexo + "\n  Usuario: " + Usuario + "\n  Nacimiento: " + Nacimiento + "\n  Edad: "
				+ Edad + "\n  Ingresos: " + Ingresos + "\n  Divorcio: " + Divorcio + "\n  Estado: " + Estado;
	}

	/**
	 * Metodo constructor
	 */
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the apellido1
	 */
	public String getApellido1() {
		return Apellido1;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the apellido2
	 */
	public String getApellido2() {
		return Apellido2;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the sexo
	 */
	public String getSexo() {
		return Sexo;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the usuario
	 */
	public String getUsuario() {
		return Usuario;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the contrasena
	 */
	public String getContrasena() {
		return Contrasena;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the correo
	 */
	public String getCorreo() {
		return Correo;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		Correo = correo;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the nacimiento
	 */
	public String getNacimiento() {
		return Nacimiento;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param nacimiento the nacimiento to set
	 */
	public void setNacimiento(String nacimiento) {
		Nacimiento = nacimiento;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the edad
	 */
	public int getEdad() {
		return Edad;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		Edad = edad;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the ingresos
	 */
	public double getIngresos() {
		return Ingresos;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param ingresos the ingresos to set
	 */
	public void setIngresos(double ingresos) {
		Ingresos = ingresos;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the divorcio
	 */
	public String getDivorcio() {
		return Divorcio;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param divorcio the divorcio to set
	 */
	public void setDivorcio(String divorcio) {
		Divorcio = divorcio;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the numeroLikesRecibidos
	 */
	public int getNumeroLikesRecibidos() {
		return NumeroLikesRecibidos;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param numeroLikesRecibidos the numeroLikesRecibidos to set
	 */
	public void setNumeroLikesRecibidos(int numeroLikesRecibidos) {
		NumeroLikesRecibidos = numeroLikesRecibidos;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the numeroLikesOtorgados
	 */
	public int getNumeroLikesOtorgados() {
		return NumeroLikesOtorgados;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param numeroLikesOtorgados the numeroLikesOtorgados to set
	 */
	public void setNumeroLikesOtorgados(int numeroLikesOtorgados) {
		NumeroLikesOtorgados = numeroLikesOtorgados;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the numeroMatches
	 */
	public int getNumeroMatches() {
		return NumeroMatches;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param numeroMatches the numeroMatches to set
	 */
	public void setNumeroMatches(int numeroMatches) {
		NumeroMatches = numeroMatches;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the estado
	 */
	public String getEstado() {
		return Estado;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		Estado = estado;
	}

	/**
	 * Metodo tipo int para comparar
	 * 
	 * @return 1 dato entero
	 */
	@Override
	public int compareTo(PersonaDTO o) {
		if (o.getEdad() < Edad) {
			return -1;
		} else if (o.getEdad() < Edad) {
			return 0;
		} else {

		}
		return 1;
	}

}
