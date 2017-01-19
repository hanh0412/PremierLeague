package vn.phamngochanh.premierleague.View.Home.Modal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PhamNgocHanh on 1/16/17.
 */

public class FixturesData {
    private static ArrayList<Fixtures> listFixtures;

    public static ArrayList<Fixtures> setDataFixture(){
        listFixtures = new ArrayList<Fixtures>();
        for (int i = 0; i < 10; i++){
            listFixtures.add(new Fixtures("Manchester United " + i, "Hull City" + i, 3, 1, "20-12-2016", "finish"));
        }
        return listFixtures;
    }
}
