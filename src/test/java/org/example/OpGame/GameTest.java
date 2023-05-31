package org.example.OpGame;

import org.example.OpGame.Service.OpGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void test(){
        OpGame game = new OpGame();
        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한 번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));
    }
}