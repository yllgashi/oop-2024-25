package lecture104_what_is_interface;

public class BarbieGame implements GameRules {
    private String barbieName;
    private String type;
    private String clothes;

    public String getBarbieName() {
        return barbieName;
    }

    public void setBarbieName(String barbieName) {
        this.barbieName = barbieName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public boolean isCompetitive() {
        return false;
    }

    @Override
    public boolean isMatchmaking() {
        return false;
    }

    @Override
    public boolean doesRequireInternetConnection() {
        return false;
    }

    @Override
    public boolean isMultiplayer() {
        return false;
    }

    @Override
    public void play() {
        System.out.println("Barbie there");
    }

    @Override
    public void pause() {
        System.out.println("Barbie game has ended");
    }
}
