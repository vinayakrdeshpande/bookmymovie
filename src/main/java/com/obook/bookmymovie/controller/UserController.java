package com.obook.bookmymovie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.obook.bookmymovie.model.User;
import com.obook.bookmymovie.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    @ResponseStatus(HttpStatus.CREATED)
    public User addTheatre(@Valid @RequestBody User user) {
        log.debug("Add User request {}", user);
        User userObj = userService.saveUser(user);
        return userObj;
    }

}
