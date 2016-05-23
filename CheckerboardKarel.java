/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		//garantizar que debe colocar siempre un beeper cada dos pasos 
		//no importa si gira o no
		//completar columna impar
		//identificar si siguiente columna
		//
		/**
		 * 1) completar primera columna
		 * 2) identificar techo 
		 * 3) pasar si hay siguiente columna
		 * 4) completar columna 
		 * 5) repetir hasta encontrar el fin 
		 */
		turnLeft();
		putBeeper();
		//frontIsClear or is ValidToTurn()
		while(frontIsClear()||leftIsClear()||rightIsClear()){
			//identificar si segir al frente o girar en el sentido valido posible
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			} else {
				//identificar si hay siguiente columna 
				//si la hay, rotar 
				//mover
				//poner 
				//quedar mirando hacia el sur
				
				/**
				 * validar si es el final, sino continuar, si no terminar
				 */							
				if (facingNorth()) {
					turnRight();
					//validate if can not move this is the end
					if (frontIsClear()) {
						move();
						turnRight();
						putBeeper();		
					} else {
						return;
					}										
				} else {
					//facing south
					turnLeft();
					//validate if can not move this is the end
					if (frontIsClear()) {
						move();
						turnLeft();
						putBeeper();
					} else {
						return;
					}					
				}				
			}
		}
	}
	private void moveToTheRight() {
		turnRight();
		//validate if can not move this is the end
		if (frontIsClear()) {
			move();
			turnRight();
		}
	}
}
