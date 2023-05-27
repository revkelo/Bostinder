/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Panel que gestiona los parametros para ingresar con usuario y contraseña y
 * extiende de JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class PanelInicio extends JPanel {

	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel usuario, contra, e1;
	/**
	 * Atributo tipo JTextField para que el usuario digite el usuario existente
	 */
	private JTextField tUsuario;
	/**
	 * Atributo tipo JPasswordField para que el usuario digite la contraseña
	 * existente
	 */
	private JPasswordField tContra;
	/**
	 * Atributo tipo JButton para el boton ingresar
	 */
	private JButton ingresar;

	/**
	 * Metodo constructor
	 */
	public PanelInicio() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.cyan);
		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		ingresar = new JButton("Ingresar");
		ingresar.setBounds(200, 320, 150, 40);
		ingresar.setFont(new Font("Monospaced", Font.BOLD, 20));
		ingresar.setForeground(Color.black);
		ingresar.setBackground(Color.LIGHT_GRAY);
		ingresar.setActionCommand("ingresar");
		add(ingresar);

		usuario = new JLabel("Ingrese su usuario:");
		usuario.setBounds(150, 30, 250, 50);
		usuario.setFont(new Font("Monospaced", Font.BOLD, 20));
		usuario.setForeground(Color.white);
		add(usuario);

		contra = new JLabel("Ingrese su contraseña:");
		contra.setBounds(150, 130, 350, 50);
		contra.setFont(new Font("Monospaced", Font.BOLD, 20));
		contra.setForeground(Color.white);
		add(contra);

		tUsuario = new JTextField();
		tUsuario.setBounds(150, 80, 250, 35);
		tUsuario.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(tUsuario);

		tContra = new JPasswordField();
		tContra.setBounds(150, 180, 250, 35);
		tContra.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(tContra);

		e1 = new JLabel("¿Aun sin usuario?");
		e1.setBounds(200, 220, 350, 50);
		e1.setFont(new Font("Monospaced", Font.BOLD, 15));
		e1.setForeground(Color.white);
		add(e1);

		e1 = new JLabel("Dale al boton 'Back' y ¡Registrate!");
		e1.setBounds(120, 250, 500, 50);
		e1.setFont(new Font("Monospaced", Font.BOLD, 15));
		e1.setForeground(Color.white);
		add(e1);

	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tUsuario
	 */
	public JTextField gettUsuario() {
		return tUsuario;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tUsuario the tUsuario to set
	 */
	public void settUsuario(JTextField tUsuario) {
		this.tUsuario = tUsuario;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tContra
	 */
	public JPasswordField gettContra() {
		return tContra;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tContra the tContra to set
	 */
	public void settContra(JPasswordField tContra) {
		this.tContra = tContra;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the ingresar
	 */
	public JButton getIngresar() {
		return ingresar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param ingresar the ingresar to set
	 */
	public void setIngresar(JButton ingresar) {
		this.ingresar = ingresar;
	}
}
