package others.businessdelegate;

public class JmsService implements BusinessService {

	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}