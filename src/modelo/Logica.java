package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.ListaPerro;
import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] textoPerroUno, textoPerroDos, textoGatoUno, textoGatoDos;
	private ListaPerro listaPerro;
	private ListaGato listaGato;
	private ListaPropietario listaPropietarios;

	public Logica(PApplet app) {
		this.app = app;
		textoPerroUno = app.loadStrings("../data/importados/perrosUno.txt");
		textoPerroDos = app.loadStrings("../data/importados/perrosDos.txt");
		textoGatoUno = app.loadStrings("../data/importados/gatosUno.txt");
		textoGatoDos = app.loadStrings("../data/importados/gatosDos.txt");
		listaPerro = new ListaPerro();
		listaGato= new ListaGato();
		listaPropietarios= new ListaPropietario();

		loadStrings();
	}

	private void loadStrings() {
		// Se carga primer TXT PERRO
		for (String texto : textoPerroUno) {
			// Se parte cada linea por comas
			String[] info = texto.split(",");
			// ----------------
			int id = Integer.parseInt(info[0]);
			String nombre = info[1];
			int edad = Integer.parseInt(info[2]);
			String raza = info[3];
			// --------------------
			listaPerro.agregarElemento(id, nombre, edad, raza, 0, "", "", 0, "");
			//System.out.println();
		}
		//-----------------------
				// Se carga segundo TXT DUE�O PERRO
				for (int i = 0; i < listaPerro.getListP().size(); i++) {
					for (int j = 0; j < textoPerroDos.length; j++) {
						String [] info = textoPerroDos[j].split(",");
						//----------------
						int id = Integer.parseInt(info[0]);
						float identificacion = Float.parseFloat(info[1]);
						String nombrePropietario = info[2];
						String apellido = info[3];
						int telefono = Integer.parseInt(info[4]);
						String direccion = info[5];
						
						
						
						
			
							
							if(listaPerro.getListP().get(i).getId() == id) {
								listaPerro.getListP().get(i).setIdentificacion(identificacion);
								listaPerro.getListP().get(i).setNombrePropietario(nombrePropietario);
								listaPerro.getListP().get(i).setApellido(apellido);
								listaPerro.getListP().get(i).setTelefono(telefono);
								listaPerro.getListP().get(i).setDireccion(direccion);
							}
					
						
					
					}
				}
				
				
	// ****************************Se carga primer TXT GATO
				for (String texto : textoGatoUno) {
					// Se parte cada linea por comas
					String[] info = texto.split(",");
					// ----------------
					int id = Integer.parseInt(info[0]);
					String nombre = info[1];
					String raza = info[2];
					// --------------------
					listaGato.agregarElementoG(id, nombre, raza, 0, "", "", 0, "");;
					//System.out.println();
				}
				//-----------------------
						// Se carga segundo TXT DUE�O GATO
						for (int i = 0; i < listaGato.getListG().size(); i++) {
							for (int j = 0; j < textoGatoDos.length; j++) {
								String [] info = textoGatoDos[j].split(",");
								//----------------
								int id = Integer.parseInt(info[0]);
								float identificacion = Float.parseFloat(info[1]);
								String nombrePropietarioG = info[2];
								String apellido = info[3];
								int telefono = Integer.parseInt(info[4]);
								String direccion = info[5];
								
								
								
								
					
									
									if(listaGato.getListG().get(i).getId() == id) {
										listaGato.getListG().get(i).setIdentificacion(identificacion);
										listaGato.getListG().get(i).setNombrePropietarioG(nombrePropietarioG);
										listaGato.getListG().get(i).setApellido(apellido);
										listaGato.getListG().get(i).setTelefono(telefono);
										listaGato.getListG().get(i).setDireccion(direccion);
									}
							
								
							
							}
						}
				

	}
	
	public void pintarListaPerros() {
		app.fill(0);
		for (int i = 0; i < listaPerro.getListP().size(); i++) {
			app.text(listaPerro.getListP().get(i).getId(), 50, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getNombre(), 150, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getEdad(), 250, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getRaza(), 350, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getIdentificacion(), 450, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getNombrePropietario(), 600, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getApellido(), 750, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getTelefono(), 850, 50 + (i * 50));
			app.text(listaPerro.getListP().get(i).getDireccion(), 950, 50 + (i * 50));
			
		}
	}
	public void pintarListaGatos() {
		app.fill(0);
		for (int i = 0; i < listaGato.getListG().size(); i++) {
			app.text(listaGato.getListG().get(i).getId(), 50, 50 + (i * 50));
			app.text(listaGato.getListG().get(i).getNombre(), 150, 50 + (i * 50));
			app.text(listaGato.getListG().get(i).getRaza(), 250, 50 + (i * 50));
			app.text(listaGato.getListG().get(i).getIdentificacion(), 350, 50 + (i * 50));
			app.text(listaGato.getListG().get(i).getNombrePropietarioG(), 450, 50 + (i * 50));
			app.text(listaGato.getListG().get(i).getApellido(), 600, 50 + (i * 50));
			app.text(listaGato.getListG().get(i).getTelefono(), 750, 50 + (i * 50));
			app.text(listaGato.getListG().get(i).getDireccion(), 850, 50 + (i * 50));
			
		}
	}

}
