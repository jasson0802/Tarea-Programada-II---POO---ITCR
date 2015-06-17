package fotografia;

public final class Empresarial extends Fotografia {

	private String nombreCompania, cuentaFacebook, cuentaTwitter, codigoQR;
	private static int cantidadEmpresarial = 0;

	public Empresarial(String nombreArchivo, String paisCreacion, String descripcion, String pDia, String pMes, String pAnio, 
			int baseImagen, int altoImagen, String tipoArchivo, double tamanoArchivo, String nombreCompania, 
			String cuentaFacebook, String cuentaTwitter, String codigoQR) {
		
		super("FEmp" + cantidadEmpresarial, nombreArchivo, paisCreacion, descripcion, pDia, pMes, pAnio, 
				baseImagen, altoImagen, tipoArchivo, tamanoArchivo);
		this.nombreCompania = nombreCompania;
		this.cuentaFacebook = cuentaFacebook;
		this.cuentaTwitter = cuentaTwitter;
		this.codigoQR = codigoQR;
		cantidadEmpresarial += 1;
		
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getCuentaFacebook() {
		return cuentaFacebook;
	}

	public void setCuentaFacebook(String cuentaFacebook) {
		this.cuentaFacebook = cuentaFacebook;
	}

	public String getCuentaTwitter() {
		return cuentaTwitter;
	}

	public void setCuentaTwitter(String cuentaTwitter) {
		this.cuentaTwitter = cuentaTwitter;
	}

	public String getCodigoQR() {
		return codigoQR;
	}

	public void setCodigoQR(String codigoQR) {
		this.codigoQR = codigoQR;
	}

	public static int getCantidadEmpresarial() {
		return cantidadEmpresarial;
	}

	public String toString(){
		
		return super.toString() + "\nNombre de la Compañía: " + getNombreCompania() + "\nCuenta de Facebook: " + getCuentaFacebook() + 
				"\nCuenta Twitter: " + getCuentaTwitter();
		
	}
	
}
