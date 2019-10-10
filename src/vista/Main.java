package vista;

import modelo.Logica;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}

	Logica logica;
	int pantalla;

	public void settings() {
		size(1100, 600);
	}

	public void setup() {
		logica = new Logica(this);
		pantalla = 0;
	}

	public void draw() {
		background(255);
		fill(255);

		switch (pantalla) {
		case 0:
			background(255);
			fill(0);
			rect(214, 254, 200, 100);
			textSize(30);
			fill(255);
			textAlign(CENTER);
			text("Lista Perros", 307, 311);
			fill(0);
			rect(634, 254, 200, 100);
			textSize(30);
			fill(255);
			textAlign(CENTER);
			text("Lista Gatos", 725, 311);

			break;

		case 1:
			background(255);
			textSize(12);
			logica.pintarListaPerros();

			textSize(16);
			text("n: Nombre Perro", 92, 565);
			text("e: Edad", 208, 565);
			text("i: Id", 334, 565);
			text("r: Raza", 455, 565);

			textSize(12);
			text("NOMBRE", 150, 15);
			text("ID", 50, 15);
			text("EDAD", 248, 15);
			text("RAZA", 346, 15);
			text("CÉDULA DUEÑO", 450, 15);
			text("NOMBRE DUEÑO", 600, 15);
			text("APELLIDO", 748, 15);

			text("TELÉFONO", 846, 15);
			text("DIRECCIÓN", 944, 15);
			textSize(13);

			text("***********************DATOS PERROS***********************", 200, 527);
			text("***********************************************DATOS PROPIETARIO****************************************",
					735, 527);
			text("****************************************************************************************************************************************************************************",
					537, 35);

			break;

		case 2:

			background(255);
			textSize(12);
			logica.pintarListaGatos();
			textSize(16);
			text("n: Nombre Gato", 92, 565);
			text("i: Id", 208, 565);
			text("r: Raza", 334, 565);

			textSize(12);
			text("NOMBRE", 150, 15);
			text("ID", 50, 15);
			text("RAZA", 248, 15);
			text("CÉDULA DUEÑO", 346, 15);
			text("NOMBRE DUEÑO", 480, 15);
			text("APELLIDO", 600, 15);
			text("TELÉFONO", 748, 15);

			text("DIRECCIÓN", 887, 15);
			// text("DIRECCIÓN",944,15);
			textSize(13);

			text("***********************DATOS GATOS*************************", 200, 527);
			text("****************************************DATOS PROPIETARIO****************************************",
					735, 527);
			text("****************************************************************************************************************************************************************************",
					537, 35);

			break;

		}

	}

	public void mousePressed() {

		println(mouseX + " " + mouseY);

		if (mouseX >= 240 && mouseX <= 416 && mouseY >= 253 && mouseY <= 353) {

			pantalla = 1;

		}

		if (mouseX >= 634 && mouseX <= 833 && mouseY >= 254 && mouseY <= 353) {

			pantalla = 2;

		}

	}

	public void keyPressed() {
		switch (pantalla) {
		case 0:

			break;

		case 1:
			logica.ordenamientoPerro(key);

			break;
		case 2:

			logica.ordenamientoGato(key);
			break;
		default:
			break;
		}


		

	}

}
