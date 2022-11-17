package com.obook.bookmymovie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public Orders bookMovie(@Valid @RequestBody Orders order) {
        log.debug("Add order request {}", order);
        Orders savedOrder = orderService.saveOrder(order);
        log.debug("Order id {}", order.getOrder_id());
        return savedOrder;
    }

}
