package robo;

public class AlphaRobot extends AbstractRobot {
	
	private String name;
	private String model;
	private int x;
	private int y;
	
	protected AlphaRobot() {
		name = null;
		model = null;
		x = 0;
		y = 0;
	}
	
	protected AlphaRobot(String name, String model) {
		setName(name);
		setModel(model);;
		x = 0;
		y = 0;
	}
	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
	}
	public String getName() {
		return name;
	}
	public void setModel(String model) {
		if(model != null) {
			this.model = model;
		}
	}
	public String getModel() {
		return model;
	}
	public void setX(int x) {
		if(x >= 0 && x <= 100) {
			this.x = x;
		}
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		if(y >= 0 && y <= 100) {
			this.y = y;
		}
	}
	public int getY() {
		return y;
	}
	public boolean moveRight() {
		if(x + 1 <= 100) {
			x++;
			return true;
		}
		return false;
	}
	public boolean moveLeft() {
		if(x - 1 >= 0) {
			x--;
			return true;
		}
		return false;
	}
	public boolean moveDown() {
		if(y + 1 <= 100) {
			y++;
			return true;
		}
		return false;
	}
	public boolean moveUp() {
		if(y - 1 >= 0) {
			y--;
			return true;
		}
		return false;
	}
}