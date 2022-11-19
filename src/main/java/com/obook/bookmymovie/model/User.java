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
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @JsonProperty(access = Access.READ_ONLY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usersseq")
    @SequenceGenerator(name = "usersseq", sequenceName = "users_seq", allocationSize = 1)
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
