package com.cryptohash.javaworklevel;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

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
            }catch (Exception e){
                return false;
            }
        };


        System.out.println(dateValidator.isValid("2019-07-10"));

    }


}
