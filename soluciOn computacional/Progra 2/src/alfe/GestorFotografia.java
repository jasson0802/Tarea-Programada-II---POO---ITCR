package alfe;

import java.util.Hashtable;

import fotografia.Empresarial;
import fotografia.Fotografia;
import fotografia.Periodismo;
import fotografia.Social;

public final class GestorFotografia {

	public static Hashtable<String,Fotografia> fotografias = new Hashtable<String,Fotografia>();
	
	//agregar fotografia social: retorna el ID de la fotografia agregada para luego mostrarla al usuario
	public String agregarFotografia(String nombreArchivo, String paisCreacion, String descripcion, 
									String pDia, String pMes, String pAnio,	int baseImagen, int altoImagen,
									String tipoArchivo, double tamanoArchivo, 
									String pDiaAct, String pMesAct, String pAnioAct,
									String tipoActividad, boolean sitioCerrado, boolean actividadPublica, String password){
		
		Fotografia nuevaFoto;
		
		nuevaFoto = new Social(nombreArchivo, paisCreacion, descripcion, pDia, pMes, pAnio, baseImagen, altoImagen, 
				tipoArchivo, tamanoArchivo, pDiaAct, pMesAct, pAnioAct, tipoActividad, sitioCerrado, 
				actividadPublica, password);
		
		fotografias.put(nuevaFoto.getId(), nuevaFoto);
		
		return nuevaFoto.getId();
		
	}
	
	//agregar fotografia empresarial: retorna ID de foto agregada
	public String agregarFotografia(String nombreArchivo, String paisCreacion, String descripcion, 
			String pDia, String pMes, String pAnio,	int baseImagen, int altoImagen,
			String tipoArchivo, double tamanoArchivo, String nombreCompania, 
			String cuentaFacebook, String cuentaTwitter, String codigoQR){

		Fotografia nuevaFoto;

		nuevaFoto = new Empresarial(nombreArchivo, paisCreacion, descripcion, pDia, pMes, pAnio, baseImagen, altoImagen, 
				tipoArchivo, tamanoArchivo, nombreCompania, cuentaFacebook, cuentaTwitter, codigoQR);

		fotografias.put(nuevaFoto.getId(), nuevaFoto);

		return nuevaFoto.getId();

}
	
	//agragar fotografia periodismo: retorna ID de foto agregada
	public String agregarFotografia(String nombreArchivo, String paisCreacion, String descripcion, 
			String pDia, String pMes, String pAnio,	int baseImagen, int altoImagen,
			String tipoArchivo, double tamanoArchivo, String tipoEvento, String hora, 
			String ambitoEvento, String sonidoEvento, String longitud, String latitud){

		Fotografia nuevaFoto;

		nuevaFoto = new Periodismo(nombreArchivo, paisCreacion, descripcion, pDia, pMes, pAnio, baseImagen, altoImagen, 
				tipoArchivo, tamanoArchivo, tipoEvento, hora, ambitoEvento, sonidoEvento, longitud, latitud);

		fotografias.put(nuevaFoto.getId(), nuevaFoto);

		return nuevaFoto.getId();

}
	
	//IMPORTANTE: para los metodos de modificar, en caso de que un atributo no se desee cambiar se debe pasar el valor que posee de todos modos
	
	//modificar fotografia social, si se cambia de fotografia se deben obtener de nuevo el tamaño, tipo y dimensiones
	//se debe llamar a este metodo luego de asegurar que el id es de una foto social
	public void modificarFotografia(String id, String nombreArchivo, String paisCreacion, String descripcion, 
			String pDia, String pMes, String pAnio,	int baseImagen, int altoImagen,
			String tipoArchivo, double tamanoArchivo, 
			String pDiaAct, String pMesAct, String pAnioAct,
			String tipoActividad, boolean sitioCerrado, boolean actividadPublica, String password){

		Social fotoModificar = (Social) fotografias.get(id);
		fotografias.remove(id);
		
		fotoModificar.setNombreArchivo(nombreArchivo);
		fotoModificar.setFechaCreacion(pDia, pMes, pAnio);
		fotoModificar.setDescripcion(descripcion);
		fotoModificar.setTipoArchivo(tipoArchivo);
		fotoModificar.setTamanoArchivo(tamanoArchivo);
		fotoModificar.setFechaActividad(pDiaAct, pMesAct, pAnioAct);
		fotoModificar.setTipoActividad(tipoActividad);
		fotoModificar.setSitioCerrado(sitioCerrado);
		fotoModificar.setActividadPublica(actividadPublica);
		fotoModificar.setPassword(password);
		
		fotografias.put(id, fotoModificar);

	}

	//modificar fotografia empresarial, si se cambia de fotografia se deben obtener de nuevo el tamaño, tipo y dimensiones
	//se debe llamar a este metodo luego de asegurar que el id es de una foto empresarial
	public void modificarFotografia(String id, String nombreArchivo, String paisCreacion, String descripcion, 
			String pDia, String pMes, String pAnio,	int baseImagen, int altoImagen,
			String tipoArchivo, double tamanoArchivo, String nombreCompania, 
			String cuentaFacebook, String cuentaTwitter, String codigoQR){

		Empresarial fotoModificar = (Empresarial) fotografias.get(id);
		fotografias.remove(id);
			
		fotoModificar.setNombreArchivo(nombreArchivo);
		fotoModificar.setFechaCreacion(pDia, pMes, pAnio);
		fotoModificar.setDescripcion(descripcion);
		fotoModificar.setTipoArchivo(tipoArchivo);
		fotoModificar.setTamanoArchivo(tamanoArchivo);
		fotoModificar.setNombreCompania(nombreCompania);
		fotoModificar.setCuentaFacebook(cuentaFacebook);
		fotoModificar.setCuentaTwitter(cuentaTwitter);
		fotoModificar.setCodigoQR(codigoQR);
			
		fotografias.put(id, fotoModificar);

	}
	
	//modificar fotografia periodismo, si se cambia de fotografia se deben obtener de nuevo el tamaño, tipo y dimensiones
	//se debe llamar a este metodo luego de asegurar que el id es de una foto periodismo
	public void modificarFotografia(String id, String nombreArchivo, String paisCreacion, String descripcion, 
			String pDia, String pMes, String pAnio,	int baseImagen, int altoImagen,
			String tipoArchivo, double tamanoArchivo, String tipoEvento, String hora, 
			String ambitoEvento, String sonidoEvento, String longitud, String latitud){

		Periodismo fotoModificar = (Periodismo) fotografias.get(id);
		fotografias.remove(id);
			
		fotoModificar.setNombreArchivo(nombreArchivo);
		fotoModificar.setFechaCreacion(pDia, pMes, pAnio);
		fotoModificar.setDescripcion(descripcion);
		fotoModificar.setTipoArchivo(tipoArchivo);
		fotoModificar.setTamanoArchivo(tamanoArchivo);
		fotoModificar.setTipoEvento(tipoEvento);
		fotoModificar.setHora(hora);
		fotoModificar.setAmbitoEvento(ambitoEvento);
		fotoModificar.setSonidoEvento(sonidoEvento);
		fotoModificar.setLatitud(latitud);
		fotoModificar.setLongitud(longitud);
			
		fotografias.put(id, fotoModificar);

	}	

	
}
