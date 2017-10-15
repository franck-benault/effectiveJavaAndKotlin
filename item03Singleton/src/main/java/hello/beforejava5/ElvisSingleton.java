package hello.beforejava5;

public class ElvisSingleton {

	public static final ElvisSingleton INSTANCE = new ElvisSingleton();

	private ElvisSingleton () { }

	public void leaveTheBuilding() {
		System.out.println("Alleen Elvis blijft bestaan before java5");
	}
}
