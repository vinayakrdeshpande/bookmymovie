package com.obook.bookmymovie.repositories.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.TheatreShow;

/**
 * @author vishr
 *
 */
@Repository
public class SearchTheatreShowRespImpl {

    @Autowired
    private EntityManager entityManager;

    public List<TheatreShow> getMovieToBook(String city, String genere, String language) {
        Map<String, Object> paramaterMap = new HashMap<String, Object>();
        List<String> whereCause = new ArrayList<String>();

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("select ts from TheatreShow ts ");

        if (city != null) {
            whereCause.add(" ts.theatre.city =:city ");
            paramaterMap.put("city", city.toUpperCase());
        }
        if (genere != null) {
            whereCause.add(" ts.show.genere =:genere ");
            paramaterMap.put("genere", genere.toUpperCase());
        }
        if (language != null) {
            whereCause.add(" ts.show.language =:language ");
            paramaterMap.put("language", language.toUpperCase());
        }

        if(!whereCause.isEmpty())
        queryBuilder.append(" where " + StringUtils.join(whereCause, " and "));
        
        TypedQuery<TheatreShow> jpaQuery = entityManager.createQuery(queryBuilder.toString(), TheatreShow.class);

        for (String key : paramaterMap.keySet()) {
            jpaQuery.setParameter(key, paramaterMap.get(key));
        }

        return jpaQuery.getResultList();
    }
}
