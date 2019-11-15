package com.example.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView profil, guide, destinasiwisata, hotel, restoran, artikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profil = findViewById(R.id.profil);
        guide = findViewById(R.id.guide);
        destinasiwisata = findViewById(R.id.destinasiwisata);
        hotel = findViewById(R.id.hotel);
        restoran = findViewById(R.id.restoran);
        artikel = findViewById(R.id.artikel);

        profil.setOnClickListener(this);
        guide.setOnClickListener(this);
        destinasiwisata.setOnClickListener(this);
        hotel.setOnClickListener(this);
        restoran.setOnClickListener(this);
        artikel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent a ;

        switch (view.getId()){
            case R.id.profil : a = new Intent(this, Profile.class); startActivity(a);break;

            case R.id.guide : a = new Intent(this, CariGuide.class); startActivity(a);break;

            case R.id.destinasiwisata : a = new Intent(this, CariDestinasi.class); startActivity(a);break;

            case R.id.hotel : a = new Intent(this, CariHotel.class); startActivity(a);break;

            case R.id.restoran : a = new Intent(this, CariRestoran.class); startActivity(a);break;

            case R.id.artikel : a = new Intent(this, LihatArtikel.class); startActivity(a);break;
            default: break ;
        }
    }
}