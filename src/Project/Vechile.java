package Project;

public class Vechile extends Engine implements Honkable{

	private String make;
	private String modle;
	private Integer year;
	private String color;
	private Integer numberOfWheels;
	private Integer weight;

	 void start() {
		System.out.println("Vehicle started");

	}

	void stop() {
		System.out.println("Vehicle stopped");

	}

	void drive(int noumberOfMiles) {
		System.out.println("Vehicle driven" + noumberOfMiles + "miles");

	}

	public void honk(){
		System.out.println("Honk Honk!");

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModle() {
		return modle;
	}

	public void setModle(String modle) {
		this.modle = modle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
