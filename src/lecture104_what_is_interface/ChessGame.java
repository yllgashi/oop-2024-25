package lecture104_what_is_interface;

public class ChessGame implements GameRules, MatchmakingGame {
    private String[] whiteFigures;
    private String[] blackFigures;

    public String[] getWhiteFigures() {
        return whiteFigures;
    }

    public void setWhiteFigures(String[] whiteFigures) {
        this.whiteFigures = whiteFigures;
    }

    public String[] getBlackFigures() {
        return blackFigures;
    }

    public void setBlackFigures(String[] blackFigures) {
        this.blackFigures = blackFigures;
    }

    @Override
    public boolean isCompetitive() {
        return true;
    }

    @Override
    public boolean isMatchmaking() {
        return true;
    }

    @Override
    public boolean doesRequireInternetConnection() {
        return true;
    }

    @Override
    public boolean isMultiplayer() {
        return true;
    }

    @Override
    public void play() {
        System.out.println("I'm playing Chess Game");
    }

    @Override
    public void pause() {
        System.out.println("Check mate");
    }

    @Override
    public void setPlayerOne() {

    }

    @Override
    public void setPlayerTwo() {

    }
}
