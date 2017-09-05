/**
 * 
 */
package com.siemens.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhang Xiaochao
 *
 */
@RestController
public class FeignConsumerController {

	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		System.out.println("Call micro service by Feign.");
		return helloService.hello();
	}
}
