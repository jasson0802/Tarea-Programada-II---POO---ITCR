package fotografia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import persona.Persona;

public final class Social extends Fotografia {

	private Date fechaActividad;
	private String tipoActividad;
	@SuppressWarnings("rawtypes")
	public ArrayList etiquetados;
	private boolean sitioCerrado, actividadPublica;
	private String password;
	private static int cantidadSocial = 0;
	
	@SuppressWarnings("rawtypes")
	public Social(String nombreArchivo, String paisCreacion, String descripcion, String pDia, String pMes, String pAnio, 
			int baseImagen, int altoImagen, String tipoArchivo, double tamanoArchivo, String pDiaAct, String pMesAct, String pAnioAct, 
			String tipoActividad, boolean sitioCerrado, boolean actividadPublica, String password) {
		
		super("FSoc" + cantidadSocial, nombreArchivo, paisCreacion, descripcion, pDia, pMes, pAnio, 
				baseImagen, altoImagen, tipoArchivo, tamanoArchivo);
		setFechaActividad(pDiaAct, pMesAct, pAnioAct);
		this.tipoActividad = tipoActividad;
		etiquetados = new ArrayList();
		this.sitioCerrado = sitioCerrado;
		this.actividadPublica = actividadPublica;
		this.password = password;
		cantidadSocial += 1;
		
	}

	public String getFechaActividad() {
			SimpleDateFormat mascara = new SimpleDateFormat( "dd/MM/yy" );
			return mascara.format( fechaActividad );
	}

	public void setFechaActividad(String dia, String mes, String anio) {
		SimpleDateFormat mascara = new SimpleDateFormat( "dd/MM/yy" );
		try {
			this.fechaActividad = mascara.parse(dia + "/" + mes + "/" + anio);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public String getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	
	@SuppressWarnings("unchecked")
	public void etiquetarPersona(Persona pRelacionado, String relacion){
		
		etiquetados.add(pRelacionado);
		etiquetados.add(relacion);
		
	}
	
	public void eliminarPersonaEtiquetada(String nombre, String apellido, String relacion){
		
		Persona etiquetado;
		
		for (int x = 0; x < etiquetados.size(); x+=2){
			
			etiquetado = (Persona) etiquetados.get(x);
			
			if (etiquetado.getNombre() == nombre && etiquetado.getApellido() == apellido && etiquetados.get(x+1) == relacion){
				
				etiquetados.remove(x+1);
				etiquetados.remove(x);
				break;
				
			}
			
		}
		
	}
	
	public String getPersonasEtiquetadas(){
		
		String personasEtiquetadas = "\n\nPersonas etiquetadas en la fotografía: ";
		Persona etiquetado;
		
		for (int x = 0; x < etiquetados.size(); x++){
			
			etiquetado = (Persona) etiquetados.get(x);
			x++;
			personasEtiquetadas += etiquetado.toString() + "\nRelación: " + etiquetados.get(x); 
			
		}
		
		return personasEtiquetadas;		
		
	}

	public boolean isSitioCerrado() {
		return sitioCerrado;
	}

	public void setSitioCerrado(boolean sitioCerrado) {
		this.sitioCerrado = sitioCerrado;
	}

	public boolean isActividadPublica() {
		return actividadPublica;
	}

	public void setActividadPublica(boolean actividadPublica) {
		this.actividadPublica = actividadPublica;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static int getCantidadSocial() {
		return cantidadSocial;
	}
	
	public String toString(){
						
		return super.toString() + "\nFecha de la actividad: " + getFechaActividad() + "\nTipo de actividad: " + getTipoActividad() + 
				getPersonasEtiquetadas() + "\n\nOcurrio " + (sitioCerrado ? "en un sitio cerrado" : "al aire libre") +
				"\nEs una actividad " + (actividadPublica ? "pública" : "privada");
		
	}
	
}
