package culminating;
import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class Ultrasonic implements Behavior {
	private UltrasonicSensor Ultra;
	private boolean suppressed = false;

	public Ultrasonic(UltrasonicSensor us){
		this.Ultra = us;
	}

	@Override
	/**
	 * @return if take control is true and distance is < 15
	 */
	public boolean takeControl() {

		//int distance = Ultra.getDistance();
		if( Ultra.getDistance() < 15){
			return true;
		}
		return false;
	}

	@Override
	/**
	 * if distance is <15 it spins to turn around
	 */
	public void action() {
		suppressed = false;
		//Motor.A.forward();
		//Motor.B.forward();

		while(Ultra.getDistance() < 15 && !suppressed){
			Motor.B.backward();
			Motor.A.forward();
		}
		
	}

	@Override
	public void suppress() {
		suppressed = true;

	}

}
