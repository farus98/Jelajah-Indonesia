package com.example.tugasakhir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CariRestoran extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulMeme;
    private ArrayList<Integer> GambarMeme;
    //Daftar Judul
    private String[] Judul = {"RM. Bumi Aki","Deleuit Restaurant", "Cimory Riverside", "Kedai Kita", "Ngohiang Gang Aut"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.bumiaki1, R.drawable.dl1, R.drawable.cr1, R.drawable.kk1,
            R.drawable.ng1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carirestoran);
        JudulMeme = new ArrayList<>();
        GambarMeme = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new AdapterRestoran(JudulMeme, GambarMeme);
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