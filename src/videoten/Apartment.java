package videoten;

public class Apartment extends Housing{

	private int sqMeter;
	
	public Apartment(int rent, String address, int rooms,int sqMeter){
		super(rent,address,rooms);
		this.sqMeter = sqMeter;
	}
	
	public String toString(){
		return super.toString();
	}
	
}
