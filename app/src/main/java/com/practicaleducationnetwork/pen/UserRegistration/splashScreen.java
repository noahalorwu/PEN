package com.practicaleducationnetwork.pen.UserRegistration;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;

import com.practicaleducationnetwork.pen.R;


public class splashScreen extends Activity {
    public static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable(){
            @Override

            public void run(){
                Intent home= new Intent(splashScreen.this,login.class);
                startActivity(home);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
