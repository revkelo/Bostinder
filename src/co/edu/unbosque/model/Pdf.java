/**
 * Paquete que pertenece al modelo el cual se encarga de la representacion de objetos 
 */
package co.edu.unbosque.model;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;

/**
 * Clase Pdf del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolns
 */

public class Pdf {

	/**
	 * String de nombre
	 */
	String nombre;
	/**
	 * String de fecha
	 */
	String fecha;
	/**
	 * PersonaDAOImpl representado como a
	 */
	PersonaDAOImpl a;
	/**
	 * Document representado como documento
	 */
	Document documento;
	/**
	 * FileOutputStream representado como archivo
	 */
	FileOutputStream archivo;
	/**
	 * Paragraph representado como titulo
	 */
	Paragraph titulo;

	/**
	 * Metodo Constructor
	 */
	public Pdf() {
		a = new PersonaDAOImpl();
		documento = new Document();
		titulo = new Paragraph("PDF TINDER");
	}

	/**
	 * @throws IOException excepcion
	 * @throws MalformedURLException excepcion
	 * 
	 */
	public void crearPlantilla() throws MalformedURLException, IOException {
		try {

			JFileChooser guardado = new JFileChooser();
			guardado.setApproveButtonText("guardar");
			guardado.showSaveDialog(null);

			Calendar c = new GregorianCalendar();

			int dia, mes, ano, hora, minuto;

			dia = c.get(Calendar.DATE);
			mes = 1 + c.get(Calendar.MONTH);
			ano = c.get(Calendar.YEAR);
			hora = c.get(Calendar.HOUR_OF_DAY);
			minuto = c.get(Calendar.MINUTE);

			archivo = new FileOutputStream(guardado.getSelectedFile() + "-" + dia + "-" + mes + "-" + ano + "---" + hora
					+ "-" + minuto + ".pdf");
			PdfWriter.getInstance(documento, archivo);
			documento.open();
			titulo.setAlignment(1);

			documento.add(titulo);

			Paragraph texto = new Paragraph("Media:");
			texto.setAlignment(Element.ALIGN_JUSTIFIED);

			Paragraph texto1 = new Paragraph("La Moda:");
			texto1.setAlignment(Element.ALIGN_JUSTIFIED);

			Paragraph conclusion = new Paragraph("La moda de las edades de los usuarios es: " + a.moda());
			conclusion.setAlignment(Element.ALIGN_JUSTIFIED);

			Paragraph conclusion2 = new Paragraph("La media de los ingresos de los usuarios es: " + a.promedio());
			conclusion.setAlignment(Element.ALIGN_JUSTIFIED);

			Paragraph conclusion3 = new Paragraph(
					"La mediana de los likes recibidos de los usuarios es: " + a.mediana());
			conclusion.setAlignment(Element.ALIGN_JUSTIFIED);

			Paragraph texto2 = new Paragraph("Mediana:");
			texto2.setAlignment(Element.ALIGN_JUSTIFIED);

			Image imagen = Image.getInstance("PNGTimeSeriesChartDemo1.png");
			imagen.scaleAbsoluteHeight(250);
			imagen.scaleAbsoluteWidth(550);

			Image imagen2 = Image.getInstance("PNGTimeSeriesChartDemo2.png");
			imagen2.scaleAbsoluteHeight(250);
			imagen2.scaleAbsoluteWidth(550);

			Image imagen3 = Image.getInstance("PNGTimeSeriesChartDemo3.png");
			imagen3.scaleAbsoluteHeight(550);
			imagen3.scaleAbsoluteWidth(550);

			documento.add(texto1);
			documento.add(Chunk.NEWLINE);
			documento.add(conclusion);
			documento.add(Chunk.NEWLINE);
			documento.add(imagen);
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			;
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			documento.add(texto);
			documento.add(Chunk.NEWLINE);
			documento.add(conclusion2);
			documento.add(Chunk.NEWLINE);
			documento.add(imagen2);
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			documento.add(texto2);
			documento.add(Chunk.NEWLINE);
			documento.add(conclusion3);
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			documento.add(imagen3);
			documento.addCreationDate();

			documento.add(new Paragraph("Fecha: " + hora + ":" + minuto + " " + dia + "/" + mes + "/" + ano));

			documento.close();

		} catch (FileNotFoundException e) {

		} catch (DocumentException e) {

		}

	}
}
