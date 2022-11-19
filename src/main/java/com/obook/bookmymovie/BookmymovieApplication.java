package com.obook.bookmymovie;

import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BookmymovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmymovieApplication.class, args);
    }

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        log.debug("Spring boot application running in UTC timezone :" + new Date());
    }
}
