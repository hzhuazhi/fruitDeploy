package com.xn.manager.service.impl;

import com.xn.common.dao.BaseDao;
import com.xn.common.service.impl.BaseServiceImpl;
import com.xn.manager.dao.MerchantDao;
import com.xn.manager.dao.OrderDao;
import com.xn.manager.service.MerchantService;
import com.xn.manager.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:订单表数据表的Service层的实现层
 * @create 2018-09-11 14:41
 **/
@Service("orderService")
public class OrderServiceImpl<T> extends BaseServiceImpl<T> implements OrderService<T> {
    private static Logger log   =  Logger.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderDao orderDao;
    @Override
    public BaseDao<T> getDao() {
        // TODO Auto-generated method stub
        return orderDao;
    }
}
