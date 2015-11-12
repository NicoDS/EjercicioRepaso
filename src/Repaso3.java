/*
 * dibujar rectangulo
 * con la esquina superior izquierda en el centro de la pantalla
 */


import acm.graphics.*;
public class Repaso3 extends acm.program.GraphicsProgram{

	//declaro una variable para almacenar el rectangulo
	//como es de instancia se ve desde el init y el run
	GRect rectangulo;
	//declaro otra variable de distancia y guardará el punto x
	//de la pantalla en que empezará a pintar el rectangulo
	int distanciaX;
	//declaro otra variable de distancia y guardará el punto y
	//de la pantalla en que empezará a pintar el rectangulo
	int distanciaY;
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
		distanciaY = getHeight()/2;
		
		rectangulo.setLocation(distanciaX, distanciaY);
		
		
	}
}
