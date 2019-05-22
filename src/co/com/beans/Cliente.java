package co.com.beans;

import javax.swing.JOptionPane;

//Usamos la palabra reservada extends para decirle a la clase hija quien es la case padre
public class Cliente extends Persona {
	
	private String FechaN;
	
	public Cliente() {
		//Con la palabra reservada super estamos llamando el constructor de la clase padre
		super();
	}
	
	//Llamamos los datos dentro de super
	public Cliente(String id, String nombre, String apellidos, String telefono, String correo, String FechaN) {
		super(id, nombre, apellidos, telefono, correo);
		this.FechaN = FechaN;
	}
	
	//Metodos
	public void comprar() {
		JOptionPane.showMessageDialog(null, "Compro los productos de la mejor empresa");
	}
	
	public void pagar() {
		JOptionPane.showMessageDialog(null, "Pago por atención de la mejor calidad");
	}

	public String getFechaN() {
		return FechaN;
	}

	public void setFechaN(String fechaN) {
		FechaN = fechaN;
	}
	
	
}
