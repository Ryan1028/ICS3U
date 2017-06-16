package culminating;
/**
 * Forward.java
 * @Ryan Seftel
 * 16/06/2017
 * moves the robot forward
 */
import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class Exit implements Behavior{

	@Override
	/**
	 * @return if take control is true
	 */
	public boolean takeControl() {
		if (Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}

	@Override
	/**
	 * exits program
	 */
	public void action() {
		System.exit(0);
		
	}

	@Override
	public void suppress() {
		
		
	}
	

}
