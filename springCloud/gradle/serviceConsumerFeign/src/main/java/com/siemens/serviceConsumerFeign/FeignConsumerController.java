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
}
