package lecture11_football_league;

import java.time.LocalDateTime;

public class Match {
    public int id;
    public String clubOne;
    public String clubTwo;
    public int clubOneScore;
    public int clubTwoScore;
    public LocalDateTime matchDateTime; // 13 mars ora 20:00
    public LocalDateTime matchStartDateTime; // per shkak te problemeve shtyhet per ne 21:00

    public void playMatch() {
        System.out.println("Match has started");
    }

    public boolean goToNextTime() {
        System.out.println("Next time has started...");
        return true;
    }
}
