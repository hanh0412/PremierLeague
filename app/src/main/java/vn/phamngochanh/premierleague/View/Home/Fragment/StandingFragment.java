package vn.phamngochanh.premierleague.View.Home.Fragment;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
import vn.phamngochanh.premierleague.View.Home.Adapter.StandingRecyclerViewAdapter;
import vn.phamngochanh.premierleague.View.Home.Modal.Standing;

/**
 * Created by PhamNgocHanh on 1/11/17.
 */

public class StandingFragment extends Fragment {

    public static final int CONNECTION_TIMEOUT = 10000;
    public static final int READ_TIMEOUT = 15000;
    StringBuilder result;
    RecyclerView recyclerView;
    StandingRecyclerViewAdapter adapter;
    String url = "http://api.football-data.org/v1/soccerseasons/426/leagueTable";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.standing_layout, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerStanding);
        GetData getData = new GetData();
        getData.execute(url);

        return view;
    }

    private class GetData extends AsyncTask<String, Void, String> {
        ProgressDialog pdLoading = new ProgressDialog(getContext());

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            pdLoading.setMessage("\tLoading...");
            pdLoading.setCancelable(false);
            pdLoading.show();

        }

        @Override
        protected String doInBackground(String... params) {
            try {
                URL url = new URL(params[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setReadTimeout(READ_TIMEOUT);
                connection.setConnectTimeout(CONNECTION_TIMEOUT);
                connection.connect();

                InputStream inputStream = connection.getInputStream();
                InputStreamReader reader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(reader);
                result = new StringBuilder();
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    result.append(line);
                    Log.d("doInBackground: ", result.toString());
                }
                bufferedReader.close();
                reader.close();
                inputStream.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result.toString();
        }

        @Override
        protected void onPostExecute(String result) {

            pdLoading.dismiss();
            final List<Standing> data = new ArrayList<>();

            pdLoading.dismiss();


            try {
                JSONObject jsonObject = new JSONObject(result);
                JSONArray arrayStanding = jsonObject.getJSONArray("standing");
                for (int i = 0; i < arrayStanding.length(); i++){
                    JSONObject position = arrayStanding.getJSONObject(i);
                    Standing teamPosition = new Standing();
                    teamPosition.setNameTeam(position.getString("teamName"));
                    teamPosition.setPlayedGames(position.getInt("playedGames"));
                    teamPosition.setWins(position.getInt("wins"));
                    teamPosition.setDraws(position.getInt("draws"));
                    teamPosition.setLosses(position.getInt("losses"));
                    teamPosition.setGoals(position.getInt("goals"));
                    teamPosition.setGoalsAgainst(position.getInt("goalsAgainst"));
                    teamPosition.setPoints(position.getInt("points"));

                    data.add(teamPosition);
                }

                LinearLayoutManager manager = new LinearLayoutManager(getContext());
                manager.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(manager);
                adapter = new StandingRecyclerViewAdapter(getContext(), data);
                recyclerView.setAdapter(adapter);


                } catch (JSONException e1) {
                e1.printStackTrace();
            }

        }
    }
}
