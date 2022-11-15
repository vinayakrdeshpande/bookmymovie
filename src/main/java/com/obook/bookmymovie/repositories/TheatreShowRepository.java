package com.obook.bookmymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.TheatreShow;

/**
 * This interface is for theatreandshow mapping for CRUD operations for same.
 * 
 * @author vishr
 *
 */
@Repository
public interface TheatreShowRepository extends JpaRepository<TheatreShow, Long> {

}
