package com.hsc.service.impl;

import com.hsc.dao.OrderDao;
import com.hsc.service.OrderService;
import common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: OrderServiceImpl
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public String getOrder() {
        throw new MyException();
        //return orderDao.getOrder();
    }

}
