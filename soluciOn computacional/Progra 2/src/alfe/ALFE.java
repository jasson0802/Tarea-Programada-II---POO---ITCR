package alfe;

import java.util.ArrayList;

import persona.Persona;

public final class ALFE {
	
	public static GestorFotografia gestorFotos = new GestorFotografia();
	public static GeneradorTop generadorTop = new GeneradorTop();
	public static GeneradorPDF generadorPDF = new GeneradorPDF();
	public static ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public static void agregarPersona(String nombre, String apellido, String alias, String direccionCorreo, String numeroTel){
		
		Persona nuevaPersona = new Persona (nombre, apellido, alias, direccionCorreo, numeroTel);
		personas.add(nuevaPersona);
		
	}
	
}
