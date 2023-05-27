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
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ventana que gestiona las funciones del usuario y extiende de JFrame
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class VentanaInicio extends JFrame {

	/**
	 * Atributo tipo JLabel que es el fondo y un enunciado
	 */
	private JLabel img, e1;
	/**
	 * Atributo tipo JButton para el perfil
	 */
	private JButton perfil;
	/**
	 * Atributo tipo PanelPerfil renombrado como pp
	 */
	private PanelPerfil pp;
	/**
	 * Atributo tipo PanelFeed renombrado como pf
	 */
	private PanelFeed pf;
	/**
	 * Atributo tipo ImageIcon para asignar un icono a la ventana
	 */
	private ImageIcon icono;

	/**
	 * Metodo constructor
	 */
	public VentanaInicio() {

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
		// TODO Auto-generated method stub

		perfil = new JButton("");
		perfil.setBounds(30, 10, 70, 70);
		perfil.setContentAreaFilled(false);
		perfil.setBorderPainted(false);
		perfil.setBackground(new Color(108, 246, 248, 0));
		perfil.setActionCommand("perfil");
		ImageIcon btn1 = new ImageIcon("Media/perfil.png");
		Icon icono1 = new ImageIcon(btn1.getImage().getScaledInstance(btn1.getIconWidth(), btn1.getIconHeight(),
				Image.SCALE_AREA_AVERAGING));
		perfil.setIcon(icono1);
		add(perfil);

		e1 = new JLabel("Perfil");
		e1.setBounds(150, 20, 150, 50);
		e1.setForeground(Color.white);
		e1.setFont(new Font("Monospaced", Font.BOLD, 30));
		add(e1);

		pp = new PanelPerfil();
		pp.setBounds(0, 0, 1000, 650);
		add(pp);

		pf = new PanelFeed();
		pf.setBounds(30, 100, 920, 490);
		add(pf);

		img = new JLabel("", JLabel.CENTER);
		img.setIcon(new ImageIcon("Media/vi.gif"));
		add(img);

	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the e1
	 */
	public JLabel getE1() {
		return e1;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param e1 the e1 to set
	 */
	public void setE1(JLabel e1) {
		this.e1 = e1;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the pf
	 */
	public PanelFeed getPf() {
		return pf;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param pf the pf to set
	 */
	public void setPf(PanelFeed pf) {
		this.pf = pf;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the perfil
	 */
	public JButton getPerfil() {
		return perfil;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param perfil the perfil to set
	 */
	public void setPerfil(JButton perfil) {
		this.perfil = perfil;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the pp
	 */
	public PanelPerfil getPp() {
		return pp;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param pp the pp to set
	 */
	public void setPp(PanelPerfil pp) {
		this.pp = pp;
	}

}
