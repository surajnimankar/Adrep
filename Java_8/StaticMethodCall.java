public class StaticMethodCall {
	
	public static String foo(){
		System.out.println("Test foo called");
		return "";
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Hello World...!");
			StaticMethodCall obj = null;
			System.out.println(obj.foo());
		}
		finally {
			System.out.println("In Finally Block...");
		}
	}
}
