/**
 * 
 */
package com.obook.bookmymovie.service;

import java.sql.Date;

import com.obook.bookmymovie.model.Orders;

/**
 * @author vishr
 *
 */
public interface OrdersService {

    Orders saveOrder(Orders order);

    /**
     * @param movieDate
     * @param theatreshowid
     * @param userid
     * @param paid
     * @return
     */
    Orders saveOrder(Date movieDate, long theatreshowid, long userid, double paid);
}
