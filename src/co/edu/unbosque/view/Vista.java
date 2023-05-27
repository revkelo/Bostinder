/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import javax.swing.JOptionPane;

/**
 * Ventana que gestiona los JOptionPane
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */
public class Vista {

	/**
	 * Metodo encargado de leer un dato tipo double
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return dato double leido
	 */

	public double leerDato(String mensaje) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Informacion", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public void mostrarAdvertencia(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Advertencia", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public void mostrarOk(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Oyeeeee", JOptionPane.PLAIN_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje tipo int por medio del JOptionPane
	 */

	public int mostrarYoN(String mensaje) {
		return JOptionPane.showConfirmDialog(null, mensaje, "Wait...", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
	}

	/**
	 * Metodo que se encarga de recibir un mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return aux variable tipo String
	 */

	public String mostrarDialogo(String mensaje) {
		String aux = JOptionPane.showInputDialog(null, mensaje, "");
		return aux;
	}
}
