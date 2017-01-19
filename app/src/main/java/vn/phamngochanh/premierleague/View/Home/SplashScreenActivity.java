package vn.phamngochanh.premierleague.View.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import vn.phamngochanh.premierleague.R;

/**
 * Created by PhamNgocHanh on 1/8/17.
 */

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);

                }catch (Exception e){

                }finally {
                    Intent itHome = new Intent(SplashScreenActivity.this, HomeActivity.class);
                    startActivity(itHome);
                    finish();
                }
            }
        });

        thread.start();
    }

}
