package modelo;

import java.util.LinkedList;

public class ListaPropietario {

private LinkedList<PropietarioPerro> listPropietario;

public ListaPropietario() {
	listPropietario = new LinkedList<PropietarioPerro>();
	}
	//public void agregarElemento(int id,int identificacion, String nombrePropietario, String apellido,int telefono,String direccion) {
	//	listPropietario.add(new PropietarioPerro(id,identificacion,nombrePropietario,apellido, telefono, direccion));
	//}
	
	public LinkedList<PropietarioPerro> getListPropietario() {
	return listPropietario;
}
public void setListPropietario(LinkedList<PropietarioPerro> listPropietario) {
	this.listPropietario = listPropietario;
}
	
	
}
