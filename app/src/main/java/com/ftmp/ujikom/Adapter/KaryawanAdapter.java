package com.ftmp.ujikom.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ftmp.ujikom.Database.AppDatabase;
import com.ftmp.ujikom.DetailActivityKaryawan;
import com.ftmp.ujikom.Model.Karyawan;
import com.ftmp.ujikom.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class KaryawanAdapter extends RecyclerView.Adapter<KaryawanAdapter.ViewHolder> {

    public KaryawanAdapter(ArrayList<Karyawan> dataKaryawan, Context context) {
        /**
         * Inisiasi data dan variabel yang akan digunakan
         */
        this.dataKaryawan = dataKaryawan;
        this.context = context;

        db = Room.databaseBuilder(context.getApplicationContext() , AppDatabase.class , "karyawan_db").allowMainThreadQueries().build();
    }

    private ArrayList<Karyawan> dataKaryawan;
    private Context context;
    private AppDatabase db;


    @NonNull
    @Override
    public KaryawanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_karyawan, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KaryawanAdapter.ViewHolder holder, final int position) {

        final String name = dataKaryawan.get(position).getNama();
        final String jabatan = dataKaryawan.get(position).getJabatan();
        final String jeniskelamin = dataKaryawan.get(position).getKelamin();
        final String gaji = Integer.toString(dataKaryawan.get(position).getGaji());

        holder.cvItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    /*
                    * codingan untuk membaca detailActivity
                    * */
                Karyawan karyawan = db.karyawanDao().selectKaryawanDetail(dataKaryawan.get(position).getKaryawanId());
                context.startActivity(DetailActivityKaryawan.getTangkapIntent((Activity) context).putExtra("data", karyawan));
            }
        });


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
       /*
       * Inisiasi View
       * */
        TextView tvNama , tvJabatan , tvKelamin , tvGaji;
        CardView cvItem;

          ViewHolder(@NonNull View itemView) {
                super(itemView);

                tvNama = itemView.findViewById(R.id.tv_nama_karyawan);
                tvJabatan = itemView.findViewById(R.id.tv_jabatan_karyawan);
                tvKelamin = itemView.findViewById(R.id.tv_jk_karyawan);
                tvGaji = itemView.findViewById(R.id.tv_gaji_karyawan);

                cvItem = itemView.findViewById(R.id.cv_item_karyawan);
            }
    }
}
