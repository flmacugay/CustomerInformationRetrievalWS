package com.mac.service;

import java.util.List;

import javax.jws.WebService;

import com.mac.exception.InvalidInputException;
import com.mac.model.Car;
import com.mac.model.Customer;
import com.mac.model.CustomerServiceStub;
import com.mac.model.Qualification;

@WebService(endpointInterface="com.mac.service.CustomerDetails")
public class CustomerDetailsImpl implements CustomerDetails{
	
	private CustomerServiceStub stub=new CustomerServiceStub();

	@Override
	public List<Customer> getAllCustomers() {
		return stub.getAllCustomers();
	}

	@Override
	public Customer getCustomer(int id) throws InvalidInputException {
		return stub.getCustomer(id);
	}

	@Override
	public Qualification getCustomerQualification(int id) throws InvalidInputException {
		return stub.getCustomerQualification(id);
	}

	@Override
	public List<Car> getCustomerCars(int id) throws InvalidInputException {
		return stub.getCustomerCars(id);
	}

}
