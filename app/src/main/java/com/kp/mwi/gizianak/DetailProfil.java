package com.kp.mwi.gizianak;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kp.mwi.gizianak.Model.DataAnak;
import com.squareup.picasso.Picasso;

import net.danlew.android.joda.JodaTimeAndroid;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.util.List;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailProfil extends AppCompatActivity implements View.OnClickListener {
    private TextView txNama, txJk, txUsia, txBerat, txTinggi;
    private Button edit, hapus, status;
    private DataAnak da;
    private CircleImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JodaTimeAndroid.init(this);
        setContentView(R.layout.activity_detail_profil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        txNama = (TextView) findViewById(R.id.txtNama);
        txJk = (TextView) findViewById(R.id.txtJenisKelamin);
        txUsia = (TextView) findViewById(R.id.txtUsia);
        txBerat = (TextView) findViewById(R.id.txtBerat);
        txTinggi = (TextView) findViewById(R.id.txtTinggi);
        gambar = (CircleImageView) findViewById(R.id.gambar_anak);

        edit = (Button) findViewById(R.id.btnUbah);
        hapus = (Button) findViewById(R.id.btnHapus);
        status = (Button) findViewById(R.id.btnStatus);

        edit.setOnClickListener(this);
        hapus.setOnClickListener(this);
        status.setOnClickListener(this);


        Bundle b = getIntent().getExtras();
        if (b != null) {
            da = b.getParcelable("data");
            txNama.setText(da.getNama());
            txJk.setText(da.getJenisKelamin());
            LocalDate now = new LocalDate();
            String[] sp = da.getTglLahir().split(" ");
            int tanggal = Integer.parseInt(sp[0]);
            String bulan = sp[1];
            int thn = Integer.parseInt(sp[2]);
            LocalDate birth = new LocalDate(thn, convertBulan(bulan), tanggal);
            Period period = new Period(birth, now, PeriodType.yearMonthDay());
            txUsia.setText(da.getTglLahir() + ", " + period.getYears() + " tahun " + (period.getMonths() + 1) + " bulan");
            txBerat.setText(da.getBerat() + " Kg");
            txTinggi.setText(da.getTinggi() + " cm");
            if (!da.isAdaFoto()) {
                if (da.getJenisKelamin().equals("Perempuan")) {
                    Picasso.with(this).load(R.drawable.girl).fit().into(gambar);
                } else {
                    Picasso.with(this).load(R.drawable.boybig).fit().into(gambar);
                }
            } else {
                byte[] image = da.getFoto();
                Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
                gambar.setImageBitmap(bitmap);
            }
        }
    }

    public int convertBulan(String angka) {
        if (angka.equals("Januari")) {
            return 1;
        } else if (angka.equals("Februari")) {
            return 2;
        } else if (angka.equals("Maret")) {
            return 3;
        } else if (angka.equals("April")) {
            return 4;
        } else if (angka.equals("Mei")) {
            return 5;
        } else if (angka.equals("Juni")) {
            return 6;
        } else if (angka.equals("Juli")) {
            return 7;
        } else if (angka.equals("Agustus")) {
            return 8;
        } else if (angka.equals("September")) {
            return 9;
        } else if (angka.equals("Oktober")) {
            return 10;
        } else if (angka.equals("November")) {
            return 11;
        } else if (angka.equals("Desember")) {
            return 12;
        }
        return -1;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            android.app.FragmentManager fm = getFragmentManager();
            fm.popBackStack();
            finish();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v == edit) {
            Intent edi = new Intent(DetailProfil.this, EditProfile.class);
            edi.putExtra("data", da);
            startActivity(edi);
            finish();
        } else if (v == hapus) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.myDialog));
            builder.setTitle("Hapus Data");
            builder.setMessage("Apakah anda yakin ingin menghapus data ini ?");
            builder.setPositiveButton("YA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(da.getUniqid()));
                    da = as.get(0);
                    da.delete();
                    android.app.FragmentManager fm = getFragmentManager();
                    fm.popBackStack();
                    finish();
                }
            });
            builder.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.create();
            builder.show();
        } else if (v == status) {

        }
    }
}
