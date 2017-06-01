package com.kp.mwi.gizianak;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kp.mwi.gizianak.Model.BeratUmur;
import com.kp.mwi.gizianak.Model.DataKesimpulan;
import com.kp.mwi.gizianak.Model.TBUmur;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class Kesimpulan extends AppCompatActivity implements View.OnClickListener {
    private TextView nama, status;
    private CircleImageView gambar;
    private Button btnSelesai;
    private String jk = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesimpulan);

        nama = (TextView) findViewById(R.id.txtNama);
        status = (TextView) findViewById(R.id.txtStatus);
        gambar = (CircleImageView) findViewById(R.id.gambar_anak);
        btnSelesai = (Button) findViewById(R.id.btnSelesai);

        btnSelesai.setOnClickListener(this);

        Bundle b = getIntent().getExtras();
        if (b != null) {
            DataKesimpulan dk = b.getParcelable("dataKesimpulan");
            nama.setText(dk.getNama());
            if (dk.getJk().equals("Perempuan")) {
                jk = "P";
            } else {
                jk = "L";
            }
            if (dk.isAdaFoto()) {
                byte[] image = dk.getFoto();
                Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
                gambar.setImageBitmap(bitmap);
            } else {
                if (dk.getJk().equals("Perempuan")) {
                    jk = "P";
                    Picasso.with(this).load(R.drawable.girl).fit().into(gambar);
                } else {
                    jk = "L";
                    Picasso.with(this).load(R.drawable.boybig).fit().into(gambar);
                }
            }
            if (dk.getStatus().equals("BeratUmur")) {
                BeratUmur bu = new BeratUmur(dk.getTitikY(), dk.getUmur(), jk);
                bu.BBumur();
                status.setText(bu.getKeterangan());
            } else if (dk.getStatus().equals("TinggiUmur")) {
                TBUmur tu = new TBUmur(dk.getTitikY(), dk.getUmur(), jk);
                tu.TBUmur();
                status.setText(tu.getKeterangan());
            }
        }
    }

    @Override
    public void onClick(View v) {
        if (v == btnSelesai) {
            this.finish();
        }
    }


}
