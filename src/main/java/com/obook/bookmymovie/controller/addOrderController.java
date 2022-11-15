package com.obook.bookmymovie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.obook.bookmymovie.model.Orders;
import com.obook.bookmymovie.service.OrdersService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@RestController
public class addOrderController {

    @Autowired
    OrdersService orderService;

    @PostMapping("/bookMovie")
    public Orders bookMovie(@Valid @RequestBody Orders order) {
        Orders savedOrder = orderService.saveOrder(order);
        return savedOrder;
    }
}
