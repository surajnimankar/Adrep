package creational.builder;


public class Client {

	public static void main(String args[]) {

		// Creating object using Builder pattern in java
		Cake whiteCake = new CakeBuilder().withSugar(1).withButter(0.5)
				.withEggs(2).withVanila(2).withFlour(1.5)
				.withBakingpowder(0.75).withMilk(0.5).build();

		// Cake is ready to eat :)
		System.out.println(whiteCake);
	}
}
