package designPatterns.behavioral.strategy;

public class Client {

	public static void main(String[] args) {
		Strategy str = new OperationAdd();
		Context context = new Context(str);
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		str = new OperationSubstract();
		context = new Context(str);
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		str = new OperationMultiply();
		context = new Context(str);
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}