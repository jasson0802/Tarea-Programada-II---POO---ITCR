package fotografia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Fotografia {
	
	private final String id;
	private String nombreArchivo, paisCreacion, descripcion;
	private Date fechaCreacion;
	public int [] dimensiones = new int [2];
	private String tipoArchivo;
	private double tamanoArchivo;
	

	
	public String dia;
	public String mes;
	public String anio;
		
	public Fotografia(String id, String nombreArchivo, String paisCreacion, String descripcion, String pDia, String pMes, String pAnio, 
			int baseImagen, int altoImagen, String tipoArchivo, double tamanoArchivo) {

		this.id = id;
		this.nombreArchivo = nombreArchivo;
		this.paisCreacion = paisCreacion;
		this.descripcion = descripcion;
		setFechaCreacion(pDia, pMes, pAnio);
		this.dimensiones [0]= baseImagen;
		this.dimensiones [1]= altoImagen;
		this.tipoArchivo = tipoArchivo;
		this.tamanoArchivo = tamanoArchivo;
		dia =pDia;
		mes = pMes;
		anio = pAnio;
		
	}

	public String getId() {
		return id;
	}
	
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	public String getPaisCreacion() {
		return paisCreacion;
	}
	
	public void setPaisCreacion(String paisCreacion) {
		this.paisCreacion = paisCreacion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getFechaCreacion() {
		SimpleDateFormat mascara = new SimpleDateFormat( "dd/MM/yy" );
		return mascara.format( fechaCreacion );
	}
	
	public void setFechaCreacion(String dia, String mes, String anio) {
		SimpleDateFormat mascara = new SimpleDateFormat( "dd/MM/yy" );
		try {
			this.fechaCreacion = mascara.parse(dia + "/" + mes + "/" + anio);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String getDimensiones() {
		return dimensiones[0] + "x" + dimensiones[1];
	}
	
	public void setDimensiones(int baseImagen, int altoImagen) {
		this.dimensiones[0] = baseImagen;
		this.dimensiones[1] = altoImagen;
	}
	
	public String getTipoArchivo() {
		return tipoArchivo;
	}
	
	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}
	
	public double getTamanoArchivo() {
		return tamanoArchivo;
	}
	
	public void setTamanoArchivo(double tamanoArchivo) {
		this.tamanoArchivo = tamanoArchivo;
	}	

	public String toString (){
		
		return "\nID: " + getId() + "\nPaís de Creación: " + getPaisCreacion() + "\nDescripción: " + getDescripcion() + 
				"\nFecha de Creación: " + getFechaCreacion() + "\nDimensiones: " + getDimensiones() + 
				"\nTipo del archivo: " + getTipoArchivo() + "\nTamaño del archivo: " + getTamanoArchivo();
		
	}
	
}
