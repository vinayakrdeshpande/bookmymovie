
package com.obook.bookmymovie.config;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author vishr
 *
 */
@Component
public class StringToDateSQLConverter implements Converter<String, java.sql.Date> {

    @Value("${spring.mvc.format.date}")
    private String PATTERN;

    @Override
    public Date convert(String source) {

        try {
            java.util.Date date = new SimpleDateFormat(PATTERN).parse(source);
            Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date it should be in " + PATTERN);
        }
    }
}
