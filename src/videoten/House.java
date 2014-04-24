package videoten;

public class House extends Apartment {
	
	private int floors;
	public House(int rent, String address, int rooms, int sqMeter, int floors) {
		super(rent, address, rooms, sqMeter);
		this.floors = floors;
		}



}
