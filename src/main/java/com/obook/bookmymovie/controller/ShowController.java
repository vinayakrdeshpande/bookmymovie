package com.obook.bookmymovie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.obook.bookmymovie.model.Show;
import com.obook.bookmymovie.service.ShowService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@RestController
public class ShowController {

    @Autowired
    ShowService showService;

    @PostMapping("/addShow")
    @ResponseStatus(HttpStatus.CREATED)
    public Show addShow(@RequestBody Show show) {
        log.debug("Add Show request {}", show);
        Show showObj = showService.saveShow(show);
        return showObj;
    }

}
