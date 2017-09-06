package com.siemens.serviceProvider;

import org.springframework.web.bind.annotation.*;

/**
 * Created by h7gsbw on 9/5/2017.
 */
@RestController
public class ServiceProviderController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloService(){
        System.out.println("Received request in service provider");
        return "Hello from service provider";
    }

    @RequestMapping(value = "hello1", method = RequestMethod.GET)
    public String helloService(@RequestParam String name){
        return "Hello: " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestParam String name, @RequestParam Integer age){
        return new User(name, age);
    }

    @RequestMapping(value = "hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "Hello: " + user.getName() + ", " + user.getAge();
    }
}
