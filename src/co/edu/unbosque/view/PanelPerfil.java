/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel que gestiona las opciones que tiene el usuario en su perfil y extiende
 * de JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class PanelPerfil extends JPanel {

	/**
	 * Atributos tipo JButton para salir, volver y modificar
	 */
	private JButton salir, volver, editar1, editar2, editar3;
	/**
	 * Atributo tipo JLabel que indica los datos del usuario e imagenes
	 */
	private JLabel e1, e2, e3, e4, img1, img2;

	/**
	 * Metodo constructor
	 */
	public PanelPerfil() {

		setSize(1000, 650);
		setLayout(null);
//		setBackground(new Color(108, 246, 248, 0));
		setBackground(Color.black);
		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		salir = new JButton("Cerrar sesion");
		salir.setBounds(680, 600, 300, 30);
		salir.setForeground(Color.white);
		salir.setBackground(Color.black);
		salir.setActionCommand("salir");
		salir.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(salir);

		editar1 = new JButton("");
		editar1.setBounds(200, 200, 50, 50);
		editar1.setContentAreaFilled(false);
		editar1.setBorderPainted(false);
		editar1.setBackground(new Color(108, 246, 248, 0));
		editar1.setBackground(Color.white);
		editar1.setActionCommand("editar1");
		ImageIcon btn3 = new ImageIcon("Media/Editar.png");
		Icon icono3 = new ImageIcon(
				btn3.getImage().getScaledInstance(btn3.getIconWidth(), btn3.getIconHeight(), Image.SCALE_DEFAULT));
		editar1.setIcon(icono3);
		add(editar1);

		editar2 = new JButton("");
		editar2.setBounds(200, 300, 50, 50);
		editar2.setContentAreaFilled(false);
		editar2.setBorderPainted(false);
		editar2.setBackground(new Color(108, 246, 248, 0));
		editar2.setBackground(Color.white);
		editar2.setActionCommand("editar2");
		ImageIcon btn4 = new ImageIcon("Media/Editar.png");
		Icon icono4 = new ImageIcon(
				btn4.getImage().getScaledInstance(btn4.getIconWidth(), btn4.getIconHeight(), Image.SCALE_DEFAULT));
		editar2.setIcon(icono4);
		add(editar2);

		editar3 = new JButton("");
		editar3.setBounds(200, 400, 50, 50);
		editar3.setContentAreaFilled(false);
		editar3.setBorderPainted(false);
		editar3.setBackground(new Color(108, 246, 248, 0));
		editar3.setBackground(Color.white);
		editar3.setActionCommand("editar3");
		ImageIcon btn5 = new ImageIcon("Media/Editar.png");
		Icon icono5 = new ImageIcon(
				btn5.getImage().getScaledInstance(btn5.getIconWidth(), btn5.getIconHeight(), Image.SCALE_DEFAULT));
		editar3.setIcon(icono5);
		add(editar3);

		volver = new JButton("");
		volver.setBounds(10, 10, 100, 50);
		volver.setContentAreaFilled(false);
		volver.setBorderPainted(false);
		volver.setBackground(new Color(108, 246, 248, 0));
		volver.setBackground(Color.white);
		volver.setActionCommand("volverPerfil");
		ImageIcon btn2 = new ImageIcon("Media/Volver.png");
		Icon icono2 = new ImageIcon(
				btn2.getImage().getScaledInstance(btn2.getIconWidth(), btn2.getIconHeight(), Image.SCALE_DEFAULT));
		volver.setIcon(icono2);
		add(volver);

		e1 = new JLabel("Informacion personal");
		e1.setBounds(300, 20, 500, 50);
		e1.setForeground(Color.white);
		e1.setFont(new Font("Monospaced", Font.BOLD, 30));
		add(e1);

		e2 = new JLabel("Nombre");
		e2.setBounds(300, 200, 700, 50);
		e2.setForeground(Color.white);
		e2.setFont(new Font("Monospaced", Font.BOLD, 30));
		add(e2);

		e3 = new JLabel("Alias");
		e3.setBounds(300, 300, 700, 50);
		e3.setForeground(Color.white);
		e3.setFont(new Font("Monospaced", Font.BOLD, 30));
		add(e3);

		e4 = new JLabel("Correo");
		e4.setBounds(300, 370, 700, 100);
		e4.setForeground(Color.white);
		e4.setFont(new Font("Monospaced", Font.BOLD, 30));
		add(e4);

		img1 = new JLabel();
		img1.setBounds(700, 30, 200, 200);
		ImageIcon i = new ImageIcon("Media/img1.png");
		Icon icono = new ImageIcon(
				i.getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT));
		img1.setIcon(icono);
		img1.setVisible(true);
		add(img1);

		img2 = new JLabel();
		img2.setBounds(50, 450, 500, 250);
		ImageIcon m = new ImageIcon("Media/img2.png");
		icono = new ImageIcon(m.getImage().getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_DEFAULT));
		img2.setIcon(icono);
		img2.setVisible(true);
		add(img2);

	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the salir
	 */
	public JButton getSalir() {
		return salir;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param salir the salir to set
	 */
	public void setSalir(JButton salir) {
		this.salir = salir;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the volver
	 */
	public JButton getVolver() {
		return volver;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param volver the volver to set
	 */
	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	/**
	 * @return the e1
	 */
	public JLabel getE1() {
		return e1;
	}

	/**
	 * @param e1 the e1 to set
	 */
	public void setE1(JLabel e1) {
		this.e1 = e1;
	}

	/**
	 * @return the e2
	 */
	public JLabel getE2() {
		return e2;
	}

	/**
	 * @param e2 the e2 to set
	 */
	public void setE2(JLabel e2) {
		this.e2 = e2;
	}

	/**
	 * @return the e3
	 */
	public JLabel getE3() {
		return e3;
	}

	/**
	 * @param e3 the e3 to set
	 */
	public void setE3(JLabel e3) {
		this.e3 = e3;
	}

	/**
	 * @return the e4
	 */
	public JLabel getE4() {
		return e4;
	}

	/**
	 * @param e4 the e4 to set
	 */
	public void setE4(JLabel e4) {
		this.e4 = e4;
	}

	/**
	 * @return the editar1
	 */
	public JButton getEditar1() {
		return editar1;
	}

	/**
	 * @param editar1 the editar1 to set
	 */
	public void setEditar1(JButton editar1) {
		this.editar1 = editar1;
	}

	/**
	 * @return the editar2
	 */
	public JButton getEditar2() {
		return editar2;
	}

	/**
	 * @param editar2 the editar2 to set
	 */
	public void setEditar2(JButton editar2) {
		this.editar2 = editar2;
	}

	/**
	 * @return the editar3
	 */
	public JButton getEditar3() {
		return editar3;
	}

	/**
	 * @param editar3 the editar3 to set
	 */
	public void setEditar3(JButton editar3) {
		this.editar3 = editar3;
	}
	
	
}
