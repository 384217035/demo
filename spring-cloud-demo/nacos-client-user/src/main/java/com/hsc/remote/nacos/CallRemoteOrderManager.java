package com.hsc.remote.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author : heshanchi
 * @projectName: spring-cloud-demo
 * @className: CallRemoteOrderManager
 * @desctiption:
 */
@Component
public class CallRemoteOrderManager {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${remote.order.url.pre}")
    private String urlPre;

    @Value("${remote.order.url.get-service-name}")
    private String getServiceNameUrl;

    public String getServiceName(){
        return restTemplate.getForObject(urlPre + getServiceNameUrl, String.class);
    }

}
