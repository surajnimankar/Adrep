package designPatterns.behavioral.command;

/**
 * Command interface implementation
 * 
 * @author 138617
 *
 */
public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
