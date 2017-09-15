
public class Ass1 {
	
	public static String foo(){
		System.out.println("Test foo called");
		return "";
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Hello World...!");
			Ass1 obj = null;
			System.out.println(obj.foo());
		}
		finally {
			
		}
	}
}
