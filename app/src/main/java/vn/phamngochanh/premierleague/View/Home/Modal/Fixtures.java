package vn.phamngochanh.premierleague.View.Home.Modal;

import android.graphics.Bitmap;

/**
 * Created by PhamNgocHanh on 1/11/17.
 */

public class Fixtures {
    private String home;
    private String away;
    private int goalHome;
    private int goalAway;
    private String date;
    private String status;

    public Fixtures(String home, String away, int goalHome, int goalAway, String date, String status) {
        this.home = home;
        this.away = away;
        this.goalHome = goalHome;
        this.goalAway = goalAway;
        this.date = date;
        this.status = status;
    }

    public int getGoalHome() {
        return goalHome;
    }

    public void setGoalHome(int goalHome) {
        this.goalHome = goalHome;
    }

    public int getGoalAway() {
        return goalAway;
    }

    public void setGoalAway(int goalAway) {
        this.goalAway = goalAway;
    }



    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
