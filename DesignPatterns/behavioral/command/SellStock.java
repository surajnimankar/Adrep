package designPatterns.behavioral.command;

/**
 * Command interface implementation
 * 
 * @author 138617
 *
 */
public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
