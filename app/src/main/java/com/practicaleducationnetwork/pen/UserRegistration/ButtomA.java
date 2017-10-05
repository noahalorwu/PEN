package com.practicaleducationnetwork.pen.UserRegistration;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.practicaleducationnetwork.pen.R;


public class ButtomA extends Activity {
    private BottomNavigationView bottonNav;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom);
bottonNav=(BottomNavigationView)findViewById(R.id.bottonNav);


        bottonNav.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
              if(item.getItemId()==R.id.sin){
                  startActivity(new Intent(ButtomA.this,login.class));
                  finish();

              }

              else if(item.getItemId()==R.id.sup){
                  startActivity(new Intent(ButtomA.this,MainActivity.class));
                  finish();
              }

                return;
            }
        });


    }


}
