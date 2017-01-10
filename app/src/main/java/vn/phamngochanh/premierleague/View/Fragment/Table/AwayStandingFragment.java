package vn.phamngochanh.premierleague.View.Fragment.Table;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Adapter.AdapterStandingAll;
import vn.phamngochanh.premierleague.View.Adapter.AdapterStandingAway;
import vn.phamngochanh.premierleague.View.Model.DataStanding;
import vn.phamngochanh.premierleague.View.Model.TeamStandingAll;
import vn.phamngochanh.premierleague.View.Model.TeamStandingAway;
import vn.phamngochanh.premierleague.View.Model.TeamStandingHome;

/**
 * Created by PhamNgocHanh on 1/10/17.
 */

public class AwayStandingFragment extends Fragment {
    RecyclerView recyclerView;
    AdapterStandingAway adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.standing_layout, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerStanding);

        List<TeamStandingAway> list = new ArrayList<>();
        list = new DataStanding().getDataAway();


        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        adapter = new AdapterStandingAway(getContext(), list);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }
}
