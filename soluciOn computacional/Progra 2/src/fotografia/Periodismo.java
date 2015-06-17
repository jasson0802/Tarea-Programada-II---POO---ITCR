package fotografia;


public final class Periodismo extends Fotografia {

	private String tipoEvento, hora, ambitoEvento, sonidoEvento, longitud, latitud;
	private static int cantidadPeriodismo = 0;
	
	public Periodismo(String nombreArchivo, String paisCreacion, String descripcion, String pDia, String pMes, String pAnio,
			int baseImagen, int altoImagen, String tipoArchivo, double tamanoArchivo, String tipoEvento, String hora, 
			String ambitoEvento, String sonidoEvento, String longitud, String latitud) {

		super("FPer" + cantidadPeriodismo, nombreArchivo, paisCreacion, descripcion, pDia, pMes, pAnio,
				baseImagen, altoImagen, tipoArchivo, tamanoArchivo);
		this.tipoEvento = tipoEvento;
		this.hora = hora;
		this.ambitoEvento = ambitoEvento;
		this.sonidoEvento = sonidoEvento;
		this.longitud = longitud;
		this.latitud = latitud;
		cantidadPeriodismo += 1;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getAmbitoEvento() {
		return ambitoEvento;
	}

	public void setAmbitoEvento(String ambitoEvento) {
		this.ambitoEvento = ambitoEvento;
	}

	public String getSonidoEvento() {
		return sonidoEvento;
	}

	public void setSonidoEvento(String sonidoEvento) {
		this.sonidoEvento = sonidoEvento;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public static int getCantidadPeriodismo() {
		return cantidadPeriodismo;
	}

	public String toString(){
				
		return super.toString() + "\nTipo de evento: " + getTipoEvento() + "\nHora del evento: " + getHora() + 
				"\n¡mbito del evento: " + getAmbitoEvento() + "\nLongitud del lugar del evento: " + getLongitud() + 
				"\nLatitud del lugar del evento: " + getLatitud();
		
	}
	
}
