/**
 * 
 */
package com.obook.bookmymovie.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long user_id;
    
    @NotNull
    private String name;
    
    @Email
    private String email;
    
    private String address;
    
    private String pincode;
    
    private String mobileNo;
        
    private String userType;
    
    @JsonIgnore
    private Timestamp createdDate;
}
