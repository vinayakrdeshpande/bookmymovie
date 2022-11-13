/**
 * 
 */
package com.obook.bookmymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.Show;

/**
 * @author vishr
 *
 */
@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

}
