/**
 * 
 */
package com.obook.bookmymovie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obook.bookmymovie.model.TheatreShow;
import com.obook.bookmymovie.repositories.TheatreShowRepository;
import com.obook.bookmymovie.repositories.impl.SearchTheatreShowRespImpl;
import com.obook.bookmymovie.service.TheatreShowService;

/**
 * @author vishr
 *
 */
@Service
public class TheatreShowServiceImpl implements TheatreShowService {

    @Autowired
    TheatreShowRepository theatreShowRepository;

    @Autowired
    SearchTheatreShowRespImpl searcchImpl;

    @Override
    public void saveTheatreShow(TheatreShow theatreShow) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<TheatreShow> searchShows(String city, String genere, String language) {
        List<TheatreShow> theatreShowLst = searcchImpl.getMovieToBook(city, genere, language);
        return theatreShowLst;
    }

}
