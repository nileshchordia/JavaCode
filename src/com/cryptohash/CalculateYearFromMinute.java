package com.cryptohash;

import java.util.Scanner;

public class CalculateYearFromMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minute = sc.nextInt();
        sc.close();
        int year=0;
        int day = minute/(1440);

        if(day>365){
             year=day/365;
        }
        day=day%365;
        System.out.println(day+" check");
        System.out.println(year+" years "+ day+" days. ");
//        System.out.println(day);
    }

}
