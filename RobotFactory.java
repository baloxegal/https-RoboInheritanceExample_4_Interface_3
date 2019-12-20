package robo;

public class RobotFactory {
	public static AbstractRobot getRobot(String model, String name) {
		AbstractRobot robot = null;
		if(model == "alpha") {
			robot = new AlphaRobot(name, model);
		}
		else if(model == "beta") {
			robot = new BetaRobot(name, model);
		}
		else if(model == "charlie") {
			robot = new CharlieRobot(name, model);
		}	
		return robot;
	}
}