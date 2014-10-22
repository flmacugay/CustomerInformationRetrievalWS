package com.mac.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.mac.exception.InvalidInputException;
import com.mac.model.Car;
import com.mac.model.Customer;
import com.mac.model.Qualification;

@WebService(serviceName="CustomerDetails", targetNamespace="http://www.mac.com")
public interface CustomerDetails {
	
	@WebMethod(operationName="allCustomers")
	@WebResult(name="Customer")
	List<Customer> getAllCustomers();
	
	@WebMethod(operationName="customerDetails")
	@WebResult(name="Customer")
	Customer getCustomer(int id) throws InvalidInputException;
	
	@WebMethod(operationName="customerQualifications")
	@WebResult(name="Qualification")
	Qualification getCustomerQualification(int id) throws InvalidInputException;
	
	@WebMethod(operationName="customerCars")
	@WebResult(name="Cars")
	List<Car> getCustomerCars(int id) throws InvalidInputException;
}
