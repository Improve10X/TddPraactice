package TddFibonacci.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void nothing() {

    }
    @Test
    public void canRoll(){
        Game game = new Game();
        game.roll(1);
    }
    @Test
    public void gutterGame(){
        Game game = new Game();
        for (int i= 0; i<20; i++){
            game.roll(0);
        }
        assertEquals(0,game.score());
    }
}
