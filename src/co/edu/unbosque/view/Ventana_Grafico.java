/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;
import org.jfree.util.Rotation;

import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.model.PersonaDAOImpl;
import co.edu.unbosque.model.PersonaDTO;
import co.edu.unbosque.view.Vista;

//import com.itextpdf.awt.geom.Rectangle;
//import com.itextpdf.awt.geom.Rectangle2D;
//import com.itextpdf.text.pdf.PdfDocument;
//import com.itextpdf.text.pdf.PdfPage;

/**
 * Panel que gestiona las graficas y extiende de JFrame
 * 
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 * 
 */
public class Ventana_Grafico extends JFrame {

	/**
	 * Atributo PersonaDAOImpl renombrado como sdi
	 */
	PersonaDAOImpl sdi;
	/**
	 * Atributo Ordenamiento renombrado como o
	 */
	Ordenamiento o;
	/**
	 * Atributo Vista renombrado como v
	 */
	Vista v;
	/**
	 * Atributo estatico JFreeChart renombrado como chart
	 */
	static JFreeChart chart;
	/**
	 * Atributo estatico JFreeChart renombrado como chart2
	 */
	static JFreeChart chart2;
	/**
	 * Atributo estatico JFreeChart renombrado como chart3
	 */
	static JFreeChart chart3;

	/**
	 * Metodo constructor
	 */
	public Ventana_Grafico() {

		sdi = new PersonaDAOImpl();
		v = new Vista();
		o = new Ordenamiento();
		setSize(1500, 6500);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		graficoC();
		graficoB();
		graficoA();

		ChartPanel c = new ChartPanel(chart3, false);
		c.setBounds(0, 50, 1350, 750);
		add(c);
		setVisible(false);

//		ChartPanel a = new ChartPanel(chart, false);
//		a.setBounds(150, 50, 600, 550);
//		add(a);
//		setVisible(true);
//
//		ChartPanel b = new ChartPanel(chart2, false);
//		b.setBounds(0,0, 600, 550);
//		add(b);
//		setVisible(true);

	}

