package com.spring.boot.web.app.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.web.app.domain.User;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author Zhang Xiaochao
 *
 */
@RestController
@RequestMapping("/services")
public class RestServiceController {

	// Simulate the data store
	private static final Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

	@ApiOperation(value = "HTTP GET method API demo", notes = "Notes for HTTP GET")
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String httpGet() {
		return "RESTful service response for GET";
	}

	@ApiOperation(value = "HTTP POST method demo", notes = "Notes for HTTP POST")
	@ApiImplicitParam(name = "user", value = "Detail of user", required = true, dataType = "User")
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String restServicePost(@RequestBody User user) {
		System.out.print("User from requesst body:" + user);
		// save new user into list
		users.put(user.getId(), user);
		return "OK";
	}

}
