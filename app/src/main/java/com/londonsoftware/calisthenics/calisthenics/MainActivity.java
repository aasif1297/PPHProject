package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;



    //inflates the menu overflow on toolbar.   NOTE:Still need to create onclicks for items
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow_menu,menu);

        return true;

    }

    //make share button send email to share app
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.share_button_menu) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT,
                    "Hey check out my app at: https://play.google.com/store/apps/details?id=com.londonsoftware.calisthenics.calisthenics");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null); //This is to remove the toolbar title



        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this); //coding which is part of linking the Nav links to fragments

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //The code below has been copied and pasted here so that when the app is open, it displays the Home page straight away.
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }

        //This sets the colour of the toolbar title. Seems to be the only way to get the text white.
        toolbar.setTitleTextColor(android.graphics.Color.WHITE);



    }





    //The coding below allows the Nav links to be clicked and connected to their respective fragment. Add here if you get more nav links.
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportActionBar().setTitle("CALISTHENICS");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();
                break;
            case R.id.nav_fitnessprograms:
                getSupportActionBar().setTitle("FITNESS PROGRAMS");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fitnessprograms_New_tabs()).commit();
                break;
            case R.id.nav_exercises:
                getSupportActionBar().setTitle("EXERCISES");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ExercisesProgramsFragment()).commit();
                break;
            case R.id.nav_mobility:
                getSupportActionBar().setTitle("MOBILITY & STRETCHING");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Youtube_Mobility()).commit();
                break;
            case R.id.nav_diet:
                getSupportActionBar().setTitle("HEALTH & NUTRITION");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HealthNutrition_New_fragment()).commit();
                break;
            case R.id.nav_parklocator:
                getSupportActionBar().setTitle("PARK LOCATOR");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Park_Locator_Fragment()).commit();
                break;
            case R.id.nav_competition:
                getSupportActionBar().setTitle("COMPETITIONS");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Competitions_Fragment()).commit();
                break;

                //Communicate Links

            case R.id.nav_therealabout:
                getSupportActionBar().setTitle("ABOUT");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new About_RealFragment()).commit();
                break;

            case R.id.nav_about:
                getSupportActionBar().setTitle("UPDATES");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AboutFragment()).commit();
                break;
            case R.id.nav_contact:
                getSupportActionBar().setTitle("CONTACT");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ContactFragment()).commit();
                break;
        }


        //This code here allows the nav drawer to close once you click on a fragment.
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //This code allows the nav drawer to be opened and closed accordingly
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



}


    