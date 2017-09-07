package com.siemens.serviceConsumerFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by h7gsbw on 9/5/2017.
 */
@RestController
public class FeignConsumerController {
    @Autowired
    ServiceProvider serviceProvider;

    @RequestMapping(value = "/feignConsumer", method = RequestMethod.GET)
    public String feignConsumer(){
        return serviceProvider.hello();
    }

    @RequestMapping(value = "/feignConsumer2", method = RequestMethod.GET)
    public String feignConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(serviceProvider.hello()).append("<br> hot fix");
        sb.append(serviceProvider.hello("name1")).append("<br>");
        sb.append(serviceProvider.hello("name2", 18)).append("<br>");
        sb.append(serviceProvider.hello(new User("name3",28))).append("<br>");

        return sb.toString();
    }
}
