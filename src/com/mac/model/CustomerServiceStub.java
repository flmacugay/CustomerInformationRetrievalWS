package com.mac.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mac.exception.InvalidInputException;

public class CustomerServiceStub {
	
	private List<Customer> customers;

	public CustomerServiceStub() {
		Qualification qualification1=new Qualification(1, "computer science", "harvard");
		List<Car> cars1=new ArrayList<>();
		cars1.add(new Car(1, "bmw", "sedan"));
		cars1.add(new Car(2, "mitsubishi", "pajero"));
		Customer customer1=new Customer(1, "Apple", "Manager", new Date(), "Steve", qualification1, cars1);
		
		Qualification qualification2=new Qualification(2, "computer engineering", "mit");
		List<Car> cars2=new ArrayList<>();
		cars2.add(new Car(3, "kia", "sorento"));
		Customer customer2=new Customer(2, "Facebook", "CEO", new Date(), "Mark", qualification2, cars2);
		
		Qualification qualification3=new Qualification(3, "management", "princeton");
		List<Car> cars3=new ArrayList<>();
		cars3.add(new Car(4, "ferarri", "458"));
		cars3.add(new Car(5, "mitsubishi", "pajero"));
		cars3.add(new Car(6, "porsche", "cayenne"));
		Customer customer3=new Customer(3, "Microsoft", "CEO", new Date(), "Bill", qualification3, cars3);
		
		customers=new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
	}
	
	public List<Customer> getAllCustomers() {
		return customers;
	}
	public Customer getCustomer(int id) throws InvalidInputException {
		if(id>2) throw new InvalidInputException("Invalid input", "id="+id);
		return customers.get(id);
	}
	public Qualification getCustomerQualification(int id) throws InvalidInputException {
		if(id>2) throw new InvalidInputException("Invalid input", "id="+id);
		return customers.get(id).getQual();
	}
	public List<Car> getCustomerCars(int id) throws InvalidInputException {
		if(id>2) throw new InvalidInputException("Invalid input", "id="+id);
		return customers.get(id).getCars();
	}
	
}
