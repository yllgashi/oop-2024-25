package lecture104_what_is_interface;

public class Main {
    public static void main(String[] args) {
        FootballGame footballGame = new FootballGame();
        footballGame.setTeamOne("Barcelona");
        footballGame.setTeamTwo("Real Madrid");
        footballGame.setTeamOneScore(0);
        footballGame.setTeamTwoScore(0);

        // call interface methods
        footballGame.play();
        footballGame.pause();
        footballGame.setPlayerOne();
        footballGame.setPlayerTwo();

        BarbieGame barbieGame = new BarbieGame();
        barbieGame.setBarbieName("Rose");
        barbieGame.setClothes("Veshje kombetare");
        barbieGame.setType("Kukell");

        // call interface methods
        barbieGame.play();
        barbieGame.pause();

        ChessGame chessGame = new ChessGame();
        chessGame.setWhiteFigures(new String[]{"Ushtari1", "Ushtari2"});
        chessGame.setBlackFigures(new String[]{"Mbreti1", "Mbreteresha2"});

        // call interface methods
        chessGame.play();
        chessGame.pause();

    }
}
