package com.siemens.serviceConsumerFeign;

import com.netflix.servo.util.VisibleForTesting;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by h7gsbw on 9/5/2017.
 */
@FeignClient("service-provider")
public interface ServiceProvider {

    @RequestMapping("/hello")
    public String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name);
    // Must specify the parameter name for @RequestParam in Feign

    @RequestMapping(value = "/hello2", method=RequestMethod.GET)
    public User hello(@RequestParam("name") String name, @RequestParam("age") Integer age);
    // Must specify the parameter name for @RequestHeader in Feign

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user);
}
