package vn.phamngochanh.premierleague.View.Model;

/**
 * Created by PhamNgocHanh on 1/10/17.
 */

public class TeamStandingHome {

    private String name;
    private int numberMatchHome;
    private int winHome;
    private int drawsHome;
    private int lostHome;
    private int scoreHome;
    private int concededHome;
    private int pointHome;

    public TeamStandingHome(String name, int numberMatchHome, int winHome, int drawsHome, int lostHome, int scoreHome, int concededHome, int pointHome) {
        this.name = name;
        this.numberMatchHome = numberMatchHome;
        this.winHome = winHome;
        this.drawsHome = drawsHome;
        this.lostHome = lostHome;
        this.scoreHome = scoreHome;
        this.concededHome = concededHome;
        this.pointHome = pointHome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberMatchHome() {
        return numberMatchHome;
    }

    public void setNumberMatchHome(int numberMatchHome) {
        this.numberMatchHome = numberMatchHome;
    }

    public int getWinHome() {
        return winHome;
    }

    public void setWinHome(int winHome) {
        this.winHome = winHome;
    }

    public int getDrawsHome() {
        return drawsHome;
    }

    public void setDrawsHome(int drawsHome) {
        this.drawsHome = drawsHome;
    }

    public int getLostHome() {
        return lostHome;
    }

    public void setLostHome(int lostHome) {
        this.lostHome = lostHome;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getConcededHome() {
        return concededHome;
    }

    public void setConcededHome(int concededHome) {
        this.concededHome = concededHome;
    }

    public int getPointHome() {
        return pointHome;
    }

    public void setPointHome(int pointHome) {
        this.pointHome = pointHome;
    }
}
