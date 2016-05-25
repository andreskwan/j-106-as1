/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		putBeepersAlongTheStreet();				
		emptyKarelsBag();		
		turnAround();
		recoverBeepersOnTheStreet();
		turnAround();
		placeBeeperInTheMiddleOfTheStreet();
		
	}
	private void moveAndPutBeeper() {
		if (frontIsClear()) {
			move();
			putBeeper();	
		}		
	}
    private void emptyKarelsBag() {
		int emptyBag = 0;
		setBeepersInBag(emptyBag);
	}
    private void putBeepersAlongTheStreet() {
    	putBeeper();		
		while(frontIsClear()){
			moveAndPutBeeper();			
		}
	}
   private void recoverBeepersOnTheStreet() {
	   while (frontIsClear()) {
			pickBeeper();
			move();
		}
		pickBeeper();
   }
   private void placeBeeperInTheMiddleOfTheStreet() {
	   for(int i=0; i< getBeepersInBag()/2; i++){
			move();
		}
		putBeeper();
}
}
