package TddFibonacci.upvotesvsdownvotes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpVotesVsDownVotesTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenZero_returnZero(){
        UpVotesVsDownVotes upVotesVsDownVotes = new UpVotesVsDownVotes();
        int zero = upVotesVsDownVotes.findVotes(0,0);
        assertEquals(0,zero);
    }
    @Test
    public void givenNegativeNumber_returnNegativeNumber(){
        UpVotesVsDownVotes upVotesVsDownVotes = new UpVotesVsDownVotes();
        int minusOne = upVotesVsDownVotes.findVotes(-1,-1);
        assertEquals(0,minusOne);
    }
    @Test
    public void givenThirteenAndZero_returnZero(){
        UpVotesVsDownVotes upVotesVsDownVotes = new UpVotesVsDownVotes();
        int thirteenZero = upVotesVsDownVotes.findVotes(13,0);
        assertEquals(0,thirteenZero);
    }
    @Test
    public void givenTwoAndThirtyThree_returnMinusThirtyOne(){
        UpVotesVsDownVotes upVotesVsDownVotes = new UpVotesVsDownVotes();
        int twoAndThirtyThree = upVotesVsDownVotes.findVotes(2,33);
        assertEquals(-31,twoAndThirtyThree);
    }
    @Test
    public void givenThirteenAndThirteen_returnZero(){
        UpVotesVsDownVotes upVotesVsDownVotes = new UpVotesVsDownVotes();
        int thirteenAndThirteen = upVotesVsDownVotes.findVotes(13,13);
        assertEquals(0,thirteenAndThirteen);
    }
}
