/**
 * 
 */
package com.obook.bookmymovie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

/**
 * Assumption at present no multiplex theatre is allowed. so 4 shows per day.
 * 
 * @author vishr
 */

@Data
@Entity
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "theatreseq")
    @SequenceGenerator(name = "theatreseq", sequenceName = "theatre_seq")
    private long theatre_id;

    private String name;

    private String address;

    private String state;

    private String city;

    private long pincode;

    private int seats;
}
