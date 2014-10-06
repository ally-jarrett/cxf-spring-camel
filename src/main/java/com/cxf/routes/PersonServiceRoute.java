package com.cxf.routes;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MultivaluedMap;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.Exchange;  
import org.apache.camel.Processor;   
import org.apache.camel.model.dataformat.JsonLibrary;  
import org.apache.cxf.jaxrs.utils.JAXRSUtils;  
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cxf.camel.beans.ResultAggregator;

public class PersonServiceRoute extends RouteBuilder {
	
	private static Logger logger= LoggerFactory.getLogger(PersonServiceRoute.class);
	
	@Override
    public void configure() throws Exception {

        from ("cxfrs://bean://personRsServer")
                .process(new ParamProcessor())
                .multicast()
                .parallelProcessing()
                .aggregationStrategy(new ResultAggregator())
                .beanRef("personService", "getNameEmailResult")
                .beanRef("personService", "getAgePhoneResult")
                .end()
                .marshal().json(JsonLibrary.Jackson)
                .to("log://camelLogger?level=DEBUG");
    }

    /**
     * Processor that splits out our query params and places into a MAP
     * @author ajarrett
     *
     */
	private class ParamProcessor implements Processor {

        @Override
        public void process(Exchange exchange) throws Exception {
            String queryString = exchange.getIn().getHeader(Exchange.HTTP_QUERY, String.class);

            MultivaluedMap<String, String> queryMap = JAXRSUtils.getStructuredParams(queryString, "&", false, false);

            for (Map.Entry<String, List<String>> eachQueryParam : queryMap.entrySet()) {
                exchange.setProperty(eachQueryParam.getKey(), eachQueryParam.getValue());
            }


        }

    }

}
