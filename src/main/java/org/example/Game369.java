package org.example;

public class Game369 {

    public static void playGameRecall(int end){
        for (int i = 0; i <= end ; i++) {
            System.out.printf("%02d%s\n", i, "*".repeat(returnIncludeThree(i)));
        }
    }
    public static void playGameWhile(int end){
        for (int i = 0; i <= end ; i++) {
            System.out.printf("%02d%s\n", i, "*".repeat(countIncludeThree(i)));
        }
    }
    private static int returnIncludeThree(int i) {
        int count = (i%10 != 0 && i%10 % 3 == 0) ? 1 : 0;
        if(i==0){
            return 0;
        }
        return count + returnIncludeThree(i/10);
    }

    private static int countIncludeThree(int i) {
        int count = 0;
        while (i>0){
            count += i%10 != 0 && i%10 % 3 == 0 ? 1 : 0;
            i/=10;
        }
        return count;
    }
}
