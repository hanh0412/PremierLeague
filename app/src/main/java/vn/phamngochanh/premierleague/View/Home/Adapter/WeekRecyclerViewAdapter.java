package vn.phamngochanh.premierleague.View.Home.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Home.Modal.Fixtures;

/**
 * Created by PhamNgocHanh on 1/12/17.
 */

public class WeekRecyclerViewAdapter extends RecyclerView.Adapter<WeekRecyclerViewAdapter.WeekViewHolder>{

    Context context;
    List<Fixtures> lisFixture = new ArrayList<>();

    public WeekRecyclerViewAdapter(Context context, List<Fixtures> lisFixture) {
        this.context = context;
        this.lisFixture = lisFixture;
    }

    @Override
    public WeekViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_fixture, parent, false);

        return new WeekViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeekViewHolder holder, int position) {

        Fixtures fixtures = lisFixture.get(position);

        holder.nameAway.setText(fixtures.getAway());
        holder.nameHome.setText(fixtures.getHome());
        holder.status.setText(fixtures.getStatus());
        holder.date.setText(fixtures.getDate());
        holder.goalHome.setText(String.valueOf(fixtures.getGoalHome()));
        holder.goalAway.setText(String.valueOf(fixtures.getGoalAway()));
    }

    @Override
    public int getItemCount() {
        return lisFixture.size();
    }

    public class WeekViewHolder extends RecyclerView.ViewHolder {
        TextView nameHome;
        TextView nameAway;
        TextView date;
        TextView status;
        TextView goalHome;
        TextView goalAway;
        public WeekViewHolder(View itemView) {
            super(itemView);

            nameAway = (TextView) itemView.findViewById(R.id.tvNameHome);
            nameHome = (TextView) itemView.findViewById(R.id.tvNameAway);
            date = (TextView) itemView.findViewById(R.id.tvTime);
            status = (TextView) itemView.findViewById(R.id.tvStatus);
            goalAway = (TextView) itemView.findViewById(R.id.goalAway);
            goalHome = (TextView) itemView.findViewById(R.id.goalHome);
        }
    }
}
