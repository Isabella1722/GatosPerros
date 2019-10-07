package modelo;

import java.util.LinkedList;

public class ListaGato {
private LinkedList<Gato> listG;
	
	public ListaGato() {
		listG = new LinkedList<Gato>();
	}

	public void agregarElementoG(int id,String nombre,String raza , int identificacion, String nombrePropietarioG, String apellido,int telefono,String direccion) {
		listG.add(new Gato(id,nombre,raza, identificacion,  nombrePropietarioG,  apellido, telefono, direccion));
	}

	public LinkedList<Gato> getListG() {
		return listG;
	}

	public void setListG(LinkedList<Gato> listG) {
		this.listG = listG;
	}
}
