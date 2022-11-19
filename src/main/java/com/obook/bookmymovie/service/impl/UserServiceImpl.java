/**
 * 
 */
package com.obook.bookmymovie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obook.bookmymovie.model.User;
import com.obook.bookmymovie.repositories.UserRepository;
import com.obook.bookmymovie.service.UserService;

/**
 * @author vishr
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User userObj = userRepository.save(user);
        return userObj;
    }

}
