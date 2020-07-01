package com.example.david;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class login_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
    }

    // Boton Login
    public void Siguiente(View view){
        Intent Siguiente = new Intent(this, welcome_screen.class);
        startActivity(Siguiente);
    }

}