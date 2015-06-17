package persona;

public final class Persona {

	private String nombre, apellido, alias, direccionCorreo, numeroTel;

	public Persona(String nombre, String apellido, String alias, String direccionCorreo, String numeroTel) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.alias = alias;
		this.direccionCorreo = direccionCorreo;
		this.numeroTel = numeroTel;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDireccionCorreo() {
		return direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}	
	
	public String toString(){
		
		return "\n\nNombre: " + getNombre() + " " + getApellido() + "\nAlias: " + getAlias() + 
				"\nCorreo electrónico: " + getDireccionCorreo() + "\nNúmero Telefónico: " + getNumeroTel();
		
	}
	
}
