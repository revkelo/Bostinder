/**
 * Paquete que pertenece al controlador que gestiona la vista con el modelo
 */
package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;

import co.edu.unbosque.model.Correos;
import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.model.PersonaDAOImpl;
import co.edu.unbosque.model.PersonaDTO;
import co.edu.unbosque.model.Pdf;
import co.edu.unbosque.util.CaracteresException;
import co.edu.unbosque.util.CorreoException;
import co.edu.unbosque.util.LetrasException;
import co.edu.unbosque.util.FechaException;
import co.edu.unbosque.view.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Clase que se encarga de controlar la logica del programa
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolns
 */

public class Controller implements ActionListener, MouseListener {

	/**
	 * Atributo tipo View renombrado como view
	 */
	private View view;
	/**
	 * Atributo tipo String renombrado como sexo
	 */
	private String sexo;
	/**
	 * Atributo tipo Correos renombrado como correo
	 */
	private Correos correo;
	/**
	 * Atributo tipo PersonaDAOImpl renombrado como sdi
	 */
	private PersonaDAOImpl sdi;
	/**
	 * Atributo tipo Ordenamiento renombrado como orde
	 */
	private Ordenamiento orde;
	/**
	 * Atributo tipo Pdf renombrado como pdf
	 */
	private Pdf pdf;
	/*
	 * Atributos tipo int y orden_ad inicializado en 2
	 */
	private int orden_ad = 2, random, usuario, usuario1, persona;

	/**
	 * Metodo Constructor
	 */
	public Controller() {
		orde = new Ordenamiento();
		pdf = new Pdf();
		view = new View();
		correo = new Correos();
		sdi = new PersonaDAOImpl();
		asignarOyentes();
		sdi.repartir();
	}

	/**
	 * Metodo tipo void para volveer al panel One al registrarse
	 */
	private void cerrarRegister() {

		view.getvPrincipal().getPr().setVisible(false);
		view.getvPrincipal().getPi().setVisible(false);
		view.getvPrincipal().getPhombre().setVisible(false);
		view.getvPrincipal().getPmujer().setVisible(false);
		view.getvPrincipal().getBackRegistro().setVisible(false);
		view.getvPrincipal().getBackInicio().setVisible(false);
		view.getvPrincipal().getPo().setVisible(true);
	}

	/**
	 * Metodo enargado de hacer visible la tabla
	 * 
	 * @param lista  variable tipo entero
	 * @param dinero variable de tipo boolean
	 */
	public void agregarTabla(int lista, boolean dinero) {

		for (int i = 0; i < lista; i++) {
			String id = sdi.getList().get(i).getId();
			String nombre = sdi.getList().get(i).getNombre();
			String apellido1 = sdi.getList().get(i).getApellido1();
			String apellido2 = sdi.getList().get(i).getApellido2();
			String sexo = sdi.getList().get(i).getSexo();
			String usuario = sdi.getList().get(i).getUsuario();
			String contrasena = sdi.getList().get(i).getContrasena();
			String correo = sdi.getList().get(i).getCorreo();
			String nacimiento = sdi.getList().get(i).getNacimiento();
			int edad = sdi.getList().get(i).getEdad();
			double ingresos = sdi.getList().get(i).getIngresos();
			String divorcio = sdi.getList().get(i).getDivorcio();
			int NumeroLikesRecibidos = sdi.getList().get(i).getNumeroLikesRecibidos();
			int NumeroLikesOtorgados = sdi.getList().get(i).getNumeroLikesOtorgados();
			int NumeroMatches = sdi.getList().get(i).getNumeroMatches();
			String estado = sdi.getList().get(i).getEstado();

			if (dinero == true) {
				if (ingresos >= 244.85) {
					Object[] tabla = { id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento,
							edad, ingresos, divorcio, NumeroLikesRecibidos, NumeroLikesOtorgados, NumeroMatches,
							estado };
					view.getvAdmin().getPb().getT_lista().addRow(tabla);
				}
			} else {

				Object[] tabla = { id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento,
						edad, ingresos, divorcio, NumeroLikesRecibidos, NumeroLikesOtorgados, NumeroMatches, estado };

				view.getvAdmin().getPb().getT_lista().addRow(tabla);

			}
		}
	}

