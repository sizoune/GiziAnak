package com.kp.mwi.gizianak.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
        if (!dataAnak.get(position).isAdaFoto()) {
            if (dataAnak.get(position).getJenisKelamin().equals("Perempuan"))
                Picasso.with(context).load(R.drawable.girl).fit().into(holder.gambar);
//                holder.gambar.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_girl));
            else
                Picasso.with(context).load(R.drawable.boybig).fit().into(holder.gambar);
//                holder.gambar.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_boy));
        } else {
            byte[] image = dataAnak.get(position).getFoto();
            Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
            holder.gambar.setImageBitmap(bitmap);
        }


    }

    @Override
    public int getItemCount() {
        return dataAnak.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView nama;
        public ImageView gambar;
        public CardView cv;

        public ViewHolder(View view) {
            super(view);
            cv = (CardView) view.findViewById(R.id.cardView);
            gambar = (ImageView) view.findViewById(R.id.gambar_anak);
            nama = (TextView) view.findViewById(R.id.txtNama);
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
