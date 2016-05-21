/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		/**
		 * 1) completar columna
		 * 2) volver a la base de la columna
		 * 3) verificar si ultima columna //si ultima terminar 
		 * 4) avanzar siguiente columna
		 * 5) repetir
		 */		
		completeColum();
		goToTheBase();
		while (frontIsClear()) {
			goToNextColumn();
			completeColum();
			goToTheBase();			
		}
	}
	/**
	 * 1) complete colum 
	 * 1.1 
	 */
	private void completeColum() {
		turnLeft();
		while (frontIsClear()) {
			checkAndPlaceBeeper();
			move();			
		}
		checkAndPlaceBeeper();
	}
	private void checkAndPlaceBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	private void goToTheBase() {
		//guarantee to face south
		if (facingNorth()) {
			turnAround();		
		}
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	private void goToNextColumn() {
		for(int i = 0; i<4; i++){
			if (frontIsClear()) {
				move();
			} else {
				break;
			}
		}
	}
}