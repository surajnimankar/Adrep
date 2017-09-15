package webservice.soap.docstyle;

import javax.jws.WebService;

///Service Implementation  
@WebService(endpointInterface = "webservice.soap.docstyle.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}
