/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel que gestiona las opciones de ordenamiento y mostrar los datos por medio
 * de una tabla y extiende de JPanel
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */

public class PanelBase extends JPanel {

	/**
	 * Atributo tipo JLabel que indica opciones
	 */
	private JLabel img, e1, e2;
	/**
	 * Atributo tipo JButton para el boton volver, eliminar y reiniciar los datos
	 */
	private JButton volverBase, refrescar, baja;
	/**
	 * Atributo tipo String que es una lista con las opciones para ordenar
	 */
	private String[] listaOrdenar = { "Nombre", "Alias", "Numero de likes", "Edad" };
	/**
	 * Atributo tipo String que es una lista con las opciones del filtro
	 */
	private String[] listaFiltrar = { "Top 10 likes", "Ingresos >= 244.85 USD ", "Genero" };
	/**
	 * Atributo tipo JRadioButton para organizar los datos de dos formas
	 */
	private JRadioButton ascendente, descendente;
	/**
	 * Atributo tipo JComboBox para ordenar y filtrar
	 */
	private JComboBox ordenar, filtrar;
	/**
	 * Atributo tipo JPanel para colocar la tabla
	 */
	private JPanel panelTabla;
	/**
	 * Atributo tipo JTable para organizar los datos por medio de una tabla
	 */
	private JTable tabla;
	/**
	 * Atributo tipo String que es una lista con las opciones de las columnas de la
	 * tabla
	 */
	private String columnas[] = { "Id", "Nombre", "Apellido1", "Apellido2", "Sexo", "Usuario", "Contraseña", "Correo",
			"Nacimiento", "Edad", "Ingresos", "Divorcios", "LikesRecibidos", "LikesOtorgados", "Matches", "Estado" };
	/**
	 * Atributo tipo DefaultTableModel para dejar la lista predeterminada
	 */
	private DefaultTableModel t_lista = null;
	/**
	 * Atributo tipo JScrollPane para visualizar mejor los datos
	 */
	private JScrollPane desplazamiento = null;

