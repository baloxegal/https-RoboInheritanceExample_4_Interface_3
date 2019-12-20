package tests;

import robo.AbstractRobot;
import robo.HasBatteryInterface;
import robo.MoveableDiagonalInterface;

public class DiagonalWalkTest {
	public static int SimpleDiagonalWalkTest(AbstractRobot robot) {
		
		int percentage = 0;
		
		robot.setX(0);
		robot.setY(0);
		((HasBatteryInterface) robot).setCharge(50);
		if(((MoveableDiagonalInterface) robot).moveUpLeft()) {
			System.err.println("Move test failed\nREASON: moveUpLeft() out of bounds!");
			return percentage;
		}
		percentage += 20;
		
		robot.setX(25);
		robot.setY(100);
		((HasBatteryInterface) robot).setCharge(50);
		if(((MoveableDiagonalInterface) robot).moveDownRight()) {
			System.err.println("Move test failed\nREASON: moveDownRight() out of bounds!");
			return percentage;
		}
		percentage += 20;
		
		robot.setX(0);
		robot.setY(50);
		((HasBatteryInterface) robot).setCharge(50);
		if(((MoveableDiagonalInterface) robot).moveDownLeft()) {
			System.err.println("Move test failed\nREASON: moveDownLeft() out of bounds!");
			return percentage;
		}
		percentage += 20;
		
		robot.setX(10);
		robot.setY(10);
		((HasBatteryInterface) robot).setCharge(50);
		if(!((MoveableDiagonalInterface) robot).moveUpLeft()) {
			System.err.println("Move test failed\nREASON: moveDownLeft() cod is not correct!");
			return percentage;
		}
		percentage += 20;
		
		robot.setX(50);
		robot.setY(50);
		((HasBatteryInterface) robot).setCharge(50);
		int i = 0;
		for(; i < 1000; i++) {
			if(!((MoveableDiagonalInterface) robot).moveDownRight()) {
				break;
			}
		}
		System.out.printf("The robot took %d steps and the charge value is %d%%\n", i, ((HasBatteryInterface) robot).getCharge());
		percentage += 20;
		
		return percentage;
	}

}