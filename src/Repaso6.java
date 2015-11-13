/*
 * hace lo mismo que el 5
 * pero solo se cambia el color si se hace dentro
 * del rectangulo
 */
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso6 extends acm.program.GraphicsProgram{
	//declaro una variable de instancia para guardar el rectangulo
	GRect rectangulo;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();
	
	public void init(){
		setSize(800,900);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del raton
		addMouseListeners();
		
	}
	public void run(){
		add (rectangulo,
		getWidth()/2 - rectangulo.getWidth()/2,
		getHeight()/2 - rectangulo.getHeight()/2);
	}
	//añado el metodo que escucha el evento del clic del raton

	public void mouseClicked (MouseEvent evento){
		//evento getX
		//si la posicion en la que se ha hecho clic el rectangulo
		//entonces lo relleno
		
		//la funcion se llama getElementAt
		if( getElementAt( evento.getX(), evento.getY()) ==rectangulo ){
		rectangulo.setFilled(true);
	
		rectangulo.setFillColor(aleatorio.nextColor()); 
		}
	}
}
