package robo;

public class BetaRobot extends AlphaRobot implements HasBatteryInterface {
	
	private byte charge;
	private int steps;
		
	public BetaRobot(String name, String model) {
		super(name, model);
		charge = 0;
		steps = 0;
	}
	
	public void setCharge(int charge) {
		if(charge >= 0 && charge <= 100) {
			this.charge = (byte)charge;
			steps = 0;
		}
	}
	public byte getCharge() {
		return charge;
	}
	public void setSteps(int steps) {
		if(steps >= 0) {
			this.steps = steps;
		}
	}
	public int getSteps() {
		return steps;
	}
	public boolean moveRight() {
		if(charge > 5 && super.moveRight()) {
			steps++;
			if(steps % 2 == 0) {
				charge--;
			}
			return true;
		}
		return false;
	}
	public boolean moveLeft() {
		if(charge > 5 && super.moveLeft()) {
			steps++;
			if(steps % 2 == 0) {
				charge--;
			}
			return true;
		}
		return false;
	}
	public boolean moveDown() {
		if(charge > 5 && super.moveDown()) {
			steps++;
			if(steps % 2 == 0) {
				charge--;
			}
			return true;
		}
		return false;
	}
	public boolean moveUp() {
		if(charge > 5 && super.moveUp()) {
			steps++;
			if(steps % 2 == 0) {
				charge--;
			}
			return true;
		}
		return false;
	}
}