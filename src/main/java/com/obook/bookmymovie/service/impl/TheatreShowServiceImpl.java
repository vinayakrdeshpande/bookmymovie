/**
 * 
 */
package com.obook.bookmymovie.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obook.bookmymovie.model.Show;
import com.obook.bookmymovie.model.Theatre;
import com.obook.bookmymovie.model.TheatreShow;
import com.obook.bookmymovie.repositories.ShowRepository;
import com.obook.bookmymovie.repositories.TheatreRepository;
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

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    ShowRepository showRepository;

    @Override
    public List<TheatreShow> searchShows(String city, String genere, String language) {
        List<TheatreShow> theatreShowLst = searcchImpl.getMovieToBook(city, genere, language);
        return theatreShowLst;
    }

    @Override
    public TheatreShow saveTheatreShow(final TheatreShow theatreShow) {
        TheatreShow theatreShowObj = theatreShowRepository.save(theatreShow);
        return theatreShowObj;
    }

    @Override
    public TheatreShow saveTheatreShow(Date theatreShowDate, long theatreid, long showid) {

        Theatre theatre = theatreRepository.findById(theatreid)
                .orElseThrow(() -> new IllegalArgumentException("Invalid theatre id"));
        Show show = showRepository.findById(showid)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Show id"));

        TheatreShow theatreShow = new TheatreShow();
        theatreShow.setShow(show);
        theatreShow.setTheatre(theatre);
        theatreShow.setTheatreShowDate(theatreShowDate);

        TheatreShow theatreShowObj = saveTheatreShow(theatreShow);
        return theatreShowObj;
    }

}
