package vn.phamngochanh.premierleague.View.Home.Modal;

/**
 * Created by PhamNgocHanh on 1/13/17.
 */

public class Player {
    private String namePlayer;
    private int numberPlayer;
    private String position;
    private String national;
    private String dayOfBirth;
    private int valueOfMarket;

    public Player(String namePlayer, int numberPlayer, String position, String national, String dayOfBirth, int valueOfMarket) {
        this.namePlayer = namePlayer;
        this.numberPlayer = numberPlayer;
        this.position = position;
        this.national = national;
        this.dayOfBirth = dayOfBirth;
        this.valueOfMarket = valueOfMarket;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(int numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getValueOfMarket() {
        return valueOfMarket;
    }

    public void setValueOfMarket(int valueOfMarket) {
        this.valueOfMarket = valueOfMarket;
    }
}
