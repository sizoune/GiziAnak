package com.kp.mwi.gizianak.Fragment;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Typeface;
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

import fr.ganfra.materialspinner.MaterialSpinner;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdentitasBaruFragment extends Fragment implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    private MaterialSpinner spinner;
    private MaterialEditText nama, lahir, tahun, bulan, berat, tinggi;
    private Button foto, simpan;
    private ImageView preview;
    boolean result;
    private int REQUEST_CAMERA = 0, SELECT_FILE = 1;

    public IdentitasBaruFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_identitas_baru, container, false);

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
                Toast.makeText(IdentitasBaruFragment.this.getContext(), "Benar", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(IdentitasBaruFragment.this.getContext(), "Belum Lengkap !", Toast.LENGTH_SHORT).show();
            }
        }
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
        String bulan = "";
        if ((++monthOfYear) == 1) {
            bulan = "Januari";
        } else if ((++monthOfYear) == 2) {
            bulan = "Februari";
        } else if ((++monthOfYear) == 3) {
            bulan = "Maret";
        } else if ((++monthOfYear) == 4) {
            bulan = "April";
        } else if ((++monthOfYear) == 5) {
            bulan = "Mei";
        } else if ((++monthOfYear) == 6) {
            bulan = "Juni";
        } else if ((++monthOfYear) == 7) {
            bulan = "Juli";
        } else if ((++monthOfYear) == 8) {
            bulan = "Agustus";
        } else if ((++monthOfYear) == 9) {
            bulan = "September";
        } else if ((++monthOfYear) == 10) {
            bulan = "Oktober";
        } else if ((++monthOfYear) == 11) {
            bulan = "November";
        } else if ((++monthOfYear) == 12) {
            bulan = "Desember";
        }
        lahir.setText(dayOfMonth + " " + bulan + " " + year);
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
                    result = Utility.checkPermission(IdentitasBaruFragment.this.getContext());
                    if (result) {
                        cameraIntent();
                    }
                } else if (options[which].equals("Pilih dari Galeri")) {
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

        Picasso.with(IdentitasBaruFragment.this.getContext()).load(data.getData()).fit().into(preview);
        preview.setVisibility(View.VISIBLE);
    }

}
