package com.obook.bookmymovie.service;

import java.sql.Date;
import java.util.List;

import com.obook.bookmymovie.model.TheatreShow;

public interface TheatreShowService {

    TheatreShow saveTheatreShow(final TheatreShow theatreShow);

    List<TheatreShow> searchShows(final String city, final String genere, final String language);

    /**
     * @param theatreShowDate
     * @param theatreid
     * @param showid
     * @return
     */
    TheatreShow saveTheatreShow(Date theatreShowDate, long theatreid, long showid);
}
