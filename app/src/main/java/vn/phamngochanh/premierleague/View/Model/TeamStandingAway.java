package vn.phamngochanh.premierleague.View.Model;

/**
 * Created by PhamNgocHanh on 1/10/17.
 */

public class TeamStandingAway {

    private String name;
    private int numberMatchAway;
    private int winAway;
    private int drawsAway;
    private int lostAway;
    private int scoreAway;
    private int concededAway;
    private int pointAway;

    public TeamStandingAway(String name, int numberMatchAway, int winAway, int drawsAway, int lostAway, int scoreAway, int concededAway, int pointAway) {
        this.name = name;
        this.numberMatchAway = numberMatchAway;
        this.winAway = winAway;
        this.drawsAway = drawsAway;
        this.lostAway = lostAway;
        this.scoreAway = scoreAway;
        this.concededAway = concededAway;
        this.pointAway = pointAway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberMatchAway() {
        return numberMatchAway;
    }

    public void setNumberMatchAway(int numberMatchAway) {
        this.numberMatchAway = numberMatchAway;
    }

    public int getWinAway() {
        return winAway;
    }

    public void setWinAway(int winAway) {
        this.winAway = winAway;
    }

    public int getLostAway() {
        return lostAway;
    }

    public void setLostAway(int lostAway) {
        this.lostAway = lostAway;
    }

    public int getDrawsAway() {
        return drawsAway;
    }

    public void setDrawsAway(int drawsAway) {
        this.drawsAway = drawsAway;
    }

    public int getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(int scoreAway) {
        this.scoreAway = scoreAway;
    }

    public int getConcededAway() {
        return concededAway;
    }

    public void setConcededAway(int concededAway) {
        this.concededAway = concededAway;
    }

    public int getPointAway() {
        return pointAway;
    }

    public void setPointAway(int pointAway) {
        this.pointAway = pointAway;
    }
}
