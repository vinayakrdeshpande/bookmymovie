/**
 * 
 */
package com.obook.bookmymovie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private String address;

	private String city;

	private long pincode;

	private int seats;
}
