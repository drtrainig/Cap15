package com.itfactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args)
    {
        LocalDate time = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        System.out.println(time.format(dateTimeFormatter));

        LocalDate time1 = time.minusDays(7);

        System.out.println(time);
        System.out.println(time1);

        System.out.println(time1.isAfter(time));


        // 2022-01-12T19:11:20.683680
        // 2022/01/12 19:19
    }
}