	/**
	 * Metodo encargado de efectuar el random
	 * 
	 * @param aux variable tipo entero
	 * @return random que es el numero aleatorio
	 */
	public int numerosAleatorios(int aux) {
		for (int l = 0; l < 4; l++) {
			random = (int) Math.floor(Math.random() * (aux));
			random += 1;
		}
		return random;
	}

	/**
	 * Metodo tipo void encargado de borrar la tabla de datos
	 */
	private void borrarTabla() {
		if (view.getvAdmin().getPb().getT_lista().getRowCount() > 0) {
			for (int i = view.getvAdmin().getPb().getT_lista().getRowCount() - 1; i > -1; i--) {
				view.getvAdmin().getPb().getT_lista().removeRow(i);
			}
		}
	}

	/**
	 * Metodo tipo int encargado de mostrar las imagenes de los usuarios
	 * 
	 * @return el usuario
	 */
	private int mostrarPersona() {
		view.getvInicio().getPf().quitarImag();
		for (int i = 0; i < sdi.getList().size(); i++) {
			int aux = numerosAleatorios(sdi.getList().size() - 1);
			if (sdi.getList().get(aux).getEstado().equals("Disponible")) {

				view.getvInicio().getPf().getInfo().getTextArea().setText(sdi.mostrarContactos(aux));

				if (sdi.getList().get(aux).getSexo().equals("H")) {
					int aux1 = numerosAleatorios(20);
					view.getvInicio().getPf().setFile_img("Media/Hombre/" + aux1 + ".jpg");

					view.getvInicio().getPf().imagen();
					view.getvInicio().getPf().repaint();
				} else if (sdi.getList().get(aux).getSexo().equals("M")) {
					int aux1 = numerosAleatorios(20);
					view.getvInicio().getPf().setFile_img("Media/Mujer/" + aux1 + ".jpg");

					view.getvInicio().getPf().imagen();
					view.getvInicio().getPf().repaint();
				}
				usuario = aux;
				break;

			}

		}
		return usuario;

	}

	/**
	 * Se le asignan las funciones a cada boton
	 */
	private void asignarOyentes() {

		// TODO Auto-generated method stub

		view.getvPrincipal().getBackRegistro().addActionListener(this);

		view.getvPrincipal().getBackInicio().addActionListener(this);

		view.getvPrincipal().getPhombre().getGuardar().addActionListener(this);

		view.getvPrincipal().getPmujer().getGuardar().addActionListener(this);

		view.getvPrincipal().getPo().getRegistro().addActionListener(this);
		view.getvPrincipal().getPo().getRegistro().addMouseListener(this);

		view.getvPrincipal().getPo().getInicio().addActionListener(this);
		view.getvPrincipal().getPo().getInicio().addMouseListener(this);

		view.getvPrincipal().getPr().getGuardar().addActionListener(this);

		view.getvPrincipal().getPi().getIngresar().addActionListener(this);
		view.getvPrincipal().getPi().getIngresar().addMouseListener(this);

		// Ventana inicio

		view.getvInicio().getPerfil().addActionListener(this);

		view.getvInicio().getPp().getVolver().addActionListener(this);

		view.getvInicio().getPp().getEditar1().addActionListener(this);
		view.getvInicio().getPp().getEditar2().addActionListener(this);
		view.getvInicio().getPp().getEditar3().addActionListener(this);

		view.getvInicio().getPp().getSalir().addActionListener(this);
		view.getvInicio().getPp().getSalir().addMouseListener(this);

		view.getvInicio().getPf().getCorazon().addActionListener(this);

		view.getvInicio().getPf().getEquis().addActionListener(this);
		
		view.getvInicio().getPf().getMsm().addActionListener(this);

		// Ventana Admin

		view.getvAdmin().getCerrar().addActionListener(this);
		view.getvAdmin().getCerrar().addMouseListener(this);

		view.getvAdmin().getBase().addActionListener(this);
		view.getvAdmin().getBase().addMouseListener(this);

		view.getvAdmin().getPdf().addActionListener(this);
		view.getvAdmin().getPdf().addMouseListener(this);

		view.getvAdmin().getPb().getVolverBase().addActionListener(this);

		view.getvAdmin().getPb().getRefrescar().addActionListener(this);

		view.getvAdmin().getPb().getOrdenar().addActionListener(this);
		view.getvAdmin().getPb().getOrdenar().setActionCommand("ordenar");

		view.getvAdmin().getPb().getFiltrar().addActionListener(this);
		view.getvAdmin().getPb().getFiltrar().setActionCommand("filtrar");

		view.getvAdmin().getPb().getRefrescar().addActionListener(this);
		view.getvAdmin().getPb().getRefrescar().addMouseListener(this);

		view.getvAdmin().getPb().getBaja().addActionListener(this);
		view.getvAdmin().getPb().getBaja().addMouseListener(this);

	}

