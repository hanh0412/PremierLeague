package vn.phamngochanh.premierleague.View.Model;

/**
 * Created by PhamNgocHanh on 1/10/17.
 */

public class TeamStandingAll {

    private String name;
    private int numberMatchAll;
    private int winAll;
    private int drawsAll;
    private int lostAll;
    private int scoreAll;
    private int concededAll;
    private int pointAll;

    public TeamStandingAll(String name, int numberMatchAll,int winAll, int drawsAll, int lostAll, int scoreAll, int concededAll, int pointAll) {
        this.winAll = winAll;
        this.name = name;
        this.numberMatchAll = numberMatchAll;
        this.drawsAll = drawsAll;
        this.lostAll = lostAll;
        this.scoreAll = scoreAll;
        this.concededAll = concededAll;
        this.pointAll = pointAll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberMatchAll() {
        return numberMatchAll;
    }

    public void setNumberMatchAll(int numberMatchAll) {
        this.numberMatchAll = numberMatchAll;
    }

    public int getWinAll() {
        return winAll;
    }

    public void setWinAll(int winAll) {
        this.winAll = winAll;
    }

    public int getDrawsAll() {
        return drawsAll;
    }

    public void setDrawsAll(int drawsAll) {
        this.drawsAll = drawsAll;
    }

    public int getLostAll() {
        return lostAll;
    }

    public void setLostAll(int lostAll) {
        this.lostAll = lostAll;
    }

    public int getScoreAll() {
        return scoreAll;
    }

    public void setScoreAll(int scoreAll) {
        this.scoreAll = scoreAll;
    }

    public int getConcededAll() {
        return concededAll;
    }

    public void setConcededAll(int concededAll) {
        this.concededAll = concededAll;
    }

    public int getPointAll() {
        return pointAll;
    }

    public void setPointAll(int pointAll) {
        this.pointAll = pointAll;
    }
}
