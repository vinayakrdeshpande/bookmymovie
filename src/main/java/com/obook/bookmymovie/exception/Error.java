/**
 * 
 */
package com.obook.bookmymovie.exception;

import lombok.Data;

/**
 * @author vishr
 *
 */
@Data
public class Error {

    private String message;
    private int errorCode;
    private String description;
    private String category;

}