	/**
	 * Metodo encargado de accionar los comandos
	 */

	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();


		if (comando.equals("editar1")) {
			boolean actualizado = false;
			String aux1 = view.getVista().mostrarDialogo("Cambiar de usuario");
			for (int i = 0; i < sdi.getList().size(); i++) {

				if (sdi.getList().get(i).getUsuario().equals(aux1)) {
					actualizado = false;
				} else {
					actualizado = true;

				}

			}
			if (actualizado == true) {

				sdi.getList().get(usuario1).setUsuario(aux1);
				view.getVista().mostrarInformacion("Cambiado exitosamente");

				view.getvInicio().getPp().getE4().setText((sdi.getList().get(usuario1).getContrasena()));
				view.getvInicio().getPp().getE2().setText((sdi.getList().get(usuario1).getUsuario()));
				view.getvInicio().getPp().getE3().setText((sdi.getList().get(usuario1).getCorreo()));

				sdi.writeFile();

			} else if (actualizado == false) {
				view.getVista().mostrarInformacion("Error este usuario ya exite");

			}

		}
		if (comando.equals("editar2")) {
			boolean actualizado = false;

			String aux1 = view.getVista().mostrarDialogo("Cambiar de correo");
			for (int i = 0; i < sdi.getList().size(); i++) {

				if (sdi.getList().get(i).getCorreo().equals(aux1)) {

					actualizado = false;

				} else {

					actualizado = true;

				}
			}

			if (actualizado == true) {

				sdi.getList().get(usuario1).setCorreo(aux1);
				view.getVista().mostrarInformacion("Cambiado exitosamente");

				view.getvInicio().getPp().getE4().setText((sdi.getList().get(usuario1).getContrasena()));
				view.getvInicio().getPp().getE2().setText((sdi.getList().get(usuario1).getUsuario()));
				view.getvInicio().getPp().getE3().setText((sdi.getList().get(usuario1).getCorreo()));

				sdi.writeFile();
			} else if (actualizado == false) {
				view.getVista().mostrarInformacion("Error este correo ya exite");

			}

		}
		if (comando.equals("editar3")) {

			String aux1 = view.getVista().mostrarDialogo("Cambiar de contrasena");

			sdi.getList().get(usuario1).setContrasena(aux1);
			view.getVista().mostrarInformacion("Cambiado exitosamente");

			view.getvInicio().getPp().getE4().setText((sdi.getList().get(usuario1).getContrasena()));
			view.getvInicio().getPp().getE2().setText((sdi.getList().get(usuario1).getUsuario()));
			view.getvInicio().getPp().getE3().setText((sdi.getList().get(usuario1).getCorreo()));

			sdi.writeFile();

		}

		if (comando.equals("corazon")) {

			int aux1 = sdi.getList().get(persona).getNumeroLikesRecibidos();
			aux1 += 1;
			sdi.getList().get(persona).setNumeroLikesRecibidos(aux1);
			int usu2 = sdi.getList().get(usuario1).getNumeroLikesOtorgados();
			usu2 += 1;
			sdi.getList().get(usuario1).setNumeroLikesOtorgados(usu2);
			sdi.writeFile();
			persona = mostrarPersona();

		}

