package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
	@RequestMapping("/")
	String home() {
		return "Hello World!" + "whitman git test 22";
	}

	@RequestMapping(value="/hello/{myName}", method=RequestMethod.GET)
	String index(@PathVariable String myName) {
		return "Hello " + myName + "!!!";
	}
}
