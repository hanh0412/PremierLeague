package vn.phamngochanh.premierleague.View.Home.Fragment;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Home.Adapter.WeekRecyclerViewAdapter;
import vn.phamngochanh.premierleague.View.Home.Modal.Fixtures;
import vn.phamngochanh.premierleague.View.Home.Modal.FixturesData;


/**
 * Created by PhamNgocHanh on 1/12/17.
 */

public class WeekFragment extends Fragment {

    ArrayList<Fixtures> listFixtures;
    RecyclerView recyclerView;
    WeekRecyclerViewAdapter adapter;
    LinearLayoutManager manager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.week_layout, container, false);

        listFixtures = FixturesData.setDataFixture();
        recyclerView = (RecyclerView) view.findViewById(R.id.weekRecyclerView);
        adapter = new WeekRecyclerViewAdapter(getContext(), listFixtures);

        manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        return view;
    }
}