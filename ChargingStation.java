package robo;

public class ChargingStation implements Has2DCoordinatesInterface, HasBatteryInterface {

	private int x;
	private int y;
	private byte charge;
	
	protected ChargingStation() {
		x = 0;
		y = 0;
		charge = 0;
	}
	
	public void setCharge(int charge) {
		if(charge >= 0 && charge <= 100) {
			this.charge = (byte)charge;
		}
	}
	public byte getCharge() {
		return charge;
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
	public boolean charge (HasBatteryInterface chargeable) {
		if(getCharge() > 5 && chargeable.getCharge() < 100 && getX() == ((Has2DCoordinatesInterface) chargeable).getX() && getY() == ((Has2DCoordinatesInterface) chargeable).getY()) {
			int i = 0;
			while(chargeable.getCharge() < 100) {
				chargeable.setCharge(chargeable.getCharge() + 1);
				i++;
				if(i % 10 == 0 || chargeable != (Moveable2DInterface) chargeable) {
					setCharge(getCharge() - 1);
				}
				else if(getCharge() == 5) {
					return false;
				}
			}
			return true;
		}
		return false;		
	}
}
