package com.kp.mwi.gizianak;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.kp.mwi.gizianak.Model.DataAnak;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class EditProfile extends AppCompatActivity implements View.OnClickListener {
    private MaterialEditText edBerat, edTinggi;
    private CircleImageView photo;
    private ImageView camera;
    private boolean result, adaFoto;
    private String userChoosenTask;
    private int REQUEST_CAMERA = 0, SELECT_FILE = 1;
    DataAnak dataAnak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edBerat = (MaterialEditText) findViewById(R.id.edBerat);
        edTinggi = (MaterialEditText) findViewById(R.id.edTinggi);
        photo = (CircleImageView) findViewById(R.id.gambar_anak);
        camera = (ImageView) findViewById(R.id.btnCamera);


        photo.setOnClickListener(this);
        camera.setOnClickListener(this);

        Bundle b = getIntent().getExtras();
        if (b != null) {
            dataAnak = b.getParcelable("data");
            if (!dataAnak.isAdaFoto()) {
                adaFoto = false;
                if (dataAnak.getJenisKelamin().equals("Perempuan")) {
                    Picasso.with(this).load(R.drawable.girl).fit().into(photo);
                } else {
                    Picasso.with(this).load(R.drawable.boybig).fit().into(photo);
                }
            } else {
                adaFoto = true;
                byte[] image = dataAnak.getFoto();
                Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
                photo.setImageBitmap(bitmap);
            }
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_done) {
            if (adaFoto) {
                if (edBerat.getText().toString().equals("") && !edTinggi.getText().toString().equals("")) {
                    byte[] gambar = imageViewtoByte(photo);
                    String nama = dataAnak.getNama();
                    String jk = dataAnak.getJenisKelamin();
                    String lahir = dataAnak.getTglLahir();
                    int weight = dataAnak.getBerat();
                    int height = Integer.parseInt(edTinggi.getText().toString());
                    DataAnak baru = new DataAnak(nama, jk, lahir, weight, height, gambar);
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(dataAnak.getUniqid()));
                    DataAnak lama = as.get(0);
                    lama.delete();
                    baru.save();
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", baru);
                    startActivity(intent);
                    finish();
                } else if (!edBerat.getText().toString().equals("") && edTinggi.getText().toString().equals("")) {
                    byte[] gambar = imageViewtoByte(photo);
                    String nama = dataAnak.getNama();
                    String jk = dataAnak.getJenisKelamin();
                    String lahir = dataAnak.getTglLahir();
                    int weight = Integer.parseInt(edBerat.getText().toString());
                    int height = dataAnak.getTinggi();
                    DataAnak baru = new DataAnak(nama, jk, lahir, weight, height, gambar);
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(dataAnak.getUniqid()));
                    DataAnak lama = as.get(0);
                    lama.delete();
                    baru.save();
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", baru);
                    startActivity(intent);
                    finish();
                } else if (!edBerat.getText().toString().equals("") && !edTinggi.getText().toString().equals("")) {
                    byte[] gambar = imageViewtoByte(photo);
                    String nama = dataAnak.getNama();
                    String jk = dataAnak.getJenisKelamin();
                    String lahir = dataAnak.getTglLahir();
                    int weight = Integer.parseInt(edBerat.getText().toString());
                    int height = Integer.parseInt(edTinggi.getText().toString());
                    DataAnak baru = new DataAnak(nama, jk, lahir, weight, height, gambar);
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(dataAnak.getUniqid()));
                    DataAnak lama = as.get(0);
                    lama.delete();
                    baru.save();
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", baru);
                    startActivity(intent);
                    finish();
                } else {
                    byte[] gambar = imageViewtoByte(photo);
                    String nama = dataAnak.getNama();
                    String jk = dataAnak.getJenisKelamin();
                    String lahir = dataAnak.getTglLahir();
                    int weight = dataAnak.getBerat();
                    int height = dataAnak.getTinggi();
                    DataAnak baru = new DataAnak(nama, jk, lahir, weight, height, gambar);
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(dataAnak.getUniqid()));
                    DataAnak lama = as.get(0);
                    lama.delete();
                    baru.save();
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", baru);
                    startActivity(intent);
                    finish();
                }
            } else {
                if (edBerat.getText().toString().equals("") && !edTinggi.getText().toString().equals("")) {
                    String nama = dataAnak.getNama();
                    String jk = dataAnak.getJenisKelamin();
                    String lahir = dataAnak.getTglLahir();
                    int weight = dataAnak.getBerat();
                    int height = Integer.parseInt(edTinggi.getText().toString());
                    DataAnak baru = new DataAnak(nama, jk, lahir, weight, height);
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(dataAnak.getUniqid()));
                    DataAnak lama = as.get(0);
                    lama.delete();
                    baru.save();
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", baru);
                    startActivity(intent);
                    finish();
                } else if (!edBerat.getText().toString().equals("") && edTinggi.getText().toString().equals("")) {
                    String nama = dataAnak.getNama();
                    String jk = dataAnak.getJenisKelamin();
                    String lahir = dataAnak.getTglLahir();
                    int weight = Integer.parseInt(edBerat.getText().toString());
                    int height = dataAnak.getTinggi();
                    DataAnak baru = new DataAnak(nama, jk, lahir, weight, height);
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(dataAnak.getUniqid()));
                    DataAnak lama = as.get(0);
                    lama.delete();
                    baru.save();
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", baru);
                    startActivity(intent);
                    finish();
                } else if (!edBerat.getText().toString().equals("") && !edTinggi.getText().toString().equals("")) {
                    String nama = dataAnak.getNama();
                    String jk = dataAnak.getJenisKelamin();
                    String lahir = dataAnak.getTglLahir();
                    int weight = Integer.parseInt(edBerat.getText().toString());
                    int height = Integer.parseInt(edTinggi.getText().toString());
                    DataAnak baru = new DataAnak(nama, jk, lahir, weight, height);
                    List<DataAnak> as = DataAnak.find(DataAnak.class, "uniqid = ?", String.valueOf(dataAnak.getUniqid()));
                    DataAnak lama = as.get(0);
                    lama.delete();
                    baru.save();
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", baru);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(EditProfile.this, DetailProfil.class);
                    intent.putExtra("data", dataAnak);
                    startActivity(intent);
                    finish();
                }
            }

        } else if (id == android.R.id.home) {
            Intent intent = new Intent(EditProfile.this, DetailProfil.class);
            intent.putExtra("data", dataAnak);
            startActivity(intent);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if (v == photo || v == camera) {
            ambilFoto();
        }
    }

    private byte[] imageViewtoByte(ImageView image) {
        Bitmap bitmap = ((BitmapDrawable) image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

    private void ambilFoto() {
        final CharSequence[] options = {"Ambil Foto", "Pilih dari Galeri", "Batal"};
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.myDialog));
        builder.setTitle("Pilih Foto");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (options[which].equals("Batal")) {
                    dialog.dismiss();
                } else if (options[which].equals("Ambil Foto")) {
                    userChoosenTask = "Ambil Foto";
                    result = Utility.checkPermission(getApplicationContext());
                    if (result) {
                        cameraIntent();
                    }
                } else if (options[which].equals("Pilih dari Galeri")) {
                    userChoosenTask = "Pilih dari Galeri";
                    result = Utility.checkPermission(getApplicationContext());
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
        Picasso.with(getApplicationContext()).load(Uri.fromFile(destination)).fit().into(photo);
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
                bm = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), data.getData());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        adaFoto = true;
        Picasso.with(getApplicationContext()).load(data.getData()).fit().into(photo);
    }
}
