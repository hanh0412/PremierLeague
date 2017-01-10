package vn.phamngochanh.premierleague.View.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PhamNgocHanh on 1/10/17.
 */

public class DataStanding {

    public List<TeamStandingAll> getDataAll(){
        List<TeamStandingAll> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add(new TeamStandingAll("ad", i, i, i, i, i, i, i));
        }
        return list;
    }

    public List<TeamStandingAway> getDataAway(){
        List<TeamStandingAway> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add(new TeamStandingAway("ad", i, i, i, i, i, i, i));
        }
        return list;
    }

    public List<TeamStandingHome> getDataHome(){
        List<TeamStandingHome> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add(new TeamStandingHome("ad", i, i, i, i, i, i, i));
        }
        return list;
    }

}
