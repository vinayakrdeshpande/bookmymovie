/**
 * 
 */
package com.obook.bookmymovie.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordersseq")
    @SequenceGenerator(name = "ordersseq", sequenceName = "orders_seq")
    private long order_id;

    private Timestamp bookedDate;

    private Double paid;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private Users users;

    @ManyToOne
    @JoinColumn(name = "theatreshow_id", referencedColumnName = "theatreshow_id", nullable = false)
    private TheatreShow theatreShow;

}
