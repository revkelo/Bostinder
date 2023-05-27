/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Ventana que gestiona las funciones del administrador y extiende de JFrame
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class VentanaAdmin extends JFrame {

	/**
	 * Atributo tipo JLabel que son imagenes
	 */
	private JLabel img, img1, publicidad;
	/**
	 * Atributo tipo JButton para las opciones de las funciones
	 */
	private JButton pdf, base, cerrar;
	/**
	 * Atributo tipo PanelBase renombrado como pb
	 */
	private PanelBase pb;
	/**
	 * Atributo tipo ImageIcon para asignar un icono a la ventana
	 */
	private ImageIcon icono;

	/**
	 * Metodo constructor
	 */
	public VentanaAdmin() {

		setSize(1000, 650);
//		setLayout(null);
//		setDefaultCloseOperation(JFrame. DO_NOTHING_ON_CLOSE);

//		getContentPane().setBackground(Color.pink);

		inicializarComponentes();

		icono();
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);

	}

	/**
	 * Metodo que asigna una imagen personalizada al icono de la ventana
	 */
	private void icono() {
		icono = new ImageIcon("Media/Icono.png");
		setIconImage(icono.getImage());

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {

		// administrador

		pdf = new JButton("PDF");
		pdf.setBounds(50, 200, 150, 50);
		pdf.setFont(new Font("Monospaced", Font.BOLD, 20));
		pdf.setBackground(Color.lightGray);
		pdf.setVisible(true);
		pdf.setActionCommand("pdf");
		add(pdf);

		base = new JButton("Usuarios");
		base.setBounds(50, 350, 150, 50);
		base.setFont(new Font("Monospaced", Font.BOLD, 20));
		base.setBackground(Color.lightGray);
		base.setVisible(true);
		base.setActionCommand("base");
		add(base);

		cerrar = new JButton("Cerrar sesion");
		cerrar.setBounds(35, 500, 180, 50);
		cerrar.setFont(new Font("Monospaced", Font.BOLD, 15));
		cerrar.setBackground(Color.lightGray);
		cerrar.setVisible(true);
		cerrar.setActionCommand("cerrar");
		add(cerrar);

		img1 = new JLabel();
		img1.setBounds(0, 0, 1000, 150);
		ImageIcon i = new ImageIcon("Media/titulo.png");
		Icon icono = new ImageIcon(
				i.getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT));
		img1.setIcon(icono);
		img1.setVisible(true);
		add(img1);

		pb = new PanelBase();
		add(pb);

		img = new JLabel("", JLabel.CENTER);
		img.setIcon(new ImageIcon("Media/vi.gif"));
		add(img);
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the img1
	 */
	public JLabel getImg1() {
		return img1;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param img1 the img1 to set
	 */
	public void setImg1(JLabel img1) {
		this.img1 = img1;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the publicidad
	 */
	public JLabel getPublicidad() {
		return publicidad;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param publicidad the publicidad to set
	 */
	public void setPublicidad(JLabel publicidad) {
		this.publicidad = publicidad;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the pb
	 */
	public PanelBase getPb() {
		return pb;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param pb the pb to set
	 */
	public void setPb(PanelBase pb) {
		this.pb = pb;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the img
	 */
	public JLabel getImg() {
		return img;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param img the img to set
	 */
	public void setImg(JLabel img) {
		this.img = img;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the pdf
	 */
	public JButton getPdf() {
		return pdf;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param pdf the pdf to set
	 */
	public void setPdf(JButton pdf) {
		this.pdf = pdf;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the base
	 */
	public JButton getBase() {
		return base;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param base the base to set
	 */
	public void setBase(JButton base) {
		this.base = base;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the cerrar
	 */
	public JButton getCerrar() {
		return cerrar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param cerrar the cerrar to set
	 */
	public void setCerrar(JButton cerrar) {
		this.cerrar = cerrar;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the icono
	 */
	public ImageIcon getIcono() {
		return icono;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param icono the icono to set
	 */
	public void setIcono(ImageIcon icono) {
		this.icono = icono;
	}

}
