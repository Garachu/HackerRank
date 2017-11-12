package com.emailed.calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by meg on 8/2/17.
 */


public class Solution {

    static int year = 2015;
    static int month = 8;
    static int day = 5;

    public static void solution() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        calendar.set(year, month - 1, day);
        System.out.println("calendar.getTime(): " + calendar.getTime());

        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println(localDate.getDayOfWeek());



    }

}
