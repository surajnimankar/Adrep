package lambdaExpression;

public class StateClient {
	
	public static void main(String[] args) {
		StateOwner owner = new StateOwner();
		owner.addStateListener(
				(oldState, newState) -> {
					System.out.println("Old State is: " + oldState);
					System.out.println("New State is: " + newState);
				}
		);
	}
}
