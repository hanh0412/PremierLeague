package vn.phamngochanh.premierleague.View.Home.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Home.Modal.Team;

/**
 * Created by PhamNgocHanh on 1/14/17.
 */

public class TeamRecyclerViewAdapter extends RecyclerView.Adapter<TeamRecyclerViewAdapter.TeamViewHolder> {
    Context context;
    List<Team> listTeam;

    public TeamRecyclerViewAdapter(Context context, List<Team> listTeam) {
        this.context = context;
        this.listTeam = listTeam;
    }

    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        Team team = listTeam.get(position);
        Glide.with(context).load(team.getUrlLogo()).placeholder(R.drawable.loading).error(R.drawable.image_fail).into(holder.logo);
        holder.name.setText(team.getName());
        holder.code.setText(team.getCode());
        holder.value.setText(team.getValue());
    }

    @Override
    public int getItemCount() {
        return listTeam.size();
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder {

        ImageView logo;
        TextView name;
        TextView code;
        TextView value;

        public TeamViewHolder(View itemView) {
            super(itemView);

            logo = (ImageView) itemView.findViewById(R.id.imLogoTeam);
            name = (TextView) itemView.findViewById(R.id.tvFullName);
            code = (TextView) itemView.findViewById(R.id.tvshortName);
            value = (TextView) itemView.findViewById(R.id.tvValueInMarket);
        }
    }
}
