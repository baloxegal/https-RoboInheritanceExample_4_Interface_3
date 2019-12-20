package robo;

public abstract class AbstractRobot implements Has2DCoordinatesInterface, Moveable2DInterface {
	
	public abstract void setName(String name);
	public abstract String getName();
	
	public abstract void setModel(String model);
	public abstract String getModel();
}