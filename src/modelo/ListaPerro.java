package modelo;

import java.util.Collections;
import java.util.LinkedList;


import modelo.PerroCompararEdad;
import modelo.PerroCompararId;
import modelo.Perro;

public class ListaPerro {

private LinkedList<Perro> listP;

private PerroCompararEdad compararEdad;
private PerroCompararId compararId;
	
	public ListaPerro() {
		listP = new LinkedList<Perro>();
		compararEdad = new PerroCompararEdad();
		compararId = new PerroCompararId();
		
	}

	public void agregarElemento(int id,String nombre,int edad,String raza , int identificacion, String nombrePropietario, String apellido,int telefono,String direccion) {
		listP.add(new Perro(id,nombre,edad,raza, identificacion,  nombrePropietario,  apellido, telefono, direccion));
	}
	//public void addPer (Perro perro){
	//	listP.add(perro);
	//}
	public void compararPorEdad() {
		Collections.sort(listP, compararEdad);
	}
	public void compararPorId() {
		
		Collections.sort(listP, compararId);
	}
	public void compararPorNombre() {
		Collections.sort(listP);
	}
	public void compararPorRaza() {
		Collections.sort(listP);
	}
	
	
	public LinkedList<Perro> getListP() {
		return listP;
	}




	public void setListP(LinkedList<Perro> listP) {
		this.listP = listP;
	}
	



}
