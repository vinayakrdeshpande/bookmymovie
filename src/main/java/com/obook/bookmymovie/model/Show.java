/**
 * 
 */
package com.obook.bookmymovie.model;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
public class Show {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long show_id;

	private String movie;
	
	private Timestamp startTime;

	private Timestamp endTime;

	private String language;
	
	private String genere;
	
	private int price;

}
