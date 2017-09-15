package lambdaExpression;

import java.lang.Thread.State;

public class StateOwner {
	
	public void addStateListener(StateChangeListener listener) {
		System.out.println("Inside addStateListener and changing the state...");
		listener.onStateChange(State.NEW, State.BLOCKED);
	}
}
