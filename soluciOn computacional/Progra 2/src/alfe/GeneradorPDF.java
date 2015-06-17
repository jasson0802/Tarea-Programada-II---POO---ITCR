package alfe;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public final class GeneradorPDF {	

	public void createPdf(String iD, String informacionImprimir, String direccionImagen) throws DocumentException, IOException {
		
		Document document = new Document();
		String path = new java.io.File(".").getCanonicalPath();
		Image foto = Image.getInstance(direccionImagen);
		Paragraph p = new Paragraph();
		
		p.add(informacionImprimir);
		foto.scaleToFit(1000, 150);		
		p.add(new Chunk(foto, 0, -175, true));		
		
		PdfWriter.getInstance(document, new FileOutputStream(path + "\\" + iD + ".pdf"));
		
		document.open();
		
		document.add(p);
		
		document.close();
	
	}
	
}
