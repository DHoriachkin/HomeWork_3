package com.example.vntu.homework_3.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.DateTimeFormatter.ofPattern;

@Service
public class DateFormatConverter {
    public static final DateTimeFormatter upstreamPattern = ofPattern("MMMM dd, yyyy", Locale.UK);
    public static final DateTimeFormatter internalPattern = ofPattern("MM-dd-yyyy", Locale.UK);

    public String convertDate(String upstreamDate) {
        LocalDate localDate = LocalDate.from(upstreamPattern.parse(upstreamDate));
        return internalPattern.format(localDate);
    }
}
