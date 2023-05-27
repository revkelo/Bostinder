/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Panel que gestiona los parametros para agregar un usuario mujer y extiende de
 * JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class PanelAggMujer extends JPanel {

	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel nombre, alias, edad, correo, estatura, divorcio, estadociv, contra, apellido1, apellido2, e1, e2, e3;
	/**
	 * Atributo tipo JTextField para que el usuario digite los requisitos que se le
	 * solicitan
	 */
	private JTextField tNombre, tAlias, tCorreo, tEstatura, tContra, tYear, tApellido1, tApellido2;
	/**
	 * Atributo tipo JButton para el boton guardar
	 */
	private JButton guardar;
	/**
	 * Atributo tipo JComboBox para la fecha de nacimiento y estado
	 */
	private JComboBox<String> dia, mes, anio, divo, estado;
	/**
	 * Atributo tipo String que es una lista con las opciones del estado
	 */
	private String[] listaEstado = { "Disponible", "Inactivo" };
	/**
	 * Atributo tipo String que es una lista con las opciones de su divorcio "si" o
	 * "no"
	 */
	private String listaDivorcio[] = { "Si", "No" };
	/**
	 * Atributo tipo String que es una lista con las opciones de años
	 */
	private String listaYear[] = { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909",
			"1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922",
			"1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935",
			"1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948",
			"1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961",
			"1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974",
			"1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987",
			"1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000",
			"2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013",
			"2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" };
	/**
	 * Atributo tipo String que es una lista con las opciones de dias
	 */
	private String listaDias[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", };
	/**
	 * Atributo tipo String que es una lista con las opciones de meses
	 */
	private String listaMes[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

	/**
	 * Metodo constructor
	 */
	public PanelAggMujer() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
		inicializarComponentes();

		setVisible(false);
	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {

		guardar = new JButton("");
		guardar.setBounds(650, 150, 100, 100);
		guardar.setContentAreaFilled(false);
		guardar.setBorderPainted(false);
		guardar.setBackground(new Color(108, 246, 248, 0));
		guardar.setActionCommand("guardarMujer");
		ImageIcon btn1 = new ImageIcon("Media/BtnGuardar-modified.png");
		Icon icono1 = new ImageIcon(
				btn1.getImage().getScaledInstance(btn1.getIconWidth(), btn1.getIconHeight(), Image.SCALE_DEFAULT));
		guardar.setIcon(icono1);
		add(guardar);

//		((AbstractButton) btn1).setIcon(icono1);

		estado = new JComboBox<String>(listaEstado);
		estado.setBounds(320, 310, 250, 25);
		estado.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(estado);

		anio = new JComboBox<String>(listaYear);
		anio.setBounds(160, 310, 100, 25);
		anio.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(anio);

		divo = new JComboBox<String>(listaDivorcio);
		divo.setBounds(320, 210, 50, 35);
		divo.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(divo);

		dia = new JComboBox<String>(listaDias);
		dia.setFont(new Font("Monospaced", Font.BOLD, 15));
		dia.setBounds(20, 310, 50, 25);
		add(dia);

		mes = new JComboBox<String>(listaMes);
		mes.setFont(new Font("Monospaced", Font.BOLD, 15));
		mes.setBounds(90, 310, 50, 25);
		add(mes);

		tYear = new JTextField();
		tYear.setBounds(160, 310, 100, 25);
		tYear.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tYear);

		nombre = new JLabel("Nombre:");
		nombre.setBounds(20, 10, 150, 50);
		nombre.setFont(new Font("Monospaced", Font.BOLD, 15));
		nombre.setForeground(Color.white);
		add(nombre);

		alias = new JLabel("Alias:");
		alias.setBounds(20, 150, 150, 50);
		alias.setFont(new Font("Monospaced", Font.BOLD, 15));
		alias.setForeground(Color.white);
		add(alias);

		apellido1 = new JLabel("Apellido 1:");
		apellido1.setBounds(20, 80, 150, 50);
		apellido1.setFont(new Font("Monospaced", Font.BOLD, 15));
		apellido1.setForeground(Color.white);
		add(apellido1);

		apellido2 = new JLabel("Apellido 2:");
		apellido2.setBounds(320, 80, 150, 50);
		apellido2.setFont(new Font("Monospaced", Font.BOLD, 15));
		apellido2.setForeground(Color.white);
		add(apellido2);

		edad = new JLabel("Fecha nacimiento:");
		edad.setBounds(20, 250, 220, 50);
		edad.setFont(new Font("Monospaced", Font.BOLD, 15));
		edad.setForeground(Color.white);
		add(edad);

		correo = new JLabel("Correo:");
		correo.setBounds(20, 350, 150, 50);
		correo.setFont(new Font("Monospaced", Font.BOLD, 15));
		correo.setForeground(Color.white);
		add(correo);

		estatura = new JLabel("Estatura:");
		estatura.setBounds(320, 10, 150, 50);
		estatura.setFont(new Font("Monospaced", Font.BOLD, 15));
		estatura.setForeground(Color.white);
		add(estatura);

		divorcio = new JLabel("Divorcios:");
		divorcio.setBounds(320, 150, 150, 50);
		divorcio.setFont(new Font("Monospaced", Font.BOLD, 15));
		divorcio.setForeground(Color.white);
		add(divorcio);

		estadociv = new JLabel("Estado civil:");
		estadociv.setBounds(320, 250, 250, 50);
		estadociv.setFont(new Font("Monospaced", Font.BOLD, 15));
		estadociv.setForeground(Color.white);
		add(estadociv);

		contra = new JLabel("Contraseña:");
		contra.setBounds(320, 350, 250, 50);
		contra.setFont(new Font("Monospaced", Font.BOLD, 15));
		contra.setForeground(Color.white);
		add(contra);

		tNombre = new JTextField();
		tNombre.setBounds(20, 60, 250, 25);
		tNombre.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tNombre);

		tApellido1 = new JTextField();
		tApellido1.setBounds(20, 130, 250, 25);
		tApellido1.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tApellido1);

		tApellido2 = new JTextField();
		tApellido2.setBounds(320, 130, 250, 25);
		tApellido2.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tApellido2);

		tAlias = new JTextField();
		tAlias.setBounds(20, 210, 250, 25);
		tAlias.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tAlias);

		tCorreo = new JTextField();
		tCorreo.setBounds(20, 400, 250, 25);
		tCorreo.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tCorreo);

		tEstatura = new JTextField();
		tEstatura.setBounds(320, 60, 250, 25);
		tEstatura.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tEstatura);

		tContra = new JTextField();
		tContra.setBounds(320, 400, 250, 25);
		tContra.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tContra);

		e1 = new JLabel("Dia");
		e1.setBounds(20, 295, 30, 10);
		e1.setFont(new Font("Monospaced", Font.BOLD, 10));
		e1.setForeground(Color.white);
		add(e1);

		e2 = new JLabel("Mes");
		e2.setBounds(90, 295, 30, 10);
		e2.setFont(new Font("Monospaced", Font.BOLD, 10));
		e2.setForeground(Color.white);
		add(e2);

		e3 = new JLabel("Año");
		e3.setBounds(160, 295, 30, 10);
		e3.setFont(new Font("Monospaced", Font.BOLD, 10));
		e3.setForeground(Color.white);
		add(e3);

	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tNombre
	 */
	public JTextField gettNombre() {
		return tNombre;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tNombre the tNombre to set
	 */
	public void settNombre(JTextField tNombre) {
		this.tNombre = tNombre;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tAlias
	 */
	public JTextField gettAlias() {
		return tAlias;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tAlias the tAlias to set
	 */
	public void settAlias(JTextField tAlias) {
		this.tAlias = tAlias;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tCorreo
	 */
	public JTextField gettCorreo() {
		return tCorreo;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tCorreo the tCorreo to set
	 */
	public void settCorreo(JTextField tCorreo) {
		this.tCorreo = tCorreo;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tEstatura
	 */
	public JTextField gettEstatura() {
		return tEstatura;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tEstatura the tEstatura to set
	 */
	public void settEstatura(JTextField tEstatura) {
		this.tEstatura = tEstatura;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tContra
	 */
	public JTextField gettContra() {
		return tContra;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tContra the tContra to set
	 */
	public void settContra(JTextField tContra) {
		this.tContra = tContra;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tYear
	 */
	public JTextField gettYear() {
		return tYear;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tYear the tYear to set
	 */
	public void settYear(JTextField tYear) {
		this.tYear = tYear;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tApellido1
	 */
	public JTextField gettApellido1() {
		return tApellido1;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tApellido1 the tApellido1 to set
	 */
	public void settApellido1(JTextField tApellido1) {
		this.tApellido1 = tApellido1;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tApellido2
	 */
	public JTextField gettApellido2() {
		return tApellido2;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tApellido2 the tApellido2 to set
	 */
	public void settApellido2(JTextField tApellido2) {
		this.tApellido2 = tApellido2;
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

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the dia
	 */
	public JComboBox<String> getDia() {
		return dia;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param dia the dia to set
	 */
	public void setDia(JComboBox<String> dia) {
		this.dia = dia;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the mes
	 */
	public JComboBox<String> getMes() {
		return mes;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param mes the mes to set
	 */
	public void setMes(JComboBox<String> mes) {
		this.mes = mes;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the anio
	 */
	public JComboBox<String> getAnio() {
		return anio;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param anio the anio to set
	 */
	public void setAnio(JComboBox<String> anio) {
		this.anio = anio;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the divo
	 */
	public JComboBox<String> getDivo() {
		return divo;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param divo the divo to set
	 */
	public void setDivo(JComboBox<String> divo) {
		this.divo = divo;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the estado
	 */
	public JComboBox<String> getEstado() {
		return estado;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param estado the estado to set
	 */
	public void setEstado(JComboBox<String> estado) {
		this.estado = estado;
	}

}
