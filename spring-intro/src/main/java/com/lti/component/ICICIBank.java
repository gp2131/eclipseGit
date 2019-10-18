package com.lti.component;

import org.springframework.stereotype.Component;

import com.lti.interfaces.ATM;
import com.lti.interfaces.Bank;

@Component("icici")
public class ICICIBank implements Bank {
	

	public void communicate(String operation ,byte [] data, long acno){
		if(acno==232) {
		System.out.println("Valid User");
		System.out.println("Communication for "+ operation + "with data" );
		}
		
		
	}

	

}
