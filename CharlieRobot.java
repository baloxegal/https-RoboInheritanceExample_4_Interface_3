package robo;

public class CharlieRobot extends BetaRobot implements MoveableDiagonalInterface {
	
	protected CharlieRobot(String name, String model) {
		super(name, model);
	}
	
	public boolean moveDownRight() {
		if(getCharge() > 5) {
			if (getX() + 1 <= 100 && getY() + 1 <= 100) {
				setX(getX() + 1);
				setY(getY() + 1);
				setSteps(getSteps() + 1);
				if(getSteps() % 2 == 0) {
					setCharge(getCharge() - 1);
				}
				return true;
			}
		}
		return false;	
	}
	public boolean moveDownLeft() {
		if(getCharge() > 5) {
			if (getX() - 1 >= 0 && getY() + 1 <= 100) {
				setX(getX() - 1);
				setY(getY() + 1);
				setSteps(getSteps() + 1);
				if(getSteps() % 2 == 0) {
					setCharge(getCharge() - 1);
				}
				return true;
			}
		}
		return false;	
	}
	public boolean moveUpRight() {
		if(getCharge() > 5) {
			if (getX() + 1 <= 100 && getY() - 1 >= 0) {
				setX(getX() + 1);
				setY(getY() - 1);
				setSteps(getSteps() + 1);
				if(getSteps() % 2 == 0) {
					setCharge(getCharge() - 1);
				}
				return true;
			}
		}
		return false;	
	}
	public boolean moveUpLeft() {
		if(getCharge() > 5) {
			if (getX() - 1 >= 0 && getY() - 1 >= 0) {
				setX(getX() - 1);
				setY(getY() - 1);
				setSteps(getSteps() + 1);
				if(getSteps() % 2 == 0) {
					setCharge(getCharge() - 1);
				}
				return true;
			}
		}
		return false;	
	}
}