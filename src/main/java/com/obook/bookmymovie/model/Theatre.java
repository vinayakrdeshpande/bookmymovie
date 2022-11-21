/**
 * 
 */
package com.obook.bookmymovie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

/**
 * Assumption at present no multiplex theatre is allowed. so 4 shows per day.
 * 
 * @author vishr
 */

@Data
@Entity
@Table(name = "theatre")
public class Theatre {

    @Id
    @JsonProperty(access = Access.READ_ONLY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "theatreseq")
    @SequenceGenerator(name = "theatreseq", sequenceName = "theatre_seq", allocationSize = 1)
    private long theatre_id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "pincode", length = 6)
    private long pincode;

    @Column(name = "seats")
    private int seats;
}
