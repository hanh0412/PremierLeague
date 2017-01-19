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
import vn.phamngochanh.premierleague.View.Home.Adapter.PlayerViewPagerAdapter;

/**
 * Created by PhamNgocHanh on 1/11/17.
 */

public class PlayerFragment extends Fragment {

    TabLayout tlPlayer;
    ViewPager vpPlayer;
    PlayerViewPagerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.player_layout, container, false);

        tlPlayer = (TabLayout) view.findViewById(R.id.tlPlayer);
        vpPlayer = (ViewPager) view.findViewById(R.id.vpPlayer);

        FragmentManager manager = getFragmentManager();
        adapter = new PlayerViewPagerAdapter(manager);
        vpPlayer.setAdapter(adapter);
        tlPlayer.setupWithViewPager(vpPlayer);
        return view;
    }
}
