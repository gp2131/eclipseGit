package com.lti.component;

import com.lti.interfaces.HelloInterface;

public class HelloWorld implements HelloInterface {

	public String sayHello(String name) {
		return "Hello "+name+" How are you";
	}
}
