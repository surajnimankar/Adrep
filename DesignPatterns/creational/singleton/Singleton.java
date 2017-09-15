package creational.singleton;

public class Singleton {
	
	private static Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {

	    return INSTANCE;
	}
	
	public void showMessage() {

		System.out.println("Hello Friends..!");
	}

}
