/**
 * 
 */
package com.obook.bookmymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.Theatre;

/**
 * @author vishr
 *
 */
@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {

}
