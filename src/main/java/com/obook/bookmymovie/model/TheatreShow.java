/**
 * 
 */
package com.obook.bookmymovie.model;

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
public class TheatreShow {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "theatre_id", referencedColumnName = "id", nullable = false)
	private Theatre theatre;

	@ManyToOne
	@JoinColumn(name = "show_id", referencedColumnName = "id", nullable = false)
	private Show show;
}
