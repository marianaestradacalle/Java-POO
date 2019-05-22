package co.com.businesslogic;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.com.beans.Cliente;
import co.com.beans.Empleado;
import co.com.beans.Empresa;
import co.com.beans.Persona;

public class MainClass {
	
	//Creamos el ArrayList
	public static ArrayList<Persona> personas = new ArrayList<Persona>();

	public static void main(String[] args) {
		
		Empresa Babaria = new Empresa(100200300, "Babaria S.A.S", "calle 43# 92-92", "4924577");
		
		
		//Llenamos las clases.
		Empleado David = new Empleado("100", "David", "Perez Estrada", "30159635324", "davidalejandrope@gmail.com", "gerente", "10.000.000");
		Empleado Esteban = new Empleado("200", "Esteban Alexander", "Velasquez Cardeño", "3125506324", "eavc@gmail.com", "Presidente", "25.000.000");
		Empleado Carolina = new Empleado("300", "Carolina", "Arias Quiceno", "3008185329", "carolinaariad@gmail.com", "Jefe de personal", "5.000.000");
		Empleado Julian = new Empleado("400", "Julian Andres", "Jaramillo David", "3254436001", "julianajd@gmail.com", "Supervisor", "3.000.000");
	
		Cliente Mariana = new Cliente("1000644347", "Mariana", "Estrada Calle", "3184437001", "estradacallemariana@gmail.com","03/08/2000");
		Cliente Dayhana = new Cliente("4455903", "Dayhana Durley", "Arroyave Calle", "3015363747", "dayhdurley@hotmail.com","30/11/1983");
		Cliente Elena = new Cliente("43072051", "Luz Elena", "Suarez Calle", "3128808272", "luzleneasuaca@gmail.com","30/05/1964");
		
		
		//Ahora los vamos a agregar a la lista;
		//Empleados
		personas.add(David);
		personas.add(Esteban);
		personas.add(Carolina);
		personas.add(Julian);
		
		//Clientes
		personas.add(Mariana);
		personas.add(Dayhana);
		personas.add(Elena);
		
		//Ahora vamos a ejecutar los metodos en comun de las clases hijas (Metodos de la clase padre)
		JOptionPane.showMessageDialog(null,"Todos las personas trabajan");
		
		//Hacemos un ciclo for para recorrer todo el ArrayList
		for(Persona persona: personas) {
			JOptionPane.showMessageDialog(null,persona.getId()+ " "+persona.getNombre());
			
			persona.descansa();
		}
		
		
		//Metodos de las clases hijas
		JOptionPane.showMessageDialog(null, "Mensaje solo para los trabajadores");
		JOptionPane.showMessageDialog(null, David.getId()+ ", mi nombre es "+ David.getNombre()+ " y soy "+ David.getCargo());
		David.Dirigir();
		David.Atender();
		
		JOptionPane.showMessageDialog(null, "Mensaje solo para los clientes");
		JOptionPane.showMessageDialog(null, Mariana.getId()+ " "+Mariana.getNombre());
		Mariana.comprar();
		Mariana.pagar();
		
		
		JOptionPane.showMessageDialog(null, "Ejemplo con for loop");
		for (int i = 0; i < personas.size(); i++) {
			JOptionPane.showMessageDialog(null, personas.get(i).getNombre());
			
			
		}
		
		JOptionPane.showMessageDialog(null, "Ejemplo con avance for loop");
		
		for (Persona temp : personas) {
			JOptionPane.showMessageDialog(null, temp.getNombre());
		}
		
		
		JOptionPane.showMessageDialog(null, "Ejemplo con iterator loop");
		Iterator<Persona> iterPersonas = personas.iterator();
		while (iterPersonas.hasNext()) {
			JOptionPane.showMessageDialog(null, iterPersonas.next().getId());
			
		}
		
		JOptionPane.showMessageDialog(null, "Ejemplo con Loop");
		int i = 0;
		while (i < personas.size()) {
			JOptionPane.showMessageDialog(null, personas.get(i).getApellidos());
			i++;
			
		}
		
		JOptionPane.showMessageDialog(null, "Ejemplo con Collection stream()");
		personas.forEach((temp) -> {
			JOptionPane.showMessageDialog(null,temp.getCorreo());
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
