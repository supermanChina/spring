package com.superman.springBootWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Zhang Xiaochao
 *
 */
@RestController
public class RestServiceController {

	@RequestMapping("serviceAPI")
	public String restService() {
		return "RESTful service response";
	}
}
