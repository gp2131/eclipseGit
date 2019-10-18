package com.lti.component;

import com.lti.interfaces.HelloInterface;

public class HelloWorldHindi implements HelloInterface{

	public String sayHello(String name) {
		return "Namaste "+name+" kya hal?";
	}

}
