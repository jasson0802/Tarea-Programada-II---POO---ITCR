package constantesTipos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import org.xml.sax.SAXException;

public final class ConstantesTipos {

	/*como es una clase dedicada a valores constantes y listas necesarias en diferentes partes del programa
	los atributos se manejan como públicos para facilidad de acceso*/
	
	public final int puntajePNG = 50, creadoEsteAnio = 20;
	public final int[] puntajesEmpresariales = {10,20,5}; //Tomada en Centroamérica, Resto del mundo, Código QR
	public final int[] puntajesSociales = {100, 50, 250}; //Relacionado padre|madre, relacionado hermano/a, privada
	public final int[] puntajesPeriodismo = {100, 150, 125}; //Tiene sonido, es acto terrorista, ambito mundial
		
	public ArrayList<String> centroamerica =  new ArrayList<String>();
	public ArrayList<String> formatosImagen = new ArrayList<String>();
	public ArrayList<String> actividades = new ArrayList<String>();
	public ArrayList<String> relaciones = new ArrayList<String>();
	public ArrayList<String> eventos = new ArrayList<String>();
	public ArrayList<String> ambitos = new ArrayList<String>();
	public ArrayList<String> listaPaises = new ArrayList<String>();
	
	public ConstantesTipos()  {

		try {
			listaPaises = leerXML("countries.xml");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ambitos.add("Mundial");
		ambitos.add("Nacional");
		ambitos.add("Local");
		
		centroamerica.add("Panama");
		centroamerica.add("Costa Rica");
		centroamerica.add("El Salvador");
		centroamerica.add("Guatemala");
		centroamerica.add("Honduras");
		centroamerica.add("Nicaragua");
		centroamerica.add("Belize");
		
		formatosImagen.add("png");
		formatosImagen.add("jpg");
		formatosImagen.add("bmp");
		formatosImagen.add("gif");
		
		actividades.add("Cumpleaños");
		actividades.add("Paseo");
		actividades.add("Boda");
		actividades.add("Primera Comunión");
		actividades.add("Graduación");
		actividades.add("Despedida");
		actividades.add("Bienvenida");
		actividades.add("BabyShower");
	
		eventos.add("Accidente");
		eventos.add("Manifestación");
		eventos.add("Sismo");
		eventos.add("Fuego");
		eventos.add("Inundación");
		eventos.add("Ataque Terrorista");
		eventos.add("Erupción Volcánica");
		
		relaciones.add("Amigo/a");
		relaciones.add("Conocido/a");
		relaciones.add("Compañero/a");
		relaciones.add("Madre/Padre");
		relaciones.add("Hermano/a");
		relaciones.add("Primo/a");
		relaciones.add("Tío/a");
	
	}
	
	private ArrayList<String> leerXML(String direccionXML) throws ParserConfigurationException, SAXException, IOException{
		
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		 
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		 
		Document doc = docBuilder.parse (new File(direccionXML));
		
		NodeList listaPersonas = doc.getElementsByTagName("country");

		ArrayList<String> listaElementos = new ArrayList<String>();

		for (int i = 0; i < listaPersonas.getLength() ; i ++) {
			 
			Node persona = listaPersonas.item(i);
			
			listaElementos.add(persona.getTextContent());
			 
		}
		
		return listaElementos;
		
	}
	
}
