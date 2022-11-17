/**
 * 
 */
package com.obook.bookmymovie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonParseException;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ IllegalArgumentException.class, JsonParseException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Error processBadRequest(Exception ex) {
        log.error("Mapping error for {}:{}", new Object[]{ex.getMessage(), ex});
        Error err = new Error();
        err.setCategory("VALIDATION");
        err.setDescription(ex.getMessage());
        err.setMessage("INVALID REQUEST");
        err.setErrorCode(400);
        return err;
    }

}
