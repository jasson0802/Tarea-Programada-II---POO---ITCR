package alfe;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;

import constantesTipos.*;
import fotografia.*;

public final class GeneradorTop {
	
	static ConstantesTipos constTipos = new ConstantesTipos();
	
	public static ArrayList<Fotografia> generarTop (Hashtable<String,Fotografia> fotografias, int cantidadN, String tipoFotografia){
		
		ArrayList<Fotografia> topN = new ArrayList<Fotografia>();
		
		if (tipoFotografia.equals("FEmp")){
			
			topN = generarTopEmpresarial(fotografias, cantidadN);
			
		}
		
		if (tipoFotografia.equals("FSoc")){
				
			topN = generarTopSocial(fotografias, cantidadN);
				
		}
			
		if (tipoFotografia.equals("FPer")){
			
			topN = generarTopPeriodismo(fotografias, cantidadN);
		}
		
		return topN;
		
	}
	
	private static ArrayList<Fotografia> generarTopPeriodismo(Hashtable<String, Fotografia> fotografias, int cantidadN) {
		
		int cantidadPeriodismo = Periodismo.getCantidadPeriodismo();
		int[] puntajes = new int[cantidadPeriodismo];//el id se genera con FPer+x en cada puntajes[x] y se guarda el puntaje de esta fotografia
		int [] puntajesOrdenados;		
		ArrayList<Fotografia> topPeriodismo = new ArrayList<Fotografia>();
		
		for (int x = 0; x < cantidadPeriodismo; x++){

			puntajes[x] = generarPuntajePeriodismo((Periodismo) fotografias.get("FPer"+x));
			
		}
		
		puntajesOrdenados = ordenarPuntajes(puntajes);
		
		for (int x = 0; x < (cantidadN > cantidadPeriodismo ? cantidadPeriodismo : cantidadN); x++){
			
			topPeriodismo.add(fotografias.get("FPer" + puntajesOrdenados[x]));
			
		}
		
		return topPeriodismo;

	}

	private static int generarPuntajePeriodismo(Periodismo foto) {
		
		int puntaje = 0;
		
		if (!foto.getSonidoEvento().equals("")) { puntaje += constTipos.puntajesPeriodismo[0]; }
		
		if (!foto.getTipoEvento().equals("Ataque Terrorista")) { puntaje += constTipos.puntajesPeriodismo[1]; }
		
		if (!foto.getAmbitoEvento().equals("Mundial")) { puntaje += constTipos.puntajesPeriodismo[2]; }
		
		return puntaje + generarPuntajeFotografia(foto);

	}

	private static ArrayList<Fotografia> generarTopSocial(Hashtable<String, Fotografia> fotografias, int cantidadN) {
		
		int cantidadSocial = Social.getCantidadSocial();
		int[] puntajes = new int[cantidadSocial];//el id se genera con FSoc+x en cada puntajes[x] y se guarda el puntaje de esta fotografia
		int [] puntajesOrdenados;		
		ArrayList<Fotografia> topSocial = new ArrayList<Fotografia>();
		
		for (int x = 0; x < cantidadSocial; x++){

			puntajes[x] = generarPuntajeSocial((Social) fotografias.get("FSoc"+x));
			
		}
		
		puntajesOrdenados = ordenarPuntajes(puntajes);
		
		for (int x = 0; x < (cantidadN > cantidadSocial ? cantidadSocial : cantidadN); x++){
			
			topSocial.add(fotografias.get("FSoc" + puntajesOrdenados[x]));
			
		}
		
		return topSocial;

	}

	private static int generarPuntajeSocial(Social foto) {
		
		int puntaje = 0;
		String personasEtiquetadas = foto.getPersonasEtiquetadas();
		
		while (personasEtiquetadas.contains("Madre/Padre")){ 

			puntaje += constTipos.puntajesSociales[0];
			personasEtiquetadas = personasEtiquetadas.replaceFirst("Madre/Padre", " ");
			
		}
		
		while (personasEtiquetadas.contains("Hermano/a")){ 
			
			puntaje += constTipos.puntajesSociales[1];
			personasEtiquetadas = personasEtiquetadas.replaceFirst("Hermano/a", " ");
			
		}
		
		if (!foto.isActividadPublica()) { puntaje += constTipos.puntajesSociales[2]; }
		
		return puntaje + generarPuntajeFotografia(foto);
		
	}

	private static ArrayList<Fotografia> generarTopEmpresarial(Hashtable<String,Fotografia> fotografias, int cantidadN){
		
		int cantidadEmpresarial = Empresarial.getCantidadEmpresarial();
		int[] puntajes = new int[cantidadEmpresarial];//el id se genera con FEmp+x en cada puntajes[x] y se guarda el puntaje de esta fotografia
		int [] puntajesOrdenados;		
		ArrayList<Fotografia> topEmpresarial = new ArrayList<Fotografia>();
		
		for (int x = 0; x < cantidadEmpresarial; x++){

			puntajes[x] = generarPuntajeEmpresarial((Empresarial) fotografias.get("FEmp"+x));
			
		}
		
		puntajesOrdenados = ordenarPuntajes(puntajes);
		
		for (int x = 0; x < (cantidadN > cantidadEmpresarial ? cantidadEmpresarial : cantidadN); x++){
			
			topEmpresarial.add(fotografias.get("FEmp" + puntajesOrdenados[x]));
			
		}
		
		return topEmpresarial;
		
	}
		
	private static int generarPuntajeEmpresarial(Empresarial foto){
		
		int puntaje = 0;
		
		if (constTipos.centroamerica.contains(foto.getPaisCreacion())) { puntaje += constTipos.puntajesEmpresariales[0]; }
		else puntaje += constTipos.puntajesEmpresariales[1];
		
		if (!foto.getCodigoQR().equals("")) { puntaje += constTipos.puntajesEmpresariales[2]; }
		
		return puntaje + generarPuntajeFotografia(foto);
		
	}
		
	private static int generarPuntajeFotografia (Fotografia foto){
		
		int puntaje = 0;
		Calendar calendario = new GregorianCalendar();		
		calendario = Calendar.getInstance();
		String anioActual = String.valueOf(calendario.get(Calendar.YEAR));
		anioActual = anioActual.substring(anioActual.length()-2);
		
		if (foto.getTipoArchivo().equals("png")) { puntaje += constTipos.puntajePNG; }
		
		if (foto.getFechaCreacion().endsWith(anioActual)) { puntaje += constTipos.creadoEsteAnio; }
		
		return puntaje;
		
	}
		
	private static int[] ordenarPuntajes (int[] puntajes){
		
		int[] ordenados = new int[puntajes.length];
		int puntajeMayor = 0, posicion = 0;

		for (int x = 0; x < ordenados.length; x++){
			
			puntajeMayor = 0; posicion = 0;
			
			for (int y = 0; y < ordenados.length; y++){
				
				if (puntajes[y] > puntajeMayor){
					
					posicion = y;
					puntajeMayor = puntajes[y];
					
				}
				
			}
			
			ordenados[x] = posicion;
			puntajes[posicion] = -1;			
			
		}
		
		return ordenados;
		
	}
	
}
