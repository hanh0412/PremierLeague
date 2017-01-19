package vn.phamngochanh.premierleague.View.Home.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Home.Modal.Standing;

/**
 * Created by PhamNgocHanh on 1/11/17.
 */

public class StandingRecyclerViewAdapter extends RecyclerView.Adapter<StandingRecyclerViewAdapter.StandingViewHolder> {

    Context context;
    List<Standing> list = new ArrayList<>();

    public StandingRecyclerViewAdapter(Context context, List<Standing> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public StandingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_standing, parent, false);
        return new StandingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StandingViewHolder holder, int position) {

        Standing standing = list.get(position);

        holder.nameTeam.setText(standing.getNameTeam());
        holder.playedGames.setText(String.valueOf(standing.getPlayedGames()));
        holder.wins.setText(String.valueOf(standing.getWins()));
        holder.draws.setText(String.valueOf(standing.getDraws()));
        holder.losses.setText(String.valueOf(standing.getLosses()));
        holder.goals.setText(String.valueOf(standing.getGoals()));
        holder.goalsAgainst.setText(String.valueOf(standing.getGoalsAgainst()));
        holder.points.setText(String.valueOf(standing.getPoints()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StandingViewHolder extends RecyclerView.ViewHolder {

        TextView nameTeam;
        TextView playedGames;
        TextView wins;
        TextView draws;
        TextView losses;
        TextView goals;
        TextView goalsAgainst;
        TextView points;
        CardView cv;

        public StandingViewHolder(View itemView) {
            super(itemView);
            nameTeam = (TextView) itemView.findViewById(R.id.nameTeam);
            playedGames = (TextView) itemView.findViewById(R.id.numberMatch);
            wins = (TextView) itemView.findViewById(R.id.win);
            draws = (TextView) itemView.findViewById(R.id.draws);
            losses = (TextView) itemView.findViewById(R.id.losts);
            goals = (TextView) itemView.findViewById(R.id.score);
            goalsAgainst = (TextView) itemView.findViewById(R.id.conceded);
            points = (TextView) itemView.findViewById(R.id.point);
            cv = (CardView) itemView.findViewById(R.id.cv);

        }
    }
}
