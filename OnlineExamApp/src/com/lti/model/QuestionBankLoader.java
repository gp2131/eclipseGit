package com.lti.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {

	public static List<Question> loadQuestionsOnJava() {
		QuestionBank qb = new QuestionBank();

		Subject s = new Subject();
		s.setName("Java");
		qb.addNewSubject(s);
		Question q = new Question();
		q.setQuestion("What is G1 in Java");

		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("G1 is a Garbage Collector", true));
		ops.add(new Option("G1 is another name for Jeevan", false));
		ops.add(new Option("G1 is the name of a spy agency", false));
		ops.add(new Option("G1 is sequel of Ra.One", false));
		q.setOptions(ops);

		qb.addNewQuestion(s, q);
		// return null;
		q = new Question();
		q.setQuestion("What is Parent class of Unchecked Exception?");
		ops = new ArrayList<Option>();
		ops.add(new Option("Exception", true));
		ops.add(new Option("Throwable", false));
		ops.add(new Option("RunTimeException", false));
		ops.add(new Option("Error", false));
		q.setOptions(ops);

		qb.addNewQuestion(s, q);

		q = new Question();
		q.setQuestion("What is Parent class of Checked Exception?");
		ops = new ArrayList<Option>();
		ops.add(new Option("Exception", true));
		ops.add(new Option("Throwable", false));
		ops.add(new Option("RunTimeException", false));
		ops.add(new Option("Error", false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		q = new Question();
		q.setQuestion("What is Super Class of all Exception?");
		ops = new ArrayList<Option>();
		ops.add(new Option("Exception", false));
		ops.add(new Option("Throwable", true));
		ops.add(new Option("RunTimeException", false));
		ops.add(new Option("Error", false));
		q.setOptions(ops);
		qb.addNewQuestion(s, q); 
		return qb.getQuestionsFor(s);
	}

}
