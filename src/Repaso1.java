/*
 * pinta un rectangulo en la esquina superior izquierda
 * 
 */
//importamos la libreria acm para los obj graficos
import acm.graphics.*;

public class Repaso1 extends acm.program.GraphicsProgram{
	//declaro una variable instancia para guardar el rectangulo
	GRect rectangulo;
	//recuerda quue el intit se ejecuta siempre antes que el run
	public void init(){
		setSize (800,600);
		//el primer parametro del rectangulo en el ancho
		//y el alto
		rectangulo = new GRect(120,80);
		
	}
	public void run(){
		//añado el objeto GRect al lienzo para que se muestre
		//si no especifico la posicion, aparece en (0,0)
		add(rectangulo);
		
	}
}
