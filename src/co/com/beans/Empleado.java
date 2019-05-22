package co.com.beans;

import javax.swing.JOptionPane;

//Usamos la palabra reservada extends para decirle a la clase hija quien es la case padre
public class Empleado extends Persona {
	
	private String cargo;
	private String salario;
	
	public Empleado() {
		//Con la palabra reservada super estamos llamando el constructor de la clase padre
		super();
	}
	
	//Llamamos los datos dentro de super
	public Empleado(String id, String nombre, String apellidos, String telefono, String correo,String cargo, String salario) {
		super(id, nombre, apellidos, telefono, correo);
		this.cargo = cargo;
		this.salario = salario;
	}
	//Metodos
	public void Dirigir() {
		JOptionPane.showMessageDialog(null, "Nos encargamos de dirigir la empresa de la mejor forma");
	}
	
	public void Atender() {
		JOptionPane.showMessageDialog(null, "Atendemos a nuestros clientes con el mejor de los gustos");
	}
	
	//Metodos Getter
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	//Metodos Setter
	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
