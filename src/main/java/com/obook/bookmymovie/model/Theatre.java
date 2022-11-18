/**
 * 
 */
package com.obook.bookmymovie.model;

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

    private String name;

    private String address;

    private String state;

    private String city;

    private long pincode;

    private int seats;
}
