
/**
 * Forward.java
 * @Ryan Seftel
 * 16/06/2017
 * moves the robot forward
 */
package culminating;

 
 
 
 
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
public class Forward implements Behavior {
private boolean suppressed = false;
	@Override
	/**
	 * @return if take control is true
	 */
	public boolean takeControl() {
		return true;
		
	}

	@Override
	/**
	 * moves robot forward
	 */
	public void action() {
		
		Button.waitForAnyPress();
		suppressed = false;
		Motor.A.setSpeed(150);
		Motor.B.setSpeed(150);
		Motor.A.forward();
		Motor.B.forward();
		while (!suppressed){
			Thread.yield();
			
		}
		Motor.A.stop();
		Motor.B.stop();
	}
	
	@Override
	public void suppress() {
		suppressed = true;
		
	}
	

}
