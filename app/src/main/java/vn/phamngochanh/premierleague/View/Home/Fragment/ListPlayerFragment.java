package vn.phamngochanh.premierleague.View.Home.Fragment;

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
import vn.phamngochanh.premierleague.View.Home.Adapter.PlayerRecyclerViewAdapter;
import vn.phamngochanh.premierleague.View.Home.Modal.Player;
import vn.phamngochanh.premierleague.View.Home.Modal.PlayerData;

/**
 * Created by PhamNgocHanh on 1/13/17.
 */

public class ListPlayerFragment extends Fragment {

    ArrayList<Player> listPlayer;
    RecyclerView recyclerView;
    PlayerRecyclerViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listplayers_team, container, false);

        listPlayer = PlayerData.setDataPlayer();
        recyclerView = (RecyclerView) view.findViewById(R.id.listPlayer);
        adapter = new PlayerRecyclerViewAdapter(getContext(), listPlayer);


        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        return view;
    }
}
