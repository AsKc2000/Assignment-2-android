package com.example.assignment_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggleButton = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggleButton);
        toggleButton.syncState();


    }
    //  public void change_fragment(View view){
    //    switch(findViewById(view)){
    //      case(R)
    //}


    //  }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_primary:
                //PrimaryFragment fragment;
                // fragment = new PrimaryFragment();
                FragmentManager fm1 = getSupportFragmentManager();
                FragmentTransaction ft = fm1.beginTransaction();
                ft.replace(R.id.fragment_container, new PrimaryFragment()).commit();
                break;
            case R.id.nav_contacts:
                //PrimaryFragment fragment;
                // fragment = new PrimaryFragment();
                FragmentManager fm2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                ft2.replace(R.id.fragment_container, new List_fragment()).commit();
                break;
            case R.id.nav_send:
                //PrimaryFragment fragment;
                // fragment = new PrimaryFragment();
                FragmentManager fm3 = getSupportFragmentManager();
                FragmentTransaction ft3 = fm3.beginTransaction();
                ft3.replace(R.id.fragment_container, new send_feragment()).commit();
                break;
            case R.id.nav_about:
                //PrimaryFragment fragment;
                // fragment = new PrimaryFragment();
                FragmentManager fm4 = getSupportFragmentManager();
                FragmentTransaction ft4 = fm4.beginTransaction();
                ft4.replace(R.id.fragment_container, new about_fragment()).commit();
                break;
            case R.id.nav_help:
                //PrimaryFragment fragment;
                // fragment = new PrimaryFragment();
                FragmentManager fm5 = getSupportFragmentManager();
                FragmentTransaction ft5 = fm5.beginTransaction();
                ft5.replace(R.id.fragment_container, new help_fragment()).commit();
                break;

        }
        //   drawerLayout.isDrawerOpen(GravityCompat.START)==true
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
