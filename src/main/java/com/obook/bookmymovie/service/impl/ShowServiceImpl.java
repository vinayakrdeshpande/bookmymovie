/**
 * 
 */
package com.obook.bookmymovie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obook.bookmymovie.model.Show;
import com.obook.bookmymovie.repositories.ShowRepository;
import com.obook.bookmymovie.service.ShowService;

/**
 * @author vishr
 *
 */
@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    ShowRepository showRepository;

    @Override
    public Show saveShow(Show show) {
        Show showObj = showRepository.save(show);
        return showObj;
    }

}
