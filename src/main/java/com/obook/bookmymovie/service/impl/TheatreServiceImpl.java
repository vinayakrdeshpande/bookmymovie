/**
 * 
 */
package com.obook.bookmymovie.service.impl;

import java.util.HashMap;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.Validator;

import com.obook.bookmymovie.model.Theatre;
import com.obook.bookmymovie.repositories.TheatreRepository;
import com.obook.bookmymovie.service.TheatreService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@Service
public class TheatreServiceImpl implements TheatreService {

	@Autowired
	TheatreRepository theatreRepository;
	
	@Autowired
	Validator validator;
	
	@Override
	public Theatre saveTheatre(Theatre theatre) {

		MapBindingResult errors = new MapBindingResult(new HashMap<String,String>(), Map.class.getName());
		validator.validate(theatre, errors);
		if(errors.hasErrors()) {
			log.error(errors.toString());
			return null;
		}
		else {
			return theatreRepository.save(theatre);
		}
		
	}

}
