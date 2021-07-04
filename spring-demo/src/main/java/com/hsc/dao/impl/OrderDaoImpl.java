package com.hsc.dao.impl;

import com.hsc.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: OrderDaoImpl
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */
@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public String getOrder() {
        return "order";
    }
}
