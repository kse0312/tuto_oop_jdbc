package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LeapYearTest {


    //@Test
    @org.junit.jupiter.api.Test
    void isLeapYear() {
        //테스트 결과 조정 -> assertEquals(내가 원하는 반환값, 실행 함수(내용));
        assertEquals(false, LeapYear.isLeapYear(1700));
        //== assertFalse(LeapYear.isLeapYear(1700));
    }
}