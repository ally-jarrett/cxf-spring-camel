package com.cxf.services.impl;

import java.util.List;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cxf.model.AgePhoneResult;
import com.cxf.model.NameEmailResult;
import com.cxf.services.PersonService;

public class PersonServiceImpl implements PersonService {

	private static Logger LOG = LoggerFactory.getLogger(PersonServiceImpl.class);

	public String personServiceMethod() {
		return null;
	}

	@SuppressWarnings("unchecked")
	public NameEmailResult getNameEmailResult(Exchange exchange) {
		LOG.info("Invoking getNameEmailResult from RestServiceImpl");

		String name = getFirstEntrySafelyFromList(exchange.getProperty("name", List.class));
		String email = getFirstEntrySafelyFromList(exchange.getProperty("email", List.class));

		LOG.info("Person name: " + name);
		LOG.info("Person email: " + email);

		/**
		 * Here we are just returning an object but obviously this could be
		 * executing some method/function, querying a db etc...
		 */
		return new NameEmailResult(name, email);
	}

	@SuppressWarnings("unchecked")
	public AgePhoneResult getAgePhoneResult(Exchange exchange) {
		LOG.info("Invoking getAgePhoneResult from RestServiceImpl");

		String age = getFirstEntrySafelyFromList(exchange.getProperty("age", List.class));
		String phone = getFirstEntrySafelyFromList(exchange.getProperty("phone", List.class));

		LOG.info("Person Age: " + age);
		LOG.info("Person phone: " + phone);

		/**
		 * Here we are just returning an object but obviously this could be
		 * executing some method/function, querying a db etc...
		 */
		return new AgePhoneResult(age, phone);
	}

	private String getFirstEntrySafelyFromList(List<String> list) {

		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

}
