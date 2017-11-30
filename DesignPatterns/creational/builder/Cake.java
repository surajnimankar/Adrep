package creational.builder;

class Cake {

	private final double sugar; // cup
	private final double butter; // cup
	private final int eggs;
	private final int vanila; // spoon
	private final double flour; // cup
	private final double bakingpowder; // spoon
	private final double milk; // cup
	private final int cherry;

	/**
	 * @param builder
	 */
	// private constructor to enforce object creation through builder
	private Cake(CakeBuilder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.vanila = builder.vanila;
		this.flour = builder.flour;
		this.bakingpowder = builder.bakingpowder;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}

	@Override
	public String toString() {
		return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs="
				+ eggs + ", vanila=" + vanila + ", flour=" + flour
				+ ", bakingpowder=" + bakingpowder + ", milk=" + milk
				+ ", cherry=" + cherry + '}';

	}
}