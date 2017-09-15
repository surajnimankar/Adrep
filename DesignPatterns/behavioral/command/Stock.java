package behavioral.command;


/**
 * It is a request class
 * @author 138617
 *
 */
public class Stock {

	private String name = "ABC";
	private int quantity = 10;

	public void buy() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity
				+ " ] bought ");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity
				+ " ] sold ");
	}
}
