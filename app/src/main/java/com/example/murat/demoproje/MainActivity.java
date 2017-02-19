package com.example.murat.demoproje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Main_OyunaBaslaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Main_OyunaBaslaButton=(Button) findViewById(R.id.Main_OyunaBaslaButton);

        Main_OyunaBaslaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent oyunEkrani=new Intent(MainActivity.this,OyunEkraniActivity.class);
        this.startActivity(oyunEkrani);

    }
}
