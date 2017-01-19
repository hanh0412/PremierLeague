package vn.phamngochanh.premierleague.View.Home.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Home.Modal.Player;

/**
 * Created by PhamNgocHanh on 1/13/17.
 */

public class PlayerRecyclerViewAdapter extends RecyclerView.Adapter<PlayerRecyclerViewAdapter.PlayerViewHolder> {

    Context context;
    ArrayList<Player> listPlayer;

    public PlayerRecyclerViewAdapter(Context context, ArrayList<Player> listPlayer) {
        this.context = context;
        this.listPlayer = listPlayer;
    }

    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_player, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position) {
        Player player = listPlayer.get(position);

        holder.numberPlayer.setText(String.valueOf(player.getNumberPlayer()));
        holder.namePlayer.setText(player.getNamePlayer());
        holder.position.setText(player.getPosition());
    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView numberPlayer;
        TextView namePlayer;
        TextView position;

        public PlayerViewHolder(View itemView) {
            super(itemView);

            numberPlayer = (TextView) itemView.findViewById(R.id.tvNumberPlayer);
            namePlayer = (TextView) itemView.findViewById(R.id.tvNamePlayer);
            position = (TextView) itemView.findViewById(R.id.tvPositionPlayer);
        }
    }
}
