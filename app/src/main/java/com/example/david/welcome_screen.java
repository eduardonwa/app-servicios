package com.example.david;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class welcome_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
    }

    // Ver categorias
    public void VerCategorias(View view){
        Intent VerCategorias = new Intent(this, categories_screen.class);
        startActivity(VerCategorias);
    }
    // Logout
    public void Anterior(View view){
        Intent Anterior = new Intent(this, login_screen.class);
        startActivity(Anterior);
    }


}