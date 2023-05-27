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
 * Panel que gestiona la imagen, informacion e interaccion de los usuarios y
 * extiende de JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class PanelFeed extends JPanel {

	/**
	 * Atributo tipo JPanel para organizar la imagen y los botones
	 */
	private JPanel imagen, interaccion;
	/**
	 * Atributo tipo JLabel que muestra la imagen
	 */
	private JLabel imag;
	/**
	 * Atributo panelinfo se renombra info
	 */
	private Panelinfo info;
	/**
	 * Atributo tipo JButton para los botones de interaccion
	 */
	private JButton corazon, equis, msm;
	/**
	 * Atributo tipo String con la ruta de las imagenes
	 */
	private String file_img = "Media/Mujer/1.jpg";

	/**
	 * Metodo constructor
	 */
	public PanelFeed() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.yellow);
		inicializarComponentes();

		setVisible(true);

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */

	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		// p2

		info = new Panelinfo();
		info.setBounds(320, 10, 590, 345);
		info.setBackground(Color.LIGHT_GRAY);
		info.setVisible(true);
		add(info);

		// p3

		equis = new JButton("");
		equis.setBounds(350, 380, 80, 80);
		equis.setContentAreaFilled(false);
		equis.setBorderPainted(false);
		equis.setBackground(new Color(108, 246, 248, 0));
		equis.setActionCommand("equis12");

		ImageIcon btn1 = new ImageIcon("Media/x.png");
		Icon icono1 = new ImageIcon(btn1.getImage().getScaledInstance(btn1.getIconWidth(), btn1.getIconHeight(),
				Image.SCALE_AREA_AVERAGING));
		equis.setIcon(icono1);
		add(equis);

		corazon = new JButton("");
		corazon.setBounds(450, 380, 80, 80);
		corazon.setContentAreaFilled(false);
		corazon.setBorderPainted(false);
		corazon.setBackground(new Color(108, 246, 248, 0));
		corazon.setActionCommand("corazon");
		ImageIcon btn4 = new ImageIcon("Media/Corazon-modified.png");
		Icon icono4 = new ImageIcon(btn4.getImage().getScaledInstance(btn4.getIconWidth(), btn4.getIconHeight(),
				Image.SCALE_AREA_AVERAGING));
		corazon.setIcon(icono4);
		add(corazon);

		msm = new JButton("");
		msm.setBounds(550, 380, 80, 80);
		msm.setContentAreaFilled(false);
		msm.setBorderPainted(false);
		msm.setBackground(new Color(108, 246, 248, 0));
		msm.setActionCommand("msm");
		ImageIcon btn3 = new ImageIcon("Media/msm-modified.png");
		Icon icono3 = new ImageIcon(
				btn3.getImage().getScaledInstance(btn3.getIconWidth(), btn3.getIconHeight(), Image.SCALE_DEFAULT));
		msm.setIcon(icono3);
		add(msm);

		interaccion = new JPanel();
		interaccion.setBounds(320, 365, 300, 115);
//		interaccion.setBackground(new Color(108, 246, 248, 0));
		interaccion.setBackground(Color.black);
		interaccion.setVisible(true);
		add(interaccion);

		imagen();

	}

	/**
	 * Metodo imagen que se encarga de rotar las imagenes de la carpeta
	 */
	public void imagen() {
		imag = new JLabel();
		imag.setBounds(0, 0, 300, 470);
		ImageIcon imag1 = new ImageIcon(file_img);
		Icon icono = new ImageIcon(
				imag1.getImage().getScaledInstance(imag.getWidth(), imag.getHeight(), Image.SCALE_DEFAULT));
		imag.setIcon(icono);

		imagen = new JPanel();
		imagen.setBounds(10, 10, 300, 470);
		imagen.setBackground(Color.black);
		imagen.setVisible(true);
		imagen.add(imag);
		add(imagen);
	}

	/**
	 * Metodo que se encarga de quitar la imagen establecida
	 */
	public void quitarImag() {
		remove(imagen);
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the info
	 */
	public Panelinfo getInfo() {
		return info;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @return the imagen
	 */
	public JPanel getImagen() {
		return imagen;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @param imagen the imagen to set
	 */
	public void setImagen(JPanel imagen) {
		this.imagen = imagen;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @return the interaccion
	 */
	public JPanel getInteraccion() {
		return interaccion;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @param interaccion the interaccion to set
	 */
	public void setInteraccion(JPanel interaccion) {
		this.interaccion = interaccion;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @return the corazon
	 */
	public JButton getCorazon() {
		return corazon;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @param corazon the corazon to set
	 */
	public void setCorazon(JButton corazon) {
		this.corazon = corazon;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @return the equis
	 */
	public JButton getEquis() {
		return equis;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @param equis the equis to set
	 */
	public void setEquis(JButton equis) {
		this.equis = equis;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @return the msm
	 */
	public JButton getMsm() {
		return msm;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @param msm the msm to set
	 */
	public void setMsm(JButton msm) {
		this.msm = msm;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @return the imag
	 */
	public JLabel getImag() {
		return imag;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @param imag the imag to set
	 */
	public void setImag(JLabel imag) {
		this.imag = imag;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @return the file_img
	 */
	public String getFile_img() {
		return file_img;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @param file_img the file_img to set
	 */
	public void setFile_img(String file_img) {
		this.file_img = file_img;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param info the info to set
	 */
	public void setInfo(Panelinfo info) {
		this.info = info;
	}

}
