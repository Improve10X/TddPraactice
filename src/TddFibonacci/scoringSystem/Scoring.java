package TddFibonacci.scoringSystem;

public class Scoring {
    public int[] calculateScore(String Score) {
        int[] scores = new int[3];
        if (Score != null) {
            for (int i=0; i<Score.length(); i++) {
                char c = Score.charAt(i);
                if (c== 'A') {
                    scores[0]++;
                } else if (c == 'B') {
                    scores[1]++;
                } else if (c== 'C') {
                    scores[2]++;
                }
            }
        }
        return scores;
    }
}