		if (comando.equals("baja")) {

			borrarTabla();
			sdi.getList().clear();
			sdi.loadFile();
			agregarTabla(sdi.getList().size(), false);
			
			try {
				String aux1 = view.getVista().mostrarDialogo("Ingrese el ID del usuario al que eliminara");
				int aux = Integer.parseInt(aux1);
				sdi.deleteByName(aux);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		if (comando.equals("equis12")) {

			persona = mostrarPersona();

		}

		if (comando.equals("base")) {

			view.getvAdmin().getPb().setVisible(true);
			view.getvAdmin().getPb().getVolverBase().setVisible(true);

			view.getvAdmin().getBase().setVisible(false);
			view.getvAdmin().getPdf().setVisible(false);
			view.getvAdmin().getCerrar().setVisible(false);
			view.getvAdmin().getImg1().setVisible(false);

			agregarTabla(sdi.getList().size(), false);

		}

		if (comando.equals("volverBase")) {

			view.getvAdmin().getPb().setVisible(false);
			view.getvAdmin().getPb().getVolverBase().setVisible(false);

			view.getvAdmin().getBase().setVisible(true);
			view.getvAdmin().getPdf().setVisible(true);
			view.getvAdmin().getCerrar().setVisible(true);
			view.getvAdmin().getImg1().setVisible(true);

			borrarTabla();
			sdi.getList().clear();
			sdi.loadFile();
			agregarTabla(sdi.getList().size(), false);

		}

		if (comando.equals("perfil")) {

			view.getvInicio().getPerfil().setVisible(false);
			view.getvInicio().getPp().setVisible(true);
			view.getvInicio().getPf().setVisible(false);
			view.getvInicio().getE1().setVisible(false);

			view.getvInicio().getPp().getE4().setText((sdi.getList().get(usuario1).getContrasena()));
			view.getvInicio().getPp().getE2().setText((sdi.getList().get(usuario1).getUsuario()));
			view.getvInicio().getPp().getE3().setText((sdi.getList().get(usuario1).getCorreo()));

		}

		String ordenar = (String) view.getvAdmin().getPb().getOrdenar().getSelectedItem();
		if (comando.equals("ordenar")) {

			if (view.getvAdmin().getPb().getAscendente().isSelected()) {
				orden_ad = 1;
			}

			if (view.getvAdmin().getPb().getDescendente().isSelected()) {

				orden_ad = 0;
			}

			if (ordenar.equals("Nombre")) {

				if (orden_ad == 1) {
					borrarTabla();
					orde.ordenamientoNombreAscendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);

				} else if (orden_ad == 0) {
					borrarTabla();
					orde.ordenamientoNombreDescendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);
				} else {
					view.getVista().mostrarAdvertencia("Selecione si Ascendente o Descendiente");
				}

			} else if (ordenar.equals("Alias")) {

				if (orden_ad == 1) {
					borrarTabla();

					orde.ordenamientoAliasAscendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);

				} else if (orden_ad == 0) {
					borrarTabla();
					orde.ordenamientoAliasDescendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);
				} else {
					view.getVista().mostrarAdvertencia("Selecione si Ascendente o Descendiente");
				}

			} else if (ordenar.equals("Numero de likes")) {

				if (orden_ad == 1) {
					borrarTabla();

					orde.burbujaNumeroLikesAscendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);

				} else if (orden_ad == 0) {
					borrarTabla();
					orde.burbujaNumeroLikesDescendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);
				} else {
					view.getVista().mostrarAdvertencia("Selecione si Ascendente o Descendiente");
				}

			} else if (ordenar.equals("Edad")) {

				if (orden_ad == 1) {
					borrarTabla();

					orde.burbujaEdadAscendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);

				} else if (orden_ad == 0) {
					borrarTabla();
					orde.burbujaEdadDescendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);
				} else {
					view.getVista().mostrarAdvertencia("Selecione si Ascendente o Descendiente");
				}
			}

		}
		String filtrar = (String) view.getvAdmin().getPb().getFiltrar().getSelectedItem();

		if (comando.equals("filtrar")) {

			if (view.getvAdmin().getPb().getAscendente().isSelected()) {
				orden_ad = 1;
			}

			if (view.getvAdmin().getPb().getDescendente().isSelected()) {

				orden_ad = 0;
			}

			if (filtrar.equals("Top 10 likes")) {
				borrarTabla();
				orde.burbujaNumeroLikesDescendente(sdi.getList());
				agregarTabla(10, false);

			} else if (filtrar.equals("Ingresos >= 244.85 USD ")) {
				borrarTabla();
				orde.burbujaDineroAscendente(sdi.getList());
				agregarTabla(sdi.getList().size(), true);

			} else if (filtrar.equals("Genero")) {

				if (orden_ad == 1) {
					borrarTabla();
					orde.ordenamientoGeneroAscendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);

				} else if (orden_ad == 0) {
					borrarTabla();
					orde.ordenamientoGeneroDescendente(sdi.getList());
					agregarTabla(sdi.getList().size(), false);

				} else {
					view.getVista().mostrarAdvertencia("Selecione si Ascendente o Descendiente");
				}

			}
		}
		if (comando.equals("refrescar")) {
			borrarTabla();
			sdi.getList().clear();
			sdi.loadFile();
			agregarTabla(sdi.getList().size(), false);

		}

		if (comando.equals("guardarHombre")) {

			try {
				String ususario = view.getvPrincipal().getPhombre().gettAlias().getText();
				String nombre = view.getvPrincipal().getPhombre().gettNombre().getText();
				String correo1 = view.getvPrincipal().getPhombre().gettCorreo().getText();
				int ingresos = Integer.parseInt(view.getvPrincipal().getPhombre().gettIngresos().getText());
				String estado = view.getvPrincipal().getPhombre().getEstado().getSelectedItem().toString();
				String contra = view.getvPrincipal().getPhombre().gettContra().getText();
				String apellido1 = view.getvPrincipal().getPhombre().gettApellido1().getText();
				String apellido2 = view.getvPrincipal().getPhombre().gettApellido2().getText();
				int anio = Integer.parseInt(view.getvPrincipal().getPhombre().getAnio().getSelectedItem().toString());
				int dia = Integer.parseInt(view.getvPrincipal().getPhombre().getDia().getSelectedItem().toString());
				int mes = Integer.parseInt(view.getvPrincipal().getPhombre().getMes().getSelectedItem().toString());
				String fecha = dia + "/" + mes + "/" + anio;

				// fecha

				Period periodo = Period.between(LocalDate.of(anio, mes, dia), LocalDate.now());
				String aux = String.valueOf(periodo.getYears());
				int edad = Integer.parseInt(aux);

				if (periodo.getYears() >= 18) {
				} else {
					throw new FechaException("Eres menor de edad, no puedes usar esta aplicacion");
				}

				correo.Correo(correo1, ususario, contra);
				
				sdi.create((1 + sdi.getList().size()) + "", nombre, apellido1, apellido2, sexo, ususario, contra,
						correo1, fecha, edad, ingresos, "No Aplica", estado);


				view.getvPrincipal().getPhombre().gettNombre().setText("");
				view.getvPrincipal().getPhombre().gettApellido1().setText("");
				view.getvPrincipal().getPhombre().gettApellido2().setText("");
				view.getvPrincipal().getPhombre().gettIngresos().setText("");
				view.getvPrincipal().getPhombre().gettEstatura().setText("");
				view.getvPrincipal().getPhombre().getEstado().setSelectedIndex(0);
				view.getvPrincipal().getPhombre().gettCorreo().setText("");
				view.getvPrincipal().getPhombre().gettContra().setText("");
				view.getvPrincipal().getPhombre().gettAlias().setText("");
				view.getvPrincipal().getPhombre().getDia().setSelectedIndex(0);
				view.getvPrincipal().getPhombre().getMes().setSelectedIndex(0);
				view.getvPrincipal().getPhombre().getAnio().setSelectedIndex(0);
				view.getVista().mostrarOk("Te enviamos un correo con tu usuario y contrasena");

				cerrarRegister();

			} catch (CaracteresException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (LetrasException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (CorreoException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (FechaException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (AddressException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia("Rellenar el campo email");
			} catch (MessagingException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia("Algo esta mal con el email");
			} catch (DateTimeException e2) {
				view.getVista().mostrarAdvertencia("Fecha invalida");
			} catch (Exception e2) {
				view.getVista().mostrarAdvertencia("No poner numeros en la fecha");
			}

		}

		if (comando.equals("guardarMujer")) {
			try {
				String ususario = view.getvPrincipal().getPmujer().gettAlias().getText();
				String nombre = view.getvPrincipal().getPmujer().gettNombre().getText();
				String correo1 = view.getvPrincipal().getPmujer().gettCorreo().getText();
				String divorcios = view.getvPrincipal().getPmujer().getDivo().getSelectedItem().toString();
				String estado = view.getvPrincipal().getPhombre().getEstado().getSelectedItem().toString();
				String contra = view.getvPrincipal().getPmujer().gettContra().getText();
				String apellido1 = view.getvPrincipal().getPmujer().gettApellido1().getText();
				String apellido2 = view.getvPrincipal().getPmujer().gettApellido2().getText();
				int anio = Integer.parseInt(view.getvPrincipal().getPmujer().getAnio().getSelectedItem().toString());
				int dia = Integer.parseInt(view.getvPrincipal().getPmujer().getDia().getSelectedItem().toString());
				int mes = Integer.parseInt(view.getvPrincipal().getPmujer().getMes().getSelectedItem().toString());
				String fecha = dia + "/" + mes + "/" + anio;

				// fecha

				Period periodo = Period.between(LocalDate.of(anio, mes, dia), LocalDate.now());
				String aux = String.valueOf(periodo.getYears());
				int edad = Integer.parseInt(aux);

				if (periodo.getYears() >= 18) {
				} else {
					throw new FechaException("Eres menor de edad no puedes usar esta aplicacion");
				}

				correo.Correo(correo1, ususario, contra);
				
				sdi.create((1 + sdi.getList().size()) + "", nombre, apellido1, apellido2, sexo, ususario, contra,
						correo1, fecha, edad, 0, divorcios, estado);


				view.getvPrincipal().getPmujer().gettNombre().setText("");
				view.getvPrincipal().getPmujer().gettEstatura().setText("");
				view.getvPrincipal().getPmujer().gettApellido1().setText("");
				view.getvPrincipal().getPmujer().gettApellido2().setText("");
				view.getvPrincipal().getPmujer().getEstado().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().gettCorreo().setText("");
				view.getvPrincipal().getPmujer().gettContra().setText("");
				view.getvPrincipal().getPmujer().gettAlias().setText("");
				view.getvPrincipal().getPmujer().getDia().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().getMes().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().getAnio().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().getDivo().setSelectedIndex(0);
				view.getVista().mostrarOk("Te enviamos un correo con tu usuario y contrasena");
				cerrarRegister();

			} catch (CaracteresException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (LetrasException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (CorreoException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (FechaException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia(e1.getMessage());
			} catch (AddressException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia("Rellenar email");
			} catch (MessagingException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia("Algo esta mal en el email");
			} catch (DateTimeException e2) {
				view.getVista().mostrarAdvertencia("Fecha invalida");
			} catch (Exception e2) {
				view.getVista().mostrarAdvertencia("No poner numeros en la fecha");
			}

		}

		if (comando.equals("inicio")) {

			view.getvPrincipal().getPo().setVisible(false);
			view.getvPrincipal().getBackInicio().setVisible(true);
			view.getvPrincipal().getBackRegistro().setVisible(false);
			view.getvPrincipal().getPi().setVisible(true);

		}
		
		if (comando.equals("msm")) {

			view.getVista().mostrarDialogo("Que mensaje le enviaras a este usuario?");
			view.getVista().mostrarInformacion("El mensaje fue enviado");

		}
		

		if (comando.equals("ingresar")) {
			Boolean ingresa = false;

			for (int i = 0; i < sdi.getList().size(); i++) {

				if (view.getvPrincipal().getPi().gettUsuario().getText().equals(sdi.getList().get(i).getUsuario())
						&& view.getvPrincipal().getPi().gettContra().getText()
								.equals(sdi.getList().get(i).getContrasena())) {
					usuario1 = i;
					view.getvPrincipal().setVisible(false);
					view.getvInicio().setVisible(true);
					ingresa = true;
				}

				else if (view.getvPrincipal().getPi().gettUsuario().getText().equals(sdi.getList().get(0).getUsuario())
						&& view.getvPrincipal().getPi().gettContra().getText()
								.equals(sdi.getList().get(0).getContrasena())) {
				
					if (view.getvInicio().isVisible()) {
						view.getvInicio().setVisible(false);
					}
					view.getvAdmin().setVisible(true);
					ingresa = true;

				}
			}
			if (ingresa == false) {

				view.getVista().mostrarInformacion("Revise si su contrasena o usuario esta correcto");

			} else if (ingresa == true) {
				persona = mostrarPersona();
				view.getVista().mostrarInformacion("Bienvenid@ a BosTinder");

			}

		}

		if (comando.equals("cerrar")) {

			int volver = (int) view.getVista().mostrarYoN("Seguro de que quiere salir?");

			if (volver == 0) {

				view.getvAdmin().getPb().setVisible(false);
				view.getvAdmin().setVisible(false);
				view.getvPrincipal().getPi().gettUsuario().setText("");
				view.getvPrincipal().getPi().gettContra().setText("");
				view.getvPrincipal().getPi().setVisible(false);
				view.getvAdmin().getPb().getVolverBase().setVisible(false);
				view.getvAdmin().getPb().getVolverBase().setVisible(false);

				view.getvPrincipal().setVisible(true);
				view.getvPrincipal().getPo().setVisible(true);
				
			}
		}

		if (comando.equals("volverPerfil")) {

			view.getvInicio().getPf().setVisible(true);
			view.getvInicio().getPp().setVisible(false);
			view.getvInicio().getPerfil().setVisible(true);
			view.getvInicio().getE1().setVisible(true);

		}

		if (comando.equals("registro")) {

			view.getvPrincipal().getPo().setVisible(false);
			view.getvPrincipal().getPr().setVisible(true);
			view.getvPrincipal().getBackInicio().setVisible(false);
			view.getvPrincipal().getBackRegistro().setVisible(true);

		}

		if (comando.equals("backRegistro")) {

			int volver = (int) view.getVista()
					.mostrarYoN("Seguro de que quiere volver al inicio?" + "\nNo se guardara");

			if (volver == 0) {

				cerrarRegister();

				view.getvPrincipal().getPhombre().gettNombre().setText("");
				view.getvPrincipal().getPhombre().gettApellido1().setText("");
				view.getvPrincipal().getPhombre().gettApellido2().setText("");
				view.getvPrincipal().getPhombre().gettIngresos().setText("");
				view.getvPrincipal().getPhombre().gettEstatura().setText("");
				view.getvPrincipal().getPhombre().getEstado().setSelectedIndex(0);
				view.getvPrincipal().getPhombre().gettCorreo().setText("");
				view.getvPrincipal().getPhombre().gettContra().setText("");
				view.getvPrincipal().getPhombre().gettAlias().setText("");
				view.getvPrincipal().getPhombre().getDia().setSelectedIndex(0);
				view.getvPrincipal().getPhombre().getMes().setSelectedIndex(0);
				view.getvPrincipal().getPhombre().getAnio().setSelectedIndex(0);

				view.getvPrincipal().getPmujer().gettNombre().setText("");
				view.getvPrincipal().getPmujer().gettEstatura().setText("");
				view.getvPrincipal().getPmujer().gettApellido1().setText("");
				view.getvPrincipal().getPmujer().gettApellido2().setText("");
				view.getvPrincipal().getPmujer().getEstado().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().gettCorreo().setText("");
				view.getvPrincipal().getPmujer().gettContra().setText("");
				view.getvPrincipal().getPmujer().gettAlias().setText("");
				view.getvPrincipal().getPmujer().getDia().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().getMes().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().getAnio().setSelectedIndex(0);
				view.getvPrincipal().getPmujer().getDivo().setSelectedIndex(0);
			}

		}

		if (comando.equals("pdf")) {
			try {
				pdf.crearPlantilla();
				view.getVista().mostrarInformacion("El reporte ha sido guardado en la ruta asignada");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				view.getVista().mostrarAdvertencia("a");
			}
		}

		if (comando.equals("backInicio")) {

			view.getvPrincipal().getPr().setVisible(false);
			view.getvPrincipal().getPi().setVisible(false);
			view.getvPrincipal().getPhombre().setVisible(false);
			view.getvPrincipal().getPmujer().setVisible(false);
			view.getvPrincipal().getBackInicio().setVisible(false);
			view.getvPrincipal().getBackRegistro().setVisible(false);
			view.getvPrincipal().getPo().setVisible(true);

			view.getvPrincipal().getPi().gettContra().setText("");
			view.getvPrincipal().getPi().gettUsuario().setText("");

		}

		if (comando.equals("next")) {

			if (view.getvPrincipal().getPr().getMujer().isSelected()) {
				sexo = "M";
				view.getvPrincipal().getPhombre().setVisible(false);
				view.getvPrincipal().getPmujer().setVisible(true);
			}

			if (view.getvPrincipal().getPr().getHombre().isSelected()) {
				sexo = "H";
				view.getvPrincipal().getPhombre().setVisible(true);
				view.getvPrincipal().getPmujer().setVisible(false);

			}

		}

		if (comando.equals("salir")) {

			int volver = (int) view.getVista().mostrarYoN("Seguro de que quiere salir?");

			if (volver == 0) {

				view.getvInicio().getPp().setVisible(false);
				view.getvInicio().getPerfil().setVisible(true);
				view.getvInicio().setVisible(false);
				view.getvInicio().getPf().setVisible(true);
				view.getvInicio().getE1().setVisible(true);

				view.getvPrincipal().getPi().gettUsuario().setText("");
				view.getvPrincipal().getPi().gettContra().setText("");
				view.getvPrincipal().getPi().setVisible(false);
				view.getvPrincipal().getBackInicio().setVisible(false);
				view.getvPrincipal().getBackRegistro().setVisible(false);

				view.getvPrincipal().setVisible(true);
				view.getvPrincipal().getPo().setVisible(true);

			}
		}
	}

	/**
	 * Metodo tipo void efectuado cuando el mouse cliquea el boton
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo tipo void efectuado cuando el mouse presiona el boton
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo tipo void efectuado cuando el mouse deja de presionar el boton
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo tipo void efectuado cuando el mouse entra a la zona del boton
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(view.getvPrincipal().getPo().getInicio())) {
			view.getvPrincipal().getPo().getInicio().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvPrincipal().getPo().getRegistro())) {
			view.getvPrincipal().getPo().getRegistro().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvPrincipal().getPi().getIngresar())) {
			view.getvPrincipal().getPi().getIngresar().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvInicio().getPp().getSalir())) {
			view.getvInicio().getPp().getSalir().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvAdmin().getBase())) {
			view.getvAdmin().getBase().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvAdmin().getPdf())) {
			view.getvAdmin().getPdf().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvAdmin().getCerrar())) {
			view.getvAdmin().getCerrar().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvAdmin().getPb().getRefrescar())) {
			view.getvAdmin().getPb().getRefrescar().setForeground(Color.red);
		} else if (e.getSource().equals(view.getvAdmin().getPb().getBaja())) {
			view.getvAdmin().getPb().getBaja().setForeground(Color.red);
		}
	}

	/**
	 * Metodo tipo void efectuado cuando el mouse sale de la zona del boton
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(view.getvPrincipal().getPo().getInicio())) {
			view.getvPrincipal().getPo().getInicio().setForeground(Color.black);
		} else if (e.getSource().equals(view.getvPrincipal().getPo().getRegistro())) {
			view.getvPrincipal().getPo().getRegistro().setForeground(Color.black);
		} else if (e.getSource().equals(view.getvPrincipal().getPi().getIngresar())) {
			view.getvPrincipal().getPi().getIngresar().setForeground(Color.black);
		} else if (e.getSource().equals(view.getvInicio().getPp().getSalir())) {
			view.getvInicio().getPp().getSalir().setForeground(Color.white);
		} else if (e.getSource().equals(view.getvAdmin().getBase())) {
			view.getvAdmin().getBase().setForeground(Color.black);
		} else if (e.getSource().equals(view.getvAdmin().getPdf())) {
			view.getvAdmin().getPdf().setForeground(Color.black);
		} else if (e.getSource().equals(view.getvAdmin().getCerrar())) {
			view.getvAdmin().getCerrar().setForeground(Color.black);
		} else if (e.getSource().equals(view.getvAdmin().getPb().getRefrescar())) {
			view.getvAdmin().getPb().getRefrescar().setForeground(Color.black);
		} else if (e.getSource().equals(view.getvAdmin().getPb().getBaja())) {
			view.getvAdmin().getPb().getBaja().setForeground(Color.black);
		}
	}
}
