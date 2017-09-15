package webservice.soap.rpcstyle;

import javax.jws.WebService;

///Service Implementation  
@WebService(endpointInterface = "webservice.soap.rpcstyle.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}
