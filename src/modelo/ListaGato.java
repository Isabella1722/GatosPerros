package modelo;

import java.util.Collections;
import java.util.LinkedList;
import modelo.GatoCompararId;

public class ListaGato {
	private LinkedList<Gato> listG;
	private GatoCompararId compararId;

	public ListaGato() {
		listG = new LinkedList<Gato>();
		compararId = new GatoCompararId();
	}

	public void agregarElementoG(int id, String nombre, String raza, int identificacion, String nombrePropietarioG,
			String apellido, int telefono, String direccion) {
		listG.add(new Gato(id, nombre, raza, identificacion, nombrePropietarioG, apellido, telefono, direccion));
	}

	public void compararPorIdGato() {

		Collections.sort(listG, compararId);
	}

	public void compararPorNombreGato() {
		Collections.sort(listG);
	}

	public void compararPorRazaGato() {
		Collections.sort(listG);
	}

	public LinkedList<Gato> getListG() {
		return listG;
	}

	public void setListG(LinkedList<Gato> listG) {
		this.listG = listG;
	}
}
