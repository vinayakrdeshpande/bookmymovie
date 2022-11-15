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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
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
