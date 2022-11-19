package com.obook.bookmymovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.obook.bookmymovie.model.TheatreShow;
import com.obook.bookmymovie.service.TheatreShowService;

import lombok.extern.slf4j.Slf4j;

/**
 * search movie based on city/ genere / language.
 * 
 * @author vishr
 *
 */
@Slf4j
@RestController
public class SearchMovieController {

    @Autowired
    TheatreShowService theaterShowService;

    @GetMapping("/searchMovie")
    public List<TheatreShow> findMovie(@RequestParam(value = "city", required = false) String city,
            @RequestParam(value = "genere", required = false) String genere,
            @RequestParam(value = "language", required = false) String language) {
        
        log.debug("Add Search request city: {}, genere: {}, language: {}", city,genere,language);
        List<TheatreShow> theatreShowLst = theaterShowService.searchShows(city, genere, language);
        return theatreShowLst;
    }
}
