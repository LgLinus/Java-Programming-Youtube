package videoten;

public class Housing {

	private int rent;
	private String address;
	private int rooms;
	
	public Housing(int rent, String address, int rooms){
		this.rent = rent;
		this.address = address;
		this.rooms = rooms;
	}
	
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public String toString(){
		return "Rent: " + this.getRent() + " Address: " + this.getAddress() + " Rooms: " + this.getRooms();
	}
	
}
