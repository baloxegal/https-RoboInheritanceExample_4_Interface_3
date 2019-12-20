package tests;

import robo.AbstractRobot;
import robo.ChargingStation;
import robo.CharlieRobot;
import robo.HasBatteryInterface;

public class ChargStationTest {
	public static int SimpleChargeStationTest(ChargingStation station, HasBatteryInterface chargeable) {
		int percentage = 0;
		
		station.setX(10);
		station.setY(10);
		station.setCharge(100);
		((AbstractRobot) chargeable).setX(20);
		((AbstractRobot) chargeable).setY(20);
		chargeable.setCharge(50);
		if(station.charge(chargeable)){
			System.err.println("Charge test for station failed\nREASON: the coordinates is not permitted!");
			return percentage;
		}
		percentage += 40;
		
		if(chargeable != (CharlieRobot) chargeable || chargeable != (ChargingStation) chargeable) {
			for(int i = ((AbstractRobot) chargeable).getX(); i >= station.getX(); i--) {
				((AbstractRobot) chargeable).moveLeft();
			}
			for(int i = ((AbstractRobot) chargeable).getY(); i >= station.getY(); i--) {
				((AbstractRobot) chargeable).moveUp();
			}
		}
		else if(chargeable == (CharlieRobot) chargeable) {
			for(int i = ((AbstractRobot) chargeable).getX(); i >= station.getX(); i--) {
				((CharlieRobot) chargeable).moveUpLeft();
			}
		}
		if(!station.charge(chargeable)){
			System.err.println("Charging test for robot failed\nREASON: the robot is must be chardged!");
			return percentage;
		}
		System.out.println("The value of charge of station is " + station.getCharge());
		System.out.println("The value of charge of robot is " + chargeable.getCharge());
		percentage += 40;
		
		
		
		if(station.charge(chargeable)){
			System.err.println("Charging test limit of charge failed\nREASON: the robot chardged!");
			return percentage;
		}
		percentage += 20;
						
		return percentage;
	}
}
