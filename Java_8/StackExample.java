import java.util.Stack;


public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<Object> stack = new Stack<Object>();
		stack.push("Object1");
		stack.push("Object2");
		stack.push("Object3");
		stack.push("Object4");
		stack.push("Object5");
		
		System.out.println("Original Stack elements: " + stack);
		
		//1. peek() retrieve element without removal from stack
		String peek = (String) stack.peek();
		System.out.println("peek object is: " + peek);
		System.out.println("Stack after peek elements: " + stack);
		
		//2. pop() retrieve element with removal from stack
		String pop = (String) stack.pop();
		System.out.println("Pop object is: " + pop);
		
		System.out.println("Stack after pop out elements: " + stack);
	}
}
