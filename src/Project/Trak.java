package Project;

public class Trak extends Vechile {
	private int numberOfAxles;
	private int capacityInTons;

	void loud(int wightOfLoud) {
		System.out.println("Loaded" + wightOfLoud + "tons");
	}

	public int getNumberOfAxles() {
		this.numberOfAxles = numberOfAxles;
		return numberOfAxles;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public int getCapacityInTons() {
		return capacityInTons;
	}

	public void setCapacityInTons(int capacityInTons) {
		this.capacityInTons = capacityInTons;
	}
}
