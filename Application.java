package main;

//import robo.AlphaRobot;
//import robo.BetaRobot;
//import robo.CharlieRobot;
import tests.SimpleTest;
import tests.ChargeTest;
import tests.DiagonalWalkTest;
import tests.ChargStationTest;
import robo.HasBatteryInterface;
import robo.RobotFactory;
import robo.StationFactory;

public class Application {

	public static void main(String[] args) {
//		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new AlphaRobot("Robi_0", "alpha")));
//		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new BetaRobot("Robo_1", "beta")));
//		System.out.printf("Simple charge test passed %d%%\n", ChargeTest.SimpleChargeTest(new BetaRobot("Robo_2", "beta")));
//		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new CharlieRobot("Robo_3", "charlie")));
//		System.out.printf("Simple charge test passed %d%%\n", ChargeTest.SimpleChargeTest(new CharlieRobot("Robo_4", "charlie")));
//		System.out.printf("Simple move diagonal test passed %d%%\n", DiagonalWalkTest.SimpleDiagonalWalkTest(new CharlieRobot("Robo_5", "charlie")));
		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("alpha", "R2")));
		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("beta", "R2D2")));
		System.out.printf("Simple charge test passed %d%%\n", ChargeTest.SimpleChargeTest(RobotFactory.getRobot("beta", "R2D2")));
		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("charlie", "R2D3")));
		System.out.printf("Simple charge test passed %d%%\n", ChargeTest.SimpleChargeTest(RobotFactory.getRobot("charlie", "R2D3")));
		System.out.printf("Simple move diagonal test passed %d%%\n", DiagonalWalkTest.SimpleDiagonalWalkTest(RobotFactory.getRobot("charlie", "R2D3")));
		System.out.printf("Simple charge station test passed %d%%\n", ChargStationTest.SimpleChargeStationTest(StationFactory.getStation(), (HasBatteryInterface) RobotFactory.getRobot("beta", "R2D3")));
	}
}