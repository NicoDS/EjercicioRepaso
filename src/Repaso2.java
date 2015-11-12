/*
 * Autor:nico
 * la clase de repaso 2 tien que dibujar un rectangulo 
 * a partir del centro de la pantalla, en el lado
 * superior de la pantalla
 */


import acm.graphics.*;

public class Repaso2 extends acm.program.GraphicsProgram{
	//declaro una variable para almacenar el rectangulo
	//como es de instancia se ve desde el init y el run
	GRect rectangulo;
	//declaro otra variable de distancia y guardará el punto x
	//de la pantalla en que empezará a pintar el rectangulo
	int distanciaX;
	public void init(){
		//cambio el tamaño de la pantalla
		setSize(800,600);
		
		//creo el rectangulo de 120 de ancho x 80 de alto
		rectangulo = new GRect(120,80);
		add (rectangulo);
	}
	public void run(){
		//divido el ancho de la pantalla en 2 para saber
		//donde está la mitad exacta de la pantalla
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX, 0);
		
		
	}
}
