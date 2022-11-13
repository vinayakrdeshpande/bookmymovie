/**
 * This is an controller to reponsible for adding theatres.
 * And getting theatres.
 */
package com.obook.bookmymovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping("/theatre")
public class TheatreController {

	@Autowired
	TheatreService theatreService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Void> saveTheatre(@RequestBody final Theatre theatre) {
		// log.info("Request to Add theatre");
		theatreService.saveTheatre(theatre);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.POST)
	public ResponseEntity<Void> findAllTheatre(@RequestBody final Theatre theatre) {
		// log.info("Request to Add theatre");
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
