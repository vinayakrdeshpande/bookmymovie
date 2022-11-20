/**
 * 
 */
package com.obook.bookmymovie.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public TheatreShow addTheatreShow(
            @RequestParam("theatreShowDate") 
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date theatreShowDate,
            @RequestParam long theatreid,
            @RequestParam long showid) {
        log.debug("Add Theatre and show request Date:{} theatreid:{} showid:{}", theatreShowDate, theatreid, showid);
        TheatreShow theatreShowObj = theatreShowService.saveTheatreShow(theatreShowDate, theatreid, showid);
        return theatreShowObj;
    }
}
