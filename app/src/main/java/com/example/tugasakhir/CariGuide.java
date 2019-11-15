package com.example.tugasakhir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CariGuide extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulMeme;
    private ArrayList<Integer> GambarMeme;
    //Daftar Judul
    private String[] Judul = {"Fauzan Rusdi", "Shalzaviera", "Muhammad Farhan", "Sharah Fadillah", "Taufik Hermawan"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.ic_account, R.drawable.ic_account, R.drawable.ic_account, R.drawable.ic_account,
            R.drawable.ic_account};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cariguide);
        JudulMeme = new ArrayList<>();
        GambarMeme = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(JudulMeme, GambarMeme);
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