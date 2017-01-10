package vn.phamngochanh.premierleague.View.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Model.TeamStandingAll;
import vn.phamngochanh.premierleague.View.Model.TeamStandingHome;

/**
 * Created by PhamNgocHanh on 1/10/17.
 */

public class AdapterStandingHome extends RecyclerView.Adapter<AdapterStandingHome.MyViewHolder>{

    Context context;
    List<TeamStandingHome> list;

    public AdapterStandingHome(Context context, List<TeamStandingHome> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public AdapterStandingHome.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_standing, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterStandingHome.MyViewHolder holder, int position) {
        TeamStandingHome item = list.get(position);
        holder.nameTeam.setText(item.getName());
        holder.numberMatch.setText(String.valueOf(item.getNumberMatchHome()));
        holder.win.setText(String.valueOf(item.getWinHome()));
        holder.draws.setText(String.valueOf(item.getDrawsHome()));
        holder.losts.setText(String.valueOf(item.getLostHome()));
        holder.score.setText(String.valueOf(item.getScoreHome()));
        holder.conceded.setText(String.valueOf(item.getConcededHome()));
        holder.point.setText(String.valueOf(item.getPointHome()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameTeam;
        TextView numberMatch;
        TextView win;
        TextView draws;
        TextView losts;
        TextView score;
        TextView conceded;
        TextView point;

        public MyViewHolder(View itemView) {
            super(itemView);

            nameTeam = (TextView) itemView.findViewById(R.id.nameTeam);
            numberMatch = (TextView) itemView.findViewById(R.id.numberMatch);
            win = (TextView) itemView.findViewById(R.id.win);
            draws = (TextView) itemView.findViewById(R.id.draws);
            losts = (TextView) itemView.findViewById(R.id.losts);
            score = (TextView) itemView.findViewById(R.id.score);
            conceded = (TextView) itemView.findViewById(R.id.conceded);
            point = (TextView) itemView.findViewById(R.id.point);
        }
    }
}
