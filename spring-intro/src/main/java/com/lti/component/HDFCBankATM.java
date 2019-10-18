package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.interfaces.Bank;

@Component("ATM")
public class HDFCBankATM {
	@Autowired
	private Bank bank;

	public void withdraw(long acno, double amount) {
		System.out.println("withdraw called " +amount );
		bank.communicate("withdraw", null, acno);
		
	}

}
