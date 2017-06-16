package culminating;
import lejos.robotics.subsumption.Behavior;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;

public class Light implements Behavior {
	private boolean suppressed = false;
	private LightSensor light;

	public Light(LightSensor ls){
		this.light = ls;
	}

	@Override
	/**
	 * @return if take control is true and light value is > 24
	 */
	public boolean takeControl() {
		if (light.getLightValue() > 24){
			return true;
		}
		return false;
	}

	@Override
	/**
	 * depending on light value it adds 1 to a color counter
	 */
	public void action() { 
		suppressed = false;
		int Redcounter= 0;
		int Bluecounter = 0;
		int Greencounter = 0;
		while(!suppressed){

			int color = light.getLightValue();
			if (color == 44 ){
				Redcounter = Redcounter + 1;

			}
			else if (color == 25){
				Bluecounter = Bluecounter + 1;
			}
			else if (color == 30){
				Greencounter = Greencounter + 1;
			}
			else{
				suppressed = true;
			}
			Thread.yield();
			Motor.A.setSpeed(150);
			Motor.B.setSpeed(150);
			Motor.A.forward();
			Motor.B.forward();


		}

		System.out.println(Redcounter);
		System.out.println(Greencounter);
		System.out.println(Bluecounter);
	}
	@Override
	public void suppress() {
		suppressed = true;

	}

}
