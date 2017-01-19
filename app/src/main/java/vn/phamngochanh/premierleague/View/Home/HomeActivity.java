package vn.phamngochanh.premierleague.View.Home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import vn.phamngochanh.premierleague.R;
import vn.phamngochanh.premierleague.View.Home.Fragment.FixturesFragment;
import vn.phamngochanh.premierleague.View.Home.Fragment.HomeFragment;
import vn.phamngochanh.premierleague.View.Home.Fragment.PlayerFragment;
import vn.phamngochanh.premierleague.View.Home.Fragment.StandingFragment;
import vn.phamngochanh.premierleague.View.Home.Fragment.TeamFragment;


/**
 * Created by PhamNgocHanh on 1/8/17.
 */

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    ActionBar actionBar;
    NavigationView navMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navMenu = (NavigationView) findViewById(R.id.navMenu);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        drawerToggle = new ActionBarDrawerToggle(HomeActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerToggle.syncState();
        navMenu.setNavigationItemSelectedListener(this);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        HomeFragment homeFragment = new HomeFragment();
        transaction.replace(R.id.content, homeFragment);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (item.getItemId()){
            case R.id.Home:
                HomeFragment homeFragment = new HomeFragment();
                transaction.replace(R.id.content, homeFragment);
                break;
            case R.id.Table:
                StandingFragment standingFragment = new StandingFragment();
                transaction.replace(R.id.content, standingFragment);
                break;
            case R.id.Team:
                TeamFragment teamFragment = new TeamFragment();
                transaction.replace(R.id.content, teamFragment);
                break;
            case R.id.Fixtures:
                FixturesFragment fixturesFragment = new FixturesFragment();
                transaction.replace(R.id.content, fixturesFragment);
                break;
            case R.id.Player:
                PlayerFragment playerFragment = new PlayerFragment();
                transaction.replace(R.id.content, playerFragment);
                break;

        }
        transaction.commit();
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }

}
