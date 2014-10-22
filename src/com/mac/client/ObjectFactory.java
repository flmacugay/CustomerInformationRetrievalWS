
package com.mac.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mac.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AllCustomers_QNAME = new QName("http://www.mac.com", "allCustomers");
    private final static QName _CustomerDetails_QNAME = new QName("http://www.mac.com", "customerDetails");
    private final static QName _CustomerDetailsResponse_QNAME = new QName("http://www.mac.com", "customerDetailsResponse");
    private final static QName _InvalidInputException_QNAME = new QName("http://www.mac.com", "InvalidInputException");
    private final static QName _AllCustomersResponse_QNAME = new QName("http://www.mac.com", "allCustomersResponse");
    private final static QName _CustomerCarsResponse_QNAME = new QName("http://www.mac.com", "customerCarsResponse");
    private final static QName _CustomerQualificationsResponse_QNAME = new QName("http://www.mac.com", "customerQualificationsResponse");
    private final static QName _CustomerQualifications_QNAME = new QName("http://www.mac.com", "customerQualifications");
    private final static QName _CustomerCars_QNAME = new QName("http://www.mac.com", "customerCars");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mac.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllCustomersResponse }
     * 
     */
    public AllCustomersResponse createAllCustomersResponse() {
        return new AllCustomersResponse();
    }

    /**
     * Create an instance of {@link InvalidInputException }
     * 
     */
    public InvalidInputException createInvalidInputException() {
        return new InvalidInputException();
    }

    /**
     * Create an instance of {@link CustomerCarsResponse }
     * 
     */
    public CustomerCarsResponse createCustomerCarsResponse() {
        return new CustomerCarsResponse();
    }

    /**
     * Create an instance of {@link CustomerQualifications }
     * 
     */
    public CustomerQualifications createCustomerQualifications() {
        return new CustomerQualifications();
    }

    /**
     * Create an instance of {@link CustomerQualificationsResponse }
     * 
     */
    public CustomerQualificationsResponse createCustomerQualificationsResponse() {
        return new CustomerQualificationsResponse();
    }

    /**
     * Create an instance of {@link CustomerCars }
     * 
     */
    public CustomerCars createCustomerCars() {
        return new CustomerCars();
    }

    /**
     * Create an instance of {@link CustomerDetails_Type }
     * 
     */
    public CustomerDetails_Type createCustomerDetails_Type() {
        return new CustomerDetails_Type();
    }

    /**
     * Create an instance of {@link AllCustomers }
     * 
     */
    public AllCustomers createAllCustomers() {
        return new AllCustomers();
    }

    /**
     * Create an instance of {@link CustomerDetailsResponse }
     * 
     */
    public CustomerDetailsResponse createCustomerDetailsResponse() {
        return new CustomerDetailsResponse();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link Qualification }
     * 
     */
    public Qualification createQualification() {
        return new Qualification();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "allCustomers")
    public JAXBElement<AllCustomers> createAllCustomers(AllCustomers value) {
        return new JAXBElement<AllCustomers>(_AllCustomers_QNAME, AllCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "customerDetails")
    public JAXBElement<CustomerDetails_Type> createCustomerDetails(CustomerDetails_Type value) {
        return new JAXBElement<CustomerDetails_Type>(_CustomerDetails_QNAME, CustomerDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "customerDetailsResponse")
    public JAXBElement<CustomerDetailsResponse> createCustomerDetailsResponse(CustomerDetailsResponse value) {
        return new JAXBElement<CustomerDetailsResponse>(_CustomerDetailsResponse_QNAME, CustomerDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidInputException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "InvalidInputException")
    public JAXBElement<InvalidInputException> createInvalidInputException(InvalidInputException value) {
        return new JAXBElement<InvalidInputException>(_InvalidInputException_QNAME, InvalidInputException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "allCustomersResponse")
    public JAXBElement<AllCustomersResponse> createAllCustomersResponse(AllCustomersResponse value) {
        return new JAXBElement<AllCustomersResponse>(_AllCustomersResponse_QNAME, AllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerCarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "customerCarsResponse")
    public JAXBElement<CustomerCarsResponse> createCustomerCarsResponse(CustomerCarsResponse value) {
        return new JAXBElement<CustomerCarsResponse>(_CustomerCarsResponse_QNAME, CustomerCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQualificationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "customerQualificationsResponse")
    public JAXBElement<CustomerQualificationsResponse> createCustomerQualificationsResponse(CustomerQualificationsResponse value) {
        return new JAXBElement<CustomerQualificationsResponse>(_CustomerQualificationsResponse_QNAME, CustomerQualificationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQualifications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "customerQualifications")
    public JAXBElement<CustomerQualifications> createCustomerQualifications(CustomerQualifications value) {
        return new JAXBElement<CustomerQualifications>(_CustomerQualifications_QNAME, CustomerQualifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerCars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mac.com", name = "customerCars")
    public JAXBElement<CustomerCars> createCustomerCars(CustomerCars value) {
        return new JAXBElement<CustomerCars>(_CustomerCars_QNAME, CustomerCars.class, null, value);
    }

}
