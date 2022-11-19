/**
 * 
 */
package com.obook.bookmymovie.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
@Table(name = "show")
public class Orders {

    @Id
    @JsonProperty(access = Access.READ_ONLY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordersseq")
    @SequenceGenerator(name = "ordersseq", sequenceName = "orders_seq", allocationSize = 1)
    private long order_id;

    private Date movieDate;

    private Double paid;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User users;

    @ManyToOne
    @JoinColumn(name = "theatreshow_id", referencedColumnName = "theatreshow_id", nullable = false)
    private TheatreShow theatreShow;
    
    @JsonProperty(access = Access.READ_ONLY)
    private Timestamp bookedDate;

}
