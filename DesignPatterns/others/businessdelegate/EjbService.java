package others.businessdelegate;

public class EjbService implements BusinessService {

	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}
