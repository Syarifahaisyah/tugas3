package com.example.syarifah3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.syarifah);
    }

    public void clickdocter(View view) {
        //gambar docter di click
        Intent i = new Intent(this,docter.class);
        startActivity(i);

    }
}