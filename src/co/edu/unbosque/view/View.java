/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

/**
 * Ventana que hace posible el MVC correspondiente
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */
public class View {

	private Ventana_Grafico a;
	/**
	 * Atributo tipo VentanaInicio renombrado como vInicio
	 */
	private VentanaInicio vInicio;
	/**
	 * Atributo tipo VentanaAdmin renombrado como vAdmin
	 */
	private VentanaAdmin vAdmin;
	/**
	 * Atributo tipo VentanaPrincipal renombrado como vPrincipal
	 */
	private VentanaPrincipal vPrincipal;
	/**
	 * Atributo tipo Vista renombrado como vista
	 */
	private Vista vista;

	/**
	 * Metodo constructor
	 */
	public View() {

		vInicio = new VentanaInicio();
		vAdmin = new VentanaAdmin();
		vPrincipal = new VentanaPrincipal();
		vista = new Vista();
		a =  new Ventana_Grafico();

	}

	/**
	 * @return the a
	 */
	public Ventana_Grafico getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Ventana_Grafico a) {
		this.a = a;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the vista
	 */
	public Vista getVista() {
		return vista;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param vista the vista to set
	 */
	public void setVista(Vista vista) {
		this.vista = vista;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the vInicio
	 */
	public VentanaInicio getvInicio() {
		return vInicio;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param vInicio the vInicio to set
	 */
	public void setvInicio(VentanaInicio vInicio) {
		this.vInicio = vInicio;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the vAdmin
	 */
	public VentanaAdmin getvAdmin() {
		return vAdmin;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param vAdmin the vAdmin to set
	 */
	public void setvAdmin(VentanaAdmin vAdmin) {
		this.vAdmin = vAdmin;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the vPrincipal
	 */
	public VentanaPrincipal getvPrincipal() {
		return vPrincipal;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param vPrincipal the vPrincipal to set
	 */
	public void setvPrincipal(VentanaPrincipal vPrincipal) {
		this.vPrincipal = vPrincipal;
	}

}
