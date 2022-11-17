package com.obook.bookmymovie.service;

import java.util.List;

import com.obook.bookmymovie.model.TheatreShow;

public interface TheatreShowService {

    void saveTheatreShow(final TheatreShow theatreShow);

    List<TheatreShow> searchShows(final String city, final String genere, final String language);
}
