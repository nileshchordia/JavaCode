package com.cryptohash.javaworklevel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * 1st way to implement interface
 */





public class DateValidatorUsingDateFormatter implements DateValidator {
    private String dateFormat;

    public DateValidatorUsingDateFormatter(String dateFormat) {
        this.dateFormat = dateFormat;
    }


    @Override
    public boolean isValid(String dateStr) {
        DateFormat dateFormat = new SimpleDateFormat(this.dateFormat);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
