package others.businessdelegate;

public class BusinessDelegate {
	private BusinessServiceLookUp lookupService = new BusinessServiceLookUp();
	private BusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {

		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
