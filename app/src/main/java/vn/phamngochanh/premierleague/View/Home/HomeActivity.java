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
import vn.phamngochanh.premierleague.View.Fragment.Fixtures.FragmentFixtures;
import vn.phamngochanh.premierleague.View.Fragment.Home.FragmentHome;
import vn.phamngochanh.premierleague.View.Fragment.Player.FragmentPlayer;
import vn.phamngochanh.premierleague.View.Fragment.Stadium.FragmentStadium;
import vn.phamngochanh.premierleague.View.Fragment.Table.FragmentTable;
import vn.phamngochanh.premierleague.View.Fragment.Team.FragmentTeam;

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
                FragmentHome fragmentHome = new FragmentHome();
                transaction.replace(R.id.content, fragmentHome);
                break;
            case R.id.Fixtures:
                FragmentFixtures fragmentFixtures = new FragmentFixtures();
                transaction.replace(R.id.content, fragmentFixtures);
                break;
            case R.id.Player:
                FragmentPlayer fragmentPlayer = new FragmentPlayer();
                transaction.replace(R.id.content, fragmentPlayer);
                break;
            case R.id.Stadium:
                FragmentStadium fragmentStadium = new FragmentStadium();
                transaction.replace(R.id.content, fragmentStadium);
                break;
            case R.id.Table:
                FragmentTable fragmentTable = new FragmentTable();
                transaction.replace(R.id.content, fragmentTable);
                break;
            case R.id.Team:
                FragmentTeam fragmentTeam = new FragmentTeam();
                transaction.replace(R.id.content, fragmentTeam);
                break;
        }
        transaction.commit();
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}
