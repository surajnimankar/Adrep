package webservice.soap.docstyle;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7774/ws/hello", new HelloWorldImpl()); 
	}
}
