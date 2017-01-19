package vn.phamngochanh.premierleague.View.Home.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Home.Adapter.FixtureViewPagerAdapter;

/**
 * Created by PhamNgocHanh on 1/11/17.
 */

public class FixturesFragment extends Fragment {
    TabLayout tlFixture;
    ViewPager vpFixrute;
    FixtureViewPagerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fixtures_layout, container, false);

        tlFixture = (TabLayout) view.findViewById(R.id.tabLayoutFixture);
        vpFixrute = (ViewPager) view.findViewById(R.id.viewPagerFixture);

        FragmentManager manager = getFragmentManager();
        adapter = new FixtureViewPagerAdapter(manager);
        vpFixrute.setAdapter(adapter);
        tlFixture.setupWithViewPager(vpFixrute);
        return view;
    }
}
