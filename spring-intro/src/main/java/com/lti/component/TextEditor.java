package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("te")
public class TextEditor {

	@Autowired
	private SpellChecker spellChecker;
	
	public void loadDocument(String doc) {
		System.out.println("text editor loading "+ doc);
		spellChecker.checkSpellingMistakes("o");
	}
}
