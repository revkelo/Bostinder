/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Panel que gestiona la informacion y extiende de JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class Panelinfo extends JPanel {

	/**
	 * Un campo de texto para insertar la informacion
	 */
	private JTextArea textArea;

	/**
	 * Una barra para deslizar por el campo de texto y observar toda la informacion
	 */
	private JScrollPane scrollBarForTextArea;

	/**
	 * Metodo constructor <b>pre</b> La existencia de atributos <br>
	 * <b>post</b> El panel de informacion creado<br>
	 */
	public Panelinfo() {
		setOpaque(false);

		setLayout(new GridLayout());

		cosas();
	}

	/**
	 * Metodo que inicializa los atributos <b>pre</b> Atributos a inicializar <br>
	 * <b>post</b> Atributos añadidos <br>
	 */
	private void cosas() {
		textArea = new JTextArea("Selecciona Alguna Opcion bb");

		textArea.setLineWrap(true);
		textArea.setFocusable(true);
		textArea.setOpaque(false);

		textArea.setBorder(null);
		textArea.setEditable(false);
		textArea.setForeground(Color.white);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 19));
		textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		scrollBarForTextArea = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		scrollBarForTextArea.getViewport().setOpaque(false);
		scrollBarForTextArea.setOpaque(false);
		scrollBarForTextArea.setBorder(null);
		add(scrollBarForTextArea);

	}

	/**
	 * Obtiene la informacion del campo de texto
	 * 
	 * @return the textArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * Asigna informacion al campo de texto
	 * 
	 * @param textArea the textArea to set
	 */
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

}
