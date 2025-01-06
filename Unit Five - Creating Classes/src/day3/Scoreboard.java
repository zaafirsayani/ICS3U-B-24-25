package day3;

public class Scoreboard {

    private String teamName1;
    private String teamName2;
    private int score1;
    private int score2;
    private boolean active;

    public Scoreboard(String teamName1, String teamName2) {
        this.teamName1 = teamName1;
        this.teamName2 = teamName2;
        score1 = 0;
        score2 = 0;
        active = true;

    }

    public void recordPlay(int pointsScored) {
        if (pointsScored == 0) {
            active = !active;
            {
                if (active)
                    score1 += pointsScored;
                else
                    score2 += pointsScored;

            }
        }

    }
}
