package com.springboot.aop.springbootaop.data;

import org.springframework.stereotype.Repository;

import com.springboot.aop.springbootaop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}

}
