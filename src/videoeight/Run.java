package videoeight;


public class Run {
	public void program() {
		Person person1 = new Person("Jack", 24);
		System.out.println(person1.getAge());
		System.out.println(person1.toString());
	}
	
	public static void main(String[] args) {

		Run prog = new Run();
		prog.program();
	}
}
