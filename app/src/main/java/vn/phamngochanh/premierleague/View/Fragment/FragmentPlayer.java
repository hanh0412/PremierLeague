package vn.phamngochanh.premierleague.View.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.phamngochanh.premierleague.R;

/**
 * Created by PhamNgocHanh on 1/8/17.
 */

public class FragmentPlayer extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.player_layout, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}