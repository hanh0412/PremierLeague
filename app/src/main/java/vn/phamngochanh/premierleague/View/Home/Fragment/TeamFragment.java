package vn.phamngochanh.premierleague.View.Home.Fragment;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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
import vn.phamngochanh.premierleague.View.Home.Adapter.TeamRecyclerViewAdapter;
import vn.phamngochanh.premierleague.View.Home.Modal.Team;

import static vn.phamngochanh.premierleague.R.id.Team;

/**
 * Created by PhamNgocHanh on 1/11/17.
 */

public class TeamFragment extends Fragment  {

    public static final int CONNECTION_TIMEOUT = 10000;
    public static final int READ_TIMEOUT = 15000;
    StringBuilder result;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    TeamRecyclerViewAdapter adapter;
    String url = "http://api.football-data.org/v1/soccerseasons/426/teams/";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.team_layout, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerTeam);
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
            final List<Team> data = new ArrayList<>();

            pdLoading.dismiss();
            try {
                JSONObject dataObject = new JSONObject(result);
                JSONArray teamArray = dataObject.getJSONArray("teams");
                for (int i = 0; i < teamArray.length(); i++){
                    JSONObject team = teamArray.getJSONObject(i);
                    JSONObject link = team.getJSONObject("_links");
                    JSONObject urlPlayer = link.getJSONObject("players");
                    Team teamItem = new Team();
                    teamItem.setUrlLogo(team.getString("crestUrl"));
                    teamItem.setName(team.getString("name"));
                    teamItem.setCode(team.getString("code"));
                    teamItem.setUrlPlayer(urlPlayer.getString("href"));
                    teamItem.setValue(team.getString("squadMarketValue"));

                    data.add(teamItem);
                    Log.d("name ", data.get(i).getName());

                }

                gridLayoutManager = new GridLayoutManager(getContext(), 2);
                recyclerView.setLayoutManager(gridLayoutManager);

                adapter = new TeamRecyclerViewAdapter(getContext(), data);
                recyclerView.setAdapter(adapter);

            } catch (JSONException e) {
                Toast.makeText(getContext(), e.toString(), Toast.LENGTH_LONG).show();
            }

        }

    }
}
