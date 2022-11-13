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

import com.obook.bookmymovie.model.Show;
import com.obook.bookmymovie.service.ShowService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@RestController
@RequestMapping("/show")
public class ShowController {

	@Autowired
	private ShowService showService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Void> saveTheatre(@RequestBody final Show show) {
		log.info("Show controller Started to save show: "+show);
		showService.saveShow(show);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}


}
