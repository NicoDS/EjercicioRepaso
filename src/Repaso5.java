/*
 * para poder escuchar los clic del raton 
 * lo q hara el programa es cambiarle el color de relleno
 * aleatoriamente cada vez que pulse clic
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;
public class Repaso5 extends acm.program.GraphicsProgram{
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
		if(evento.getButton() == MouseEvent.BUTTON1){
		rectangulo.setFilled(true);
	
		rectangulo.setFillColor(aleatorio.nextColor()); 
		}
	}
}
