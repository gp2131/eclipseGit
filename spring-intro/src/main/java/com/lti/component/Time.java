package com.lti.component;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component("t")
public class Time {
	public LocalDate currentDate() {
		return LocalDate.now();
	}

}
