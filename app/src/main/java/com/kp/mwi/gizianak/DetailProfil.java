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

import com.kp.mwi.gizianak.Model.BeratUmur;
import com.kp.mwi.gizianak.Model.DataAnak;
import com.kp.mwi.gizianak.Model.DataKesimpulan;
import com.kp.mwi.gizianak.Model.TBUmur;
import com.squareup.picasso.Picasso;

import net.danlew.android.joda.JodaTimeAndroid;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.util.List;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;
import me.drakeet.materialdialog.MaterialDialog;

public class DetailProfil extends AppCompatActivity implements View.OnClickListener {
    private TextView txNama, txJk, txUsia, txBerat, txTinggi;
    private Button edit, hapus, status;
    private DataAnak da;
    private CircleImageView gambar;
    private MaterialDialog mMaterialDialog;

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
            txUsia.setText(da.getTglLahir() + ", " + period.getYears() + " tahun " + (period.getMonths()) + " bulan");
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
            final CharSequence[] options = {"Kurva berat badan menurut umur", "Kurva tinggi badan menurut umur", "Kurva berat badan menurut tinggi badan", "Lihat nanti"};
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.myDialog));
            builder.setTitle("Lihat Status Anak");
            builder.setItems(options, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if (options[which].equals("Kurva berat badan menurut umur")) {
                        LocalDate now = new LocalDate();
                        String[] sp = da.getTglLahir().split(" ");
                        int tanggal = Integer.parseInt(sp[0]);
                        String bulan = sp[1];
                        int thn = Integer.parseInt(sp[2]);
                        int umur = -1;
                        int thnhasconv = -1;
                        LocalDate birth = new LocalDate(thn, convertBulan(bulan), tanggal);
                        Period period = new Period(birth, now, PeriodType.yearMonthDay());
                        if (period.getYears() < 5) {
                            umur = (period.getYears() * 12) + (period.getMonths());
                        } else if (period.getYears() == 5) {
                            if (period.getMonths() == 0) {
                                umur = (period.getYears() * 12) + (period.getMonths());
                            } else {
                                int bulhasconv = -1;
                                if (period.getMonths() <= 5) {
                                    if (period.getMonths() < 3) {
                                        bulhasconv = 0;
                                    } else {
                                        bulhasconv = 5;
                                    }
                                    thnhasconv = period.getYears();
                                } else {
                                    if (period.getMonths() < 8) {
                                        bulhasconv = 5;
                                        thnhasconv = period.getYears();
                                    } else {
                                        bulhasconv = 0;
                                        thnhasconv = period.getYears() + 1;
                                    }
                                }
                                umur = (thnhasconv * 12) + bulhasconv;
                            }
                        } else {
                            int bulhasconv = -1;
                            if (period.getMonths() <= 5) {
                                if (period.getMonths() < 3) {
                                    bulhasconv = 0;
                                } else {
                                    bulhasconv = 5;
                                }
                                thnhasconv = period.getYears();
                            } else {
                                if (period.getMonths() < 8) {
                                    bulhasconv = 5;
                                    thnhasconv = period.getYears();
                                } else {
                                    bulhasconv = 0;
                                    thnhasconv = period.getYears() + 1;
                                }
                            }
                            umur = (thnhasconv * 12) + bulhasconv;
                        }
                        DataKesimpulan dk;
                        if (da.isAdaFoto()) {
                            dk = new DataKesimpulan(da.getNama(), da.getJenisKelamin(), "BeratUmur", umur, da.getBerat(), umur, da.getFoto());
                        } else {
                            dk = new DataKesimpulan(da.getNama(), da.getJenisKelamin(), "BeratUmur", umur, da.getBerat(), umur);
                        }
                        Intent intent = new Intent(getApplicationContext(), Kesimpulan.class);
                        intent.putExtra("dataKesimpulan", dk);
                        startActivity(intent);
                    } else if (options[which].equals("Kurva tinggi badan menurut umur")) {
                        LocalDate now = new LocalDate();
                        String[] sp = da.getTglLahir().split(" ");
                        int tanggal = Integer.parseInt(sp[0]);
                        String bulan = sp[1];
                        int thn = Integer.parseInt(sp[2]);
                        LocalDate birth = new LocalDate(thn, convertBulan(bulan), tanggal);
                        Period period = new Period(birth, now, PeriodType.yearMonthDay());
                        int umur = -1;
                        int thnhasconv = -1;
                        if (period.getYears() < 5) {
                            umur = (period.getYears() * 12) + (period.getMonths());
                        } else if (period.getYears() == 5) {
                            if (period.getMonths() == 0) {
                                umur = (period.getYears() * 12) + (period.getMonths());
                            } else {
                                int bulhasconv = -1;
                                if (period.getMonths() <= 5) {
                                    if (period.getMonths() < 3) {
                                        bulhasconv = 0;
                                    } else {
                                        bulhasconv = 5;
                                    }
                                    thnhasconv = period.getYears();
                                } else {
                                    if (period.getMonths() < 8) {
                                        bulhasconv = 5;
                                        thnhasconv = period.getYears();
                                    } else {
                                        bulhasconv = 0;
                                        thnhasconv = period.getYears() + 1;
                                    }
                                }
                                umur = (thnhasconv * 12) + bulhasconv;
                            }
                        } else {
                            int bulhasconv = -1;
                            if (period.getMonths() <= 5) {
                                if (period.getMonths() < 3) {
                                    bulhasconv = 0;
                                } else {
                                    bulhasconv = 5;
                                }
                                thnhasconv = period.getYears();
                            } else {
                                if (period.getMonths() < 8) {
                                    bulhasconv = 5;
                                    thnhasconv = period.getYears();
                                } else {
                                    bulhasconv = 0;
                                    thnhasconv = period.getYears() + 1;
                                }
                            }
                            umur = (thnhasconv * 12) + bulhasconv;
                        }
                        String jk = "";
                        if (da.getJenisKelamin().equals("Perempuan")) {
                            jk = "P";
                        } else {
                            jk = "L";
                        }
                        DataKesimpulan dk;
                        if (da.isAdaFoto()) {
                            dk = new DataKesimpulan(da.getNama(), da.getJenisKelamin(), "TinggiUmur", umur, da.getTinggi(), umur, da.getFoto());
                        } else {
                            dk = new DataKesimpulan(da.getNama(), da.getJenisKelamin(), "TinggiUmur", umur, da.getTinggi(), umur);
                        }
                        Intent intent = new Intent(getApplicationContext(), Kesimpulan.class);
                        intent.putExtra("dataKesimpulan", dk);
                        startActivity(intent);
                    } else if (options[which].equals("Kurva berat badan menurut tinggi badan")) {
                        Toast.makeText(DetailProfil.this, "Coming soon !", Toast.LENGTH_SHORT).show();
                    } else if (options[which].equals("Lihat nanti")) {
                        dialog.dismiss();
                    }
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }
    }

    private void lihatKesimpulanTinggiUmur(int tinggi, int umur, String jk) {
        TBUmur tb = new TBUmur(umur, tinggi, jk);
        tb.TBUmur();
        View view = View.inflate(getApplicationContext(), R.layout.layout_status, null);
        TextView nm = (TextView) view.findViewById(R.id.txtNama);
        CircleImageView gambar = (CircleImageView) view.findViewById(R.id.gambar_anak);
        TextView stat = (TextView) view.findViewById(R.id.txtStatus);
        Button done = (Button) view.findViewById(R.id.btnSelesai);
        nm.setText(da.getNama());
        if (!da.isAdaFoto()) {
            if (da.getJenisKelamin().equals("Perempuan")) {
                Picasso.with(getApplicationContext()).load(R.drawable.girl).fit().into(gambar);
            } else {
                Picasso.with(getApplicationContext()).load(R.drawable.boybig).fit().into(gambar);
            }
        } else {
            byte[] image = da.getFoto();
            Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
            gambar.setImageBitmap(bitmap);
        }
        stat.setText(tb.getKeterangan() + tb.getKeterangan() + tb.getKeterangan());
        mMaterialDialog = new MaterialDialog(DetailProfil.this)
                .setView(view);
        mMaterialDialog.show();
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
    }

    private void lihatKesimpulanBBUmur(int berat, int umur, String jk) {
        BeratUmur bu = new BeratUmur(berat, umur, jk);
        bu.BBumur();
        View view = View.inflate(getApplicationContext(), R.layout.layout_status, null);
        TextView nm = (TextView) view.findViewById(R.id.txtNama);
        CircleImageView gambar = (CircleImageView) view.findViewById(R.id.gambar_anak);
        TextView stat = (TextView) view.findViewById(R.id.txtStatus);
        Button done = (Button) view.findViewById(R.id.btnSelesai);
        nm.setText(da.getNama());
        if (!da.isAdaFoto()) {
            if (da.getJenisKelamin().equals("Perempuan")) {
                Picasso.with(getApplicationContext()).load(R.drawable.girl).fit().into(gambar);
            } else {
                Picasso.with(getApplicationContext()).load(R.drawable.boybig).fit().into(gambar);
            }
        } else {
            byte[] image = da.getFoto();
            Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
            gambar.setImageBitmap(bitmap);
        }
        stat.setText(bu.getKeterangan());
        mMaterialDialog = new MaterialDialog(DetailProfil.this)
                .setView(view);
        mMaterialDialog.show();
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
    }
}
