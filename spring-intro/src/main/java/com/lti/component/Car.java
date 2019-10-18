package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("kar")
public class Car {
	
	@Autowired //DI
	private AudioSystem audioSystem;
	public void playSomeMusic() {
		audioSystem.playFM(93.5);
	}

}
