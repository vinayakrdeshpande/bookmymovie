package com.obook.bookmymovie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obook.bookmymovie.model.Orders;
import com.obook.bookmymovie.repositories.OrdersRepository;
import com.obook.bookmymovie.service.OrdersService;

/**
 * @author vishr
 *
 */
@Service
public class OrderServiceImpl implements OrdersService {

    @Autowired
    OrdersRepository orderRepository;

    @Override
    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

}
