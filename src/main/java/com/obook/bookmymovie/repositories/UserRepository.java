/**
 * 
 */
package com.obook.bookmymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obook.bookmymovie.model.User;

/**
 * @author vishr
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
