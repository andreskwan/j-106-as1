/*
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * File: CollectNewspaperKarel.java
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

// Karol is defined as a class
// here we are creating a custom Karol robot
public class CollectNewspaperKarel extends SuperKarel {
	
	// main method, entry point 
	// where program starts running 
	public void run(){
		pickUpNewspaper();
		returnToOrigin();
	}
	private void pickUpNewspaper(){
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
	}
	private void returnToOrigin(){
		//how to make this funciton 
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
	}
}
