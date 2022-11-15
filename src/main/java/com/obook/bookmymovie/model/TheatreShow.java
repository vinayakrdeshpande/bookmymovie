/**
 * 
 */
package com.obook.bookmymovie.model;

import java.sql.Date;

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
public class TheatreShow {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "theatreshowseq")
    @SequenceGenerator(name = "theatreshowseq", sequenceName = "theatreshow_seq")
    private long theatreshow_id;

    private Date fromdate;

    private Date tillDate;

    @ManyToOne
    @JoinColumn(name = "theatre_id", referencedColumnName = "theatre_id", nullable = false)
    private Theatre theatre;

    @ManyToOne
    @JoinColumn(name = "show_id", referencedColumnName = "show_id", nullable = false)
    private Show show;
}
