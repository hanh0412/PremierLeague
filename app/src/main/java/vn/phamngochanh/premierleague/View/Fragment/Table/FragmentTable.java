package vn.phamngochanh.premierleague.View.Fragment.Table;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Adapter.ViewPagerStandingAdapter;

/**
 * Created by PhamNgocHanh on 1/8/17.
 */

public class FragmentTable extends Fragment {


    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.table_layout, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.tabStandinh);
        viewPager = (ViewPager) view.findViewById(R.id.viewPagerStanding);

        ViewPagerStandingAdapter adapter = new ViewPagerStandingAdapter(getFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
