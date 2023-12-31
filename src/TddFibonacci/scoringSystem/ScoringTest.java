package TddFibonacci.scoringSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ScoringTest {
    private Scoring scoring ;
    @BeforeEach
    public void setup() {
        scoring = new Scoring();
    }
    @Test
    public void nothing() {

    }
    @Test
    public void givenNull_returnAllZeros() {
        int[] score = scoring.calculateScore(null);
        assertArrayEquals(new int[3],score);
    }

    @Test
    public void givenEmpty_returnAllZeros() {
        int[] allZeros = scoring.calculateScore("");
        assertArrayEquals(new int[3],allZeros);
    }

    @Test
    public void givenA_returnOneZeroZero() {
        int[] onlyAScore = scoring.calculateScore("A");
        assertArrayEquals(new int[]{1,0,0},onlyAScore);
    }

    @Test
    public void givenB_returnZeroOneZero() {
        int[] onlyBScore = scoring.calculateScore("B");
        assertArrayEquals(new int[]{0,1,0},onlyBScore);
    }

    @Test
    public void givenC_returnZeroZeroOne() {
        int[] onlyCScore = scoring.calculateScore("C");
        assertArrayEquals(new int[]{0,0,1},onlyCScore);
    }

    @Test
    public void givenAB_returnOneOneZero() {
        int[] onlyABScore = scoring.calculateScore("AB");
        assertArrayEquals(new int[]{1,1,0},onlyABScore);
    }

    @Test
    public void givenABC_returnOneOneOne() {
        int[] abcScore = scoring.calculateScore("ABC");
        assertArrayEquals(new int[]{1,1,1},abcScore);
    }

    @Test
    public void givenAABC_returnTwoOneOne() {
        int[] aabcScore = scoring.calculateScore("AABC");
        assertArrayEquals(new int[]{2,1,1},aabcScore);
    }
    @Test
    public void givenABBC_returnOneTwoOne() {
        int[] abbcScore = scoring.calculateScore("ABBC");
        assertArrayEquals(new int[]{1,2,1},abbcScore);
    }
    @Test
    public void givenABCC_returnOneOneTwo() {
        int[] abccScore = scoring.calculateScore("ABCC");
        assertArrayEquals(new int[]{1,1,2},abccScore);
    }

    @Test
    public void givenABBACCCCAC_returnThreeTwoFive() {
        int[] abbaccccacScore = scoring.calculateScore("ABBACCCCAC");
        assertArrayEquals(new int[]{3,2,5},abbaccccacScore);
    }
}
