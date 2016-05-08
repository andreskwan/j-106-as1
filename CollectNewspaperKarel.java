/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

// Karol is defined as a class
// here we are creating a custom Karol robot
public class CollectNewspaperKarel extends Karel {
	
	// main method, entry point 
	// where program starts running 
	public void run(){
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
	}
	
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
}
