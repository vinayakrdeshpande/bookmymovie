package com.obook.bookmymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.User;

/**
 * This is basic user interface for adding users those are responsible for
 * bookings.
 * 
 * @author vishr
 *
 */
@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

}
