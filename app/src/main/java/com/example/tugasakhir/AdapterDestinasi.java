package com.example.tugasakhir;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class AdapterDestinasi extends RecyclerView.Adapter<AdapterDestinasi.ViewHolder>{

    private ArrayList<String> arrayList; //Digunakan untuk Judul
    private ArrayList<Integer> memeList; //Digunakan untuk Image/Gambar


    //Membuat Konstruktor pada Class RecyclerViewAdapter
    AdapterDestinasi(ArrayList<String> arrayList, ArrayList<Integer> memeList){
        this.arrayList = arrayList;
        this.memeList = memeList;

    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView JudulMeme;
        private ImageView Meme;
        private RelativeLayout ItemList;
        private Context context;

        ViewHolder(View itemView) {
            super(itemView);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();

            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            JudulMeme = itemView.findViewById(R.id.memetitle);
            Meme = itemView.findViewById(R.id.meme);
            ItemList = itemView.findViewById(R.id.item_list);
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()){
                        case 0 :
                            intent = new Intent(context, DetailDestinasi1.class);
                            break;
                        case 1 :
                            intent = new Intent(context, DetailDestinasi2.class);
                            break;
                        case 2 :
                            intent = new Intent(context, DetailDestinasi3.class);
                            break;
                        case 3 :
                            intent = new Intent(context, DetailDestinasi4.class);
                            break;
                        case 4 :
                            intent = new Intent(context, DetailDestinasi5.class);
                            break;
                        case 5 :
                            intent = new Intent(context, DetailDestinasi6.class);
                            break;
                        case 6 :
                            intent = new Intent(context, DetailDestinasi7.class);
                            break;
                        case 7 :
                            intent = new Intent(context, DetailDestinasi8.class);
                            break;
                    }
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listdestinasi, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Memasukan Nilai/Value Pada View-View Yang Telah Dibuat
        final String Nama = arrayList.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.JudulMeme.setText(Nama);
        holder.Meme.setImageResource(memeList.get(position)); // Mengambil gambar sesuai posisi yang telah ditentukan
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return arrayList.size();
    }

}
