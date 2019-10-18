package com.lti.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Calculator;
import com.lti.component.Car;
import com.lti.component.CurrencyConvertor;
import com.lti.component.HelloWorld;
import com.lti.component.TextEditor;
import com.lti.component.Time;
import com.lti.interfaces.HelloInterface;

public class App {

	public static void main(String[] args) {
		//Loading of Spring's IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		//Access a bean
		HelloInterface h=(HelloInterface) context.getBean("hw");//id given in app-config.xml
		System.out.println(h.sayHello("Himani"));
		
		for(int i = 0; i < 5; i++) {
			Calculator c=(Calculator) context.getBean("calc");
			System.out.println(c.add(10, 20));
		}
		
		CurrencyConvertor x=(CurrencyConvertor) context.getBean("cc");
		System.out.println(x.dollarsToRupees(50));
		

	}
}
