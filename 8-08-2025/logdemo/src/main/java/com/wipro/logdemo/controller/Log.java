package com.wipro.logdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log {
	private static final Logger logger = LoggerFactory.getLogger(Log.class);

	@GetMapping("/greet")
	String greet() {
		System.out.println("--Home Controller--");

//		logger.error("--Error--");
//		logger.warn("--WARN--");
//		logger.info("--INFO--");
		logger.debug("--DEBUG--");
		logger.trace("--TRACE--");
		return "Hello greet";
		
	}
}
