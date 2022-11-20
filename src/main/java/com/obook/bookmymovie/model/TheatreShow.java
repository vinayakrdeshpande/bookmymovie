/**
 * 
 */
package com.obook.bookmymovie.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
@Table(name = "theatreshow")
public class TheatreShow {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "theatreshowseq")
    @SequenceGenerator(name = "theatreshowseq", sequenceName = "theatreshow_seq", allocationSize = 1)
    private long theatreshow_id;
    
    /**
     * This will tell which date show will be displayed in theatre.
     */
    @DateTimeFormat(pattern = "${yyyy-MM-dd}")
    @Column(name="theatreshowdate")
    private Date theatreShowDate;

    @ManyToOne
    @JoinColumn(name = "theatre_id", referencedColumnName = "theatre_id", nullable = false)
    private Theatre theatre;

    @ManyToOne
    @JoinColumn(name = "show_id", referencedColumnName = "show_id", nullable = false)
    private Show show;
}
