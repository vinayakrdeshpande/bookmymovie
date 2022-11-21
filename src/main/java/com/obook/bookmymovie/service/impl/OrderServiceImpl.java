package com.obook.bookmymovie.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obook.bookmymovie.model.Orders;
import com.obook.bookmymovie.model.TheatreShow;
import com.obook.bookmymovie.model.User;
import com.obook.bookmymovie.repositories.OrdersRepository;
import com.obook.bookmymovie.repositories.TheatreShowRepository;
import com.obook.bookmymovie.repositories.UserRepository;
import com.obook.bookmymovie.service.OrdersService;

/**
 * @author vishr
 *
 */
@Service
public class OrderServiceImpl implements OrdersService {

    @Autowired
    OrdersRepository orderRepository;

    @Autowired
    TheatreShowRepository theatreShowRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

    @Override
    public Orders saveOrder(Date movieDate, long theatreshowid, long userid, double paid) {

        TheatreShow theatreShow = theatreShowRepository.findById(theatreshowid)
                .orElseThrow(() -> new IllegalArgumentException("Invalid theatreshowid"));

        User user = userRepository.findById(userid)
                .orElseThrow(() -> new IllegalArgumentException("Invalid userid"));

        if(!movieDate.after(theatreShow.getTheatreShowDate())) 
            throw new IllegalArgumentException("Invalid movie date. Movie date must be after movie release date");
        
        
        Orders order = new Orders();
        order.setMoviedate(movieDate);
        order.setTheatreshow(theatreShow);
        order.setUsers(user);
        order.setPaid(paid);
       
        return saveOrder(order);
    }

}
