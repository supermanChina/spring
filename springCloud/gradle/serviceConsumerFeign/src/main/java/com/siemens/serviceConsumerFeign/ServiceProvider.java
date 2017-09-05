package com.siemens.serviceConsumerFeign;

import com.netflix.servo.util.VisibleForTesting;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by h7gsbw on 9/5/2017.
 */
@FeignClient("service-provider")
public interface ServiceProvider {

    @RequestMapping("/hello")
    public String hello();
}
