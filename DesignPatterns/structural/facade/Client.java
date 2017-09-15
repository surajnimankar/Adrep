package structural.facade;

public class Client {

	public static void main(String[] args) {
		ShapeMakerFacade facade = new ShapeMakerFacade();

		facade.drawCircle();
		facade.drawRectangle();
		facade.drawSquare();
	}
}