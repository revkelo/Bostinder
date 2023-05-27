/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * Panel que gestiona las opciones de genero para agregar un nuevo usuario y
 * extiende de JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class PanelRegistro extends JPanel {

	/**
	 * Atributo tipo JLabel que indica lo que debera hacer el usuario
	 */
	private JLabel titulo;
	/**
	 * Atributo tipo JRadioButton para escoger el genero
	 */
	private JRadioButton mujer, hombre;
	/**
	 * Atributo tipo JButton para el boton guardar "next"
	 */
	private JButton guardar;

	/**
	 * Metodo constructor
	 */
	public PanelRegistro() {

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

		mujer = new JRadioButton("Mujer");
		mujer.setBounds(100, 50, 100, 30);
		mujer.setForeground(Color.white);
		mujer.setBackground(Color.black);
		mujer.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(mujer);

		hombre = new JRadioButton("Hombre");
		hombre.setBounds(100, 80, 100, 30);
		hombre.setForeground(Color.white);
		hombre.setBackground(Color.black);
		hombre.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(hombre);

		ButtonGroup btns = new ButtonGroup();
		btns.add(mujer);
		btns.add(hombre);

		guardar = new JButton("Next");
		guardar.setBounds(230, 70, 100, 30);
		guardar.setForeground(Color.white);
		guardar.setBackground(Color.black);
		guardar.setActionCommand("next");
		guardar.setFont(new Font("Monospaced", Font.BOLD, 20));
		add(guardar);

		titulo = new JLabel("Escoja su genero y oprima el boton 'Next'");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 15));
		titulo.setForeground(Color.white);
		titulo.setBounds(25, 0, 500, 55);
		add(titulo);
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the mujer
	 */
	public JRadioButton getMujer() {
		return mujer;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param mujer the mujer to set
	 */
	public void setMujer(JRadioButton mujer) {
		this.mujer = mujer;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the hombre
	 */
	public JRadioButton getHombre() {
		return hombre;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param hombre the hombre to set
	 */
	public void setHombre(JRadioButton hombre) {
		this.hombre = hombre;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the guardar
	 */
	public JButton getGuardar() {
		return guardar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param guardar the guardar to set
	 */
	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}
}
