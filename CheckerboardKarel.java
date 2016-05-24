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
	public void run() {
		putBeeper();
		while(frontIsClear() || leftIsClear()){
			 if(frontIsBlocked()) {	
				if (facingWest()) {
					turnRightMoveAndPutBeeper();					
				} else if (facingEast()) {
					turnLeftMoveAndPutBeeper();	
				} 
			} else {
				if (beepersPresent()) {
					move();
				} 
				moveAndPutBeeper();
			}
		}
	}	
	private void turnLeftMoveAndPutBeeper() {
		turnLeft();
		if (frontIsClear()) {
			if (beepersPresent()) {
				move();									
			} else {	
				moveAndPutBeeper();
			}	
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