package tests;

import robo.ChargingStation;
import robo.HasBatteryInterface;
import robo.Has2DCoordinatesInterface;
import robo.Moveable2DInterface;

public class ChargStationTest {
	public static int SimpleChargeStationTest(ChargingStation station, HasBatteryInterface chargeable) {
		int percentage = 0;
		
		station.setX(10);
		station.setY(10);
		station.setCharge(100);
		((Has2DCoordinatesInterface) chargeable).setX(20);
		((Has2DCoordinatesInterface) chargeable).setY(20);
		chargeable.setCharge(50);
		if(station.charge(chargeable)){
			System.err.println("Charge test for station failed\nREASON: the coordinates is not permitted!");
			return percentage;
		}
		percentage += 40;
		
		if(chargeable != (Moveable2DInterface) chargeable) {
			((Has2DCoordinatesInterface) chargeable).setX(10); // телепорт для других зарядных станций
			((Has2DCoordinatesInterface) chargeable).setY(10);
		}
		else {
			while(((Has2DCoordinatesInterface) chargeable).getX() != 10 && ((Has2DCoordinatesInterface) chargeable).getY() != 10 ) {
				((Moveable2DInterface) chargeable).moveLeft();
				((Moveable2DInterface) chargeable).moveUp();
			}
		}
		if(!station.charge(chargeable)){
			System.err.println("Charging test for robot(object) failed\nREASON: the robot(object) is must be chardged!");
			return percentage;
		}
		else if (station.getCharge() != 94 && chargeable.getCharge() != 100){
			System.err.println("Charging test for robot(object) failed\nREASON: the robot(object) is must be chardged to value of 100% , and station charge value must be 94%!");
			return percentage;
		}
		System.out.println("The value of charge of station is " + station.getCharge());
		System.out.println("The value of charge of robot is " + chargeable.getCharge());
		percentage += 40;
		
		
		
		if(station.charge(chargeable)){
			System.err.println("Charging test limit of charge failed\nREASON: the robot is charged!");
			return percentage;
		}
		percentage += 20;
						
		return percentage;
	}
}
