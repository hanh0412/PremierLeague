package vn.phamngochanh.premierleague.View.Home.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.View.Home.Fragment.WeekFragment;

/**
 * Created by PhamNgocHanh on 1/11/17.
 */

public class FixtureViewPagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> listFragment = new ArrayList<>();
    List<String> listTitle = new ArrayList<>();

    public FixtureViewPagerAdapter(FragmentManager fm) {
        super(fm);

        for (int i = 0; i < 38; i++){
            listFragment.add(new WeekFragment());
            listTitle.add("week" + i);
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
