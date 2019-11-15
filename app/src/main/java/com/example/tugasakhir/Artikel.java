package com.example.tugasakhir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Artikel extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulMeme;
    private ArrayList<Integer> GambarMeme;
    //Daftar Judul
    private String[] Judul = {"8 tips mengatur keuangan untuk yang hobi travelling","9 Tips Memilih Asuransi Perjalanan yang Perlu Kamu Ketahui", "Mengintip Sejarah di Museum Perjuangan Bogor", "Bukan Cuma Songkran, Ini 6 Festival di Bangkok yang Seru"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.travel1, R.drawable.artikel2, R.drawable.artikel3, R.drawable.artikel4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
        JudulMeme = new ArrayList<>();
        GambarMeme = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new AdapterArtikel(JudulMeme, GambarMeme);
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