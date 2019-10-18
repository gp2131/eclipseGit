package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("user")
public class BankUser {

	@Autowired
	private HDFCBankATM hdfc;
	
	public void withdrawByUser(long acno, double amount) {
		long ac=232;
		hdfc.withdraw(ac, 56666666);
		
	}
	
}
