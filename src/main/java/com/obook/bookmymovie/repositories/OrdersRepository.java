package com.obook.bookmymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obook.bookmymovie.model.Orders;

/**
 * This interface is for CRUD operations for movies that are booked.
 * 
 * @author vishr
 *
 */
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
