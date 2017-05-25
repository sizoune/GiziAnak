package com.kp.mwi.gizianak.Fragment;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
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
import com.kp.mwi.gizianak.Model.DataAnak;
import com.kp.mwi.gizianak.R;
import com.kp.mwi.gizianak.Utility;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.squareup.picasso.Picasso;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import fr.ganfra.materialspinner.MaterialSpinner;

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

    public IdentitasBaruFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
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
                if (!tahun.getText().toString().equals("")) {
                    String namas = nama.getText().toString();
                    String jk = spinner.getSelectedItem().toString();
                    String tglLahir = lahir.getText().toString();
                    int weight = Integer.parseInt(berat.getText().toString());
                    int height = Integer.parseInt(tinggi.getText().toString());
                    if (adaFoto) {
//                        Toast.makeText(IdentitasBaruFragment.this.getContext(), "ada Foto", Toast.LENGTH_SHORT).show();
                        byte[] gambar = imageViewtoByte(preview);
                        DataAnak da = new DataAnak(namas, jk, tglLahir, weight, height, gambar);
                        String uniqid = namas + lahir;
                        List<DataAnak> cekData = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(uniqid));
                        if (cekData.size() <= 0) {
                            da.save();
                            Toast.makeText(IdentitasBaruFragment.this.getContext(), "Data berhasil disimpan !", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(IdentitasBaruFragment.this.getContext(), "Data anak anda sudah terdaftar !", Toast.LENGTH_SHORT).show();
                        }
                        clearAll();
                    } else {
//                        Toast.makeText(IdentitasBaruFragment.this.getContext(), "tanpa Foto", Toast.LENGTH_SHORT).show();
                        DataAnak da = new DataAnak(namas, jk, tglLahir, weight, height);
                        String uniqid = namas + lahir;
                        List<DataAnak> cekData = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(uniqid));
                        if (cekData.size() <= 0) {
                            da.save();
                            Toast.makeText(IdentitasBaruFragment.this.getContext(), "Data berhasil disimpan !", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(IdentitasBaruFragment.this.getContext(), "Data anak anda sudah terdaftar !", Toast.LENGTH_SHORT).show();
                        }
                        clearAll();
                    }
                } else {

                }
            } else {
                Toast.makeText(IdentitasBaruFragment.this.getContext(), "Data masih ada yang salah / tidak lengkap !", Toast.LENGTH_SHORT).show();
            }
        }
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
    }

    private byte[] imageViewtoByte(ImageView image) {
        Bitmap bitmap = ((BitmapDrawable) image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

    private boolean cekValidasiData() {
        if (!nama.getText().toString().equals("") && !spinner.getSelectedItem().toString().equals("Jenis Kelamin")
                && (!lahir.getText().toString().equals("") || (!tahun.getText().toString().equals("") && !bulan.getText().toString().equals("")))
                && !berat.getText().toString().equals("") && !tinggi.getText().toString().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        lahir.setText(dayOfMonth + " " + convertBulan(++monthOfYear) + " " + year);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case Utility.MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE:
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
