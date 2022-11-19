package com.obook.bookmymovie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.obook.bookmymovie.model.Theatre;
import com.obook.bookmymovie.service.TheatreService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@RestController
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/addTheatre")
    @ResponseStatus(HttpStatus.CREATED)
    public Theatre addTheatre(@Valid @RequestBody Theatre theatre) {
        log.debug("Add theatre request {}", theatre);
        Theatre theatreObj = theatreService.saveTheatre(theatre);
        return theatreObj;
    }

}
