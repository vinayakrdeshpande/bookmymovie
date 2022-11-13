/**
 * 
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
@RequestMapping("/theatreShow")
public class TheatreShowController {

	@Autowired
	TheatreService theatreService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Void> saveTheatre(@RequestBody final Theatre theatre) {
		log.info("Request to Add theatre :"+theatre);
		theatreService.saveTheatre(theatre);
		log.info("Request added");
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
