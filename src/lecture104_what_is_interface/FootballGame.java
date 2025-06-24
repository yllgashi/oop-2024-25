package lecture104_what_is_interface;

public class FootballGame implements GameRules, MatchmakingGame {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public int getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(int teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public int getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(int teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }

    public boolean isCompetitive() {
        return false;
    }

    @Override
    public boolean isMatchmaking() {
        return true;
    }

    @Override
    public boolean doesRequireInternetConnection() {
        return false;
    }

    @Override
    public boolean isMultiplayer() {
        return true;
    }

    @Override
    public void play() {
        System.out.println("Welcome to Football Game");
    }

    @Override
    public void pause() {
        System.out.println("Game over");
    }

    @Override
    public void setPlayerOne() {

    }

    @Override
    public void setPlayerTwo() {

    }
}
