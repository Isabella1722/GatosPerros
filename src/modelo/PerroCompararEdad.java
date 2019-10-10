package modelo;

import java.util.Comparator;



public class PerroCompararEdad implements Comparator<Perro> {

	
	public int compare(Perro o1, Perro o2) {
		// TODO Auto-generated method stub
		return o1.getEdad() - o2.getEdad();
	}

}
