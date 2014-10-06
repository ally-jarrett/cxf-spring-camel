cxf-spring-camel
================

Assorted CXF Spring Camel implementations demonstrating a number of ways of implementing WS via CXF and Camel-CXF. The Camel-CXF implementations demonstrate both Java and Spring-XML Camel DSL's as well as a simple helloworld WS to a multi-param, multi-method implementation that uses an aggregation strategy to collate the results into a single JSON response. 


@Produces({ MediaType.TEXT_PLAIN } <br/>
Simple CXF HelloWorld:<br/>
http://localhost:8080/cxf-spring-camel/webservices/helloServices/helloworld/{param}

@Produces(MediaType.APPLICATION_JSON) <br/>
Simple CXF Products WS with Param:<br/>
http://localhost:8080/cxf-spring-camel/webservices/productServices/product/{id}

@Produces(MediaType.APPLICATION_JSON) <br/>
Simple CXF Products WS with Param:<br/>
Camel-CXF HelloWorld:<br/>
http://localhost:8080/cxf-spring-camel/webservices/example/test

@Produces(MediaType.APPLICATION_JSON) <br/>
Simple CXF Products WS with Param:<br/>
Camel-CXF Multi-Param:<br/>
http://localhost:8080/cxf-spring-camel/webservices/personServices/person?name={name}&email={email}&age={age}&phone={phone-number}
