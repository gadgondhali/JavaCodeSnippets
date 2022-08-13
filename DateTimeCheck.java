package com.untitled;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateTimeCheck {

    private static LocalDate currentDate = LocalDate.now();
    private static LocalTime currentTime = LocalTime.now();
    private static LocalDateTime currentDateTime = LocalDateTime.now();

    public static void main(String[] args) {

        /**
         * Assigning Local Date
         */

        LocalDate dateNow = LocalDate.now();
        System.out.println("Date Now : "+ dateNow);
        LocalDate dateString = LocalDate.parse("2023-09-18");
        System.out.println("Date using String : "+ dateString);
        LocalDate dateStringFormat = LocalDate.parse("2025-11-02", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Date using String and Date formatting : "+ dateStringFormat);
        LocalDate dateOf = LocalDate.of(2027, 01, 31);
        System.out.println("Date using of method and Int values : "+ dateOf);
        LocalDate dateOf2 = LocalDate.of(2029, Month.NOVEMBER, 12);
        System.out.println("Date using of method and Month constant value : "+ dateOf2);



        System.out.println("Current Date : "+ currentDate);
        System.out.println("Is leap year : "+ currentDate.isLeapYear());
        LocalDate startDate = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Month Start date : "+ startDate);
        LocalDate endDate = currentDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Month End date : "+ endDate);
        //end date another approach
        LocalDate endDate1 = currentDate.withDayOfMonth(currentDate.getMonth().length(currentDate.isLeapYear()));
        System.out.println("Month End date : "+ endDate1);

        LocalDate febDate = LocalDate.parse("2024-02-02");
        System.out.println("Is leap year : "+ febDate.isLeapYear());
        System.out.println("FebDate : "+ febDate);
        LocalDate TempoEndDate = febDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("End date 1 : "+ TempoEndDate);

        LocalDate anydate = LocalDate.of(2021, 7, 14);


    }

}
