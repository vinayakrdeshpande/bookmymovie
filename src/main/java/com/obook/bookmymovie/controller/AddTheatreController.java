package com.obook.bookmymovie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
public class AddTheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/addTheatre")
    public Theatre saveTheatre(@Valid @RequestBody Theatre theatre) {
        return theatreService.saveTheatre(theatre);
    }

}
