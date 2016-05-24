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
		putBeeper();
		while(frontIsClear() || leftIsClear()){
			if (frontIsClear() && beepersPresent()) {
				move();
				moveAndPutBeeper();
			} else if (frontIsClear() && noBeepersPresent()){
				moveAndPutBeeper();
			} else {
				if (facingWest() && frontIsBlocked()) {
					turnRightMoveAndPutBeeper();					
				} else if (facingEast() && frontIsBlocked()) {
					turnLeftMoveAndPutBeeper();	
				} 
			}
		}
	}	
	private void turnLeftMoveAndPutBeeper() {
		turnLeft();
		//validate if can not move this is the end
		if (frontIsClear() && noBeepersPresent()) {
			moveAndPutBeeper();									
		} else if (frontIsClear() && beepersPresent()) {	
			move();
		}
		turnLeft();
	}
	private void turnRightMoveAndPutBeeper() {
		turnRight();
		//validate if can not move this is the end
		if (frontIsClear()) {
			moveAndPutBeeper();
			turnRight();
		} 										
	}
	private void moveAndPutBeeper() {
		if (frontIsClear()) {
			move();
			putBeeper();	
		}		
	}
}