	/**
	 * Metodo tipo void con grafico
	 */
	public void graficoA() {
		DefaultPieDataset data = new DefaultPieDataset();
		String b = "";

		Collections.sort(sdi.getList());
		for (int i = 0; i < sdi.getConcat().size(); i++) {
			data.setValue(sdi.getConcat2().get(i).toString(), Integer.parseInt(sdi.getConcat().get(i).toString()));

		}

		chart = ChartFactory.createPieChart3D("Grafica moda", data);

		chart.setBackgroundPaint(Color.ORANGE);
		chart.getTitle().setPaint(Color.blue);

		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setLabelBackgroundPaint(Color.ORANGE);

		TextTitle nombre = new TextTitle("Numero de veces que se repite la Edad en la App",
				new Font("Monospaced", Font.PLAIN, 18));
		nombre.setPosition(RectangleEdge.TOP);
		nombre.setHorizontalAlignment(HorizontalAlignment.CENTER);

		chart.addSubtitle(nombre);
		try {
			asd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Metodo tipo void con grafico
	 */
	public void graficoB() {

		DefaultPieDataset data2 = new DefaultPieDataset();
		for (int j = 0; j < sdi.getList().size(); j++) {
			for (int i = j + 1; i < sdi.getList().size(); i++) {
				if (sdi.getList().get(j).getSexo().equals("H") && sdi.getList().get(j).getIngresos() != 0.0) {
					if (i != j && sdi.getList().get(j).getNombre() != sdi.getList().get(i).getNombre()) {
						data2.setValue(sdi.getList().get(j).getApellido2(), sdi.getList().get(j).getIngresos());
						break;
					} else if (i != j && sdi.getList().get(j).getApellido1() != sdi.getList().get(i).getApellido1()
							&& sdi.getList().get(j).getNombre().equals(sdi.getList().get(i).getNombre())) {
						data2.setValue(sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1()
								+ " " + sdi.getList().get(j).getApellido2(), sdi.getList().get(j).getIngresos());
						break;
					} else if (i != j && sdi.getList().get(j).getApellido2() != sdi.getList().get(i).getApellido2()
							&& sdi.getList().get(j).getApellido1().equals(sdi.getList().get(i).getApellido1())
							&& sdi.getList().get(j).getNombre().equals(sdi.getList().get(i).getNombre())) {
						data2.setValue(
								sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1() + " "
										+ sdi.getList().get(j).getApellido2() + " " + sdi.getList().get(j).getUsuario(),
								sdi.getList().get(j).getIngresos());
						break;
					}
				}

			}

		}

		chart2 = ChartFactory.createPieChart3D("Grafica de la Media de ingresos", data2);

		chart2.setBackgroundPaint(Color.ORANGE);
		chart2.getTitle().setPaint(Color.blue);

		PiePlot3D plot2 = (PiePlot3D) chart2.getPlot();
		plot2.setLabelBackgroundPaint(Color.ORANGE);

		TextTitle nombre2 = new TextTitle("Media de ingreso de los Hombres", new Font("Monospaced", Font.PLAIN, 20));
		nombre2.setPosition(RectangleEdge.TOP);
		nombre2.setHorizontalAlignment(HorizontalAlignment.LEFT);

		chart2.addSubtitle(nombre2);
		try {
			asd2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Metodo tipo void con grafico
	 */
	public void graficoC() {

		DefaultPieDataset data2 = new DefaultPieDataset();
		for (int j = 0; j < sdi.getList().size(); j++) {
			for (int i = j + 1; i < sdi.getList().size(); i++) {
				if (sdi.getList().get(j).getSexo().equals("M") && sdi.getList().get(j).getIngresos() == 0.0) {
					if (i != j && sdi.getList().get(j).getNombre() != sdi.getList().get(i).getNombre()) {

						data2.setValue(sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1(),
								sdi.getList().get(j).getNumeroLikesRecibidos());
						break;
					} else if (i != j && sdi.getList().get(j).getApellido1() != sdi.getList().get(i).getApellido1()
							&& sdi.getList().get(j).getNombre().equals(sdi.getList().get(i).getNombre())) {
						data2.setValue(
								sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1() + " "
										+ sdi.getList().get(j).getApellido2(),
								sdi.getList().get(j).getNumeroLikesRecibidos());
						break;
					} else if (i != j && sdi.getList().get(j).getApellido2() != sdi.getList().get(i).getApellido2()
							&& sdi.getList().get(j).getApellido1().equals(sdi.getList().get(i).getApellido1())
							&& sdi.getList().get(j).getNombre().equals(sdi.getList().get(i).getNombre())) {
						data2.setValue(
								sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1() + " "
										+ sdi.getList().get(j).getApellido2() + " " + sdi.getList().get(j).getUsuario(),
								sdi.getList().get(j).getNumeroLikesRecibidos());
						break;
					} else if (i != j && sdi.getList().get(j).getApellido2() != sdi.getList().get(i).getApellido2()
							&& sdi.getList().get(j).getApellido1() != sdi.getList().get(i).getApellido1()
							&& sdi.getList().get(j).getNombre() != (sdi.getList().get(i).getNombre())) {
						data2.setValue(
								sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1() + " "
										+ sdi.getList().get(j).getApellido2(),
								sdi.getList().get(j).getNumeroLikesRecibidos());
						break;
					} else if (i != j && sdi.getList().get(j).getApellido2().equals(sdi.getList().get(i).getApellido2())
							&& sdi.getList().get(j).getApellido1() != (sdi.getList().get(i).getApellido1())
							&& sdi.getList().get(j).getNombre().equals(sdi.getList().get(i).getNombre())) {
						data2.setValue(
								sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1() + " "
										+ sdi.getList().get(j).getApellido2(),
								sdi.getList().get(j).getNumeroLikesRecibidos());
						break;
					} else if (i != j && sdi.getList().get(j).getApellido2().equals(sdi.getList().get(i).getApellido2())
							&& sdi.getList().get(j).getApellido1().equals(sdi.getList().get(i).getApellido1())
							&& sdi.getList().get(j).getNombre() != (sdi.getList().get(i).getNombre())) {
						data2.setValue(
								sdi.getList().get(j).getNombre() + " " + sdi.getList().get(j).getApellido1() + " "
										+ sdi.getList().get(j).getApellido2(),
								sdi.getList().get(j).getNumeroLikesRecibidos());
						break;
					}
				}

			}

		}

		chart3 = ChartFactory.createPieChart3D("Grafica de la mediana", data2);

		chart3.setBackgroundPaint(Color.ORANGE);
		chart3.getTitle().setPaint(Color.blue);

		PiePlot3D plot2 = (PiePlot3D) chart3.getPlot();
		plot2.setLabelBackgroundPaint(Color.ORANGE);

		TextTitle nombre2 = new TextTitle("mediana de likes recibidos de las mujeres",
				new Font("Monospaced", Font.PLAIN, 20));
		nombre2.setPosition(RectangleEdge.TOP);
		nombre2.setHorizontalAlignment(HorizontalAlignment.LEFT);

		chart3.addSubtitle(nombre2);
		try {
			asd3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Metodo estatico asd
	 * 
	 * @throws IOException exception
	 */
	public static void asd() throws IOException {

		BufferedImage image = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();

		g2.setRenderingHint(JFreeChart.KEY_SUPPRESS_SHADOW_GENERATION, true);
		Rectangle r = new Rectangle(0, 0, 500, 500);
		chart.draw(g2, r);
		File f = new File("PNGTimeSeriesChartDemo1.png");

		BufferedImage chartImage = chart.createBufferedImage(1000, 1000, null);
		ImageIO.write(chartImage, "png", f);
	}

	/**
	 * Metodo estatico tipo asd2
	 * 
	 * @throws IOException exception
	 */
	public static void asd2() throws IOException {

		BufferedImage image = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();

		g2.setRenderingHint(JFreeChart.KEY_SUPPRESS_SHADOW_GENERATION, true);
		Rectangle r = new Rectangle(0, 0, 500, 500);
		chart2.draw(g2, r);
		File f = new File("PNGTimeSeriesChartDemo2.png");

		BufferedImage chartImage = chart2.createBufferedImage(1000, 1000, null);
		ImageIO.write(chartImage, "png", f);
	}

	/**
	 * Metodo estatico tipo asd3
	 * 
	 * @throws IOException exception
	 */
	public static void asd3() throws IOException {

		BufferedImage image = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();

		g2.setRenderingHint(JFreeChart.KEY_SUPPRESS_SHADOW_GENERATION, true);
		Rectangle r = new Rectangle(0, 0, 500, 500);
		chart3.draw(g2, r);
		File f = new File("PNGTimeSeriesChartDemo3.png");

		BufferedImage chartImage = chart3.createBufferedImage(1000, 1000, null);
		ImageIO.write(chartImage, "png", f);
	}
}
