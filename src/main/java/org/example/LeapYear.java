package org.example;

import java.util.Date;



public class LeapYear {
    public static void main(String[] args) {
        int[] years = {1700, 2016, 2020, 1900, 2400, 2100, 2019};

        for(int yy : years) isLeapYear(yy);
    }

    private static void isLeapYear(int year) {
        //윤년을 알아맞추기
        //1700, 2016, 2020, 1900, 2400, 2100, 2019
        //1700 X
        //2020 0
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.printf("%d년은 윤년입니다.\n", year);
        else
            System.out.printf("%d년은 평년입니다.\n", year);
    }
}
