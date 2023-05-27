/**
 * Paquete que pertenece al modelo el cual se encarga de la representacion de objetos 
 */
package co.edu.unbosque.model;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import co.edu.unbosque.view.View;
import co.edu.unbosque.view.Vista;

/**
 * Clase Correos del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolás
 */

public class Correos {

	/**
	 * Atributo tipo String para titulo y contenido
	 */
	private String titulo, contenido;
	/**
	 * Atributo tipo Vista renombrado como vista
	 */
	private Vista vista;
	/**
	 * Atributo tipo Properties renombrado como props
	 */
	private Properties props;
	/**
	 * Atributo tipo Session renombrado como session
	 */
	private Session session;
	/**
	 * Atributo tipo MimeMessage renombrado como mensajecorreo
	 */
	private MimeMessage mensajecorreo;
	/**
	 * Atributo estatico tipo String del correo del que se enviara el email
	 */
	private static String correoUwU = "bostinder3@gmail.com";
	/**
	 * Atributo estatico tipo String de la contraseña del correo que se enviara el
	 * email
	 */
	private static String contrasena = "jffwatexjcjqtjse";

	/**
	 * Metodo Constructor
	 */
	public Correos() {
		vista = new Vista();
		props = new Properties();
	}

	/**
	 * Metodo encargado de enviar el correo de confirmacion
	 */
	private void enviarcorreo() {

		try {
			Transport envio = session.getTransport("smtp");
			envio.connect(correoUwU, contrasena);
			envio.sendMessage(mensajecorreo, mensajecorreo.getRecipients(Message.RecipientType.TO));
			envio.close();
			vista.mostrarAdvertencia("Se envio un correo de confirmacion a su correo");
		} catch (NoSuchProviderException e) {
			vista.mostrarAdvertencia("Algo esta mal");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Metodo que se encarga de la configuracion para enviar el correo
	 * 
	 * @param correo1 variable tipo String 
	 * @param usuario variable tipo String 
	 * @param contra variable tipo String 
	 */
	public void Correo(String correo1, String usuario, String contra) {
		titulo = "Bienvenido a bostinder";
		contenido = "Tu usuario es " + usuario + "\n" + "Tu contraseña es " + contra;

		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.setProperty("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.smtp.port", "587");
		props.setProperty("mail.smtp.user", correoUwU);
		props.put("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
		props.setProperty("mail.smtp.auth", "true");

		session = Session.getDefaultInstance(props);

		mensajecorreo = new MimeMessage(session);
		try {
			mensajecorreo.setFrom(new InternetAddress(correoUwU));
		} catch (MessagingException e) {
		System.out.println("No existe");
			e.printStackTrace();
		}
		try {
			mensajecorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(correo1));
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mensajecorreo.setSubject(titulo);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mensajecorreo.setText(contenido, "ISO-8859-1", "html");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		enviarcorreo();
	}

}
