package co.com.beans;


public class Persona {
	
	protected String id;
	protected String nombre;
	protected String apellidos;
	protected String telefono;
	protected String correo;
	
	public Persona() {
		
	}
	
	public Persona( String id, String nombre, String apellidos, String telefono, String correo) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
	}
	//Métodos
	public void trabajar() {
		
	}
	
	public void descansa() {
		
	}
	
	//Métodos Getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	//Métodos Setters
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	

}
