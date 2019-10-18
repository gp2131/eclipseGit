package com.lti.component;

import org.springframework.stereotype.Component;

@Component("as")
public class AudioSystem {
	public void playFM(double frequency) {
		System.out.println("You are listening to" +frequency+"MHz") ;
	}
	

}
