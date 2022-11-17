package com.obook.bookmymovie.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.TheatreShow;

/**
 * @author vishr
 *
 */
@Repository
public class SearchTheatreShowRespImpl {

    EntityManager enityManager;

    public List<TheatreShow> getMovieToBook(String city, String genere, String language) {
        CriteriaBuilder cb = enityManager.getCriteriaBuilder();
        CriteriaQuery<TheatreShow> cq = cb.createQuery(TheatreShow.class);

        Root<TheatreShow> theatreRoot = cq.from(TheatreShow.class);
        List<Predicate> predicates = new ArrayList<>();

        if (city != null) {
            predicates.add(cb.equal(theatreRoot.get("city"), city));
        }
        if (genere != null) {
            predicates.add(cb.equal(theatreRoot.get("genere"), genere));
        }
        if (language != null) {
            predicates.add(cb.equal(theatreRoot.get("language"), language));
        }
        cq.where(predicates.toArray(new Predicate[0]));

        return enityManager.createQuery(cq).getResultList();
    }
}
