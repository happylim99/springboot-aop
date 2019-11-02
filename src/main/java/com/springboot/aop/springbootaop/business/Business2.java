package com.springboot.aop.springbootaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aop.springbootaop.data.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;

	public String calculateSomething() {
		return dao2.retrieveSomething();
	}

	public String calculateSomething2() {
		return "2 2";
	}

}
