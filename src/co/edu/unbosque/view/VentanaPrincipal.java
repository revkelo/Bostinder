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

/**
 * Ventana que gestiona las funciones de refistrarse e ingresar y extiende de
 * JFrame
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */
public class VentanaPrincipal extends JFrame {

	/**
	 * Atributo tipo JLabel que es una imagen
	 */
	private JLabel img;
	/**
	 * Atributo tipo JButton para regresar de las opciones
	 */
	private JButton backRegistro, backInicio;
	/**
	 * Atributo tipo PanelRegistro renombrado como pr
	 */
	private PanelRegistro pr;
	/**
	 * Atributo tipo PanelAggMujer renombrado como pmujer
	 */
	private PanelAggMujer pmujer;
	/**
	 * Atributo tipo PanelAggHombre renombrado como phombre
	 */
	private PanelAggHombre phombre;
	/**
	 * Atributo tipo PanelOne renombrado como po
	 */
	private PanelOne po;
	/**
	 * Atributo tipo PanelInicio renombrado como pi
	 */
	private PanelInicio pi;
	/**
	 * Atributo tipo ImageIcon para asignar un icono a la ventana
	 */
	private ImageIcon icono;

	/**
	 * Metodo constructor
	 */
	public VentanaPrincipal() {

		setSize(1000, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		getContentPane().setBackground(Color.black);

		inicializarComponentes();

		icono();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
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
		// TODO Auto-generated method stub

//		getContentPane().setLayout(new BorderLayout());

		pr = new PanelRegistro();
		pr.setBounds(10, 10, 440, 150);
		pr.setVisible(false);
		add(pr);

		pi = new PanelInicio();
		pi.setBounds(200, 150, 570, 430);
		pi.setVisible(false);
		add(pi);

		phombre = new PanelAggHombre();
		phombre.setBounds(150, 150, 800, 450);
		phombre.setVisible(false);
		add(phombre);

		pmujer = new PanelAggMujer();
		pmujer.setBounds(150, 150, 800, 450);
		pmujer.setVisible(false);
		add(pmujer);

		po = new PanelOne();
		po.setVisible(true);
		add(po);

		backRegistro = new JButton("");
		backRegistro.setBounds(850, 550, 100, 50);
		backRegistro.setContentAreaFilled(false);
		backRegistro.setBorderPainted(false);
		backRegistro.setFont(new Font("Monospaced", Font.BOLD, 20));
		ImageIcon btn1 = new ImageIcon("Media/Back.png");
		Icon icono1 = new ImageIcon(
				btn1.getImage().getScaledInstance(btn1.getIconWidth(), btn1.getIconHeight(), Image.SCALE_DEFAULT));
		backRegistro.setIcon(icono1);
		backRegistro.setVisible(false);
		backRegistro.setActionCommand("backRegistro");
		add(backRegistro);

		backInicio = new JButton("");
		backInicio.setBounds(850, 550, 100, 50);
		backInicio.setContentAreaFilled(false);
		backInicio.setBorderPainted(false);
		backInicio.setFont(new Font("Monospaced", Font.BOLD, 20));
		ImageIcon btn2 = new ImageIcon("Media/Back.png");
		Icon icono2 = new ImageIcon(
				btn2.getImage().getScaledInstance(btn2.getIconWidth(), btn2.getIconHeight(), Image.SCALE_DEFAULT));
		backInicio.setIcon(icono2);
		backInicio.setVisible(false);
		backInicio.setActionCommand("backInicio");
		add(backInicio);

		img = new JLabel("", JLabel.CENTER);
		img.setIcon(new ImageIcon("Media/vp.gif"));
		add(img);

	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the backRegistro
	 */
	public JButton getBackRegistro() {
		return backRegistro;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param backRegistro the backRegistro to set
	 */
	public void setBackRegistro(JButton backRegistro) {
		this.backRegistro = backRegistro;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the backInicio
	 */
	public JButton getBackInicio() {
		return backInicio;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param backInicio the backInicio to set
	 */
	public void setBackInicio(JButton backInicio) {
		this.backInicio = backInicio;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the pr
	 */
	public PanelRegistro getPr() {
		return pr;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param pr the pr to set
	 */
	public void setPr(PanelRegistro pr) {
		this.pr = pr;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the pmujer
	 */
	public PanelAggMujer getPmujer() {
		return pmujer;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param pmujer the pmujer to set
	 */
	public void setPmujer(PanelAggMujer pmujer) {
		this.pmujer = pmujer;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the phombre
	 */
	public PanelAggHombre getPhombre() {
		return phombre;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param phombre the phombre to set
	 */
	public void setPhombre(PanelAggHombre phombre) {
		this.phombre = phombre;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the po
	 */
	public PanelOne getPo() {
		return po;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param po the po to set
	 */
	public void setPo(PanelOne po) {
		this.po = po;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the pi
	 */
	public PanelInicio getPi() {
		return pi;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param pi the pi to set
	 */
	public void setPi(PanelInicio pi) {
		this.pi = pi;
	}
}
