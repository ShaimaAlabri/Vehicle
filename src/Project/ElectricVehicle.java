package Project;

public class ElectricVehicle {
	private Integer batteryCapacity;
	private Integer chargeLevel;

	void charge(int chargeLevel) {
		if (chargeLevel > 0) {
			
			System.out.println("chargeLevel  increases");
		}
	}

	public void drive(int speed) {
		System.out.println("Electric vehicle driven " + speed + " MPH");
	}

	public Integer getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Integer getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(Integer chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

}