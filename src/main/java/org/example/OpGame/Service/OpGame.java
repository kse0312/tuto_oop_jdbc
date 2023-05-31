package org.example.OpGame.Service;

public class OpGame {
    int remainingAnswers;
    int val1, val2;
    public void makeQuestion() {
        remainingAnswers = 3;
        val1 = 1;
        val2 = 1;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
        return val1 + val2 == answer;
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public String getQuestion() {
        return String.format("%d + %d = ", val1, val2);
    }

    public String getCheeringUpMsg() {
        return "한 번 더 해보자";
    }
}
