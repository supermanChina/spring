/**
 * 
 */
package com.siemens.helloService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClientConfig;

/**
 * @author Zhang Xiaochao
 *
 */
@RestController
public class HelloController {

	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloSerive() {
		EurekaClientConfig eurekaClientConfig = client.getEurekaClientConfig();
		System.out.println("client:" + client);
		System.out.println("EurekaClientConfig:" + eurekaClientConfig);

		return "Hello from micro service";
	}
}
