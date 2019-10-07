package modelo;

import java.util.LinkedList;

import modelo.Perro;

public class ListaPerro {

private LinkedList<Perro> listP;
	
	public ListaPerro() {
		listP = new LinkedList<Perro>();
	}

	public void agregarElemento(int id,String nombre,int edad,String raza , int identificacion, String nombrePropietario, String apellido,int telefono,String direccion) {
		listP.add(new Perro(id,nombre,edad,raza, identificacion,  nombrePropietario,  apellido, telefono, direccion));
	}
	
	
	
	
	public LinkedList<Perro> getListP() {
		return listP;
	}




	public void setListP(LinkedList<Perro> listP) {
		this.listP = listP;
	}


}
