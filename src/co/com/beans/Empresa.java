package co.com.beans;

public class Empresa {
	
	private int nit;
	private String RazonSocial;
	private String direccion;
	private String telefono;
	
	
	public Empresa() {
		
	}
	
	public Empresa(int nit,String RazonSocial, String direccion, String telefono) {
		this.nit = nit;
		this.RazonSocial = RazonSocial;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public int getNit() {
		return this.nit;
	}
	
	public String getRazonSocial() {
		return this.RazonSocial;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	
	public void setNit(int n) {
		this.nit = n;
	}
	
	public void setRazonSocial(String rz) {
		this.RazonSocial = rz;
	}
	
	public void setDireccion(String d) {
		this.direccion = d;
	}
	
	public void setTelefono(String t) {
		this.telefono = t;
	}
}
