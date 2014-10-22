<h2>This is a sample web service that provides customer information to consumers.</h2>
<br/>
<h3>Client stubs were generated using wsimport utility</h3><br/>
wsimport -keep -p com.mac.client http://localhost:9999/ws/customer?wsdl

<br/><br/>
<h3>WSDL</h3><br/>
http://localhost:9999/ws/customer?wsdl
<br/><br/>

<h3>Endpoint Publisher</h3><br/>
com.mac.endpoint.CustomerPublisher
<br/><br/>

<h3>SEI</h3><br/>
com.mac.service.CustomerDetails
<br/><br/>

<h3>Xml Adapter to customize date format</h3><br/>
com.mac.adapter.DateAdapter
<br/><br/>

<h3>Exception handling (Fault)</h3><br/>
com.mac.exception.InvalidInputException
<br/><br/>

<h3>Client</h3><br/>
com.mac.client.CustomerClientDemo
<br/><br/>

<h4>Used SoapUI to test</h4>
