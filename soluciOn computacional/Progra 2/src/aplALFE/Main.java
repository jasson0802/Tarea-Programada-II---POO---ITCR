package aplALFE;

import interfaz.MenuPrincipal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.itextpdf.text.DocumentException;

import alfe.*;
import constantesTipos.*;
import fotografia.*;
import persona.*;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws IOException, DocumentException, ParserConfigurationException, SAXException {
		
		/*ALFE.gestorFotos.agregarFotografia("a", "Costa Rica", "a", "1", "1", "13", 100, 100, "png", 1000, "a", "a", "a", "a");
		ALFE.gestorFotos.agregarFotografia("b", "Japón", "b", "1", "1", "13", 100, 100, "png", 1000, "a", "a", "a", "a");
		ALFE.gestorFotos.agregarFotografia("c", "Panamá", "c", "1", "1", "13", 100, 100, "png", 1000, "a", "a", "a", "");
		ALFE.gestorFotos.agregarFotografia("d", "Japón", "d", "1", "1", "13", 100, 100, "gif", 1000, "a", "a", "a", "a");
		ALFE.gestorFotos.agregarFotografia("e", "Inglaterra", "e", "1", "1", "03", 100, 100, "gif", 1000, "a", "a", "a", "a");
		ALFE.gestorFotos.agregarFotografia("f", "Guatemala", "f", "1", "1", "13", 100, 100, "gif", 1000, "a", "a", "a", "");
		
		System.out.println(GeneradorTop.generarTop(GestorFotografia.fotografias, 3, "FEmp" ));
		
		Persona p1 = new Persona("Fabio", "Sánchez", "dasc", "dasc93@gmail.com", "83347503");
		Persona p0 = new Persona("Daniel", "Sánchez", "dasc", "dasc93@gmail.com", "83347503");

		ALFE.gestorFotos.agregarFotografia("D:\\daniel\\Pictures\\1238696477431_f.jpg","a","a","1","1","13",100,100,"jpg",1000,"1","1","13","a",true,false,"a");
		ALFE.gestorFotos.agregarFotografia("a","a","a","1","1","11",100,100,"gif",1000,"1","1","13","a",true,true,"a");
		ALFE.gestorFotos.agregarFotografia("a","a","a","1","1","13",100,100,"png",1000,"1","1","13","a",true,false,"a");

		Social s1 = (Social) GestorFotografia.fotografias.get("FSoc0");
		
		s1.etiquetarPersona(p1,"Madre/Padre");
		s1.etiquetarPersona(p0,"Hermano/a");
		
		//System.out.println(GeneradorTop.generarTop(GestorFotografia.fotografias, 2, "FSoc"));
		
		ALFE.generadorPDF.createPdf(s1.getId(), s1.toString(), s1.getNombreArchivo());
		*/
		
		MenuPrincipal miMenu = new MenuPrincipal();
		miMenu.setVisible(true);
			
		}
		
	}


