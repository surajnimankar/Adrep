package others.businessdelegate;

/**
 * Presentation tier code may be JSP, servlet or UI java code.
 * @author 138617
 *
 */
public class PresentationClient {

	BusinessDelegate businessService;

	public PresentationClient(BusinessDelegate businessService) {

		this.businessService = businessService;
	}

	public void doTask() {

		businessService.doTask();
	}
}