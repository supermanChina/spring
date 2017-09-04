package com.spring.boot.web.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author Zhang Xiaochao
 *
 */
@RestController
@RequestMapping("/services")
public class RestServiceController {
	
	@ApiOperation(value="Get the user list", notes="Notes for getUerList")
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String restServiceGet() {
		return "RESTful service response for GET";
	}

}
