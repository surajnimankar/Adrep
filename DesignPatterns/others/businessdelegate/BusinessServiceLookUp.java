package others.businessdelegate;

public class BusinessServiceLookUp {

	public BusinessService getBusinessService(String serviceType) {

		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EjbService();
		} else {
			return new JmsService();
		}
	}
}
