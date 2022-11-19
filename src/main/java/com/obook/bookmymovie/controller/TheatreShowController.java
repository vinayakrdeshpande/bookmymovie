/**
 * 
 */
package com.obook.bookmymovie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.obook.bookmymovie.model.TheatreShow;
import com.obook.bookmymovie.service.TheatreShowService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@RestController
public class TheatreShowController {

    @Autowired
    TheatreShowService theatreShowService;

    @PostMapping("/addTheatreShow")
    @ResponseStatus(HttpStatus.CREATED)
    public TheatreShow addTheatreShow(@Valid @RequestBody TheatreShow theatreShow) {
        log.debug("Add Theatre and show request {}", theatreShow);
        TheatreShow theatreShowObj = theatreShowService.saveTheatreShow(theatreShow);
        return theatreShowObj;
    }
}
