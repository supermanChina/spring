/**
 * 
 */
package com.siemens.helloService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClientConfig;

/**
 * @author Zhang Xiaochao
 *
 */
@RestController
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloSerive() {
		System.out.println("hello service request recieved.");
		return "Hello from micro service";
	}
}
