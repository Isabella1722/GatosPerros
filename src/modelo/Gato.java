package modelo;

public class Gato implements Comparable <Gato> {

	private int id;
	private String nombre,raza;
	private int  telefono;
	private float identificacion;
	private String nombrePropietarioG,apellido, direccion;

	
	public Gato(int id,String nombre,String raza, float identificacion, String nombrePropietarioG, String apellido, int telefono, String direccion) {
		this.id=id;
		this.nombre = nombre;
		this.raza = raza;
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public float getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(float identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombrePropietarioG() {
		return nombrePropietarioG;
	}


	public void setNombrePropietarioG(String nombrePropietarioG) {
		this.nombrePropietarioG = nombrePropietarioG;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	
	public int compareTo(Gato gat) {
		// TODO Auto-generated method stub
		 return nombre.compareTo(gat.getNombre());
	}
	public int compareToRazaG(Gato gatR) {
		// TODO Auto-generated method stub
		 return raza.compareTo(gatR.getRaza());
	}

}
