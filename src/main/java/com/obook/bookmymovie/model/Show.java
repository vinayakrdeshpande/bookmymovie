/**
 * 
 */
package com.obook.bookmymovie.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
@Table(name = "show")
public class Show {

    @Id
    @JsonProperty(access = Access.READ_ONLY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "showseq")
    @SequenceGenerator(name = "showseq", sequenceName = "show_seq", allocationSize = 1)
    private long show_id;

    private String movie;

    @DateTimeFormat(pattern = "${yyyy-MM-dd}")
    private Date releaseDate;
    
    @Value("00:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private String startTime;

    @Value("03:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private String endTime;

    private String language;

    private String genere;

    private int price;

}
