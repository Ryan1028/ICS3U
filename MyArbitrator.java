package culminating;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;

import lejos.robotics.subsumption.Behavior;;
/**
 * Forward.java
 * @Ryan Seftel
 * 16/06/2017
 * moves the robot forward
 */
public class MyArbitrator {

	public static void main(String[]args){
		UltrasonicSensor Ultra = new UltrasonicSensor(SensorPort.S2);
		LightSensor light = new LightSensor(SensorPort.S1);
		
		Behavior b1 = new Forward();
		Behavior b2 = new Exit();
		Behavior b3 = new Light(light);
		Behavior b4 = new Ultrasonic(Ultra);
		Behavior [] behaviors = {b1,b3,b4,b2};
		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();
		
	}
}
