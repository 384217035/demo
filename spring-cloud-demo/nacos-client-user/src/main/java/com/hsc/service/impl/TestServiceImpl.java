package com.hsc.service.impl;

import com.hsc.remote.nacos.CallRemoteOrderManager;
import com.hsc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : heshanchi
 * @projectName: spring-cloud-demo
 * @className: TestServiceImpl
 * @desctiption:
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private CallRemoteOrderManager callRemoteOrderManager;

    @Override
    public String getOrderServiceName() {
        return callRemoteOrderManager.getServiceName();
    }
}
