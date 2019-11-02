package com.springboot.aop.springbootaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aop.springbootaop.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;

	public String calculateSomething() {
		return dao1.retrieveSomething();
	}

	public String calculateSomething2() {
		return "1 1";
	}

}