	/**
	 * Metodo constructor
	 */
	public PanelBase() {

		setSize(1000, 650);
		setLayout(null);
//		setBackground(new Color(108, 246, 248, 0));
		setBackground(Color.black);
		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		volverBase = new JButton("");
		volverBase.setBounds(760, 580, 200, 50);
		volverBase.setContentAreaFilled(false);
		volverBase.setBorderPainted(false);
		volverBase.setBackground(new Color(108, 246, 248, 0));
		volverBase.setActionCommand("volverBase");
		volverBase.setVisible(false);
		ImageIcon btn1 = new ImageIcon("Media/Volver.png");
		Icon icono1 = new ImageIcon(btn1.getImage().getScaledInstance(btn1.getIconWidth(), btn1.getIconHeight(),
				Image.SCALE_AREA_AVERAGING));
		volverBase.setIcon(icono1);
		add(volverBase);

		ordenar = new JComboBox<String>(listaOrdenar);
		ordenar.setBounds(210, 20, 150, 35);
		ordenar.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(ordenar);

		filtrar = new JComboBox<String>(listaFiltrar);
		filtrar.setBounds(660, 20, 200, 35);
		filtrar.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(filtrar);

		ascendente = new JRadioButton("Ascendente");
		ascendente.setBounds(80, 530, 180, 50);
		ascendente.setFont(new Font("Monospaced", Font.BOLD, 20));
		ascendente.setForeground(Color.white);
		ascendente.setBackground(Color.black);
		add(ascendente);
//		ascendente.setBackground(new Color(116, 131, 171));

		descendente = new JRadioButton("Descendente");
		descendente.setBounds(80, 580, 200, 50);
		descendente.setFont(new Font("Monospaced", Font.BOLD, 20));
		descendente.setForeground(Color.white);
		descendente.setBackground(Color.black);
		add(descendente);
//		descendente.setBackground(new Color(116, 131, 171));

		ButtonGroup btns = new ButtonGroup();
		btns.add(ascendente);
		btns.add(descendente);

		refrescar = new JButton("Reiniciar datos");
		refrescar.setBounds(550, 580, 200, 35);
		refrescar.setBackground(Color.LIGHT_GRAY);
		refrescar.setFont(new Font("Monospaced", Font.BOLD, 15));
		refrescar.setActionCommand("refrescar");
		add(refrescar);

		baja = new JButton("Dar de baja");
		baja.setBounds(300, 580, 180, 35);
		baja.setBackground(Color.LIGHT_GRAY);
		baja.setFont(new Font("Monospaced", Font.BOLD, 15));
		baja.setActionCommand("baja");
		add(baja);

		e1 = new JLabel("Ordenar por:");
		e1.setBounds(50, 20, 150, 30);
		e1.setFont(new Font("Monospaced", Font.BOLD, 15));
		e1.setForeground(Color.white);
		add(e1);

		e2 = new JLabel("Filtrar por:");
		e2.setBounds(500, 20, 150, 30);
		e2.setFont(new Font("Monospaced", Font.BOLD, 15));
		e2.setForeground(Color.white);
		add(e2);

		panelTabla = new JPanel();
		panelTabla.setBounds(50, 70, 900, 800);
		panelTabla.setOpaque(false);
		panelTabla.setLayout(new BorderLayout());
//		panelTabla.setVisible(false);

		tabla = new JTable();
		t_lista = new DefaultTableModel();
		desplazamiento = new JScrollPane(tabla);

		t_lista.setColumnIdentifiers(columnas);

		desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		// Propiedades de la tabla

		tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tabla.setFillsViewportHeight(true);

		tabla.setModel(t_lista);

		panelTabla.add(desplazamiento, BorderLayout.NORTH);

		add(panelTabla);

		img = new JLabel("", JLabel.CENTER);
		img.setIcon(new ImageIcon("Media/vi.gif"));
		add(img);
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
	 * @return the volverBase
	 */
	public JButton getVolverBase() {
		return volverBase;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param volverBase the volverBase to set
	 */
	public void setVolverBase(JButton volverBase) {
		this.volverBase = volverBase;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the refrescar
	 */
	public JButton getRefrescar() {
		return refrescar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param refrescar the refrescar to set
	 */
	public void setRefrescar(JButton refrescar) {
		this.refrescar = refrescar;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the baja
	 */
	public JButton getBaja() {
		return baja;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param baja the baja to set
	 */
	public void setBaja(JButton baja) {
		this.baja = baja;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the listaOrdenar
	 */
	public String[] getListaOrdenar() {
		return listaOrdenar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param listaOrdenar the listaOrdenar to set
	 */
	public void setListaOrdenar(String[] listaOrdenar) {
		this.listaOrdenar = listaOrdenar;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the listaFiltrar
	 */
	public String[] getListaFiltrar() {
		return listaFiltrar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param listaFiltrar the listaFiltrar to set
	 */
	public void setListaFiltrar(String[] listaFiltrar) {
		this.listaFiltrar = listaFiltrar;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the ascendente
	 */
	public JRadioButton getAscendente() {
		return ascendente;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param ascendente the ascendente to set
	 */
	public void setAscendente(JRadioButton ascendente) {
		this.ascendente = ascendente;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the descendente
	 */
	public JRadioButton getDescendente() {
		return descendente;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param descendente the descendente to set
	 */
	public void setDescendente(JRadioButton descendente) {
		this.descendente = descendente;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the ordenar
	 */
	public JComboBox getOrdenar() {
		return ordenar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param ordenar the ordenar to set
	 */
	public void setOrdenar(JComboBox ordenar) {
		this.ordenar = ordenar;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the filtrar
	 */
	public JComboBox getFiltrar() {
		return filtrar;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param filtrar the filtrar to set
	 */
	public void setFiltrar(JComboBox filtrar) {
		this.filtrar = filtrar;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the panelTabla
	 */
	public JPanel getPanelTabla() {
		return panelTabla;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param panelTabla the panelTabla to set
	 */
	public void setPanelTabla(JPanel panelTabla) {
		this.panelTabla = panelTabla;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tabla
	 */
	public JTable getTabla() {
		return tabla;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tabla the tabla to set
	 */
	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the columnas
	 */
	public String[] getColumnas() {
		return columnas;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param columnas the columnas to set
	 */
	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the t_lista
	 */
	public DefaultTableModel getT_lista() {
		return t_lista;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param t_lista the t_lista to set
	 */
	public void setT_lista(DefaultTableModel t_lista) {
		this.t_lista = t_lista;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the desplazamiento
	 */
	public JScrollPane getDesplazamiento() {
		return desplazamiento;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param desplazamiento the desplazamiento to set
	 */
	public void setDesplazamiento(JScrollPane desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

}
