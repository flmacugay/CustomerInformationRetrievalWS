package com.mac.client;

import java.util.List;

/**
 * Sample web service client
 * Stubs were generated using wsimport -keep -p com.mac.client http://localhost:9999/ws/customer?wsdl
 * 
 * @author Froilan
 *
 */
public class CustomerClientDemo {

	public static void main(String[] args) throws Exception {

		CustomerDetailsImplService service=new CustomerDetailsImplService();
		CustomerDetails customerDetails=service.getCustomerDetailsImplPort();
		List<Customer> customerList=customerDetails.allCustomers();
		
		/* Retrieve details through web service operations */
		for(Customer customer : customerList) {
			System.out.println("id : "+customer.userId+"  name : "+customer.getUserName());
		}
		
		List<Car> cars = customerDetails.customerCars(1);
		for(Car car : cars) {
			System.out.println("car : "+car.make+"  "+car.model);
		}
		
		Qualification qualification=customerDetails.customerQualifications(2);
		System.out.println("qualification : "+qualification.course+" at "+qualification.school);
		
		
		/* Web service exception handling */
		try {
			customerDetails.customerDetails(3);
		} catch (InvalidInputException_Exception e) {
			System.out.println("Web service fault.. "+e);
		}
	}

}
