package com.cryptohash.javaworklevel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * for JAVA 7
 */

public class DateCheck {
    public static void main(String[] args) {
        DateValidatorUsingDateFormatter dateValidatorUsingDateFormatter = new DateValidatorUsingDateFormatter("yyyy-MM-dd");
        System.out.println(dateValidatorUsingDateFormatter.isValid("2019-08-15"));


        /**
         * 2nd way implement interface
         */
        DateValidator dateValidator = new DateValidator() {
            @Override
            public boolean isValid(String dateStr) {
                String pattern;
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                try {
                    dateFormat.parse(dateStr);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return false;
                }
                return true;
            }
        };

        System.out.println(dateValidator.isValid("2019/08/20"));


        /**
         * 3rd way implement interface
         */
        DateValidator validator = s -> {
            String pattern = "dd-MM-yyyy";
            DateFormat dateFormat = new SimpleDateFormat(pattern);
            try {
                dateFormat.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        };

        System.out.println(validator.isValid("12-12-2014"));


    }
}
