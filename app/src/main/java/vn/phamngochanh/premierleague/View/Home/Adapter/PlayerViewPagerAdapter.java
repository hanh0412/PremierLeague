package vn.phamngochanh.premierleague.View.Home.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.View.Home.Fragment.ListPlayerFragment;

/**
 * Created by PhamNgocHanh on 1/13/17.
 */

public class PlayerViewPagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> listFragment = new ArrayList<>();
    List<String> listTitle = new ArrayList<>();

    public PlayerViewPagerAdapter(FragmentManager fm) {
        super(fm);

        for (int i = 0; i < 20; i++){
            listFragment.add(new ListPlayerFragment());
            listTitle.add(""+i);
        }
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position);
    }
}
