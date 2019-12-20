package robo;

public class StationFactory {
	public static ChargingStation getStation() {
		ChargingStation station = new ChargingStation();
		return station;
	}
}
