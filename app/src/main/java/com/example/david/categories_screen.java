package com.example.david;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categories_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_screen);
    }

    public void Anterior(View view){
        Intent Anterior = new Intent(this, welcome_screen.class);
        startActivity(Anterior);
    }
}