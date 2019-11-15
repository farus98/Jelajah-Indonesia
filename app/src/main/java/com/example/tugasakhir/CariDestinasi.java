package com.example.tugasakhir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CariDestinasi extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulMeme;
    private ArrayList<Integer> GambarMeme;
    //Daftar Judul
    private String[] Judul = {"Kebun Raya Bogor", "Istana Bogor", "Little Venice Kota Bunga Puncak Bogor", "Curug Bidadari Sentul Paradise Park", "Gunung Pancar", "Curug Bengkok Leuwi Hejo", "Jungle Land Adventure Theme Park", "Penangkaran Rusa Giri Jaya Cariu Bogor"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.kbr, R.drawable.ib1, R.drawable.lv1, R.drawable.cb1, R.drawable.gp1, R.drawable.lw2, R.drawable.jl6, R.drawable.pr1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caridestinasi);
        JudulMeme = new ArrayList<>();
        GambarMeme = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new AdapterDestinasi(JudulMeme, GambarMeme);
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