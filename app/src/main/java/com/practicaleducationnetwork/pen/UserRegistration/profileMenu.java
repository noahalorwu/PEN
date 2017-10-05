package com.practicaleducationnetwork.pen.UserRegistration;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.practicaleducationnetwork.pen.NavigationFragment.Camera;
import com.practicaleducationnetwork.pen.NavigationFragment.Chat;
import com.practicaleducationnetwork.pen.NavigationFragment.Cycles;
import com.practicaleducationnetwork.pen.NavigationFragment.DiversityMatter;
import com.practicaleducationnetwork.pen.NavigationFragment.Energy;
import com.practicaleducationnetwork.pen.NavigationFragment.InteractionsMatter;
import com.practicaleducationnetwork.pen.NavigationFragment.Introduction;
import com.practicaleducationnetwork.pen.NavigationFragment.LabEquipment;
import com.practicaleducationnetwork.pen.R;
import com.practicaleducationnetwork.pen.NavigationFragment.Systems;

import static com.practicaleducationnetwork.pen.R.id.drawer_layout;

public class profileMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentTransaction fragmentTransaction;
    private FirebaseAuth firebaseAuth;
    private  TextView userName,userEmail;
    private  EditText fullname;
    View fname;

    private DatabaseReference databaseReference;
    View header;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        fullname=(EditText)findViewById(R.id.fullname);

        fname=findViewById(R.id.fullname);
        header=navigationView.getHeaderView(0);

        firebaseAuth=FirebaseAuth.getInstance();

        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new Introduction());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Introduction to Matter");
        FirebaseUser user1=FirebaseAuth.getInstance().getCurrentUser();

        userEmail=(TextView) header.findViewById(R.id.userEmail);
        userEmail.setText("Welcome, " + user1.getEmail());

       // userName=(TextView) header.findViewById(R.id.userName);
        //userName.setText(user1.getDisplayName());

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.profile_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(profileMenu.this,dataSave.class));

        }

        // Logout back to Login Activity
        if (id == R.id.logout) {
            firebaseAuth.signOut();
            startActivity(new Intent(this, com.practicaleducationnetwork.pen.UserRegistration.login.class));
            finish();

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int navclick = item.getItemId();

            if (navclick == R.id.intro) {
                // Handles  Introduction to Matter
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Introduction());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Introduction to Matter");
                item.setChecked(true);
            }

            else if (navclick == R.id.diversity) {

                // Handles  Diversity of Matter
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new DiversityMatter());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Diversity of Matter");
                item.setChecked(true);
            }

            else if (navclick == R.id.cycles) {
                // Handles  Cycles
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Cycles());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Cycles");
                item.setChecked(true);
            }


            else if (navclick == R.id.sys) {

                // Handles  Systems
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Systems());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Systems");
                item.setChecked(true);
            }

            else if (navclick == R.id.energy) {
                // Handles  Energy
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Energy());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Energy");
                item.setChecked(true);
            }

            else if (navclick == R.id.interact) {

                // Handles  Interactions of Matter
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new InteractionsMatter());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Interactions of Matter");
                item.setChecked(true);
            }


            else if (navclick == R.id.equip) {
                // Handles laboratory Equipments
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new LabEquipment());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Lab Equipments");
                item.setChecked(true);
            }

            else if (navclick == R.id.chat) {
                // Handles Chat
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Chat());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Chat");
                item.setChecked(true);
            }

            else if (navclick == R.id.capture){
                // Handles Camera
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Camera());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Capture");
                item.setChecked(true);
            }

        DrawerLayout drawer = (DrawerLayout) findViewById(drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
