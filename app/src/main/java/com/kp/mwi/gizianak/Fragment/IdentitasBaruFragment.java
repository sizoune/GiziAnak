package com.kp.mwi.gizianak.Fragment;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kp.mwi.gizianak.MainActivity;
import com.kp.mwi.gizianak.Model.BeratUmur;
import com.kp.mwi.gizianak.Model.DataAnak;
import com.kp.mwi.gizianak.Model.TBUmur;
import com.kp.mwi.gizianak.R;
import com.kp.mwi.gizianak.Utility;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.squareup.picasso.Picasso;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import net.danlew.android.joda.JodaTimeAndroid;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import fr.ganfra.materialspinner.MaterialSpinner;
import me.drakeet.materialdialog.MaterialDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdentitasBaruFragment extends Fragment implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    private MaterialSpinner spinner;
    private MaterialEditText nama, lahir, tahun, bulan, berat, tinggi;
    private Button foto, simpan;
    private ImageView preview;
    boolean result, adaFoto;
    private int REQUEST_CAMERA = 0, SELECT_FILE = 1;
    private String userChoosenTask;
    private MaterialDialog mMaterialDialog;
    private DataAnak anakUniv;


    public IdentitasBaruFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        JodaTimeAndroid.init(IdentitasBaruFragment.this.getContext());
        View v = inflater.inflate(R.layout.fragment_identitas_baru, container, false);
        adaFoto = false;
        result = false;
