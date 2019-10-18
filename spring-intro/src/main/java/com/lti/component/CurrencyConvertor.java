package com.lti.component;

import org.springframework.stereotype.Component;

@Component("cc") //alternative to <bean id=.. class=..> written in config.xml
public class CurrencyConvertor {

	public double dollarsToRupees(double dollars) {
		return dollars*71.05;
	}
}
