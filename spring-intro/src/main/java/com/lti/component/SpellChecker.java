package com.lti.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sc")
@Scope("prototype")
public class SpellChecker {
	
	public void checkSpellingMistakes(String doc) {
		System.out.println("spell checker loaded for " + doc);
	
	}

}
