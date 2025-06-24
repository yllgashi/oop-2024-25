package lecture104_what_is_interface;

public interface GameRules {
    public boolean isCompetitive();
    public boolean isMatchmaking();
    public boolean doesRequireInternetConnection();
    public boolean isMultiplayer();
    public void play();
    public void pause();
}
