/**
 * 
 */
package com.siemens.feignconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zhang Xiaochao
 *
 */
//service name is none-case-sensitive here
@FeignClient("hello-service")
public interface HelloService {

	@RequestMapping("/hello")
	String hello();
}
