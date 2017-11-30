package creational.singleton;

public class Singleton {
	
	private static Singleton INSTANCE = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(INSTANCE == null) {
			return new Singleton();
		}
	    return INSTANCE;
	}
	
	public void showMessage() {

		System.out.println("Hello Friends..!");
	}

}
