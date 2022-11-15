/**
 * 
 */
package com.obook.bookmymovie.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "showseq")
    @SequenceGenerator(name = "showseq", sequenceName = "show_seq")
    private long show_id;

    private String movie;

    private Timestamp startTime;

    private Timestamp endTime;

    private String language;

    private String genere;

    private int price;

}
