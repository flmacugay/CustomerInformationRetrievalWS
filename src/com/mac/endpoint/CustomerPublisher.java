package com.mac.endpoint;

import javax.xml.ws.Endpoint;

import com.mac.service.CustomerDetailsImpl;

public class CustomerPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/customer", new CustomerDetailsImpl());
		System.out.println("web service is up and running... ");
	}

}
