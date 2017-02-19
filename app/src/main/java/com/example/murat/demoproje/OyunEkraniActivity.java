package com.example.murat.demoproje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class OyunEkraniActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {


    SeekBar OyunEkrani_Slide;
    EditText OyunEkrani_Tahmin;
    Button OyunEkrani_Buton;
    Integer slideSayi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_ekrani);
        OyunEkrani_Slide=(SeekBar) findViewById(R.id.OyunEkrani_Slide);
        OyunEkrani_Tahmin=(EditText) findViewById(R.id.OyunEkrani_Tahmin);
        OyunEkrani_Buton=(Button) findViewById(R.id.OyunEkrani_Buton);

        OyunEkrani_Slide.setOnSeekBarChangeListener(this);
        OyunEkrani_Buton.setOnClickListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        Log.i("qweqwewq", String.valueOf(i));
        slideSayi=i;

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


    @Override
    public void onClick(View view) {

        if(slideSayi==Integer.valueOf(String.valueOf(OyunEkrani_Tahmin.getText())))
        {

            Toast toa = Toast.makeText(OyunEkraniActivity.this, "Bildiniz!",
                    Toast.LENGTH_LONG);
            toa.setGravity(Gravity.CENTER, 0, 0);
            toa.show();

        }
        else {

            Toast toa = Toast.makeText(OyunEkraniActivity.this, "Bilemediniz..",
                    Toast.LENGTH_LONG);
            toa.setGravity(Gravity.CENTER, 0, 0);
            toa.show();
        }
    }
}
