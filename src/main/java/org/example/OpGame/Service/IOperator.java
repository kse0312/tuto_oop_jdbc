package org.example.OpGame.Service;

public interface IOperator {
    void setA(int a);
    void setB(int b);
    void generateQuestion(int max);
    String getQuestionMsg();
    boolean isEqueals(int answer);
}

