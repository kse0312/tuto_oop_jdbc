package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public static boolean isPrime(int number){
        for (int i = 2; i < number/2 ; i++) {
            if(isMeasure(number,i)) return false;
        }
        return true;
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for (int i = 1; i <= number/2 ; i++) {
            if(isMeasure(number,i)) sum += i;
        }
        return sum == number;
    }

    public static int[] findMeasureList(int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number/2; i++) {
            if(isMeasure(number, i)) result.add(i);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isMeasure(int number, int temp){
        return number % temp == 0;
    }
}
