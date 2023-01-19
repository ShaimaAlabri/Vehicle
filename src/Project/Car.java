package Project;

public class Car extends Vechile {
	private Integer numberOfDoors;

	void openTrunk() {
		System.out.println("trunk opened");

	}

	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
