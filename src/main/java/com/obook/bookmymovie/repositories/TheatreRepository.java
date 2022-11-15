package com.obook.bookmymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.Theatre;

/**
 * This interface is for CRUD operations for Theatre shows will be added and
 * mapping will be done seperately.
 * 
 * @author vishr
 *
 */
@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {

}
