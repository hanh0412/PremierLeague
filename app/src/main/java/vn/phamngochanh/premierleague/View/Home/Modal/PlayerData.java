package vn.phamngochanh.premierleague.View.Home.Modal;

import java.util.ArrayList;

/**
 * Created by PhamNgocHanh on 1/13/17.
 */

public class PlayerData {

    private static ArrayList<Player> listPlayer;
    public static ArrayList<Player> setDataPlayer(){
        listPlayer = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            listPlayer.add(new Player("Pham Ngoc Hanh", i, "GK", "VietNam", "04-12-1994", i));
        }
        return listPlayer;
    }
}