//        TextView tx = (TextView) v.findViewById(R.id.judul);
//        Typeface custom_font = Typeface.createFromAsset(IdentitasBaruFragment.this.getActivity().getAssets(), "fonts/roboto.ttf");
//        tx.setTypeface(custom_font);
        String[] layanan = {"Laki-laki", "Perempuan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentitasBaruFragment.this.getContext(), android.R.layout.simple_spinner_item, layanan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = (MaterialSpinner) v.findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);

        lahir = (MaterialEditText) v.findViewById(R.id.edTgllahir);
        foto = (Button) v.findViewById(R.id.btnFoto);
        simpan = (Button) v.findViewById(R.id.btnSimpan);
        nama = (MaterialEditText) v.findViewById(R.id.edNama);
        preview = (ImageView) v.findViewById(R.id.preview);
        tahun = (MaterialEditText) v.findViewById(R.id.edTahun);
        bulan = (MaterialEditText) v.findViewById(R.id.edBulan);
        berat = (MaterialEditText) v.findViewById(R.id.edBerat);
        tinggi = (MaterialEditText) v.findViewById(R.id.edTinggi);

        foto.setOnClickListener(this);
        simpan.setOnClickListener(this);
        lahir.setOnClickListener(this);
        preview.setVisibility(View.GONE);
        return v;
    }

    @Override
    public void onClick(View v) {
        if (v == lahir) {
            Calendar now = Calendar.getInstance();
            DatePickerDialog dpd = DatePickerDialog.newInstance(
                    IdentitasBaruFragment.this,
                    now.get(Calendar.YEAR),
                    now.get(Calendar.MONTH),
                    now.get(Calendar.DAY_OF_MONTH)
            );
            dpd.setAccentColor(ContextCompat.getColor(IdentitasBaruFragment.this.getContext(), R.color.hijauaplikasi));
            dpd.dismissOnPause(true);
            dpd.showYearPickerFirst(true);
            dpd.setVersion(DatePickerDialog.Version.VERSION_2);
            dpd.show(IdentitasBaruFragment.this.getActivity().getFragmentManager(), "Date");
        } else if (v == foto) {
            ambilFoto();
        } else if (v == simpan) {
            if (cekValidasiData()) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(IdentitasBaruFragment.this.getContext());
                builder.setTitle("Konfirmasi Data");
                builder.setMessage("Apakah anda yakin data yang sudah diisi benar ?");
                builder.setPositiveButton("YAKIN", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (!lahir.getText().toString().equals("")) {
                            String namas = nama.getText().toString();
                            String jk = spinner.getSelectedItem().toString();
                            int weight = Integer.parseInt(berat.getText().toString());
                            int height = Integer.parseInt(tinggi.getText().toString());
                            if (adaFoto) {
                                byte[] gambar = imageViewtoByte(preview);
                                DataAnak da = new DataAnak(namas, jk, lahir.getText().toString(), weight, height, gambar);
                                anakUniv = da;
                                da.save();
                                cekStatus();
                                clearAll();
                            } else {
                                DataAnak da = new DataAnak(namas, jk, lahir.getText().toString(), weight, height);
                                anakUniv = da;
                                da.save();
                                cekStatus();
                                clearAll();
                            }
                        } else {
                            if (cekBulan(Integer.parseInt(bulan.getText().toString()))) {
                                String tglLahir = "";
                                int monthNow = Calendar.getInstance().get(Calendar.MONTH);
                                int year = Calendar.getInstance().get(Calendar.YEAR);
                                int month = Integer.parseInt(bulan.getText().toString());
                                int tahunlahir = 0;
                                int selesihbulanLahir = 0;
                                if (month > monthNow) {
                                    tahunlahir = year - (Integer.parseInt(tahun.getText().toString())) - 1;
                                    int temp = monthNow - month;
                                    if (temp == -1) {
                                        selesihbulanLahir = 12;
                                    } else if (temp == -2) {
                                        selesihbulanLahir = 11;
                                    } else if (temp == -3) {
                                        selesihbulanLahir = 10;
                                    } else if (temp == -4) {
                                        selesihbulanLahir = 9;
                                    } else if (temp == -5) {
                                        selesihbulanLahir = 8;
                                    } else if (temp == -6) {
                                        selesihbulanLahir = 7;
                                    } else if (temp == -7) {
                                        selesihbulanLahir = 6;
                                    } else if (temp == -8) {
                                        selesihbulanLahir = 5;
                                    } else if (temp == -9) {
                                        selesihbulanLahir = 4;
                                    } else if (temp == -10) {
                                        selesihbulanLahir = 3;
                                    } else if (temp == -11) {
                                        selesihbulanLahir = 2;
                                    } else if (temp == -12) {
                                        selesihbulanLahir = 1;
                                    }
                                } else {
                                    tahunlahir = year - Integer.parseInt(tahun.getText().toString());
                                    selesihbulanLahir = (monthNow + 1) - month;
                                }
                                int bulanLahir = getmonthCal(selesihbulanLahir);
                                int iDay = 1;
                                Calendar mycal = new GregorianCalendar(tahunlahir, bulanLahir, iDay);
                                int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
                                tglLahir = Integer.toString(daysInMonth) + " " + convertBulan(bulanLahir + 1) + " " + Integer.toString(tahunlahir);
                                String namas = nama.getText().toString();
                                String jk = spinner.getSelectedItem().toString();
                                int weight = Integer.parseInt(berat.getText().toString());
                                int height = Integer.parseInt(tinggi.getText().toString());
                                if (adaFoto) {
                                    byte[] gambar = imageViewtoByte(preview);
                                    DataAnak da = new DataAnak(namas, jk, tglLahir, weight, height, gambar);
                                    anakUniv = da;
                                    da.save();
                                    cekStatus();
                                    clearAll();
                                } else {
                                    DataAnak da = new DataAnak(namas, jk, tglLahir, weight, height);
                                    anakUniv = da;
                                    da.save();
                                    cekStatus();
                                    clearAll();
                                }
                            } else {
                                Toast.makeText(IdentitasBaruFragment.this.getContext(), "Usia bulan anda tidak valid !", Toast.LENGTH_SHORT).show();
                                bulan.setText("");
                            }
                        }
                    }
                });
                builder.setNegativeButton("PERIKSA LAGI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create();
                builder.show();
            } else {
                Toast.makeText(IdentitasBaruFragment.this.getContext(), "Data masih ada yang salah / tidak lengkap !", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void cekStatus() {
        final CharSequence[] options = {"Kurva berat badan menurut umur", "Kurva tinggi badan menurut umur", "Kurva berat badan menurut tinggi badan", "Lihat nanti"};
        AlertDialog.Builder builder = new AlertDialog.Builder(IdentitasBaruFragment.this.getContext());
        builder.setTitle("Lihat Status Anak");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (options[which].equals("Kurva berat badan menurut umur")) {
                    LocalDate now = new LocalDate();
                    String[] sp = anakUniv.getTglLahir().split(" ");
                    int tanggal = Integer.parseInt(sp[0]);
                    String bulan = sp[1];
                    int thn = Integer.parseInt(sp[2]);
                    LocalDate birth = new LocalDate(thn, convertBulan1(bulan), tanggal);
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
                    if (anakUniv.getJenisKelamin().equals("Perempuan")) {
                        jk = "P";
                    } else {
                        jk = "L";
                    }
                    lihatKesimpulanBBUmur(anakUniv.getBerat(), umur, jk);
                } else if (options[which].equals("Kurva tinggi badan menurut umur")) {
                    LocalDate now = new LocalDate();
                    String[] sp = anakUniv.getTglLahir().split(" ");
                    int tanggal = Integer.parseInt(sp[0]);
                    String bulan = sp[1];
                    int thn = Integer.parseInt(sp[2]);
                    LocalDate birth = new LocalDate(thn, convertBulan1(bulan), tanggal);
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
                    if (anakUniv.getJenisKelamin().equals("Perempuan")) {
                        jk = "P";
                    } else {
                        jk = "L";
                    }
                    lihatKesimpulanTinggiUmur(anakUniv.getTinggi(), umur, jk);
                } else if (options[which].equals("Kurva berat badan menurut tinggi badan")) {
                    Toast.makeText(IdentitasBaruFragment.this.getContext(), "Coming soon !", Toast.LENGTH_SHORT).show();
                } else if (options[which].equals("Lihat nanti")) {
                    dialog.dismiss();
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void lihatKesimpulanTinggiUmur(int tinggi, int umur, String jk) {
        TBUmur tb = new TBUmur(umur, tinggi, jk);
        tb.TBUmur();
        View view = View.inflate(getContext(), R.layout.layout_status, null);
        TextView nm = (TextView) view.findViewById(R.id.txtNama);
        CircleImageView gambar = (CircleImageView) view.findViewById(R.id.gambar_anak);
        TextView stat = (TextView) view.findViewById(R.id.txtStatus);
        Button done = (Button) view.findViewById(R.id.btnSelesai);
        nm.setText(anakUniv.getNama());
        if (!anakUniv.isAdaFoto()) {
            if (anakUniv.getJenisKelamin().equals("Perempuan")) {
                Picasso.with(IdentitasBaruFragment.this.getContext()).load(R.drawable.girl).fit().into(gambar);
            } else {
                Picasso.with(IdentitasBaruFragment.this.getContext()).load(R.drawable.boybig).fit().into(gambar);
            }
        } else {
            byte[] image = anakUniv.getFoto();
            Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
            gambar.setImageBitmap(bitmap);
        }
        stat.setText(tb.getKeterangan());
        mMaterialDialog = new MaterialDialog(IdentitasBaruFragment.this.getContext())
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
        View view = View.inflate(getContext(), R.layout.layout_status, null);
        TextView nm = (TextView) view.findViewById(R.id.txtNama);
        CircleImageView gambar = (CircleImageView) view.findViewById(R.id.gambar_anak);
        TextView stat = (TextView) view.findViewById(R.id.txtStatus);
        Button done = (Button) view.findViewById(R.id.btnSelesai);
        nm.setText(anakUniv.getNama());
        if (!anakUniv.isAdaFoto()) {
            if (anakUniv.getJenisKelamin().equals("Perempuan")) {
                Picasso.with(IdentitasBaruFragment.this.getContext()).load(R.drawable.girl).fit().into(gambar);
            } else {
                Picasso.with(IdentitasBaruFragment.this.getContext()).load(R.drawable.boybig).fit().into(gambar);
            }
        } else {
            byte[] image = anakUniv.getFoto();
            Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
            gambar.setImageBitmap(bitmap);
        }
        stat.setText(bu.getKeterangan());
        mMaterialDialog = new MaterialDialog(IdentitasBaruFragment.this.getContext())
                .setView(view);
        mMaterialDialog.show();
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
    }

    public int convertBulan1(String angka) {
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

    private int getmonthCal(int angka) {
        int a = -1;
        if (angka == 1) {
            a = Calendar.JANUARY;
        } else if (angka == 2) {
            a = Calendar.FEBRUARY;
        } else if (angka == 3) {
            a = Calendar.MARCH;
        } else if (angka == 4) {
            a = Calendar.APRIL;
        } else if (angka == 5) {
            a = Calendar.MAY;
        } else if (angka == 6) {
            a = Calendar.JUNE;
        } else if (angka == 7) {
            a = Calendar.JULY;
        } else if (angka == 8) {
            a = Calendar.AUGUST;
        } else if (angka == 9) {
            a = Calendar.SEPTEMBER;
        } else if (angka == 10) {
            a = Calendar.OCTOBER;
        } else if (angka == 11) {
            a = Calendar.NOVEMBER;
        } else if (angka == 12) {
            a = Calendar.DECEMBER;
        }
        return a;
    }

    private void clearAll() {
        nama.setText("");
        spinner.setSelection(0);
        lahir.setText("");
        tahun.setText("");
        bulan.setText("");
        berat.setText("");
        tinggi.setText("");
        preview.setVisibility(View.GONE);
        adaFoto = false;
    }

    private byte[] imageViewtoByte(ImageView image) {
        Bitmap bitmap = ((BitmapDrawable) image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

    private boolean cekBulan(int num) {
        if (num < 0 || num > 12) {
            return false;
        } else {
            return true;
        }
    }

    private boolean cekValidasiData() {
        if (!nama.getText().toString().equals("") && !spinner.getSelectedItem().toString().equals("Jenis Kelamin")
                && !berat.getText().toString().equals("") && !tinggi.getText().toString().equals("")) {
            if (lahir.getText().toString().equals("")) {
                if (!tahun.getText().toString().equals("") && !bulan.getText().toString().equals("")) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, (++monthOfYear), dayOfMonth);
        Calendar today = Calendar.getInstance();
        if (birthday.after(today)) {
            Toast.makeText(IdentitasBaruFragment.this.getContext(), "Maaf Tanggal Lahir anda tidak valid !", Toast.LENGTH_SHORT).show();
        } else {
            lahir.setText(dayOfMonth + " " + convertBulan(monthOfYear) + " " + year);
            LocalDate now = new LocalDate();
            LocalDate birth = new LocalDate(year, monthOfYear, dayOfMonth);
            Period period = new Period(birth, now, PeriodType.yearMonthDay());
            tahun.setText(Integer.toString(period.getYears()));
            bulan.setText(Integer.toString(period.getMonths()));
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case Utility.MY_PERMISSIONS_REQUEST_CAMERA:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (userChoosenTask.equals("Ambil Foto"))
                        cameraIntent();
                    else if (userChoosenTask.equals("Pilih dari Galeri"))
                        galleryIntent();
                } else {
                    //code for deny
                }
                break;
        }
    }

    private void ambilFoto() {
        final CharSequence[] options = {"Ambil Foto", "Pilih dari Galeri", "Batal"};
        AlertDialog.Builder builder = new AlertDialog.Builder(IdentitasBaruFragment.this.getContext());
        builder.setTitle("Pilih Foto");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (options[which].equals("Batal")) {
                    dialog.dismiss();
                } else if (options[which].equals("Ambil Foto")) {
                    userChoosenTask = "Ambil Foto";
                    result = Utility.checkPermission(IdentitasBaruFragment.this.getContext());
                    if (result) {
                        cameraIntent();
                    }
                } else if (options[which].equals("Pilih dari Galeri")) {
                    userChoosenTask = "Pilih dari Galeri";
                    result = Utility.checkPermission(IdentitasBaruFragment.this.getContext());
                    if (result) {
                        galleryIntent();
                    }
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void cameraIntent() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE) {
                onSelectFromGalleryResult(data);
            } else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
        }
    }

    private void onCaptureImageResult(Intent data) {
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        thumbnail.compress(Bitmap.CompressFormat.JPEG, 90, bytes);

        File destination = new File(Environment.getExternalStorageDirectory(),
                System.currentTimeMillis() + ".jpg");

        FileOutputStream fo;
        try {
            destination.createNewFile();
            fo = new FileOutputStream(destination);
            fo.write(bytes.toByteArray());
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        adaFoto = true;
        Picasso.with(IdentitasBaruFragment.this.getContext()).load(Uri.fromFile(destination)).fit().into(preview);
        preview.setVisibility(View.VISIBLE);
    }

    private void galleryIntent() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//
        startActivityForResult(Intent.createChooser(intent, "Select File"), SELECT_FILE);
    }

    @SuppressWarnings("deprecation")
    private void onSelectFromGalleryResult(Intent data) {

        Bitmap bm = null;
        if (data != null) {
            try {
                bm = MediaStore.Images.Media.getBitmap(IdentitasBaruFragment.this.getContext().getContentResolver(), data.getData());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        adaFoto = true;
        Picasso.with(IdentitasBaruFragment.this.getContext()).load(data.getData()).fit().into(preview);
        preview.setVisibility(View.VISIBLE);
    }

    public String convertBulan(int angka) {
        String bulan = "";
        if (angka == 1) {
            bulan = "Januari";
        } else if (angka == 2) {
            bulan = "Februari";
        } else if (angka == 3) {
            bulan = "Maret";
        } else if (angka == 4) {
            bulan = "April";
        } else if (angka == 5) {
            bulan = "Mei";
        } else if (angka == 6) {
            bulan = "Juni";
        } else if (angka == 7) {
            bulan = "Juli";
        } else if (angka == 8) {
            bulan = "Agustus";
        } else if (angka == 9) {
            bulan = "September";
        } else if (angka == 10) {
            bulan = "Oktober";
        } else if (angka == 11) {
            bulan = "November";
        } else if (angka == 12) {
            bulan = "Desember";
        }
        return bulan;
    }

}
