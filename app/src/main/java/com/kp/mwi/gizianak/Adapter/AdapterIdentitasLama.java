package com.kp.mwi.gizianak.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kp.mwi.gizianak.Model.DataAnak;
import com.kp.mwi.gizianak.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by desmoncode on 25/05/17.
 */

public class AdapterIdentitasLama extends RecyclerView.Adapter<AdapterIdentitasLama.ViewHolder> {
    final Context context;
    OnItemClickListener mItemClickListener;
    private ArrayList<DataAnak> dataAnak;

    public AdapterIdentitasLama(Context context, ArrayList<DataAnak> dataAnak) {
        this.context = context;
        this.dataAnak = dataAnak;
    }

    @Override
    public AdapterIdentitasLama.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_identitaslama, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AdapterIdentitasLama.ViewHolder holder, int position) {
        holder.nama.setText(dataAnak.get(position).getNama());
        holder.jenisKelamin.setText(dataAnak.get(position).getJenisKelamin());
        holder.tanggalLahir.setText(dataAnak.get(position).getTglLahir());
        holder.beratBadan.setText(Integer.toString(dataAnak.get(position).getBerat()));
        holder.tinggiBadan.setText(Integer.toString(dataAnak.get(position).getTinggi()));
        if (dataAnak.get(position).getBerat() < 20 || dataAnak.get(position).getTinggi() < 10) {
            holder.status.setText("TIDAK IDEAL");
            holder.status.setTextColor(Color.RED);
        } else {
            holder.status.setText("IDEAL");
            holder.status.setTextColor(Color.GREEN);
        }
        if (dataAnak.get(position).getJenisKelamin().equals("Perempuan"))
            Picasso.with(context).load(R.drawable.ic_girl).fit().into(holder.gambar);
        else
            Picasso.with(context).load(R.drawable.ic_boy).fit().into(holder.gambar);

    }

    @Override
    public int getItemCount() {
        return dataAnak.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView nama, jenisKelamin, tanggalLahir, beratBadan, tinggiBadan, status;
        public ImageView gambar;
        public CardView cv;

        public ViewHolder(View view) {
            super(view);
            cv = (CardView) view.findViewById(R.id.cardView);
            gambar = (ImageView) view.findViewById(R.id.gambar_anak);
            nama = (TextView) view.findViewById(R.id.txtNama);
            jenisKelamin = (TextView) view.findViewById(R.id.txtJenisKelamin);
            tanggalLahir = (TextView) view.findViewById(R.id.txtTanggalLahir);
            beratBadan = (TextView) view.findViewById(R.id.txtBeratBadan);
            tinggiBadan = (TextView) view.findViewById(R.id.txtTinggiBadan);
            status = (TextView) view.findViewById(R.id.txtStatus);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mItemClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }
}
