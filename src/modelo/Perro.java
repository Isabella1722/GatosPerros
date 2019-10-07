package modelo;


public class Perro {
	private int id,edad;
	private String nombre,raza;
	private int  telefono;
	private float identificacion;
	private String nombrePropietario,apellido, direccion;

	
	public Perro(int id,String nombre,int edad,String raza, float identificacion, String nombrePropietario, String apellido, int telefono, String direccion) {
		this.id=id;
		this.nombre = nombre;
		this.edad=edad;
		this.raza = raza;
	
	}


	public float getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(float identificacion) {
		this.identificacion = identificacion;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getNombrePropietario() {
		return nombrePropietario;
	}


	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
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
}
