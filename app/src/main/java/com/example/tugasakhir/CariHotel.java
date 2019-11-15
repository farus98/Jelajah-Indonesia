package com.example.tugasakhir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CariHotel extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulMeme;
    private ArrayList<Integer> GambarMeme;
    //Daftar Judul
    private String[] Judul = {"Padjadjaran Suites Hotel and Conferenc", "HARRIS Hotel Sentul City Bogor", "THE 1O1 Bogor Suryakancana Hotel", "Hotel Salak The Heritager", "Salak Tower Hotel"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.pajajaran1, R.drawable.harrishotel1, R.drawable.the1, R.drawable.hs1,
            R.drawable.salak1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carihotel);
        JudulMeme = new ArrayList<>();
        GambarMeme = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new AdapterHotel(JudulMeme, GambarMeme);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            GambarMeme.add(Gambar[w]);
            JudulMeme.add(Judul[w]);
        }
    }
}