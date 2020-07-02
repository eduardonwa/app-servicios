package com.example.david;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class categories_screen extends AppCompatActivity {

    BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_screen);

        showSelectecFragment(new Listado());

        mBottomNavigation = (BottomNavigationView)findViewById(R.id.bottom_navbar);
        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.settings){
                    showSelectecFragment(new Contratar());
                }

                if(item.getItemId() == R.id.categories){
                    showSelectecFragment(new Listado());
                }

                if(item.getItemId() == R.id.profile){
                    showSelectecFragment(new PerfilServidor());
                }

                return true;
            }
        });
    }

    private void showSelectecFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

}