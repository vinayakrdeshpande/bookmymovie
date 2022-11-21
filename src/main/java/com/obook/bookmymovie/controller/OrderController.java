package com.obook.bookmymovie.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class OrderController {

    @Autowired
    OrdersService orderService;

    @PostMapping("/bookMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public Orders bookMovie(@RequestParam("movieDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date movieDate,
            @RequestParam long theatreshowid, @RequestParam long userid, @RequestParam double paid) {
        log.debug("Add order request movieDate: {}, theatreshowid: {}, userid: {}, paid: {}", movieDate, theatreshowid,
                userid, paid);
        Orders savedOrder = orderService.saveOrder(movieDate,theatreshowid,userid, paid);
        log.debug("Order id {}", savedOrder.getOrder_id());
        return savedOrder;
    }

}
