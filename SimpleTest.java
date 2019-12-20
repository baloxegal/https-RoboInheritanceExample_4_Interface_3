package tests;

import robo.AbstractRobot;

public class SimpleTest {
	public static int runCase (AbstractRobot robot) {
		
		int percentage = 0;
		
		robot.setName(null);
		if(robot.getName() == null) {
			System.err.println("Name test failed\nREASON: null name not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setModel(null);
		if(robot.getModel() == null) {
			System.err.println("Model test failed\nREASON: null model not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setX(-100);
		if(robot.getX() < 0) {
			System.err.println("X coord test failed\nREASON: Values less than 0 not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setX(1000);
		if(robot.getX() > 100) {
			System.err.println("X coord test failed\nREASON: Values more than 100 not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setY(-100);
		if(robot.getY() < 0) {
			System.err.println("Y coord test failed\nREASON: Values less than 0 not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setY(1000);
		if(robot.getY() > 100) {
			System.err.println("Y coord test failed\nREASON: Values more than 100 not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setY(0);
		if(robot.moveUp()) {
			System.err.println("Move test failed\nREASON: moveUp() out of bounds!");
			return percentage;
		}
		percentage += 10;
		
		robot.setY(100);
		if(robot.moveDown()) {
			System.err.println("Move test failed\nREASON: moveDown() out of bounds!");
			return percentage;
		}
		percentage += 10;
		
		robot.setX(0);
		if(robot.moveLeft()) {
			System.err.println("Move test failed\nREASON: moveLeft() out of bounds!");
			return percentage;
		}
		percentage += 10;
		
		robot.setX(100);
		if(robot.moveRight()) {
			System.err.println("Move test failed\nREASON: moveRight() out of bounds!");
			return percentage;
		}
		percentage += 10;
		
		return percentage;
	}
}