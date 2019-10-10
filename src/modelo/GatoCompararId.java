package modelo;

import java.util.Comparator;

public class GatoCompararId implements Comparator<Gato> {

	

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return  g1.getId()-g2.getId();
	}

}
