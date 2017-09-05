package com.siemens.serviceProvider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by h7gsbw on 9/5/2017.
 */
@RestController
public class ServiceProviderController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloService(){
        System.out.println("Recieved request in service provider");
        return "Hello from service provider";
    }
}
