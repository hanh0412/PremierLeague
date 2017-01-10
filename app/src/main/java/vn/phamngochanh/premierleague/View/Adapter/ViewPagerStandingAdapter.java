package vn.phamngochanh.premierleague.View.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.View.Fragment.Home.FragmentHome;
import vn.phamngochanh.premierleague.View.Fragment.Table.AllStandingFragment;
import vn.phamngochanh.premierleague.View.Fragment.Table.AwayStandingFragment;
import vn.phamngochanh.premierleague.View.Fragment.Table.HomeStandingFragment;

/**
 * Created by PhamNgocHanh on 1/10/17.
 */

public class ViewPagerStandingAdapter extends FragmentPagerAdapter {

    List<Fragment> listFragment = new ArrayList<>();
    List<String> titleFragment = new ArrayList<>();
    public ViewPagerStandingAdapter(FragmentManager fm) {
        super(fm);

        listFragment.add(new AllStandingFragment());
        listFragment.add(new HomeStandingFragment());
        listFragment.add(new AwayStandingFragment());

        titleFragment.add("All");
        titleFragment.add("Home");
        titleFragment.add("Away");

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
        return titleFragment.get(position);
    }

}
