package org.example;

import java.util.Date;



public class LeapYear {
    public static boolean isLeapYear(int year) {
        //1) 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
        //2) 400으로 나누어 떨어지면 윤년
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
