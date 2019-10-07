package vista;

import modelo.Logica;
import processing.core.PApplet;


public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	Logica logica;
	int pantalla;
	
	public void settings() {
		size(1200,700);
	}
	public void setup() {
		logica = new Logica(this);
		pantalla=0;
	}
	public void draw () {
		background(255);
		fill(255);
		
		
		
		
		switch (pantalla) {
		case 0: 
			background(255);
			fill(0);
			rect(214,254,200,100);
			textSize(30);
			fill(255);
			textAlign(CENTER);
			text("Lista Perros",307,311);
			fill(0);
			rect(634,254,200,100);
			textSize(30);
			fill(255);
			textAlign(CENTER);
			text("Lista Gatos",725,311);
			
			break;
				
		case 1:
			background(255);
			textSize(12);
			logica.pintarListaPerros();
			
			
			
			break;
			
			
		case 2:
			
			background(255);
			textSize(12);
			//logica.pintarListaGatos();
			
			
			break;
		
		
		}
		
	}
	public void mousePressed() {

		println(mouseX+" "+mouseY);
		 
		if (mouseX >= 240 && mouseX <= 416 && mouseY >= 253 && mouseY <= 353) {
           
		pantalla=1;
			
		}
		
		if (mouseX >= 634 && mouseX <= 833 && mouseY >= 254 && mouseY <= 353) {
	           
			pantalla=2;
				
			}
		
		
	}
	public void keyPressed() {
		
}
	
	
}
