package videoten;

public class Run {
	public void program() {
		
		Apartment apartment = new Apartment(500, "Kopenhamnsvagen 52", 5, 90);
		System.out.println(apartment.toString());
		
	}
	
	public static void main(String[] args) {

		Run prog = new Run();
		prog.program();
	}
}
