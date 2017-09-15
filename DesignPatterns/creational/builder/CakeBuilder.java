package creational.builder;

public class CakeBuilder {

	protected double sugar; // cup
	protected double butter; // cup
	protected int eggs;
	protected int vanila; // spoon
	protected double flour; // cup
	protected double bakingpowder; // spoon
	protected double milk; // cup
	protected int cherry;

	// builder methods for setting property
	public CakeBuilder withSugar(double cup) {
		this.sugar = cup;
		return this;
	}

	public CakeBuilder withButter(double cup) {
		this.butter = cup;
		return this;
	}

	public CakeBuilder withEggs(int number) {
		this.eggs = number;
		return this;
	}

	public CakeBuilder withVanila(int spoon) {
		this.vanila = spoon;
		return this;
	}

	public CakeBuilder withFlour(double cup) {
		this.flour = cup;
		return this;
	}

	public CakeBuilder withBakingpowder(double spoon) {
		this.bakingpowder = spoon;
		return this;
	}

	public CakeBuilder withMilk(double cup) {
		this.milk = cup;
		return this;
	}

	public CakeBuilder withCherry(int number) {
		this.cherry = number;
		return this;
	}

	// return fully build object
	public Cake build() {
		return new Cake(this);
	}
}
