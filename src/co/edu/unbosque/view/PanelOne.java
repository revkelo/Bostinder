/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con las opciones iniciales del programa extiende de JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class PanelOne extends JPanel {

	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel e1, e2;
	/**
	 * Atributo tipo JButton para el boton inicio y registro
	 */
	private JButton inicio, registro;

	/**
	 * Metodo constructor
	 */

	public PanelOne() {

		setLayout(null);
		setSize(1000, 650);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.cyan);
		inicializarComponentes();

		setVisible(true);
	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		inicio = new JButton("Iniciar sesion");
		inicio.setBounds(350, 300, 250, 50);
		inicio.setFont(new Font("Monospaced", Font.BOLD, 20));
		inicio.setForeground(Color.black);
		inicio.setBackground(Color.LIGHT_GRAY);
		inicio.setActionCommand("inicio");
		add(inicio);

		registro = new JButton("Registrate aqui");
		registro.setBounds(350, 450, 250, 50);
		registro.setFont(new Font("Monospaced", Font.BOLD, 20));
		registro.setForeground(Color.black);
		registro.setBackground(Color.LIGHT_GRAY);
		registro.setActionCommand("registro");
		add(registro);

		e1 = new JLabel("Ya tienes cuenta?");
		e1.setBounds(365, 250, 250, 50);
		e1.setFont(new Font("Monospaced", Font.BOLD, 20));
		e1.setForeground(Color.white);
		add(e1);

		e2 = new JLabel("Aun no tienes cuenta?");
		e2.setBounds(340, 400, 350, 50);
		e2.setFont(new Font("Monospaced", Font.BOLD, 20));
		e2.setForeground(Color.white);
		add(e2);

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
	 * @return the e2
	 */
	public JLabel getE2() {
		return e2;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param e2 the e2 to set
	 */
	public void setE2(JLabel e2) {
		this.e2 = e2;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the inicio
	 */
	public JButton getInicio() {
		return inicio;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param inicio the inicio to set
	 */
	public void setInicio(JButton inicio) {
		this.inicio = inicio;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the registro
	 */
	public JButton getRegistro() {
		return registro;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param registro the registro to set
	 */
	public void setRegistro(JButton registro) {
		this.registro = registro;
	}

}
