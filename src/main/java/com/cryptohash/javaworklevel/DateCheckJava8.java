package com.cryptohash.javaworklevel;

import org.apache.commons.validator.GenericValidator;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.format.ResolverStyle;
import java.util.Locale;

/**
 * Java 8 DateValid
 */


public class DateCheckJava8 {


    public static void main(String[] args) {

        DateValidator dateValidator = dateStr -> {
            String pattern = "yyyy-MM-dd";
            DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(pattern);
            try {
                LocalDate.parse(dateStr, dateTimeFormatter);
                return true;
            } catch (Exception e) {
                return false;
            }
        };


        System.out.println(dateValidator.isValid("2019-07-10"));

        DateValidator validator = dateStr -> {
            java.time.format.DateTimeFormatter dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US)
                    .withResolverStyle(ResolverStyle.LENIENT);

            try {
                dateTimeFormatter.parse(dateStr);
                return true;
            } catch (Exception e) {
                return false;
            }


        };

        System.out.println(validator.isValid("2019-09-20"));
        System.out.println(GenericValidator.isDate("2019-09-12", "yyyy-MM-dd", true));
        System.out.println(GenericValidator.isBlankOrNull(""));
        System.out.println(GenericValidator.isBlankOrNull(null));
        System.out.println(GenericValidator.isBlankOrNull("nilesh"));


    }


}
