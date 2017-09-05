package com.siemens.serviceConsumerRibbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by h7gsbw on 9/5/2017.
 */
@RestController
public class RibbonConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbonConsumer", method = RequestMethod.GET)
    public String ribbonConsumer(){
        return restTemplate.getForEntity("http://SERVICE-PROVIDER/hello",String.class).getBody();
    }
}
