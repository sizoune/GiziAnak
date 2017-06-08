package com.kp.mwi.gizianak;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.kp.mwi.gizianak.Model.BBTinggi;
import com.kp.mwi.gizianak.Model.BeratUmur;
import com.kp.mwi.gizianak.Model.DataKesimpulan;
import com.kp.mwi.gizianak.Model.TBUmur;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.UUID;

import de.hdodenhof.circleimageview.CircleImageView;

public class Kesimpulan extends AppCompatActivity implements View.OnClickListener {
    private TextView nama, status;
    private CircleImageView gambar;
    private Button btnSelesai, btnKurva;
    private String jk = "";
    private LineChart chart;
    private DataKesimpulan dk;
    private double bmi;
    private View rootView;
    private ImageView bagikan;
    private static File file;
    private ScrollView scrollLayout;
    private TextView sumber, judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesimpulan);

        scrollLayout = (ScrollView) findViewById(R.id.scroller);

        nama = (TextView) findViewById(R.id.txtNama);
        status = (TextView) findViewById(R.id.txtStatus);
        gambar = (CircleImageView) findViewById(R.id.gambar_anak);
        btnSelesai = (Button) findViewById(R.id.btnSelesai);
        btnKurva = (Button) findViewById(R.id.btnKurva);
        chart = (LineChart) findViewById(R.id.chart);
        bagikan = (ImageView) findViewById(R.id.shareit);
        sumber = (TextView) findViewById(R.id.txtSumber);
        judul = (TextView) findViewById(R.id.txtSumber1);

        sumber.setVisibility(View.GONE);
        judul.setVisibility(View.GONE);

        btnSelesai.setOnClickListener(this);
        btnKurva.setOnClickListener(this);
        bagikan.setOnClickListener(this);

        chart.setVisibility(View.GONE);
        chart.setNoDataText("Maaf kurva anda belum tersedia untuk saat ini !");

        Bundle b = getIntent().getExtras();
        if (b != null) {
            dk = b.getParcelable("dataKesimpulan");
//            Toast.makeText(this, Integer.toString(dk.getUmur()), Toast.LENGTH_SHORT).show();
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
                TBUmur tu = new TBUmur(dk.getUmur(), dk.getTitikY(), jk);
                tu.TBUmur();
                status.setText(tu.getKeterangan());
            } else if (dk.getStatus().equals("BeratTinggi")) {
                BBTinggi bb = new BBTinggi(dk.getTitikY(), dk.getTitikX(), dk.getUmur(), jk);
                bb.hitungBMI();
                bb.BBTinggi();
                bmi = bb.getBmi();
                status.setText(bb.getKeterangan());
            }
            if (dk.getUmur() > 216) {
                btnKurva.setVisibility(View.GONE);
            } else {
                btnKurva.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onClick(View v) {
        if (v == btnSelesai) {
            this.finish();
        } else if (v == btnKurva) {
            //chart.setBackgroundColor(Color.WHITE);
            if (chart.getVisibility() == View.GONE) {
                if (dk.getUmur() < 61) {
                    dibawah5tahun(dk.getTitikX(), dk.getTitikY());
                } else {
                    diatas5tahun(dk.getTitikX(), dk.getTitikY());
                }
                chart.setVisibility(View.VISIBLE);
                btnKurva.setText("Tutup Kurva");
            } else {
                sumber.setVisibility(View.GONE);
                judul.setVisibility(View.GONE);
                chart.setVisibility(View.GONE);
                btnKurva.setText("Lihat Kurva");
            }
        } else if (v == bagikan) {
            rootView = v.getRootView();
            RelativeLayout panjang = (RelativeLayout) scrollLayout.findViewById(R.id.relLong);
            store(loadBitmapFromView(scrollLayout, panjang.getWidth(), panjang.getHeight()), UUID.randomUUID().toString() + ".jpg");
//            store(getScreenShot(rootView), UUID.randomUUID().toString() + ".jpg");
            shareImage(file);
        }
    }

    //take ss in whole screen
    public static Bitmap loadBitmapFromView(View v, int width, int height) {
        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        v.layout(0, 0, v.getLayoutParams().width, v.getLayoutParams().height);
        v.draw(c);
        return b;
    }

    //take ss in screen yang keliatan sekarang
    public static Bitmap getScreenShot(View view) {
        View screenView = view.getRootView();
        screenView.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(screenView.getDrawingCache());
        screenView.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public static void store(Bitmap bm, String fileName) {
        final String dirPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/ScreenshotGiziAnak";
        File dir = new File(dirPath);
        if (!dir.exists())
            dir.mkdirs();
        file = new File(dirPath, fileName);
        try {
            FileOutputStream fOut = new FileOutputStream(file);
            bm.compress(Bitmap.CompressFormat.PNG, 85, fOut);
            fOut.flush();
            fOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void shareImage(File file) {
        Uri uri = null;
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            uri = FileProvider.getUriForFile(getApplicationContext(), getApplicationContext().getPackageName() + ".provider", file);
        } else {
            uri = Uri.fromFile(file);
        }
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("image/*");

        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "");
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        try {
            startActivity(Intent.createChooser(intent, "Share Screenshot"));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getApplicationContext(), "Tidak ada tujuan aplikasi !", Toast.LENGTH_SHORT).show();
        }
    }

    private void diatas5tahun(float sumbx, float sumby) {
        String[] valuesX = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
                , "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"
                , "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36"
                , "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"
                , "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"
                , "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72"
                , "73", "74", "75", "76", "77", "78", "79", "70", "71", "72", "73", "74"
                , "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86"
                , "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98"
                , "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110"
                , "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122"
                , "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134"
                , "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146"
                , "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158"
                , "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170"
                , "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180"
                , "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192"
                , "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204"
                , "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216"};

        ArrayList<Entry> garisG = new ArrayList<>();
        ArrayList<Entry> garisF = new ArrayList<>();
        ArrayList<Entry> garisE = new ArrayList<>();
        ArrayList<Entry> garisD = new ArrayList<>();
        ArrayList<Entry> garisC = new ArrayList<>();
        ArrayList<Entry> garisB = new ArrayList<>();
        ArrayList<Entry> garisA = new ArrayList<>();
        ArrayList<Entry> dataUser = new ArrayList<>();

        dataUser.add(new Entry(sumbx, sumby));

        if (dk.getStatus().equals("BeratUmur")) {
            String[] valuesKg = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
                    , "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"
                    , "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36"
                    , "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"
                    , "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"
                    , "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72"
                    , "73", "74", "75", "76", "77", "78", "79", "70", "71", "72", "73", "74"
                    , "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86"
                    , "87", "88", "89", "90", "91", "92", "93", "94", "95", "96"};

            garisG.add(new Entry(66, 16));
            garisF.add(new Entry(66, 17));
            garisE.add(new Entry(66, 18));
            garisD.add(new Entry(66, 20));
            garisC.add(new Entry(66, 22));
            garisB.add(new Entry(66, 24));
            garisA.add(new Entry(66, 25));

            garisG.add(new Entry(72, 17));
            garisF.add(new Entry(72, 18));
            garisE.add(new Entry(72, 19));
            garisD.add(new Entry(72, 21));
            garisC.add(new Entry(72, 23));
            garisB.add(new Entry(72, 25));
            garisA.add(new Entry(72, 27));

            garisG.add(new Entry(78, 18));
            garisF.add(new Entry(78, 19));
            garisE.add(new Entry(78, 20));
            garisD.add(new Entry(78, 22));
            garisC.add(new Entry(78, 24));
            garisB.add(new Entry(78, 27));
            garisA.add(new Entry(78, 29));

            garisG.add(new Entry(84, 19));
            garisF.add(new Entry(84, 20));
            garisE.add(new Entry(84, 21));
            garisD.add(new Entry(84, 23));
            garisC.add(new Entry(84, 26));
            garisB.add(new Entry(84, 29));
            garisA.add(new Entry(84, 31));

            garisG.add(new Entry(90, 20));
            garisF.add(new Entry(90, 21));
            garisE.add(new Entry(90, 22));
            garisD.add(new Entry(90, 24));
            garisC.add(new Entry(90, 27));
            garisB.add(new Entry(90, 32));
            garisA.add(new Entry(90, 33));

            garisG.add(new Entry(96, 21));
            garisF.add(new Entry(96, 22));
            garisE.add(new Entry(96, 23));
            garisD.add(new Entry(96, 25));
            garisC.add(new Entry(96, 29));
            garisB.add(new Entry(96, 33));
            garisA.add(new Entry(96, 35));

            garisG.add(new Entry(102, 22));
            garisF.add(new Entry(102, 23));
            garisE.add(new Entry(102, 25));
            garisD.add(new Entry(102, 27));
            garisC.add(new Entry(102, 30));
            garisB.add(new Entry(102, 34));
            garisA.add(new Entry(102, 37));

            garisG.add(new Entry(108, 23));
            garisF.add(new Entry(108, 24));
            garisE.add(new Entry(108, 26));
            garisD.add(new Entry(108, 29));
            garisC.add(new Entry(108, 32));
            garisB.add(new Entry(108, 37));
            garisA.add(new Entry(108, 40));

            garisG.add(new Entry(114, 24));
            garisF.add(new Entry(114, 25));
            garisE.add(new Entry(114, 27));
            garisD.add(new Entry(114, 30));
            garisC.add(new Entry(114, 34));
            garisB.add(new Entry(114, 39));
            garisA.add(new Entry(114, 42));

            garisG.add(new Entry(120, 25));
            garisF.add(new Entry(120, 26));
            garisE.add(new Entry(120, 29));
            garisD.add(new Entry(120, 32));
            garisC.add(new Entry(120, 37));
            garisB.add(new Entry(120, 42));
            garisA.add(new Entry(120, 46));

            garisG.add(new Entry(126, 26));
            garisF.add(new Entry(126, 27));
            garisE.add(new Entry(126, 30));
            garisD.add(new Entry(126, 34));
            garisC.add(new Entry(126, 39));
            garisB.add(new Entry(126, 44));
            garisA.add(new Entry(126, 49));

            garisG.add(new Entry(132, 27));
            garisF.add(new Entry(132, 29));
            garisE.add(new Entry(132, 32));
            garisD.add(new Entry(132, 36));
            garisC.add(new Entry(132, 41));
            garisB.add(new Entry(132, 48));
            garisA.add(new Entry(132, 52));

            garisG.add(new Entry(138, 29));
            garisF.add(new Entry(138, 30));
            garisE.add(new Entry(138, 34));
            garisD.add(new Entry(138, 38));
            garisC.add(new Entry(138, 44));
            garisB.add(new Entry(138, 51));
            garisA.add(new Entry(138, 55));

            garisG.add(new Entry(144, 30));
            garisF.add(new Entry(144, 32));
            garisE.add(new Entry(144, 36));
            garisD.add(new Entry(144, 40));
            garisC.add(new Entry(144, 46));
            garisB.add(new Entry(144, 54));
            garisA.add(new Entry(144, 59));

            garisG.add(new Entry(150, 32));
            garisF.add(new Entry(150, 34));
            garisE.add(new Entry(150, 38));
            garisD.add(new Entry(150, 43));
            garisC.add(new Entry(150, 49));
            garisB.add(new Entry(150, 57));
            garisA.add(new Entry(150, 62));

            garisG.add(new Entry(156, 34));
            garisF.add(new Entry(156, 36));
            garisE.add(new Entry(156, 40));
            garisD.add(new Entry(156, 45));
            garisC.add(new Entry(156, 52));
            garisB.add(new Entry(156, 60));
            garisA.add(new Entry(156, 65));

            garisG.add(new Entry(162, 36));
            garisF.add(new Entry(162, 38));
            garisE.add(new Entry(162, 42));
            garisD.add(new Entry(162, 48));
            garisC.add(new Entry(162, 55));
            garisB.add(new Entry(162, 63));
            garisA.add(new Entry(162, 69));

            garisG.add(new Entry(168, 38));
            garisF.add(new Entry(168, 40));
            garisE.add(new Entry(168, 45));
            garisD.add(new Entry(168, 51));
            garisC.add(new Entry(168, 59));
            garisB.add(new Entry(168, 67));
            garisA.add(new Entry(168, 73));

            garisG.add(new Entry(174, 40));
            garisF.add(new Entry(174, 43));
            garisE.add(new Entry(174, 48));
            garisD.add(new Entry(174, 54));
            garisC.add(new Entry(174, 61));
            garisB.add(new Entry(174, 70));
            garisA.add(new Entry(174, 75));

            garisG.add(new Entry(180, 43));
            garisF.add(new Entry(180, 45));
            garisE.add(new Entry(180, 50));
            garisD.add(new Entry(180, 56));
            garisC.add(new Entry(180, 64));
            garisB.add(new Entry(180, 73));
            garisA.add(new Entry(180, 79));

            garisG.add(new Entry(186, 45));
            garisF.add(new Entry(186, 47));
            garisE.add(new Entry(186, 52));
            garisD.add(new Entry(186, 58));
            garisC.add(new Entry(186, 66));
            garisB.add(new Entry(186, 75));
            garisA.add(new Entry(186, 81));

            garisG.add(new Entry(192, 47));
            garisF.add(new Entry(192, 50));
            garisE.add(new Entry(192, 55));
            garisD.add(new Entry(192, 61));
            garisC.add(new Entry(192, 69));
            garisB.add(new Entry(192, 78));
            garisA.add(new Entry(192, 84));

            garisG.add(new Entry(198, 49));
            garisF.add(new Entry(198, 52));
            garisE.add(new Entry(198, 56));
            garisD.add(new Entry(198, 63));
            garisC.add(new Entry(198, 71));
            garisB.add(new Entry(198, 80));
            garisA.add(new Entry(198, 86));

            garisG.add(new Entry(204, 51));
            garisF.add(new Entry(204, 53));
            garisE.add(new Entry(204, 58));
            garisD.add(new Entry(204, 65));
            garisC.add(new Entry(204, 73));
            garisB.add(new Entry(204, 82));
            garisA.add(new Entry(204, 89));

            garisG.add(new Entry(210, 52));
            garisF.add(new Entry(210, 55));
            garisE.add(new Entry(210, 60));
            garisD.add(new Entry(210, 66));
            garisC.add(new Entry(210, 74));
            garisB.add(new Entry(210, 84));
            garisA.add(new Entry(210, 90));

            garisG.add(new Entry(216, 53));
            garisF.add(new Entry(216, 56));
            garisE.add(new Entry(216, 61));
            garisD.add(new Entry(216, 67));
            garisC.add(new Entry(216, 75));
            garisB.add(new Entry(216, 85));
            garisA.add(new Entry(216, 92));

            ArrayList<ILineDataSet> dataSets = new ArrayList<>();

            LineDataSet siUser = new LineDataSet(dataUser, "Titik Anda");
            siUser.setColor(Color.MAGENTA);
            siUser.setCircleColor(Color.MAGENTA);

            LineDataSet datasetG = new LineDataSet(garisG, "");
            datasetG.setDrawCircles(false);
            datasetG.setColor(Color.RED);

            LineDataSet datasetF = new LineDataSet(garisF, "");
            datasetF.setDrawCircles(false);
            datasetF.setColor(Color.YELLOW);

            LineDataSet datasetE = new LineDataSet(garisE, "");
            datasetE.setDrawCircles(false);
            datasetE.setColor(Color.GREEN);

            LineDataSet datasetD = new LineDataSet(garisD, "");
            datasetD.setDrawCircles(false);
            datasetD.setColor(Color.BLACK);

            LineDataSet datasetC = new LineDataSet(garisC, "");
            datasetC.setDrawCircles(false);
            datasetC.setColor(Color.GREEN);

            LineDataSet datasetB = new LineDataSet(garisB, "");
            datasetB.setDrawCircles(false);
            datasetB.setColor(Color.YELLOW);

            LineDataSet datasetA = new LineDataSet(garisA, "");
            datasetA.setDrawCircles(false);
            datasetA.setColor(Color.RED);

            datasetG.setValueFormatter(new MyValueFormatter());
            datasetF.setValueFormatter(new MyValueFormatter());
            datasetE.setValueFormatter(new MyValueFormatter());
            datasetD.setValueFormatter(new MyValueFormatter());
            datasetC.setValueFormatter(new MyValueFormatter());
            datasetB.setValueFormatter(new MyValueFormatter());
            datasetA.setValueFormatter(new MyValueFormatter());

            dataSets.add(datasetG);
            dataSets.add(datasetF);
            dataSets.add(datasetE);
            dataSets.add(datasetD);
            dataSets.add(datasetC);
            dataSets.add(datasetB);
            dataSets.add(datasetA);
            dataSets.add(siUser);

            chart.getXAxis().setValueFormatter(new MyXAxisValueFormatter(valuesX));
            chart.getAxisLeft().setValueFormatter(new MyYAxisValueFormatter(valuesKg));
            chart.getAxisRight().setValueFormatter(new MyYAxisValueFormatter(valuesKg));

            chart.setData(new LineData(dataSets));

            Description description = new Description();
            chart.getLegend().setEnabled(false);
            description.setText("");
            chart.setDescription(description);
            chart.invalidate();

            judul.setVisibility(View.VISIBLE);
            sumber.setText("Developed by the National Center for Health Statistics in collaboration with" +
                    " the National Center for Chronic Disease Prevention and Health Promotion (2000)");
            sumber.setVisibility(View.VISIBLE);
        } else if (dk.getStatus().equals("TinggiUmur")) {
            String[] valuesCm = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
                    , "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"
                    , "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36"
                    , "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"
                    , "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"
                    , "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72"
                    , "73", "74", "75", "76", "77", "78", "79", "70", "71", "72", "73", "74"
                    , "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86"
                    , "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98"
                    , "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110"
                    , "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122"
                    , "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134"
                    , "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146"
                    , "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158"
                    , "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170"
                    , "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180"
                    , "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192"
                    , "193", "194", "195"};

            garisG.add(new Entry(66, 104));
            garisF.add(new Entry(66, 106));
            garisE.add(new Entry(66, 109));
            garisD.add(new Entry(66, 112));
            garisC.add(new Entry(66, 115));
            garisB.add(new Entry(66, 119));
            garisA.add(new Entry(66, 120));

            garisG.add(new Entry(72, 107));
            garisF.add(new Entry(72, 109));
            garisE.add(new Entry(72, 112));
            garisD.add(new Entry(72, 115));
            garisC.add(new Entry(72, 119));
            garisB.add(new Entry(72, 122));
            garisA.add(new Entry(72, 123));

            garisG.add(new Entry(78, 110));
            garisF.add(new Entry(78, 112));
            garisE.add(new Entry(78, 115));
            garisD.add(new Entry(78, 119));
            garisC.add(new Entry(78, 122));
            garisB.add(new Entry(78, 125));
            garisA.add(new Entry(78, 127));

            garisG.add(new Entry(84, 113));
            garisF.add(new Entry(84, 115));
            garisE.add(new Entry(84, 118));
            garisD.add(new Entry(84, 122));
            garisC.add(new Entry(84, 125));
            garisB.add(new Entry(84, 129));
            garisA.add(new Entry(84, 130));

            garisG.add(new Entry(90, 116));
            garisF.add(new Entry(90, 118));
            garisE.add(new Entry(90, 121));
            garisD.add(new Entry(90, 125));
            garisC.add(new Entry(90, 129));
            garisB.add(new Entry(90, 132));
            garisA.add(new Entry(90, 134));

            garisG.add(new Entry(96, 119));
            garisF.add(new Entry(96, 121));
            garisE.add(new Entry(96, 124));
            garisD.add(new Entry(96, 128));
            garisC.add(new Entry(96, 132));
            garisB.add(new Entry(96, 135));
            garisA.add(new Entry(96, 138));

            garisG.add(new Entry(102, 121));
            garisF.add(new Entry(102, 123));
            garisE.add(new Entry(102, 127));
            garisD.add(new Entry(102, 131));
            garisC.add(new Entry(102, 135));
            garisB.add(new Entry(102, 139));
            garisA.add(new Entry(102, 141));

            garisG.add(new Entry(108, 124));
            garisF.add(new Entry(108, 126));
            garisE.add(new Entry(108, 130));
            garisD.add(new Entry(108, 133));
            garisC.add(new Entry(108, 138));
            garisB.add(new Entry(108, 142));
            garisA.add(new Entry(108, 144));

            garisG.add(new Entry(114, 126));
            garisF.add(new Entry(114, 128));
            garisE.add(new Entry(114, 132));
            garisD.add(new Entry(114, 136));
            garisC.add(new Entry(114, 141));
            garisB.add(new Entry(114, 145));
            garisA.add(new Entry(114, 147));

            garisG.add(new Entry(120, 128));
            garisF.add(new Entry(120, 131));
            garisE.add(new Entry(120, 134));
            garisD.add(new Entry(120, 139));
            garisC.add(new Entry(120, 143));
            garisB.add(new Entry(120, 147));
            garisA.add(new Entry(120, 150));

            garisG.add(new Entry(126, 130));
            garisF.add(new Entry(126, 133));
            garisE.add(new Entry(126, 136));
            garisD.add(new Entry(126, 141));
            garisC.add(new Entry(126, 146));
            garisB.add(new Entry(126, 150));
            garisA.add(new Entry(126, 153));

            garisG.add(new Entry(132, 133));
            garisF.add(new Entry(132, 135));
            garisE.add(new Entry(132, 139));
            garisD.add(new Entry(132, 144));
            garisC.add(new Entry(132, 148));
            garisB.add(new Entry(132, 153));
            garisA.add(new Entry(132, 155));

            garisG.add(new Entry(138, 135));
            garisF.add(new Entry(138, 137));
            garisE.add(new Entry(138, 142));
            garisD.add(new Entry(138, 146));
            garisC.add(new Entry(138, 151));
            garisB.add(new Entry(138, 156));
            garisA.add(new Entry(138, 158));

            garisG.add(new Entry(144, 137));
            garisF.add(new Entry(144, 140));
            garisE.add(new Entry(144, 144));
            garisD.add(new Entry(144, 149));
            garisC.add(new Entry(144, 154));
            garisB.add(new Entry(144, 159));
            garisA.add(new Entry(144, 161));

            garisG.add(new Entry(150, 140));
            garisF.add(new Entry(150, 143));
            garisE.add(new Entry(150, 147));
            garisD.add(new Entry(150, 152));
            garisC.add(new Entry(150, 158));
            garisB.add(new Entry(150, 162));
            garisA.add(new Entry(150, 165));

            garisG.add(new Entry(156, 144));
            garisF.add(new Entry(156, 146));
            garisE.add(new Entry(156, 151));
            garisD.add(new Entry(156, 156));
            garisC.add(new Entry(156, 161));
            garisB.add(new Entry(156, 166));
            garisA.add(new Entry(156, 169));

            garisG.add(new Entry(162, 147));
            garisF.add(new Entry(162, 150));
            garisE.add(new Entry(162, 155));
            garisD.add(new Entry(162, 160));
            garisC.add(new Entry(162, 165));
            garisB.add(new Entry(162, 170));
            garisA.add(new Entry(162, 173));

            garisG.add(new Entry(168, 151));
            garisF.add(new Entry(168, 154));
            garisE.add(new Entry(168, 159));
            garisD.add(new Entry(168, 164));
            garisC.add(new Entry(168, 169));
            garisB.add(new Entry(168, 174));
            garisA.add(new Entry(168, 177));

            garisG.add(new Entry(174, 154));
            garisF.add(new Entry(174, 157));
            garisE.add(new Entry(174, 162));
            garisD.add(new Entry(174, 167));
            garisC.add(new Entry(174, 173));
            garisB.add(new Entry(174, 177));
            garisA.add(new Entry(174, 180));

            garisG.add(new Entry(180, 157));
            garisF.add(new Entry(180, 160));
            garisE.add(new Entry(180, 165));
            garisD.add(new Entry(180, 170));
            garisC.add(new Entry(180, 175));
            garisB.add(new Entry(180, 180));
            garisA.add(new Entry(180, 183));

            garisG.add(new Entry(186, 159));
            garisF.add(new Entry(186, 162));
            garisE.add(new Entry(186, 167));
            garisD.add(new Entry(186, 172));
            garisC.add(new Entry(186, 177));
            garisB.add(new Entry(186, 182));
            garisA.add(new Entry(186, 184));

            garisG.add(new Entry(192, 161));
            garisF.add(new Entry(192, 164));
            garisE.add(new Entry(192, 168));
            garisD.add(new Entry(192, 174));
            garisC.add(new Entry(192, 178));
            garisB.add(new Entry(192, 183));
            garisA.add(new Entry(192, 185));

            garisG.add(new Entry(198, 162));
            garisF.add(new Entry(198, 165));
            garisE.add(new Entry(198, 170));
            garisD.add(new Entry(198, 175));
            garisC.add(new Entry(198, 180));
            garisB.add(new Entry(198, 184));
            garisA.add(new Entry(198, 186));

            garisG.add(new Entry(204, 163));
            garisF.add(new Entry(204, 166));
            garisE.add(new Entry(204, 170));
            garisD.add(new Entry(204, 175));
            garisC.add(new Entry(204, 180));
            garisB.add(new Entry(204, 185));
            garisA.add(new Entry(204, 187));

            garisG.add(new Entry(210, 164));
            garisF.add(new Entry(210, 167));
            garisE.add(new Entry(210, 171));
            garisD.add(new Entry(210, 176));
            garisC.add(new Entry(210, 181));
            garisB.add(new Entry(210, 185));
            garisA.add(new Entry(210, 188));

            garisG.add(new Entry(216, 165));
            garisF.add(new Entry(216, 167));
            garisE.add(new Entry(216, 172));
            garisD.add(new Entry(216, 176));
            garisC.add(new Entry(216, 181));
            garisB.add(new Entry(216, 185));
            garisA.add(new Entry(216, 188));

            ArrayList<ILineDataSet> dataSets = new ArrayList<>();

            LineDataSet siUser = new LineDataSet(dataUser, "Titik Anda");
            siUser.setColor(Color.MAGENTA);
            siUser.setCircleColor(Color.MAGENTA);

            LineDataSet datasetG = new LineDataSet(garisG, "");
            datasetG.setDrawCircles(false);
            datasetG.setColor(Color.RED);

            LineDataSet datasetF = new LineDataSet(garisF, "");
            datasetF.setDrawCircles(false);
            datasetF.setColor(Color.YELLOW);

            LineDataSet datasetE = new LineDataSet(garisE, "");
            datasetE.setDrawCircles(false);
            datasetE.setColor(Color.GREEN);

            LineDataSet datasetD = new LineDataSet(garisD, "");
            datasetD.setDrawCircles(false);
            datasetD.setColor(Color.BLACK);

            LineDataSet datasetC = new LineDataSet(garisC, "");
            datasetC.setDrawCircles(false);
            datasetC.setColor(Color.GREEN);

            LineDataSet datasetB = new LineDataSet(garisB, "");
            datasetB.setDrawCircles(false);
            datasetB.setColor(Color.YELLOW);

            LineDataSet datasetA = new LineDataSet(garisA, "");
            datasetA.setDrawCircles(false);
            datasetA.setColor(Color.RED);

            datasetG.setValueFormatter(new MyValueFormatter());
            datasetF.setValueFormatter(new MyValueFormatter());
            datasetE.setValueFormatter(new MyValueFormatter());
            datasetD.setValueFormatter(new MyValueFormatter());
            datasetC.setValueFormatter(new MyValueFormatter());
            datasetB.setValueFormatter(new MyValueFormatter());
            datasetA.setValueFormatter(new MyValueFormatter());

            dataSets.add(datasetG);
            dataSets.add(datasetF);
            dataSets.add(datasetE);
            dataSets.add(datasetD);
            dataSets.add(datasetC);
            dataSets.add(datasetB);
            dataSets.add(datasetA);
            dataSets.add(siUser);

            chart.getXAxis().setValueFormatter(new MyXAxisValueFormatter(valuesX));
            chart.getAxisLeft().setValueFormatter(new MyCMYAxisValueFormatter(valuesCm));
            chart.getAxisRight().setValueFormatter(new MyCMYAxisValueFormatter(valuesCm));

            chart.setData(new LineData(dataSets));

            Description description = new Description();
            chart.getLegend().setEnabled(false);
            description.setText("");
            chart.setDescription(description);
            chart.invalidate();

            judul.setVisibility(View.VISIBLE);
            sumber.setText("Developed by the National Center for Health Statistics in collaboration with" +
                    " the National Center for Chronic Disease Prevention and Health Promotion (2000)");
            sumber.setVisibility(View.VISIBLE);
        }


    }


    private void dibawah5tahun(float sumbx, float sumby) {
        String[] values = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
                , "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"
                , "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36"
                , "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"
                , "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"};

        ArrayList<Entry> garisE = new ArrayList<>();
        ArrayList<Entry> garisD = new ArrayList<>();
        ArrayList<Entry> garisC = new ArrayList<>();
        ArrayList<Entry> garisB = new ArrayList<>();
        ArrayList<Entry> garisA = new ArrayList<>();
        ArrayList<Entry> dataUser = new ArrayList<>();

        dataUser.add(new Entry(sumbx, sumby));

        if (dk.getStatus().equals("BeratUmur")) {
            String[] valuesKg = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
                    , "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"
                    , "25", "26", "27", "28", "29", "30"};
            if (dk.getJk().equals("Perempuan")) {

                //DATA KURVA BERAT TERHADAP UMUR < 5 TAHUN UNTUK PEREMPUAN
                garisE.add(new Entry(0, 2));
                garisD.add(new Entry(0, Float.parseFloat("2.5")));
                garisC.add(new Entry(0, Float.parseFloat("3.2")));
                garisB.add(new Entry(0, Float.parseFloat("4.2")));
                garisA.add(new Entry(0, Float.parseFloat("4.9")));

                garisE.add(new Entry(2, Float.parseFloat("3.4")));
                garisD.add(new Entry(2, Float.parseFloat("4")));
                garisC.add(new Entry(2, Float.parseFloat("5")));
                garisB.add(new Entry(2, Float.parseFloat("6.8")));
                garisA.add(new Entry(2, Float.parseFloat("7.5")));

                garisE.add(new Entry(4, Float.parseFloat("4.4")));
                garisD.add(new Entry(4, Float.parseFloat("5")));
                garisC.add(new Entry(4, Float.parseFloat("6.4")));
                garisB.add(new Entry(4, Float.parseFloat("8.2")));
                garisA.add(new Entry(4, Float.parseFloat("9.2")));

                garisE.add(new Entry(6, Float.parseFloat("5")));
                garisD.add(new Entry(6, Float.parseFloat("5.8")));
                garisC.add(new Entry(6, Float.parseFloat("7.4")));
                garisB.add(new Entry(6, Float.parseFloat("9.2")));
                garisA.add(new Entry(6, Float.parseFloat("10.5")));

                garisE.add(new Entry(8, Float.parseFloat("5.5")));
                garisD.add(new Entry(8, Float.parseFloat("6.3")));
                garisC.add(new Entry(8, Float.parseFloat("8")));
                garisB.add(new Entry(8, Float.parseFloat("10.2")));
                garisA.add(new Entry(8, Float.parseFloat("11.5")));

                garisE.add(new Entry(10, Float.parseFloat("6")));
                garisD.add(new Entry(10, Float.parseFloat("6.8")));
                garisC.add(new Entry(10, Float.parseFloat("8.5")));
                garisB.add(new Entry(10, Float.parseFloat("11")));
                garisA.add(new Entry(10, Float.parseFloat("12.4")));

                garisE.add(new Entry(12, Float.parseFloat("6.3")));
                garisD.add(new Entry(12, Float.parseFloat("7")));
                garisC.add(new Entry(12, Float.parseFloat("9")));
                garisB.add(new Entry(12, Float.parseFloat("11.5")));
                garisA.add(new Entry(12, Float.parseFloat("13")));

                garisE.add(new Entry(14, Float.parseFloat("6.7")));
                garisD.add(new Entry(14, Float.parseFloat("7.4")));
                garisC.add(new Entry(14, Float.parseFloat("9.4")));
                garisB.add(new Entry(14, Float.parseFloat("12")));
                garisA.add(new Entry(14, Float.parseFloat("13.9")));

                garisE.add(new Entry(16, Float.parseFloat("7")));
                garisD.add(new Entry(16, Float.parseFloat("7.8")));
                garisC.add(new Entry(16, Float.parseFloat("9.9")));
                garisB.add(new Entry(16, Float.parseFloat("12.6")));
                garisA.add(new Entry(16, Float.parseFloat("14.5")));

                garisE.add(new Entry(18, Float.parseFloat("7.2")));
                garisD.add(new Entry(18, Float.parseFloat("8")));
                garisC.add(new Entry(18, Float.parseFloat("10.2")));
                garisB.add(new Entry(18, Float.parseFloat("13")));
                garisA.add(new Entry(18, Float.parseFloat("15")));

                garisE.add(new Entry(20, Float.parseFloat("7.5")));
                garisD.add(new Entry(20, Float.parseFloat("8.5")));
                garisC.add(new Entry(20, Float.parseFloat("10.7")));
                garisB.add(new Entry(20, Float.parseFloat("13.9")));
                garisA.add(new Entry(20, Float.parseFloat("15.9")));

                garisE.add(new Entry(22, Float.parseFloat("7.9")));
                garisD.add(new Entry(22, Float.parseFloat("8.8")));
                garisC.add(new Entry(22, Float.parseFloat("11")));
                garisB.add(new Entry(22, Float.parseFloat("14.2")));
                garisA.add(new Entry(22, Float.parseFloat("16.3")));

                garisE.add(new Entry(24, Float.parseFloat("8")));
                garisD.add(new Entry(24, Float.parseFloat("9")));
                garisC.add(new Entry(24, Float.parseFloat("11.5")));
                garisB.add(new Entry(24, Float.parseFloat("14.9")));
                garisA.add(new Entry(24, Float.parseFloat("17")));

                garisE.add(new Entry(26, Float.parseFloat("8.3")));
                garisD.add(new Entry(26, Float.parseFloat("9.3")));
                garisC.add(new Entry(26, Float.parseFloat("11.9")));
                garisB.add(new Entry(26, Float.parseFloat("15.5")));
                garisA.add(new Entry(26, Float.parseFloat("17.7")));

                garisE.add(new Entry(28, Float.parseFloat("8.7")));
                garisD.add(new Entry(28, Float.parseFloat("9.7")));
                garisC.add(new Entry(28, Float.parseFloat("12.2")));
                garisB.add(new Entry(28, Float.parseFloat("16")));
                garisA.add(new Entry(28, Float.parseFloat("18.2")));

                garisE.add(new Entry(30, Float.parseFloat("8.9")));
                garisD.add(new Entry(30, Float.parseFloat("10")));
                garisC.add(new Entry(30, Float.parseFloat("12.7")));
                garisB.add(new Entry(30, Float.parseFloat("16.5")));
                garisA.add(new Entry(30, Float.parseFloat("19")));

                garisE.add(new Entry(32, Float.parseFloat("9.1")));
                garisD.add(new Entry(32, Float.parseFloat("10.2")));
                garisC.add(new Entry(32, Float.parseFloat("13")));
                garisB.add(new Entry(32, Float.parseFloat("17")));
                garisA.add(new Entry(32, Float.parseFloat("19.5")));

                garisE.add(new Entry(34, Float.parseFloat("9.3")));
                garisD.add(new Entry(34, Float.parseFloat("10.5")));
                garisC.add(new Entry(34, Float.parseFloat("13.5")));
                garisB.add(new Entry(34, Float.parseFloat("17.5")));
                garisA.add(new Entry(34, Float.parseFloat("20.2")));

                garisE.add(new Entry(36, Float.parseFloat("9.6")));
                garisD.add(new Entry(36, Float.parseFloat("10.8")));
                garisC.add(new Entry(36, Float.parseFloat("13.9")));
                garisB.add(new Entry(36, Float.parseFloat("18.1")));
                garisA.add(new Entry(36, Float.parseFloat("21")));

                garisE.add(new Entry(38, Float.parseFloat("9.9")));
                garisD.add(new Entry(38, Float.parseFloat("11")));
                garisC.add(new Entry(38, Float.parseFloat("14.2")));
                garisB.add(new Entry(38, Float.parseFloat("18.8")));
                garisA.add(new Entry(38, Float.parseFloat("21.5")));

                garisE.add(new Entry(40, Float.parseFloat("10")));
                garisD.add(new Entry(40, Float.parseFloat("11.2")));
                garisC.add(new Entry(40, Float.parseFloat("14.5")));
                garisB.add(new Entry(40, Float.parseFloat("19.2")));
                garisA.add(new Entry(40, Float.parseFloat("22.2")));

                garisE.add(new Entry(42, Float.parseFloat("10.2")));
                garisD.add(new Entry(42, Float.parseFloat("11.6")));
                garisC.add(new Entry(42, Float.parseFloat("15")));
                garisB.add(new Entry(42, Float.parseFloat("19.9")));
                garisA.add(new Entry(42, Float.parseFloat("23")));

                garisE.add(new Entry(44, Float.parseFloat("10.5")));
                garisD.add(new Entry(44, Float.parseFloat("11.9")));
                garisC.add(new Entry(44, Float.parseFloat("15.3")));
                garisB.add(new Entry(44, Float.parseFloat("20.2")));
                garisA.add(new Entry(44, Float.parseFloat("23.8")));

                garisE.add(new Entry(46, Float.parseFloat("10.7")));
                garisD.add(new Entry(46, Float.parseFloat("12")));
                garisC.add(new Entry(46, Float.parseFloat("15.8")));
                garisB.add(new Entry(46, Float.parseFloat("21")));
                garisA.add(new Entry(46, Float.parseFloat("24.5")));

                garisE.add(new Entry(48, Float.parseFloat("10.9")));
                garisD.add(new Entry(48, Float.parseFloat("12.3")));
                garisC.add(new Entry(48, Float.parseFloat("16")));
                garisB.add(new Entry(48, Float.parseFloat("21.5")));
                garisA.add(new Entry(48, Float.parseFloat("25")));

                garisE.add(new Entry(50, Float.parseFloat("11")));
                garisD.add(new Entry(50, Float.parseFloat("12.7")));
                garisC.add(new Entry(50, Float.parseFloat("16.5")));
                garisB.add(new Entry(50, Float.parseFloat("22")));
                garisA.add(new Entry(50, Float.parseFloat("26")));

                garisE.add(new Entry(52, Float.parseFloat("11.3")));
                garisD.add(new Entry(52, Float.parseFloat("12.8")));
                garisC.add(new Entry(52, Float.parseFloat("16.8")));
                garisB.add(new Entry(52, Float.parseFloat("22.7")));
                garisA.add(new Entry(52, Float.parseFloat("26.7")));

                garisE.add(new Entry(54, Float.parseFloat("11.5")));
                garisD.add(new Entry(54, Float.parseFloat("13")));
                garisC.add(new Entry(54, Float.parseFloat("17.2")));
                garisB.add(new Entry(54, Float.parseFloat("23.2")));
                garisA.add(new Entry(54, Float.parseFloat("27.3")));

                garisE.add(new Entry(56, Float.parseFloat("11.7")));
                garisD.add(new Entry(56, Float.parseFloat("13.2")));
                garisC.add(new Entry(56, Float.parseFloat("17.5")));
                garisB.add(new Entry(56, Float.parseFloat("23.9")));
                garisA.add(new Entry(56, Float.parseFloat("28")));

                garisE.add(new Entry(58, Float.parseFloat("11.9")));
                garisD.add(new Entry(58, Float.parseFloat("13.5")));
                garisC.add(new Entry(58, Float.parseFloat("18")));
                garisB.add(new Entry(58, Float.parseFloat("24.3")));
                garisA.add(new Entry(58, Float.parseFloat("28.9")));

                garisE.add(new Entry(60, Float.parseFloat("12")));
                garisD.add(new Entry(60, Float.parseFloat("13.8")));
                garisC.add(new Entry(60, Float.parseFloat("18.2")));
                garisB.add(new Entry(60, Float.parseFloat("25")));
                garisA.add(new Entry(60, Float.parseFloat("29.5")));

            } else {

                //DATA KURVA BERAT TERHADAP UMUR < 5 TAHUN UNTUK LAKI-LAKI
                garisE.add(new Entry(0, 2));
                garisD.add(new Entry(0, Float.parseFloat("2.5")));
                garisC.add(new Entry(0, Float.parseFloat("3.4")));
                garisB.add(new Entry(0, Float.parseFloat("4.4")));
                garisA.add(new Entry(0, Float.parseFloat("5")));

                garisE.add(new Entry(2, Float.parseFloat("3.9")));
                garisD.add(new Entry(2, Float.parseFloat("4.2")));
                garisC.add(new Entry(2, Float.parseFloat("5.5")));
                garisB.add(new Entry(2, Float.parseFloat("7")));
                garisA.add(new Entry(2, Float.parseFloat("8")));

                garisE.add(new Entry(4, 5));
                garisD.add(new Entry(4, Float.parseFloat("5.5")));
                garisC.add(new Entry(4, Float.parseFloat("7")));
                garisB.add(new Entry(4, Float.parseFloat("8.8")));
                garisA.add(new Entry(4, Float.parseFloat("9.8")));

                garisE.add(new Entry(6, Float.parseFloat("5.9")));
                garisD.add(new Entry(6, Float.parseFloat("6.3")));
                garisC.add(new Entry(6, Float.parseFloat("8")));
                garisB.add(new Entry(6, Float.parseFloat("9.9")));
                garisA.add(new Entry(6, Float.parseFloat("11")));

                garisE.add(new Entry(8, Float.parseFloat("6.2")));
                garisD.add(new Entry(8, Float.parseFloat("6.9")));
                garisC.add(new Entry(8, Float.parseFloat("8.7")));
                garisB.add(new Entry(8, Float.parseFloat("10.8")));
                garisA.add(new Entry(8, Float.parseFloat("11.9")));

                garisE.add(new Entry(10, Float.parseFloat("6.6")));
                garisD.add(new Entry(10, Float.parseFloat("7.3")));
                garisC.add(new Entry(10, Float.parseFloat("9.2")));
                garisB.add(new Entry(10, Float.parseFloat("11.3")));
                garisA.add(new Entry(10, Float.parseFloat("12.6")));

                garisE.add(new Entry(12, Float.parseFloat("6.9")));
                garisD.add(new Entry(12, Float.parseFloat("7.8")));
                garisC.add(new Entry(12, Float.parseFloat("9.6")));
                garisB.add(new Entry(12, Float.parseFloat("12")));
                garisA.add(new Entry(12, Float.parseFloat("13.3")));

                garisE.add(new Entry(14, Float.parseFloat("7.2")));
                garisD.add(new Entry(14, Float.parseFloat("8.1")));
                garisC.add(new Entry(14, Float.parseFloat("10.1")));
                garisB.add(new Entry(14, Float.parseFloat("12.5")));
                garisA.add(new Entry(14, Float.parseFloat("14")));

                garisE.add(new Entry(16, Float.parseFloat("7.5")));
                garisD.add(new Entry(16, Float.parseFloat("8.4")));
                garisC.add(new Entry(16, Float.parseFloat("10.5")));
                garisB.add(new Entry(16, Float.parseFloat("13.1")));
                garisA.add(new Entry(16, Float.parseFloat("14.6")));

                garisE.add(new Entry(18, Float.parseFloat("7.9")));
                garisD.add(new Entry(18, Float.parseFloat("8.8")));
                garisC.add(new Entry(18, Float.parseFloat("11")));
                garisB.add(new Entry(18, Float.parseFloat("13.7")));
                garisA.add(new Entry(18, Float.parseFloat("15.2")));

                garisE.add(new Entry(20, Float.parseFloat("8.1")));
                garisD.add(new Entry(20, Float.parseFloat("9")));
                garisC.add(new Entry(20, Float.parseFloat("11.2")));
                garisB.add(new Entry(20, Float.parseFloat("14.2")));
                garisA.add(new Entry(20, Float.parseFloat("15.9")));

                garisE.add(new Entry(22, Float.parseFloat("8.3")));
                garisD.add(new Entry(22, Float.parseFloat("9.3")));
                garisC.add(new Entry(22, Float.parseFloat("11.8")));
                garisB.add(new Entry(22, Float.parseFloat("14.8")));
                garisA.add(new Entry(22, Float.parseFloat("16.5")));

                garisE.add(new Entry(24, Float.parseFloat("8.6")));
                garisD.add(new Entry(24, Float.parseFloat("9.7")));
                garisC.add(new Entry(24, Float.parseFloat("12.1")));
                garisB.add(new Entry(24, Float.parseFloat("15.2")));
                garisA.add(new Entry(24, Float.parseFloat("17")));

                garisE.add(new Entry(26, Float.parseFloat("8.9")));
                garisD.add(new Entry(26, Float.parseFloat("10")));
                garisC.add(new Entry(26, Float.parseFloat("12.5")));
                garisB.add(new Entry(26, Float.parseFloat("15.8")));
                garisA.add(new Entry(26, Float.parseFloat("17.8")));

                garisE.add(new Entry(28, Float.parseFloat("9.1")));
                garisD.add(new Entry(28, Float.parseFloat("10.2")));
                garisC.add(new Entry(28, Float.parseFloat("13")));
                garisB.add(new Entry(28, Float.parseFloat("16.3")));
                garisA.add(new Entry(28, Float.parseFloat("18.3")));

                garisE.add(new Entry(30, Float.parseFloat("9.3")));
                garisD.add(new Entry(30, Float.parseFloat("10.5")));
                garisC.add(new Entry(30, Float.parseFloat("13.2")));
                garisB.add(new Entry(30, Float.parseFloat("16.9")));
                garisA.add(new Entry(30, Float.parseFloat("19")));

                garisE.add(new Entry(32, Float.parseFloat("9.5")));
                garisD.add(new Entry(32, Float.parseFloat("10.8")));
                garisC.add(new Entry(32, Float.parseFloat("13.6")));
                garisB.add(new Entry(32, Float.parseFloat("17.3")));
                garisA.add(new Entry(32, Float.parseFloat("19.5")));

                garisE.add(new Entry(34, Float.parseFloat("9.8")));
                garisD.add(new Entry(34, Float.parseFloat("11")));
                garisC.add(new Entry(34, Float.parseFloat("14")));
                garisB.add(new Entry(34, Float.parseFloat("17.9")));
                garisA.add(new Entry(34, Float.parseFloat("20.1")));

                garisE.add(new Entry(36, Float.parseFloat("10")));
                garisD.add(new Entry(36, Float.parseFloat("11.2")));
                garisC.add(new Entry(36, Float.parseFloat("14.2")));
                garisB.add(new Entry(36, Float.parseFloat("18.3")));
                garisA.add(new Entry(36, Float.parseFloat("20.8")));

                garisE.add(new Entry(38, Float.parseFloat("10.2")));
                garisD.add(new Entry(38, Float.parseFloat("11.5")));
                garisC.add(new Entry(38, Float.parseFloat("14.8")));
                garisB.add(new Entry(38, Float.parseFloat("18.8")));
                garisA.add(new Entry(38, Float.parseFloat("21.2")));

                garisE.add(new Entry(40, Float.parseFloat("10.5")));
                garisD.add(new Entry(40, Float.parseFloat("11.8")));
                garisC.add(new Entry(40, Float.parseFloat("15")));
                garisB.add(new Entry(40, Float.parseFloat("19.2")));
                garisA.add(new Entry(40, Float.parseFloat("21.9")));

                garisE.add(new Entry(42, Float.parseFloat("10.7")));
                garisD.add(new Entry(42, Float.parseFloat("12")));
                garisC.add(new Entry(42, Float.parseFloat("15.3")));
                garisB.add(new Entry(42, Float.parseFloat("19.8")));
                garisA.add(new Entry(42, Float.parseFloat("22.4")));

                garisE.add(new Entry(44, Float.parseFloat("10.9")));
                garisD.add(new Entry(44, Float.parseFloat("12.2")));
                garisC.add(new Entry(44, Float.parseFloat("15.7")));
                garisB.add(new Entry(44, Float.parseFloat("20.2")));
                garisA.add(new Entry(44, Float.parseFloat("23")));

                garisE.add(new Entry(46, Float.parseFloat("11")));
                garisD.add(new Entry(46, Float.parseFloat("12.5")));
                garisC.add(new Entry(46, Float.parseFloat("16")));
                garisB.add(new Entry(46, Float.parseFloat("20.8")));
                garisA.add(new Entry(46, Float.parseFloat("23.5")));

                garisE.add(new Entry(48, Float.parseFloat("11.2")));
                garisD.add(new Entry(48, Float.parseFloat("12.8")));
                garisC.add(new Entry(48, Float.parseFloat("16.3")));
                garisB.add(new Entry(48, Float.parseFloat("21.1")));
                garisA.add(new Entry(48, Float.parseFloat("24.1")));

                garisE.add(new Entry(50, Float.parseFloat("11.4")));
                garisD.add(new Entry(50, Float.parseFloat("13")));
                garisC.add(new Entry(50, Float.parseFloat("16.8")));
                garisB.add(new Entry(50, Float.parseFloat("21.8")));
                garisA.add(new Entry(50, Float.parseFloat("24.9")));

                garisE.add(new Entry(52, Float.parseFloat("11.6")));
                garisD.add(new Entry(52, Float.parseFloat("13.1")));
                garisC.add(new Entry(52, Float.parseFloat("17")));
                garisB.add(new Entry(52, Float.parseFloat("22.1")));
                garisA.add(new Entry(52, Float.parseFloat("25.2")));

                garisE.add(new Entry(54, Float.parseFloat("11.8")));
                garisD.add(new Entry(54, Float.parseFloat("13.4")));
                garisC.add(new Entry(54, Float.parseFloat("17.3")));
                garisB.add(new Entry(54, Float.parseFloat("22.6")));
                garisA.add(new Entry(54, Float.parseFloat("26")));

                garisE.add(new Entry(56, Float.parseFloat("12")));
                garisD.add(new Entry(56, Float.parseFloat("13.6")));
                garisC.add(new Entry(56, Float.parseFloat("17.6")));
                garisB.add(new Entry(56, Float.parseFloat("23.2")));
                garisA.add(new Entry(56, Float.parseFloat("26.6")));

                garisE.add(new Entry(58, Float.parseFloat("12.2")));
                garisD.add(new Entry(58, Float.parseFloat("13.9")));
                garisC.add(new Entry(58, Float.parseFloat("18")));
                garisB.add(new Entry(58, Float.parseFloat("23.8")));
                garisA.add(new Entry(58, Float.parseFloat("27.2")));

                garisE.add(new Entry(60, Float.parseFloat("12.4")));
                garisD.add(new Entry(60, Float.parseFloat("14")));
                garisC.add(new Entry(60, Float.parseFloat("18.3")));
                garisB.add(new Entry(60, Float.parseFloat("24.1")));
                garisA.add(new Entry(60, Float.parseFloat("27.9")));
            }

            ArrayList<ILineDataSet> dataSets = new ArrayList<>();

            LineDataSet siUser = new LineDataSet(dataUser, "Titik Anda");
            siUser.setColor(Color.MAGENTA);
            siUser.setCircleColor(Color.MAGENTA);

            LineDataSet datasetE = new LineDataSet(garisE, "-3");
            datasetE.setDrawCircles(false);
            datasetE.setColor(Color.BLACK);

            LineDataSet datasetD = new LineDataSet(garisD, "-2");
            datasetD.setDrawCircles(false);
            datasetD.setColor(Color.RED);

            LineDataSet datasetC = new LineDataSet(garisC, "0");
            datasetC.setDrawCircles(false);
            datasetC.setColor(Color.GREEN);

            LineDataSet datasetB = new LineDataSet(garisB, "2");
            datasetB.setDrawCircles(false);
            datasetB.setColor(Color.RED);

            LineDataSet datasetA = new LineDataSet(garisA, "3");
            datasetA.setDrawCircles(false);
            datasetA.setColor(Color.BLACK);

            datasetE.setValueFormatter(new MyValueFormatter());
            datasetD.setValueFormatter(new MyValueFormatter());
            datasetC.setValueFormatter(new MyValueFormatter());
            datasetB.setValueFormatter(new MyValueFormatter());
            datasetA.setValueFormatter(new MyValueFormatter());

            dataSets.add(datasetE);
            dataSets.add(datasetD);
            dataSets.add(datasetC);
            dataSets.add(datasetB);
            dataSets.add(datasetA);
            dataSets.add(siUser);

            chart.getXAxis().setValueFormatter(new MyXAxisValueFormatter(values));
            chart.getAxisLeft().setValueFormatter(new MyYAxisValueFormatter(valuesKg));
            chart.getAxisRight().setValueFormatter(new MyYAxisValueFormatter(valuesKg));

            chart.setData(new LineData(dataSets));

            Description description = new Description();
            chart.getLegend().setEnabled(false);
            description.setText("Sumber : WHO Child Growth Standards");
            chart.setDescription(description);
            chart.invalidate();

        } else if (dk.getStatus().equals("TinggiUmur")) {
            //ubah dari 40 - 125
            String[] valuesCm = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
                    , "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"
                    , "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36"
                    , "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52"
                    , "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68"
                    , "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84"
                    , "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"
                    , "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114"
                    , "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125"};

            ArrayList<Entry> garisE1 = new ArrayList<>();
            ArrayList<Entry> garisD1 = new ArrayList<>();
            ArrayList<Entry> garisC1 = new ArrayList<>();
            ArrayList<Entry> garisB1 = new ArrayList<>();
            ArrayList<Entry> garisA1 = new ArrayList<>();

            if (dk.getJk().equals("Perempuan")) {

                //DATA KURVA TINGGI TERHADAP UMUR < 5 TAHUN UNTUK PEREMPUAN
                garisE.add(new Entry(0, Float.parseFloat("43")));
                garisD.add(new Entry(0, Float.parseFloat("46")));
                garisC.add(new Entry(0, Float.parseFloat("49")));
                garisB.add(new Entry(0, Float.parseFloat("53")));
                garisA.add(new Entry(0, Float.parseFloat("55")));

                garisE.add(new Entry(1, Float.parseFloat("48")));
                garisD.add(new Entry(1, Float.parseFloat("50")));
                garisC.add(new Entry(1, Float.parseFloat("53.8")));
                garisB.add(new Entry(1, Float.parseFloat("58")));
                garisA.add(new Entry(1, Float.parseFloat("59.5")));

                garisE.add(new Entry(2, Float.parseFloat("51")));
                garisD.add(new Entry(2, Float.parseFloat("53")));
                garisC.add(new Entry(2, Float.parseFloat("57")));
                garisB.add(new Entry(2, Float.parseFloat("61")));
                garisA.add(new Entry(2, Float.parseFloat("63")));

                garisE.add(new Entry(3, Float.parseFloat("53.2")));
                garisD.add(new Entry(3, Float.parseFloat("55.8")));
                garisC.add(new Entry(3, Float.parseFloat("60")));
                garisB.add(new Entry(3, Float.parseFloat("64")));
                garisA.add(new Entry(3, Float.parseFloat("66")));

                garisE.add(new Entry(4, Float.parseFloat("55.6")));
                garisD.add(new Entry(4, Float.parseFloat("58")));
                garisC.add(new Entry(4, Float.parseFloat("62")));
                garisB.add(new Entry(4, Float.parseFloat("66.3")));
                garisA.add(new Entry(4, Float.parseFloat("68.4")));

                garisE.add(new Entry(5, Float.parseFloat("57.2")));
                garisD.add(new Entry(5, Float.parseFloat("59.6")));
                garisC.add(new Entry(5, Float.parseFloat("64")));
                garisB.add(new Entry(5, Float.parseFloat("68.5")));
                garisA.add(new Entry(5, Float.parseFloat("70.6")));

                garisE.add(new Entry(6, Float.parseFloat("59")));
                garisD.add(new Entry(6, Float.parseFloat("61")));
                garisC.add(new Entry(6, Float.parseFloat("66")));
                garisB.add(new Entry(6, Float.parseFloat("70")));
                garisA.add(new Entry(6, Float.parseFloat("72.8")));

                garisE.add(new Entry(7, Float.parseFloat("60")));
                garisD.add(new Entry(7, Float.parseFloat("62.8")));
                garisC.add(new Entry(7, Float.parseFloat("66.2")));
                garisB.add(new Entry(7, Float.parseFloat("72")));
                garisA.add(new Entry(7, Float.parseFloat("74.4")));

                garisE.add(new Entry(8, Float.parseFloat("61.8")));
                garisD.add(new Entry(8, Float.parseFloat("64")));
                garisC.add(new Entry(8, Float.parseFloat("69")));
                garisB.add(new Entry(8, Float.parseFloat("73.6")));
                garisA.add(new Entry(8, Float.parseFloat("76")));

                garisE.add(new Entry(9, Float.parseFloat("62.9")));
                garisD.add(new Entry(9, Float.parseFloat("66.2")));
                garisC.add(new Entry(9, Float.parseFloat("70")));
                garisB.add(new Entry(9, Float.parseFloat("75")));
                garisA.add(new Entry(9, Float.parseFloat("77")));

                garisE.add(new Entry(10, Float.parseFloat("64")));
                garisD.add(new Entry(10, Float.parseFloat("66.4")));
                garisC.add(new Entry(10, Float.parseFloat("71.8")));
                garisB.add(new Entry(10, Float.parseFloat("76.5")));
                garisA.add(new Entry(10, Float.parseFloat("79")));

                garisE.add(new Entry(11, Float.parseFloat("65")));
                garisD.add(new Entry(11, Float.parseFloat("67.8")));
                garisC.add(new Entry(11, Float.parseFloat("73")));
                garisB.add(new Entry(11, Float.parseFloat("78")));
                garisA.add(new Entry(11, Float.parseFloat("80.3")));

                garisE.add(new Entry(12, Float.parseFloat("65.2")));
                garisD.add(new Entry(12, Float.parseFloat("68.8")));
                garisC.add(new Entry(12, Float.parseFloat("74")));
                garisB.add(new Entry(12, Float.parseFloat("79")));
                garisA.add(new Entry(12, Float.parseFloat("82")));

                garisE.add(new Entry(13, Float.parseFloat("66")));
                garisD.add(new Entry(13, Float.parseFloat("70")));
                garisC.add(new Entry(13, Float.parseFloat("75")));
                garisB.add(new Entry(13, Float.parseFloat("80.7")));
                garisA.add(new Entry(13, Float.parseFloat("83")));

                garisE.add(new Entry(14, Float.parseFloat("68")));
                garisD.add(new Entry(14, Float.parseFloat("71")));
                garisC.add(new Entry(14, Float.parseFloat("76.2")));
                garisB.add(new Entry(14, Float.parseFloat("82")));
                garisA.add(new Entry(14, Float.parseFloat("84.2")));

                garisE.add(new Entry(15, Float.parseFloat("69")));
                garisD.add(new Entry(15, Float.parseFloat("72")));
                garisC.add(new Entry(15, Float.parseFloat("77.6")));
                garisB.add(new Entry(15, Float.parseFloat("83")));
                garisA.add(new Entry(15, Float.parseFloat("85.8")));

                garisE.add(new Entry(16, Float.parseFloat("70")));
                garisD.add(new Entry(16, Float.parseFloat("73")));
                garisC.add(new Entry(16, Float.parseFloat("78.6")));
                garisB.add(new Entry(16, Float.parseFloat("84")));
                garisA.add(new Entry(16, Float.parseFloat("87")));

                garisE.add(new Entry(17, Float.parseFloat("71")));
                garisD.add(new Entry(17, Float.parseFloat("74")));
                garisC.add(new Entry(17, Float.parseFloat("79.8")));
                garisB.add(new Entry(17, Float.parseFloat("85.4")));
                garisA.add(new Entry(17, Float.parseFloat("88")));

                garisE.add(new Entry(18, Float.parseFloat("72")));
                garisD.add(new Entry(18, Float.parseFloat("75")));
                garisC.add(new Entry(18, Float.parseFloat("80.8")));
                garisB.add(new Entry(18, Float.parseFloat("86.8")));
                garisA.add(new Entry(18, Float.parseFloat("89.4")));

                garisE.add(new Entry(19, Float.parseFloat("73")));
                garisD.add(new Entry(19, Float.parseFloat("76")));
                garisC.add(new Entry(19, Float.parseFloat("81.8")));
                garisB.add(new Entry(19, Float.parseFloat("87.8")));
                garisA.add(new Entry(19, Float.parseFloat("90.6")));

                garisE.add(new Entry(20, Float.parseFloat("74")));
                garisD.add(new Entry(20, Float.parseFloat("76.8")));
                garisC.add(new Entry(20, Float.parseFloat("82.7")));
                garisB.add(new Entry(20, Float.parseFloat("89")));
                garisA.add(new Entry(20, Float.parseFloat("92")));

                garisE.add(new Entry(21, Float.parseFloat("74.5")));
                garisD.add(new Entry(21, Float.parseFloat("77.4")));
                garisC.add(new Entry(21, Float.parseFloat("83.8")));
                garisB.add(new Entry(21, Float.parseFloat("90")));
                garisA.add(new Entry(21, Float.parseFloat("93")));

                garisE.add(new Entry(22, Float.parseFloat("75")));
                garisD.add(new Entry(22, Float.parseFloat("78.4")));
                garisC.add(new Entry(22, Float.parseFloat("84.8")));
                garisB.add(new Entry(22, Float.parseFloat("91")));
                garisA.add(new Entry(22, Float.parseFloat("94")));

                garisE.add(new Entry(23, Float.parseFloat("76")));
                garisD.add(new Entry(23, Float.parseFloat("79")));
                garisC.add(new Entry(23, Float.parseFloat("86.5")));
                garisB.add(new Entry(23, Float.parseFloat("92")));
                garisA.add(new Entry(23, Float.parseFloat("95")));

                garisE.add(new Entry(24, Float.parseFloat("77")));
                garisD.add(new Entry(24, Float.parseFloat("80")));
                garisC.add(new Entry(24, Float.parseFloat("86")));
                garisB.add(new Entry(24, Float.parseFloat("93")));
                garisA.add(new Entry(24, Float.parseFloat("96")));

                garisE1.add(new Entry(24, Float.parseFloat("76")));
                garisD1.add(new Entry(24, Float.parseFloat("79.4")));
                garisC1.add(new Entry(24, Float.parseFloat("85.7")));
                garisB1.add(new Entry(24, Float.parseFloat("92")));
                garisA1.add(new Entry(24, Float.parseFloat("95.4")));

                garisE1.add(new Entry(25, Float.parseFloat("77")));
                garisD1.add(new Entry(25, Float.parseFloat("80")));
                garisC1.add(new Entry(25, Float.parseFloat("85.4")));
                garisB1.add(new Entry(25, Float.parseFloat("93")));
                garisA1.add(new Entry(25, Float.parseFloat("96.6")));

                garisE1.add(new Entry(26, Float.parseFloat("77.2")));
                garisD1.add(new Entry(26, Float.parseFloat("81")));
                garisC1.add(new Entry(26, Float.parseFloat("87.4")));
                garisB1.add(new Entry(26, Float.parseFloat("94")));
                garisA1.add(new Entry(26, Float.parseFloat("97.7")));

                garisE1.add(new Entry(27, Float.parseFloat("78")));
                garisD1.add(new Entry(27, Float.parseFloat("81.5")));
                garisC1.add(new Entry(27, Float.parseFloat("87.2")));
                garisB1.add(new Entry(27, Float.parseFloat("95")));
                garisA1.add(new Entry(27, Float.parseFloat("98.5")));

                garisE1.add(new Entry(28, Float.parseFloat("79")));
                garisD1.add(new Entry(28, Float.parseFloat("82")));
                garisC1.add(new Entry(28, Float.parseFloat("89")));
                garisB1.add(new Entry(28, Float.parseFloat("96")));
                garisA1.add(new Entry(28, Float.parseFloat("99.4")));

                garisE1.add(new Entry(29, Float.parseFloat("79.5")));
                garisD1.add(new Entry(29, Float.parseFloat("83")));
                garisC1.add(new Entry(29, Float.parseFloat("90")));
                garisB1.add(new Entry(29, Float.parseFloat("97")));
                garisA1.add(new Entry(29, Float.parseFloat("100")));

                garisE1.add(new Entry(30, Float.parseFloat("80")));
                garisD1.add(new Entry(30, Float.parseFloat("84")));
                garisC1.add(new Entry(30, Float.parseFloat("91")));
                garisB1.add(new Entry(30, Float.parseFloat("98")));
                garisA1.add(new Entry(30, Float.parseFloat("101")));

                garisE1.add(new Entry(31, Float.parseFloat("81")));
                garisD1.add(new Entry(31, Float.parseFloat("84.4")));
                garisC1.add(new Entry(31, Float.parseFloat("91.2")));
                garisB1.add(new Entry(31, Float.parseFloat("99")));
                garisA1.add(new Entry(31, Float.parseFloat("102")));

                garisE1.add(new Entry(32, Float.parseFloat("81.2")));
                garisD1.add(new Entry(32, Float.parseFloat("85")));
                garisC1.add(new Entry(32, Float.parseFloat("92")));
                garisB1.add(new Entry(32, Float.parseFloat("99.6")));
                garisA1.add(new Entry(32, Float.parseFloat("103")));

                garisE1.add(new Entry(33, Float.parseFloat("82")));
                garisD1.add(new Entry(33, Float.parseFloat("85.7")));
                garisC1.add(new Entry(33, Float.parseFloat("93")));
                garisB1.add(new Entry(33, Float.parseFloat("100")));
                garisA1.add(new Entry(33, Float.parseFloat("104")));

                garisE1.add(new Entry(34, Float.parseFloat("82.4")));
                garisD1.add(new Entry(34, Float.parseFloat("86.2")));
                garisC1.add(new Entry(34, Float.parseFloat("93")));
                garisB1.add(new Entry(34, Float.parseFloat("101")));
                garisA1.add(new Entry(34, Float.parseFloat("105")));

                garisE1.add(new Entry(35, Float.parseFloat("83")));
                garisD1.add(new Entry(35, Float.parseFloat("86.8")));
                garisC1.add(new Entry(35, Float.parseFloat("94.2")));
                garisB1.add(new Entry(35, Float.parseFloat("102")));
                garisA1.add(new Entry(35, Float.parseFloat("105.5")));

                garisE1.add(new Entry(36, Float.parseFloat("83.6")));
                garisD1.add(new Entry(36, Float.parseFloat("87.5")));
                garisC1.add(new Entry(36, Float.parseFloat("95")));
                garisB1.add(new Entry(36, Float.parseFloat("102.5")));
                garisA1.add(new Entry(36, Float.parseFloat("106.4")));

                garisE1.add(new Entry(37, Float.parseFloat("84")));
                garisD1.add(new Entry(37, Float.parseFloat("88")));
                garisC1.add(new Entry(37, Float.parseFloat("95.8")));
                garisB1.add(new Entry(37, Float.parseFloat("103.2")));
                garisA1.add(new Entry(37, Float.parseFloat("107")));

                garisE1.add(new Entry(38, Float.parseFloat("84.6")));
                garisD1.add(new Entry(38, Float.parseFloat("88.8")));
                garisC1.add(new Entry(38, Float.parseFloat("96.4")));
                garisB1.add(new Entry(38, Float.parseFloat("104")));
                garisA1.add(new Entry(38, Float.parseFloat("108")));

                garisE1.add(new Entry(39, Float.parseFloat("85")));
                garisD1.add(new Entry(39, Float.parseFloat("89")));
                garisC1.add(new Entry(39, Float.parseFloat("97")));
                garisB1.add(new Entry(39, Float.parseFloat("105")));
                garisA1.add(new Entry(39, Float.parseFloat("109")));

                garisE1.add(new Entry(40, Float.parseFloat("86")));
                garisD1.add(new Entry(40, Float.parseFloat("90")));
                garisC1.add(new Entry(40, Float.parseFloat("97.8")));
                garisB1.add(new Entry(40, Float.parseFloat("105.8")));
                garisA1.add(new Entry(40, Float.parseFloat("110")));

                garisE1.add(new Entry(41, Float.parseFloat("86.2")));
                garisD1.add(new Entry(41, Float.parseFloat("90.3")));
                garisC1.add(new Entry(41, Float.parseFloat("98.4")));
                garisB1.add(new Entry(41, Float.parseFloat("106.4")));
                garisA1.add(new Entry(41, Float.parseFloat("110.4")));

                garisE1.add(new Entry(42, Float.parseFloat("86.8")));
                garisD1.add(new Entry(42, Float.parseFloat("91")));
                garisC1.add(new Entry(42, Float.parseFloat("99")));
                garisB1.add(new Entry(42, Float.parseFloat("107")));
                garisA1.add(new Entry(42, Float.parseFloat("111")));

                garisE1.add(new Entry(43, Float.parseFloat("87.4")));
                garisD1.add(new Entry(43, Float.parseFloat("91.4")));
                garisC1.add(new Entry(43, Float.parseFloat("99.8")));
                garisB1.add(new Entry(43, Float.parseFloat("108")));
                garisA1.add(new Entry(43, Float.parseFloat("112")));

                garisE1.add(new Entry(44, Float.parseFloat("88")));
                garisD1.add(new Entry(44, Float.parseFloat("92")));
                garisC1.add(new Entry(44, Float.parseFloat("100.2")));
                garisB1.add(new Entry(44, Float.parseFloat("108.4")));
                garisA1.add(new Entry(44, Float.parseFloat("113")));

                garisE1.add(new Entry(45, Float.parseFloat("88.2")));
                garisD1.add(new Entry(45, Float.parseFloat("92.4")));
                garisC1.add(new Entry(45, Float.parseFloat("101")));
                garisB1.add(new Entry(45, Float.parseFloat("109")));
                garisA1.add(new Entry(45, Float.parseFloat("113.4")));

                garisE1.add(new Entry(46, Float.parseFloat("89")));
                garisD1.add(new Entry(46, Float.parseFloat("93")));
                garisC1.add(new Entry(46, Float.parseFloat("101.5")));
                garisB1.add(new Entry(46, Float.parseFloat("110")));
                garisA1.add(new Entry(46, Float.parseFloat("114")));

                garisE1.add(new Entry(47, Float.parseFloat("89.2")));
                garisD1.add(new Entry(47, Float.parseFloat("93.5")));
                garisC1.add(new Entry(47, Float.parseFloat("102")));
                garisB1.add(new Entry(47, Float.parseFloat("110.6")));
                garisA1.add(new Entry(47, Float.parseFloat("115")));

                garisE1.add(new Entry(48, Float.parseFloat("90")));
                garisD1.add(new Entry(48, Float.parseFloat("94")));
                garisC1.add(new Entry(48, Float.parseFloat("102.8")));
                garisB1.add(new Entry(48, Float.parseFloat("111.3")));
                garisA1.add(new Entry(48, Float.parseFloat("115.8")));

                garisE1.add(new Entry(49, Float.parseFloat("90.2")));
                garisD1.add(new Entry(49, Float.parseFloat("94.6")));
                garisC1.add(new Entry(49, Float.parseFloat("103")));
                garisB1.add(new Entry(49, Float.parseFloat("112")));
                garisA1.add(new Entry(49, Float.parseFloat("116.2")));

                garisE1.add(new Entry(50, Float.parseFloat("90.8")));
                garisD1.add(new Entry(50, Float.parseFloat("95")));
                garisC1.add(new Entry(50, Float.parseFloat("104")));
                garisB1.add(new Entry(50, Float.parseFloat("112.8")));
                garisA1.add(new Entry(50, Float.parseFloat("117")));

                garisE1.add(new Entry(51, Float.parseFloat("91")));
                garisD1.add(new Entry(51, Float.parseFloat("95.6")));
                garisC1.add(new Entry(51, Float.parseFloat("104.6")));
                garisB1.add(new Entry(51, Float.parseFloat("113.2")));
                garisA1.add(new Entry(51, Float.parseFloat("117.8")));

                garisE1.add(new Entry(52, Float.parseFloat("91.6")));
                garisD1.add(new Entry(52, Float.parseFloat("96.2")));
                garisC1.add(new Entry(52, Float.parseFloat("105")));
                garisB1.add(new Entry(52, Float.parseFloat("114")));
                garisA1.add(new Entry(52, Float.parseFloat("118.4")));

                garisE1.add(new Entry(53, Float.parseFloat("92")));
                garisD1.add(new Entry(53, Float.parseFloat("96.6")));
                garisC1.add(new Entry(53, Float.parseFloat("105.6")));
                garisB1.add(new Entry(53, Float.parseFloat("114.6")));
                garisA1.add(new Entry(53, Float.parseFloat("119")));

                garisE1.add(new Entry(54, Float.parseFloat("92.4")));
                garisD1.add(new Entry(54, Float.parseFloat("97")));
                garisC1.add(new Entry(54, Float.parseFloat("106.1")));
                garisB1.add(new Entry(54, Float.parseFloat("115.2")));
                garisA1.add(new Entry(54, Float.parseFloat("119.8")));

                garisE1.add(new Entry(55, Float.parseFloat("93")));
                garisD1.add(new Entry(55, Float.parseFloat("97.6")));
                garisC1.add(new Entry(55, Float.parseFloat("106.8")));
                garisB1.add(new Entry(55, Float.parseFloat("116")));
                garisA1.add(new Entry(55, Float.parseFloat("120.4")));

                garisE1.add(new Entry(56, Float.parseFloat("93.4")));
                garisD1.add(new Entry(56, Float.parseFloat("98")));
                garisC1.add(new Entry(56, Float.parseFloat("107.2")));
                garisB1.add(new Entry(56, Float.parseFloat("116.4")));
                garisA1.add(new Entry(56, Float.parseFloat("121")));

                garisE1.add(new Entry(57, Float.parseFloat("93.8")));
                garisD1.add(new Entry(57, Float.parseFloat("98.6")));
                garisC1.add(new Entry(57, Float.parseFloat("107.9")));
                garisB1.add(new Entry(57, Float.parseFloat("117")));
                garisA1.add(new Entry(57, Float.parseFloat("121.8")));

                garisE1.add(new Entry(58, Float.parseFloat("94")));
                garisD1.add(new Entry(58, Float.parseFloat("99")));
                garisC1.add(new Entry(58, Float.parseFloat("108.2")));
                garisB1.add(new Entry(58, Float.parseFloat("117.9")));
                garisA1.add(new Entry(58, Float.parseFloat("122.5")));

                garisE1.add(new Entry(59, Float.parseFloat("94.8")));
                garisD1.add(new Entry(59, Float.parseFloat("99.5")));
                garisC1.add(new Entry(59, Float.parseFloat("109")));
                garisB1.add(new Entry(59, Float.parseFloat("118.2")));
                garisA1.add(new Entry(59, Float.parseFloat("123")));

                garisE1.add(new Entry(60, Float.parseFloat("95")));
                garisD1.add(new Entry(60, Float.parseFloat("100")));
                garisC1.add(new Entry(60, Float.parseFloat("109.2")));
                garisB1.add(new Entry(60, Float.parseFloat("119")));
                garisA1.add(new Entry(60, Float.parseFloat("123.8")));


            } else {

                //DATA KURVA TINGGI TERHADAP UMUR < 5 TAHUN UNTUK lki

                garisE.add(new Entry(0, Float.parseFloat("44")));
                garisD.add(new Entry(0, Float.parseFloat("46.2")));
                garisC.add(new Entry(0, Float.parseFloat("50")));
                garisB.add(new Entry(0, Float.parseFloat("54")));
                garisA.add(new Entry(0, Float.parseFloat("55.2")));

                garisE.add(new Entry(1, Float.parseFloat("49")));
                garisD.add(new Entry(1, Float.parseFloat("51")));
                garisC.add(new Entry(1, Float.parseFloat("55")));
                garisB.add(new Entry(1, Float.parseFloat("59")));
                garisA.add(new Entry(1, Float.parseFloat("60")));

                garisE.add(new Entry(2, Float.parseFloat("53")));
                garisD.add(new Entry(2, Float.parseFloat("55")));
                garisC.add(new Entry(2, Float.parseFloat("58.4")));
                garisB.add(new Entry(2, Float.parseFloat("62.4")));
                garisA.add(new Entry(2, Float.parseFloat("64.8")));

                garisE.add(new Entry(3, Float.parseFloat("55")));
                garisD.add(new Entry(3, Float.parseFloat("57")));
                garisC.add(new Entry(3, Float.parseFloat("61")));
                garisB.add(new Entry(3, Float.parseFloat("66")));
                garisA.add(new Entry(3, Float.parseFloat("68")));

                garisE.add(new Entry(4, Float.parseFloat("58")));
                garisD.add(new Entry(4, Float.parseFloat("60")));
                garisC.add(new Entry(4, Float.parseFloat("64")));
                garisB.add(new Entry(4, Float.parseFloat("68")));
                garisA.add(new Entry(4, Float.parseFloat("70")));

                garisE.add(new Entry(5, Float.parseFloat("59.8")));
                garisD.add(new Entry(5, Float.parseFloat("62")));
                garisC.add(new Entry(5, Float.parseFloat("66")));
                garisB.add(new Entry(5, Float.parseFloat("70")));
                garisA.add(new Entry(5, Float.parseFloat("72")));

                garisE.add(new Entry(6, Float.parseFloat("61")));
                garisD.add(new Entry(6, Float.parseFloat("63")));
                garisC.add(new Entry(6, Float.parseFloat("67.8")));
                garisB.add(new Entry(6, Float.parseFloat("72")));
                garisA.add(new Entry(6, Float.parseFloat("74")));

                garisE.add(new Entry(7, Float.parseFloat("63")));
                garisD.add(new Entry(7, Float.parseFloat("65")));
                garisC.add(new Entry(7, Float.parseFloat("69")));
                garisB.add(new Entry(7, Float.parseFloat("73.6")));
                garisA.add(new Entry(7, Float.parseFloat("76")));

                garisE.add(new Entry(8, Float.parseFloat("64")));
                garisD.add(new Entry(8, Float.parseFloat("66")));
                garisC.add(new Entry(8, Float.parseFloat("70.4")));
                garisB.add(new Entry(8, Float.parseFloat("75")));
                garisA.add(new Entry(8, Float.parseFloat("77")));

                garisE.add(new Entry(9, Float.parseFloat("65")));
                garisD.add(new Entry(9, Float.parseFloat("67.5")));
                garisC.add(new Entry(9, Float.parseFloat("72")));
                garisB.add(new Entry(9, Float.parseFloat("76.4")));
                garisA.add(new Entry(9, Float.parseFloat("79")));

                garisE.add(new Entry(10, Float.parseFloat("66")));
                garisD.add(new Entry(10, Float.parseFloat("69")));
                garisC.add(new Entry(10, Float.parseFloat("73.4")));
                garisB.add(new Entry(10, Float.parseFloat("78")));
                garisA.add(new Entry(10, Float.parseFloat("80")));

                garisE.add(new Entry(11, Float.parseFloat("68")));
                garisD.add(new Entry(11, Float.parseFloat("70")));
                garisC.add(new Entry(11, Float.parseFloat("74.8")));
                garisB.add(new Entry(11, Float.parseFloat("79")));
                garisA.add(new Entry(11, Float.parseFloat("82")));

                garisE.add(new Entry(12, Float.parseFloat("69")));
                garisD.add(new Entry(12, Float.parseFloat("71")));
                garisC.add(new Entry(12, Float.parseFloat("76")));
                garisB.add(new Entry(12, Float.parseFloat("80.2")));
                garisA.add(new Entry(12, Float.parseFloat("83")));

                garisE.add(new Entry(13, Float.parseFloat("69.8")));
                garisD.add(new Entry(13, Float.parseFloat("72")));
                garisC.add(new Entry(13, Float.parseFloat("77")));
                garisB.add(new Entry(13, Float.parseFloat("82")));
                garisA.add(new Entry(13, Float.parseFloat("84")));

                garisE.add(new Entry(14, Float.parseFloat("70.8")));
                garisD.add(new Entry(14, Float.parseFloat("73")));
                garisC.add(new Entry(14, Float.parseFloat("78")));
                garisB.add(new Entry(14, Float.parseFloat("83")));
                garisA.add(new Entry(14, Float.parseFloat("85.6")));

                garisE.add(new Entry(15, Float.parseFloat("71.6")));
                garisD.add(new Entry(15, Float.parseFloat("74")));
                garisC.add(new Entry(15, Float.parseFloat("79")));
                garisB.add(new Entry(15, Float.parseFloat("84")));
                garisA.add(new Entry(15, Float.parseFloat("87")));

                garisE.add(new Entry(16, Float.parseFloat("72.5")));
                garisD.add(new Entry(16, Float.parseFloat("75")));
                garisC.add(new Entry(16, Float.parseFloat("80")));
                garisB.add(new Entry(16, Float.parseFloat("85.3")));
                garisA.add(new Entry(16, Float.parseFloat("88")));

                garisE.add(new Entry(17, Float.parseFloat("73")));
                garisD.add(new Entry(17, Float.parseFloat("76")));
                garisC.add(new Entry(17, Float.parseFloat("81")));
                garisB.add(new Entry(17, Float.parseFloat("86.5")));
                garisA.add(new Entry(17, Float.parseFloat("89")));

                garisE.add(new Entry(18, Float.parseFloat("74")));
                garisD.add(new Entry(18, Float.parseFloat("77")));
                garisC.add(new Entry(18, Float.parseFloat("82")));
                garisB.add(new Entry(18, Float.parseFloat("88")));
                garisA.add(new Entry(18, Float.parseFloat("90.3")));

                garisE.add(new Entry(19, Float.parseFloat("75")));
                garisD.add(new Entry(19, Float.parseFloat("78")));
                garisC.add(new Entry(19, Float.parseFloat("83")));
                garisB.add(new Entry(19, Float.parseFloat("89")));
                garisA.add(new Entry(19, Float.parseFloat("91.8")));

                garisE.add(new Entry(20, Float.parseFloat("76")));
                garisD.add(new Entry(20, Float.parseFloat("78.9")));
                garisC.add(new Entry(20, Float.parseFloat("84")));
                garisB.add(new Entry(20, Float.parseFloat("90")));
                garisA.add(new Entry(20, Float.parseFloat("92.4")));

                garisE.add(new Entry(21, Float.parseFloat("76.3")));
                garisD.add(new Entry(21, Float.parseFloat("79.2")));
                garisC.add(new Entry(21, Float.parseFloat("85")));
                garisB.add(new Entry(21, Float.parseFloat("91")));
                garisA.add(new Entry(21, Float.parseFloat("94")));

                garisE.add(new Entry(22, Float.parseFloat("77")));
                garisD.add(new Entry(22, Float.parseFloat("80")));
                garisC.add(new Entry(22, Float.parseFloat("86")));
                garisB.add(new Entry(22, Float.parseFloat("92")));
                garisA.add(new Entry(22, Float.parseFloat("95")));

                garisE.add(new Entry(23, Float.parseFloat("78")));
                garisD.add(new Entry(23, Float.parseFloat("81")));
                garisC.add(new Entry(23, Float.parseFloat("87")));
                garisB.add(new Entry(23, Float.parseFloat("93")));
                garisA.add(new Entry(23, Float.parseFloat("96")));

                garisE.add(new Entry(24, Float.parseFloat("78.3")));
                garisD.add(new Entry(24, Float.parseFloat("81.6")));
                garisC.add(new Entry(24, Float.parseFloat("87.7")));
                garisB.add(new Entry(24, Float.parseFloat("94")));
                garisA.add(new Entry(24, Float.parseFloat("97")));

                garisE1.add(new Entry(24, Float.parseFloat("78")));
                garisD1.add(new Entry(24, Float.parseFloat("81")));
                garisC1.add(new Entry(24, Float.parseFloat("87")));
                garisB1.add(new Entry(24, Float.parseFloat("93.4")));
                garisA1.add(new Entry(24, Float.parseFloat("96.2")));

                garisE1.add(new Entry(25, Float.parseFloat("78.8")));
                garisD1.add(new Entry(25, Float.parseFloat("82")));
                garisC1.add(new Entry(25, Float.parseFloat("88")));
                garisB1.add(new Entry(25, Float.parseFloat("94")));
                garisA1.add(new Entry(25, Float.parseFloat("97")));

                garisE1.add(new Entry(26, Float.parseFloat("79")));
                garisD1.add(new Entry(26, Float.parseFloat("82.5")));
                garisC1.add(new Entry(26, Float.parseFloat("88.8")));
                garisB1.add(new Entry(26, Float.parseFloat("95")));
                garisA1.add(new Entry(26, Float.parseFloat("98")));

                garisE1.add(new Entry(27, Float.parseFloat("80")));
                garisD1.add(new Entry(27, Float.parseFloat("83")));
                garisC1.add(new Entry(27, Float.parseFloat("89.6")));
                garisB1.add(new Entry(27, Float.parseFloat("96")));
                garisA1.add(new Entry(27, Float.parseFloat("99")));

                garisE1.add(new Entry(28, Float.parseFloat("80.5")));
                garisD1.add(new Entry(28, Float.parseFloat("84")));
                garisC1.add(new Entry(28, Float.parseFloat("90.4")));
                garisB1.add(new Entry(28, Float.parseFloat("97")));
                garisA1.add(new Entry(28, Float.parseFloat("100")));

                garisE1.add(new Entry(29, Float.parseFloat("81")));
                garisD1.add(new Entry(29, Float.parseFloat("84.4")));
                garisC1.add(new Entry(29, Float.parseFloat("91")));
                garisB1.add(new Entry(29, Float.parseFloat("98")));
                garisA1.add(new Entry(29, Float.parseFloat("101")));

                garisE1.add(new Entry(30, Float.parseFloat("81.6")));
                garisD1.add(new Entry(30, Float.parseFloat("85")));
                garisC1.add(new Entry(30, Float.parseFloat("92")));
                garisB1.add(new Entry(30, Float.parseFloat("98.8")));
                garisA1.add(new Entry(30, Float.parseFloat("102")));

                garisE1.add(new Entry(31, Float.parseFloat("82")));
                garisD1.add(new Entry(31, Float.parseFloat("86")));
                garisC1.add(new Entry(31, Float.parseFloat("92.5")));
                garisB1.add(new Entry(31, Float.parseFloat("99.8")));
                garisA1.add(new Entry(31, Float.parseFloat("103")));

                garisE1.add(new Entry(32, Float.parseFloat("83")));
                garisD1.add(new Entry(32, Float.parseFloat("86.4")));
                garisC1.add(new Entry(32, Float.parseFloat("93.3")));
                garisB1.add(new Entry(32, Float.parseFloat("100.3")));
                garisA1.add(new Entry(32, Float.parseFloat("104")));

                garisE1.add(new Entry(33, Float.parseFloat("83.2")));
                garisD1.add(new Entry(33, Float.parseFloat("87")));
                garisC1.add(new Entry(33, Float.parseFloat("94")));
                garisB1.add(new Entry(33, Float.parseFloat("101.2")));
                garisA1.add(new Entry(33, Float.parseFloat("105")));

                garisE1.add(new Entry(34, Float.parseFloat("84")));
                garisD1.add(new Entry(34, Float.parseFloat("87.6")));
                garisC1.add(new Entry(34, Float.parseFloat("95")));
                garisB1.add(new Entry(34, Float.parseFloat("102")));
                garisA1.add(new Entry(34, Float.parseFloat("105.8")));

                garisE1.add(new Entry(35, Float.parseFloat("84.4")));
                garisD1.add(new Entry(35, Float.parseFloat("88")));
                garisC1.add(new Entry(35, Float.parseFloat("95.3")));
                garisB1.add(new Entry(35, Float.parseFloat("103")));
                garisA1.add(new Entry(35, Float.parseFloat("106")));

                garisE1.add(new Entry(36, Float.parseFloat("85")));
                garisD1.add(new Entry(36, Float.parseFloat("88.8")));
                garisC1.add(new Entry(36, Float.parseFloat("96")));
                garisB1.add(new Entry(36, Float.parseFloat("103.5")));
                garisA1.add(new Entry(36, Float.parseFloat("107")));

                garisE1.add(new Entry(37, Float.parseFloat("85.2")));
                garisD1.add(new Entry(37, Float.parseFloat("89")));
                garisC1.add(new Entry(37, Float.parseFloat("96.8")));
                garisB1.add(new Entry(37, Float.parseFloat("104")));
                garisA1.add(new Entry(37, Float.parseFloat("108")));

                garisE1.add(new Entry(38, Float.parseFloat("86")));
                garisD1.add(new Entry(38, Float.parseFloat("90")));
                garisC1.add(new Entry(38, Float.parseFloat("97.2")));
                garisB1.add(new Entry(38, Float.parseFloat("105")));
                garisA1.add(new Entry(38, Float.parseFloat("109")));

                garisE1.add(new Entry(39, Float.parseFloat("86.3")));
                garisD1.add(new Entry(39, Float.parseFloat("90.2")));
                garisC1.add(new Entry(39, Float.parseFloat("98")));
                garisB1.add(new Entry(39, Float.parseFloat("106")));
                garisA1.add(new Entry(39, Float.parseFloat("109.8")));

                garisE1.add(new Entry(40, Float.parseFloat("87")));
                garisD1.add(new Entry(40, Float.parseFloat("91")));
                garisC1.add(new Entry(40, Float.parseFloat("98.8")));
                garisB1.add(new Entry(40, Float.parseFloat("106.3")));
                garisA1.add(new Entry(40, Float.parseFloat("110")));

                garisE1.add(new Entry(41, Float.parseFloat("87.3")));
                garisD1.add(new Entry(41, Float.parseFloat("91.3")));
                garisC1.add(new Entry(41, Float.parseFloat("99.2")));
                garisB1.add(new Entry(41, Float.parseFloat("107")));
                garisA1.add(new Entry(41, Float.parseFloat("111")));

                garisE1.add(new Entry(42, Float.parseFloat("88")));
                garisD1.add(new Entry(42, Float.parseFloat("92")));
                garisC1.add(new Entry(42, Float.parseFloat("100")));
                garisB1.add(new Entry(42, Float.parseFloat("108")));
                garisA1.add(new Entry(42, Float.parseFloat("112")));

                garisE1.add(new Entry(43, Float.parseFloat("88.4")));
                garisD1.add(new Entry(43, Float.parseFloat("92.4")));
                garisC1.add(new Entry(43, Float.parseFloat("100.3")));
                garisB1.add(new Entry(43, Float.parseFloat("108.6")));
                garisA1.add(new Entry(43, Float.parseFloat("112.4")));

                garisE1.add(new Entry(44, Float.parseFloat("89")));
                garisD1.add(new Entry(44, Float.parseFloat("93")));
                garisC1.add(new Entry(44, Float.parseFloat("101")));
                garisB1.add(new Entry(44, Float.parseFloat("109")));
                garisA1.add(new Entry(44, Float.parseFloat("113")));

                garisE1.add(new Entry(45, Float.parseFloat("89.2")));
                garisD1.add(new Entry(45, Float.parseFloat("93.3")));
                garisC1.add(new Entry(45, Float.parseFloat("101.6")));
                garisB1.add(new Entry(45, Float.parseFloat("110")));
                garisA1.add(new Entry(45, Float.parseFloat("114")));

                garisE1.add(new Entry(46, Float.parseFloat("90")));
                garisD1.add(new Entry(46, Float.parseFloat("94")));
                garisC1.add(new Entry(46, Float.parseFloat("102")));
                garisB1.add(new Entry(46, Float.parseFloat("110.3")));
                garisA1.add(new Entry(46, Float.parseFloat("114.6")));

                garisE1.add(new Entry(47, Float.parseFloat("90.1")));
                garisD1.add(new Entry(47, Float.parseFloat("94.5")));
                garisC1.add(new Entry(47, Float.parseFloat("102.9")));
                garisB1.add(new Entry(47, Float.parseFloat("111")));
                garisA1.add(new Entry(47, Float.parseFloat("115")));

                garisE1.add(new Entry(48, Float.parseFloat("90.8")));
                garisD1.add(new Entry(48, Float.parseFloat("95")));
                garisC1.add(new Entry(48, Float.parseFloat("103.2")));
                garisB1.add(new Entry(48, Float.parseFloat("112")));
                garisA1.add(new Entry(48, Float.parseFloat("116")));

                garisE1.add(new Entry(49, Float.parseFloat("91")));
                garisD1.add(new Entry(49, Float.parseFloat("95.4")));
                garisC1.add(new Entry(49, Float.parseFloat("103.9")));
                garisB1.add(new Entry(49, Float.parseFloat("112.3")));
                garisA1.add(new Entry(49, Float.parseFloat("116.6")));

                garisE1.add(new Entry(50, Float.parseFloat("91.6")));
                garisD1.add(new Entry(50, Float.parseFloat("96")));
                garisC1.add(new Entry(50, Float.parseFloat("104.3")));
                garisB1.add(new Entry(50, Float.parseFloat("113")));
                garisA1.add(new Entry(50, Float.parseFloat("117")));

                garisE1.add(new Entry(51, Float.parseFloat("92")));
                garisD1.add(new Entry(51, Float.parseFloat("96.4")));
                garisC1.add(new Entry(51, Float.parseFloat("105")));
                garisB1.add(new Entry(51, Float.parseFloat("113.8")));
                garisA1.add(new Entry(51, Float.parseFloat("118")));

                garisE1.add(new Entry(52, Float.parseFloat("92.5")));
                garisD1.add(new Entry(52, Float.parseFloat("97")));
                garisC1.add(new Entry(52, Float.parseFloat("105.4")));
                garisB1.add(new Entry(52, Float.parseFloat("114")));
                garisA1.add(new Entry(52, Float.parseFloat("118.5")));

                garisE1.add(new Entry(53, Float.parseFloat("93")));
                garisD1.add(new Entry(53, Float.parseFloat("97.3")));
                garisC1.add(new Entry(53, Float.parseFloat("106")));
                garisB1.add(new Entry(53, Float.parseFloat("115")));
                garisA1.add(new Entry(53, Float.parseFloat("119")));

                garisE1.add(new Entry(54, Float.parseFloat("93.2")));
                garisD1.add(new Entry(54, Float.parseFloat("98")));
                garisC1.add(new Entry(54, Float.parseFloat("106.8")));
                garisB1.add(new Entry(54, Float.parseFloat("115.4")));
                garisA1.add(new Entry(54, Float.parseFloat("120")));

                garisE1.add(new Entry(55, Float.parseFloat("94")));
                garisD1.add(new Entry(55, Float.parseFloat("98.2")));
                garisC1.add(new Entry(55, Float.parseFloat("107")));
                garisB1.add(new Entry(55, Float.parseFloat("115.8")));
                garisA1.add(new Entry(55, Float.parseFloat("120.5")));

                garisE1.add(new Entry(56, Float.parseFloat("94.2")));
                garisD1.add(new Entry(56, Float.parseFloat("99")));
                garisC1.add(new Entry(56, Float.parseFloat("107.8")));
                garisB1.add(new Entry(56, Float.parseFloat("116")));
                garisA1.add(new Entry(56, Float.parseFloat("121")));

                garisE1.add(new Entry(57, Float.parseFloat("94.8")));
                garisD1.add(new Entry(57, Float.parseFloat("99.2")));
                garisC1.add(new Entry(57, Float.parseFloat("108.2")));
                garisB1.add(new Entry(57, Float.parseFloat("117.1")));
                garisA1.add(new Entry(57, Float.parseFloat("122")));

                garisE1.add(new Entry(58, Float.parseFloat("95")));
                garisD1.add(new Entry(58, Float.parseFloat("100")));
                garisC1.add(new Entry(58, Float.parseFloat("109")));
                garisB1.add(new Entry(58, Float.parseFloat("118")));
                garisA1.add(new Entry(58, Float.parseFloat("122.8")));

                garisE1.add(new Entry(59, Float.parseFloat("95.4")));
                garisD1.add(new Entry(59, Float.parseFloat("100.2")));
                garisC1.add(new Entry(59, Float.parseFloat("109.2")));
                garisB1.add(new Entry(59, Float.parseFloat("118.4")));
                garisA1.add(new Entry(59, Float.parseFloat("123")));

                garisE1.add(new Entry(60, Float.parseFloat("96")));
                garisD1.add(new Entry(60, Float.parseFloat("100.8")));
                garisC1.add(new Entry(60, Float.parseFloat("110")));
                garisB1.add(new Entry(60, Float.parseFloat("119")));
                garisA1.add(new Entry(60, Float.parseFloat("124")));


            }

            ArrayList<ILineDataSet> dataSets = new ArrayList<>();

            LineDataSet siUser = new LineDataSet(dataUser, "Titik Anda");
            siUser.setColor(Color.MAGENTA);
            siUser.setCircleColor(Color.MAGENTA);

            LineDataSet datasetE = new LineDataSet(garisE, "");
            datasetE.setDrawCircles(false);
            datasetE.setColor(Color.RED);

            LineDataSet datasetD = new LineDataSet(garisD, "");
            datasetD.setDrawCircles(false);
            datasetD.setColor(Color.YELLOW);

            LineDataSet datasetC = new LineDataSet(garisC, "");
            datasetC.setDrawCircles(false);
            datasetC.setColor(Color.GREEN);

            LineDataSet datasetB = new LineDataSet(garisB, "");
            datasetB.setDrawCircles(false);
            datasetB.setColor(Color.YELLOW);

            LineDataSet datasetA = new LineDataSet(garisA, "");
            datasetA.setDrawCircles(false);
            datasetA.setColor(Color.RED);

            LineDataSet datasetE1 = new LineDataSet(garisE1, "");
            datasetE1.setDrawCircles(false);
            datasetE1.setColor(Color.RED);

            LineDataSet datasetD1 = new LineDataSet(garisD1, "");
            datasetD1.setDrawCircles(false);
            datasetD1.setColor(Color.YELLOW);

            LineDataSet datasetC1 = new LineDataSet(garisC1, "");
            datasetC1.setDrawCircles(false);
            datasetC1.setColor(Color.GREEN);

            LineDataSet datasetB1 = new LineDataSet(garisB1, "");
            datasetB1.setDrawCircles(false);
            datasetB1.setColor(Color.YELLOW);

            LineDataSet datasetA1 = new LineDataSet(garisA1, "");
            datasetA1.setDrawCircles(false);
            datasetA1.setColor(Color.RED);

            datasetA.setDrawValues(false);

            datasetE.setValueFormatter(new MyValueFormatter());
            datasetD.setValueFormatter(new MyValueFormatter());
            datasetC.setValueFormatter(new MyValueFormatter());
            datasetB.setValueFormatter(new MyValueFormatter());
            datasetA.setValueFormatter(new MyValueFormatter());
            datasetE1.setValueFormatter(new MyValueFormatter());
            datasetD1.setValueFormatter(new MyValueFormatter());
            datasetC1.setValueFormatter(new MyValueFormatter());
            datasetB1.setValueFormatter(new MyValueFormatter());
            datasetA1.setValueFormatter(new MyValueFormatter());

            dataSets.add(datasetE);
            dataSets.add(datasetD);
            dataSets.add(datasetC);
            dataSets.add(datasetB);
            dataSets.add(datasetA);
            dataSets.add(datasetE1);
            dataSets.add(datasetD1);
            dataSets.add(datasetC1);
            dataSets.add(datasetB1);
            dataSets.add(datasetA1);
            dataSets.add(siUser);

            chart.getXAxis().setValueFormatter(new MyXAxisValueFormatter(values));
            chart.getAxisLeft().setValueFormatter(new MyCMYAxisValueFormatter(valuesCm));
            chart.getAxisRight().setValueFormatter(new MyCMYAxisValueFormatter(valuesCm));

            chart.setData(new LineData(dataSets));
            chart.getLegend().setEnabled(false);
            Description description = new Description();
            description.setText("Sumber : WHO Child Growth Standards");
            chart.setDescription(description);
            chart.invalidate();

        } else if (dk.getStatus().equals("BeratTinggi")) {

            String[] valuesBMI = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
                    , "13", "14", "15", "16", "17", "18", "19", "20", "21"};

            ArrayList<Entry> garisE1 = new ArrayList<>();
            ArrayList<Entry> garisD1 = new ArrayList<>();
            ArrayList<Entry> garisC1 = new ArrayList<>();
            ArrayList<Entry> garisB1 = new ArrayList<>();
            ArrayList<Entry> garisA1 = new ArrayList<>();
            ArrayList<Entry> dataUser1 = new ArrayList<>();

            dataUser1.add(new Entry(dk.getUmur(), (float) bmi));

            if (dk.getJk().equals("Perempuan")) {

                //DATA KURVA BMI TERHADAP UMUR < 5 TAHUN UNTUK PEREMPUAN
                garisE.add(new Entry(0, Float.parseFloat("11.1")));
                garisD.add(new Entry(0, Float.parseFloat("12.1")));
                garisC.add(new Entry(0, Float.parseFloat("13.3")));
                garisB.add(new Entry(0, Float.parseFloat("14.8")));
                garisA.add(new Entry(0, Float.parseFloat("15.9")));

                garisE.add(new Entry(2, Float.parseFloat("13.2")));
                garisD.add(new Entry(2, Float.parseFloat("14.4")));
                garisC.add(new Entry(2, Float.parseFloat("15.8")));
                garisB.add(new Entry(2, Float.parseFloat("17.4")));
                garisA.add(new Entry(2, Float.parseFloat("18.8")));

                garisE.add(new Entry(4, Float.parseFloat("14")));
                garisD.add(new Entry(4, Float.parseFloat("15.2")));
                garisC.add(new Entry(4, Float.parseFloat("16.6")));
                garisB.add(new Entry(4, Float.parseFloat("18.4")));
                garisA.add(new Entry(4, Float.parseFloat("19.8")));

                garisE.add(new Entry(6, Float.parseFloat("14.3")));
                garisD.add(new Entry(6, Float.parseFloat("15.4")));
                garisC.add(new Entry(6, Float.parseFloat("16.9")));
                garisB.add(new Entry(6, Float.parseFloat("18.6")));
                garisA.add(new Entry(6, Float.parseFloat("20.1")));

                garisE.add(new Entry(8, Float.parseFloat("14.3")));
                garisD.add(new Entry(8, Float.parseFloat("15.4")));
                garisC.add(new Entry(8, Float.parseFloat("16.8")));
                garisB.add(new Entry(8, Float.parseFloat("18.5")));
                garisA.add(new Entry(8, Float.parseFloat("20")));

                garisE.add(new Entry(10, Float.parseFloat("14.1")));
                garisD.add(new Entry(10, Float.parseFloat("15.2")));
                garisC.add(new Entry(10, Float.parseFloat("16.6")));
                garisB.add(new Entry(10, Float.parseFloat("18.4")));
                garisA.add(new Entry(10, Float.parseFloat("19.7")));

                garisE.add(new Entry(12, Float.parseFloat("13.9")));
                garisD.add(new Entry(12, Float.parseFloat("15")));
                garisC.add(new Entry(12, Float.parseFloat("16.3")));
                garisB.add(new Entry(12, Float.parseFloat("18")));
                garisA.add(new Entry(12, Float.parseFloat("19.4")));

                garisE.add(new Entry(14, Float.parseFloat("13.7")));
                garisD.add(new Entry(14, Float.parseFloat("14.7")));
                garisC.add(new Entry(14, Float.parseFloat("16.1")));
                garisB.add(new Entry(14, Float.parseFloat("17.7")));
                garisA.add(new Entry(14, Float.parseFloat("19.1")));

                garisE.add(new Entry(16, Float.parseFloat("13.6")));
                garisD.add(new Entry(16, Float.parseFloat("14.6")));
                garisC.add(new Entry(16, Float.parseFloat("15.9")));
                garisB.add(new Entry(16, Float.parseFloat("17.4")));
                garisA.add(new Entry(16, Float.parseFloat("18.8")));

                garisE.add(new Entry(18, Float.parseFloat("13.4")));
                garisD.add(new Entry(18, Float.parseFloat("14.4")));
                garisC.add(new Entry(18, Float.parseFloat("15.7")));
                garisB.add(new Entry(18, Float.parseFloat("17.2")));
                garisA.add(new Entry(18, Float.parseFloat("18.6")));

                garisE.add(new Entry(20, Float.parseFloat("13.3")));
                garisD.add(new Entry(20, Float.parseFloat("14.3")));
                garisC.add(new Entry(20, Float.parseFloat("15.6")));
                garisB.add(new Entry(20, Float.parseFloat("17.1")));
                garisA.add(new Entry(20, Float.parseFloat("18.4")));

                garisE.add(new Entry(22, Float.parseFloat("13.3")));
                garisD.add(new Entry(22, Float.parseFloat("14.2")));
                garisC.add(new Entry(22, Float.parseFloat("15.5")));
                garisB.add(new Entry(22, Float.parseFloat("17")));
                garisA.add(new Entry(22, Float.parseFloat("18.3")));

                garisE.add(new Entry(24, Float.parseFloat("13.2")));
                garisD.add(new Entry(24, Float.parseFloat("14.1")));
                garisC.add(new Entry(24, Float.parseFloat("15.4")));
                garisB.add(new Entry(24, Float.parseFloat("16.9")));
                garisA.add(new Entry(24, Float.parseFloat("18.2")));


                garisE1.add(new Entry(24, Float.parseFloat("13.5")));
                garisD1.add(new Entry(24, Float.parseFloat("14.5")));
                garisC1.add(new Entry(24, Float.parseFloat("15.7")));
                garisB1.add(new Entry(24, Float.parseFloat("17.2")));
                garisA1.add(new Entry(24, Float.parseFloat("18.5")));

                garisE1.add(new Entry(26, Float.parseFloat("13.4")));
                garisD1.add(new Entry(26, Float.parseFloat("14.3")));
                garisC1.add(new Entry(26, Float.parseFloat("15.6")));
                garisB1.add(new Entry(26, Float.parseFloat("17.1")));
                garisA1.add(new Entry(26, Float.parseFloat("18.4")));

                garisE1.add(new Entry(28, Float.parseFloat("13.4")));
                garisD1.add(new Entry(28, Float.parseFloat("14.3")));
                garisC1.add(new Entry(28, Float.parseFloat("15.6")));
                garisB1.add(new Entry(28, Float.parseFloat("17")));
                garisA1.add(new Entry(28, Float.parseFloat("18.4")));

                garisE1.add(new Entry(30, Float.parseFloat("13.4")));
                garisD1.add(new Entry(30, Float.parseFloat("14.3")));
                garisC1.add(new Entry(30, Float.parseFloat("15.5")));
                garisB1.add(new Entry(30, Float.parseFloat("17")));
                garisA1.add(new Entry(30, Float.parseFloat("18.3")));

                garisE1.add(new Entry(32, Float.parseFloat("13.3")));
                garisD1.add(new Entry(32, Float.parseFloat("14.2")));
                garisC1.add(new Entry(32, Float.parseFloat("15.5")));
                garisB1.add(new Entry(32, Float.parseFloat("16.9")));
                garisA1.add(new Entry(32, Float.parseFloat("18.3")));

                garisE1.add(new Entry(34, Float.parseFloat("13.3")));
                garisD1.add(new Entry(34, Float.parseFloat("14.2")));
                garisC1.add(new Entry(34, Float.parseFloat("15.4")));
                garisB1.add(new Entry(34, Float.parseFloat("16.9")));
                garisA1.add(new Entry(34, Float.parseFloat("18.3")));

                garisE1.add(new Entry(36, Float.parseFloat("13.2")));
                garisD1.add(new Entry(36, Float.parseFloat("14.1")));
                garisC1.add(new Entry(36, Float.parseFloat("15.4")));
                garisB1.add(new Entry(36, Float.parseFloat("16.8")));
                garisA1.add(new Entry(36, Float.parseFloat("18.2")));

                garisE1.add(new Entry(38, Float.parseFloat("13.2")));
                garisD1.add(new Entry(38, Float.parseFloat("14.1")));
                garisC1.add(new Entry(38, Float.parseFloat("15.4")));
                garisB1.add(new Entry(38, Float.parseFloat("16.8")));
                garisA1.add(new Entry(38, Float.parseFloat("18.2")));

                garisE1.add(new Entry(40, Float.parseFloat("13.1")));
                garisD1.add(new Entry(40, Float.parseFloat("14")));
                garisC1.add(new Entry(40, Float.parseFloat("15.3")));
                garisB1.add(new Entry(40, Float.parseFloat("16.8")));
                garisA1.add(new Entry(40, Float.parseFloat("18.4")));

                garisE1.add(new Entry(42, Float.parseFloat("13.1")));
                garisD1.add(new Entry(42, Float.parseFloat("14")));
                garisC1.add(new Entry(42, Float.parseFloat("15.3")));
                garisB1.add(new Entry(42, Float.parseFloat("16.8")));
                garisA1.add(new Entry(42, Float.parseFloat("18.2")));

                garisE1.add(new Entry(44, Float.parseFloat("13")));
                garisD1.add(new Entry(44, Float.parseFloat("14")));
                garisC1.add(new Entry(44, Float.parseFloat("15.3")));
                garisB1.add(new Entry(44, Float.parseFloat("16.8")));
                garisA1.add(new Entry(44, Float.parseFloat("18.2")));

                garisE1.add(new Entry(46, Float.parseFloat("13")));
                garisD1.add(new Entry(46, Float.parseFloat("13.9")));
                garisC1.add(new Entry(46, Float.parseFloat("15.3")));
                garisB1.add(new Entry(46, Float.parseFloat("16.8")));
                garisA1.add(new Entry(46, Float.parseFloat("18.3")));

                garisE1.add(new Entry(48, Float.parseFloat("12.9")));
                garisD1.add(new Entry(48, Float.parseFloat("13.9")));
                garisC1.add(new Entry(48, Float.parseFloat("15.2")));
                garisB1.add(new Entry(48, Float.parseFloat("16.8")));
                garisA1.add(new Entry(48, Float.parseFloat("18.3")));

                garisE1.add(new Entry(50, Float.parseFloat("12.9")));
                garisD1.add(new Entry(50, Float.parseFloat("13.9")));
                garisC1.add(new Entry(50, Float.parseFloat("15.2")));
                garisB1.add(new Entry(50, Float.parseFloat("16.8")));
                garisA1.add(new Entry(50, Float.parseFloat("18.3")));

                garisE1.add(new Entry(52, Float.parseFloat("12.9")));
                garisD1.add(new Entry(52, Float.parseFloat("13.9")));
                garisC1.add(new Entry(52, Float.parseFloat("15.3")));
                garisB1.add(new Entry(52, Float.parseFloat("16.9")));
                garisA1.add(new Entry(52, Float.parseFloat("18.4")));

                garisE1.add(new Entry(54, Float.parseFloat("12.9")));
                garisD1.add(new Entry(54, Float.parseFloat("13.8")));
                garisC1.add(new Entry(54, Float.parseFloat("15.2")));
                garisB1.add(new Entry(54, Float.parseFloat("16.9")));
                garisA1.add(new Entry(54, Float.parseFloat("18.4")));

                garisE1.add(new Entry(56, Float.parseFloat("12.9")));
                garisD1.add(new Entry(56, Float.parseFloat("13.8")));
                garisC1.add(new Entry(56, Float.parseFloat("15.2")));
                garisB1.add(new Entry(56, Float.parseFloat("16.8")));
                garisA1.add(new Entry(56, Float.parseFloat("18.5")));

                garisE1.add(new Entry(58, Float.parseFloat("12.8")));
                garisD1.add(new Entry(58, Float.parseFloat("13.8")));
                garisC1.add(new Entry(58, Float.parseFloat("15.2")));
                garisB1.add(new Entry(58, Float.parseFloat("16.9")));
                garisA1.add(new Entry(58, Float.parseFloat("18.5")));

                garisE1.add(new Entry(60, Float.parseFloat("12.8")));
                garisD1.add(new Entry(60, Float.parseFloat("13.8")));
                garisC1.add(new Entry(60, Float.parseFloat("15.2")));
                garisB1.add(new Entry(60, Float.parseFloat("16.9")));
                garisA1.add(new Entry(60, Float.parseFloat("18.5")));
            } else {

                //DATA KURVA BMI TERHADAP UMUR < 5 TAHUN UNTUK LAKI-LAKI
                garisE.add(new Entry(0, Float.parseFloat("11.2")));
                garisD.add(new Entry(0, Float.parseFloat("12.2")));
                garisC.add(new Entry(0, Float.parseFloat("13.4")));
                garisB.add(new Entry(0, Float.parseFloat("14.8")));
                garisA.add(new Entry(0, Float.parseFloat("16")));

                garisE.add(new Entry(2, Float.parseFloat("13.8")));
                garisD.add(new Entry(2, Float.parseFloat("15")));
                garisC.add(new Entry(2, Float.parseFloat("16.4")));
                garisB.add(new Entry(2, Float.parseFloat("18")));
                garisA.add(new Entry(2, Float.parseFloat("19")));

                garisE.add(new Entry(4, Float.parseFloat("14.6")));
                garisD.add(new Entry(4, Float.parseFloat("15.8")));
                garisC.add(new Entry(4, Float.parseFloat("17.2")));
                garisB.add(new Entry(4, Float.parseFloat("18.7")));
                garisA.add(new Entry(4, Float.parseFloat("20.1")));

                garisE.add(new Entry(6, Float.parseFloat("14.9")));
                garisD.add(new Entry(6, Float.parseFloat("15.5")));
                garisC.add(new Entry(6, Float.parseFloat("17.4")));
                garisB.add(new Entry(6, Float.parseFloat("18.9")));
                garisA.add(new Entry(6, Float.parseFloat("20.3")));

                garisE.add(new Entry(8, Float.parseFloat("14.8")));
                garisD.add(new Entry(8, Float.parseFloat("15.8")));
                garisC.add(new Entry(8, Float.parseFloat("17.2")));
                garisB.add(new Entry(8, Float.parseFloat("18.8")));
                garisA.add(new Entry(8, Float.parseFloat("20.2")));

                garisE.add(new Entry(10, Float.parseFloat("14.6")));
                garisD.add(new Entry(10, Float.parseFloat("15.6")));
                garisC.add(new Entry(10, Float.parseFloat("17")));
                garisB.add(new Entry(10, Float.parseFloat("18.6")));
                garisA.add(new Entry(10, Float.parseFloat("20")));

                garisE.add(new Entry(12, Float.parseFloat("14.5")));
                garisD.add(new Entry(12, Float.parseFloat("15.5")));
                garisC.add(new Entry(12, Float.parseFloat("16.8")));
                garisB.add(new Entry(12, Float.parseFloat("18.2")));
                garisA.add(new Entry(12, Float.parseFloat("19.6")));

                garisE.add(new Entry(14, Float.parseFloat("14.3")));
                garisD.add(new Entry(14, Float.parseFloat("15.2")));
                garisC.add(new Entry(14, Float.parseFloat("16.6")));
                garisB.add(new Entry(14, Float.parseFloat("18")));
                garisA.add(new Entry(14, Float.parseFloat("19.4")));

                garisE.add(new Entry(16, Float.parseFloat("14.2")));
                garisD.add(new Entry(16, Float.parseFloat("15.2")));
                garisC.add(new Entry(16, Float.parseFloat("16.3")));
                garisB.add(new Entry(16, Float.parseFloat("17.8")));
                garisA.add(new Entry(16, Float.parseFloat("19")));

                garisE.add(new Entry(18, Float.parseFloat("14")));
                garisD.add(new Entry(18, Float.parseFloat("14.9")));
                garisC.add(new Entry(18, Float.parseFloat("16.1")));
                garisB.add(new Entry(18, Float.parseFloat("17.6")));
                garisA.add(new Entry(18, Float.parseFloat("18.8")));

                garisE.add(new Entry(20, Float.parseFloat("13.9")));
                garisD.add(new Entry(20, Float.parseFloat("14.7")));
                garisC.add(new Entry(20, Float.parseFloat("15.9")));
                garisB.add(new Entry(20, Float.parseFloat("17.4")));
                garisA.add(new Entry(20, Float.parseFloat("18.6")));

                garisE.add(new Entry(22, Float.parseFloat("13.8")));
                garisD.add(new Entry(22, Float.parseFloat("14.6")));
                garisC.add(new Entry(22, Float.parseFloat("15.8")));
                garisB.add(new Entry(22, Float.parseFloat("17.2")));
                garisA.add(new Entry(22, Float.parseFloat("18.4")));

                garisE.add(new Entry(24, Float.parseFloat("13.6")));
                garisD.add(new Entry(24, Float.parseFloat("14.5")));
                garisC.add(new Entry(24, Float.parseFloat("15.7")));
                garisB.add(new Entry(24, Float.parseFloat("17.1")));
                garisA.add(new Entry(24, Float.parseFloat("18.2")));


                garisE1.add(new Entry(24, Float.parseFloat("13.9")));
                garisD1.add(new Entry(24, Float.parseFloat("14.8")));
                garisC1.add(new Entry(24, Float.parseFloat("16")));
                garisB1.add(new Entry(24, Float.parseFloat("17.4")));
                garisA1.add(new Entry(24, Float.parseFloat("18.7")));

                garisE1.add(new Entry(26, Float.parseFloat("13.8")));
                garisD1.add(new Entry(26, Float.parseFloat("14.7")));
                garisC1.add(new Entry(26, Float.parseFloat("15.9")));
                garisB1.add(new Entry(26, Float.parseFloat("17.3")));
                garisA1.add(new Entry(26, Float.parseFloat("18.6")));

                garisE1.add(new Entry(28, Float.parseFloat("13.7")));
                garisD1.add(new Entry(28, Float.parseFloat("14.6")));
                garisC1.add(new Entry(28, Float.parseFloat("15.8")));
                garisB1.add(new Entry(28, Float.parseFloat("17.2")));
                garisA1.add(new Entry(28, Float.parseFloat("18.5")));

                garisE1.add(new Entry(30, Float.parseFloat("13.7")));
                garisD1.add(new Entry(30, Float.parseFloat("14.6")));
                garisC1.add(new Entry(30, Float.parseFloat("15.8")));
                garisB1.add(new Entry(30, Float.parseFloat("17.2")));
                garisA1.add(new Entry(30, Float.parseFloat("18.5")));

                garisE1.add(new Entry(32, Float.parseFloat("13.6")));
                garisD1.add(new Entry(32, Float.parseFloat("14.5")));
                garisC1.add(new Entry(32, Float.parseFloat("15.7")));
                garisB1.add(new Entry(32, Float.parseFloat("17.1")));
                garisA1.add(new Entry(32, Float.parseFloat("18.3")));

                garisE1.add(new Entry(34, Float.parseFloat("13.5")));
                garisD1.add(new Entry(34, Float.parseFloat("14.5")));
                garisC1.add(new Entry(34, Float.parseFloat("15.7")));
                garisB1.add(new Entry(34, Float.parseFloat("17.1")));
                garisA1.add(new Entry(34, Float.parseFloat("18.4")));

                garisE1.add(new Entry(36, Float.parseFloat("13.4")));
                garisD1.add(new Entry(36, Float.parseFloat("14.4")));
                garisC1.add(new Entry(36, Float.parseFloat("15.6")));
                garisB1.add(new Entry(36, Float.parseFloat("17")));
                garisA1.add(new Entry(36, Float.parseFloat("18.3")));

                garisE1.add(new Entry(38, Float.parseFloat("13.4")));
                garisD1.add(new Entry(38, Float.parseFloat("14.3")));
                garisC1.add(new Entry(38, Float.parseFloat("15.5")));
                garisB1.add(new Entry(38, Float.parseFloat("16.9")));
                garisA1.add(new Entry(38, Float.parseFloat("18.1")));

                garisE1.add(new Entry(40, Float.parseFloat("13.4")));
                garisD1.add(new Entry(40, Float.parseFloat("14.3")));
                garisC1.add(new Entry(40, Float.parseFloat("15.5")));
                garisB1.add(new Entry(40, Float.parseFloat("16.8")));
                garisA1.add(new Entry(40, Float.parseFloat("18.1")));

                garisE1.add(new Entry(42, Float.parseFloat("13.3")));
                garisD1.add(new Entry(42, Float.parseFloat("14.2")));
                garisC1.add(new Entry(42, Float.parseFloat("15.4")));
                garisB1.add(new Entry(42, Float.parseFloat("16.8")));
                garisA1.add(new Entry(42, Float.parseFloat("18")));

                garisE1.add(new Entry(44, Float.parseFloat("13.2")));
                garisD1.add(new Entry(44, Float.parseFloat("14.2")));
                garisC1.add(new Entry(44, Float.parseFloat("15.4")));
                garisB1.add(new Entry(44, Float.parseFloat("16.8")));
                garisA1.add(new Entry(44, Float.parseFloat("18")));

                garisE1.add(new Entry(46, Float.parseFloat("13.2")));
                garisD1.add(new Entry(46, Float.parseFloat("14.1")));
                garisC1.add(new Entry(46, Float.parseFloat("15.4")));
                garisB1.add(new Entry(46, Float.parseFloat("16.8")));
                garisA1.add(new Entry(46, Float.parseFloat("18")));

                garisE1.add(new Entry(48, Float.parseFloat("13.2")));
                garisD1.add(new Entry(48, Float.parseFloat("14.1")));
                garisC1.add(new Entry(48, Float.parseFloat("15.3")));
                garisB1.add(new Entry(48, Float.parseFloat("16.7")));
                garisA1.add(new Entry(48, Float.parseFloat("18")));

                garisE1.add(new Entry(50, Float.parseFloat("13.2")));
                garisD1.add(new Entry(50, Float.parseFloat("14.1")));
                garisC1.add(new Entry(50, Float.parseFloat("15.3")));
                garisB1.add(new Entry(50, Float.parseFloat("16.7")));
                garisA1.add(new Entry(50, Float.parseFloat("18")));

                garisE1.add(new Entry(52, Float.parseFloat("13.1")));
                garisD1.add(new Entry(52, Float.parseFloat("14")));
                garisC1.add(new Entry(52, Float.parseFloat("15.3")));
                garisB1.add(new Entry(52, Float.parseFloat("16.7")));
                garisA1.add(new Entry(52, Float.parseFloat("18")));

                garisE1.add(new Entry(54, Float.parseFloat("13.1")));
                garisD1.add(new Entry(54, Float.parseFloat("14")));
                garisC1.add(new Entry(54, Float.parseFloat("15.2")));
                garisB1.add(new Entry(54, Float.parseFloat("16.7")));
                garisA1.add(new Entry(54, Float.parseFloat("18")));

                garisE1.add(new Entry(56, Float.parseFloat("13.1")));
                garisD1.add(new Entry(56, Float.parseFloat("14")));
                garisC1.add(new Entry(56, Float.parseFloat("15.2")));
                garisB1.add(new Entry(56, Float.parseFloat("16.7")));
                garisA1.add(new Entry(56, Float.parseFloat("18")));

                garisE1.add(new Entry(58, Float.parseFloat("13")));
                garisD1.add(new Entry(58, Float.parseFloat("14")));
                garisC1.add(new Entry(58, Float.parseFloat("15.2")));
                garisB1.add(new Entry(58, Float.parseFloat("16.7")));
                garisA1.add(new Entry(58, Float.parseFloat("18")));

                garisE1.add(new Entry(60, Float.parseFloat("13")));
                garisD1.add(new Entry(60, Float.parseFloat("13.9")));
                garisC1.add(new Entry(60, Float.parseFloat("15.2")));
                garisB1.add(new Entry(60, Float.parseFloat("16.7")));
                garisA1.add(new Entry(60, Float.parseFloat("18.1")));

            }

            ArrayList<ILineDataSet> dataSets = new ArrayList<>();

            LineDataSet siUser = new LineDataSet(dataUser1, "Titik Anda");
            siUser.setColor(Color.MAGENTA);
            siUser.setCircleColor(Color.MAGENTA);

            LineDataSet datasetE = new LineDataSet(garisE, "");
            datasetE.setDrawCircles(false);
            datasetE.setColor(Color.RED);

            LineDataSet datasetD = new LineDataSet(garisD, "");
            datasetD.setDrawCircles(false);
            datasetD.setColor(Color.YELLOW);

            LineDataSet datasetC = new LineDataSet(garisC, "");
            datasetC.setDrawCircles(false);
            datasetC.setColor(Color.GREEN);

            LineDataSet datasetB = new LineDataSet(garisB, "");
            datasetB.setDrawCircles(false);
            datasetB.setColor(Color.YELLOW);

            LineDataSet datasetA = new LineDataSet(garisA, "");
            datasetA.setDrawCircles(false);
            datasetA.setColor(Color.RED);

            LineDataSet datasetE1 = new LineDataSet(garisE1, "");
            datasetE1.setDrawCircles(false);
            datasetE1.setColor(Color.RED);

            LineDataSet datasetD1 = new LineDataSet(garisD1, "");
            datasetD1.setDrawCircles(false);
            datasetD1.setColor(Color.YELLOW);

            LineDataSet datasetC1 = new LineDataSet(garisC1, "");
            datasetC1.setDrawCircles(false);
            datasetC1.setColor(Color.GREEN);

            LineDataSet datasetB1 = new LineDataSet(garisB1, "");
            datasetB1.setDrawCircles(false);
            datasetB1.setColor(Color.YELLOW);

            LineDataSet datasetA1 = new LineDataSet(garisA1, "");
            datasetA1.setDrawCircles(false);
            datasetA1.setColor(Color.RED);

            datasetA.setDrawValues(false);

            datasetE.setValueFormatter(new MyValueFormatter());
            datasetD.setValueFormatter(new MyValueFormatter());
            datasetC.setValueFormatter(new MyValueFormatter());
            datasetB.setValueFormatter(new MyValueFormatter());
            datasetA.setValueFormatter(new MyValueFormatter());
            datasetE1.setValueFormatter(new MyValueFormatter());
            datasetD1.setValueFormatter(new MyValueFormatter());
            datasetC1.setValueFormatter(new MyValueFormatter());
            datasetB1.setValueFormatter(new MyValueFormatter());
            datasetA1.setValueFormatter(new MyValueFormatter());

            dataSets.add(datasetE);
            dataSets.add(datasetD);
            dataSets.add(datasetC);
            dataSets.add(datasetB);
            dataSets.add(datasetA);
            dataSets.add(datasetE1);
            dataSets.add(datasetD1);
            dataSets.add(datasetC1);
            dataSets.add(datasetB1);
            dataSets.add(datasetA1);
            dataSets.add(siUser);

            chart.getXAxis().setValueFormatter(new MyXAxisValueFormatter(values));
            chart.getAxisLeft().setValueFormatter(new MyBMIYAxisValueFormatter(valuesBMI));
            chart.getAxisRight().setValueFormatter(new MyBMIYAxisValueFormatter(valuesBMI));

            chart.setData(new LineData(dataSets));
            chart.getLegend().setEnabled(false);
            Description description = new Description();
            description.setText("Sumber : WHO Child Growth Standards");
            chart.setDescription(description);
            chart.invalidate();
        }

    }

    public class MyValueFormatter implements IValueFormatter {

        private DecimalFormat mFormat;

        public MyValueFormatter() {
            mFormat = new DecimalFormat("###,###,##0.0"); // use one decimal
        }

        @Override
        public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
            // write your logic here
            return " "; // e.g. append a dollar-sign
        }
    }

    public class MyYAxisValueFormatter implements IAxisValueFormatter {
        private String[] mValues;
        private float mValueCount = 0;

        public MyYAxisValueFormatter() {
        }

        public MyYAxisValueFormatter(String[] values) {
            if (values != null) {
                setValues(values);
            }
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            // "value" represents the position of the label on the axis (x or y)
            int index = Math.round(value);

            if (index < 0 || index >= mValueCount || index != (int) value)
                return "";

            return mValues[index] + " Kg";
        }

        /**
         * this is only needed if numbers are returned, else return 0
         */

        public int getDecimalDigits() {
            return 0;
        }

        public String[] getValues() {
            return mValues;
        }

        public void setValues(String[] values) {
            if (values == null)
                values = new String[]{};

            this.mValues = values;
            this.mValueCount = values.length;
        }
    }

    public class MyXAxisValueFormatter implements IAxisValueFormatter {

        private String[] mValues;
        private int mValueCount = 0;

        public MyXAxisValueFormatter() {
        }

        public MyXAxisValueFormatter(String[] values) {
            if (values != null) {
                setValues(values);
            }
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            // "value" represents the position of the label on the axis (x or y)
            int index = Math.round(value);

            if (index < 0 || index >= mValueCount || index != (int) value)
                return "";

            return mValues[index] + " bulan";
        }

        /**
         * this is only needed if numbers are returned, else return 0
         */

        public int getDecimalDigits() {
            return 0;
        }

        public String[] getValues() {
            return mValues;
        }

        public void setValues(String[] values) {
            if (values == null)
                values = new String[]{};

            this.mValues = values;
            this.mValueCount = values.length;
        }
    }

    public class MyBMIYAxisValueFormatter implements IAxisValueFormatter {
        private String[] mValues;
        private float mValueCount = 0;

        public MyBMIYAxisValueFormatter() {
        }

        public MyBMIYAxisValueFormatter(String[] values) {
            if (values != null) {
                setValues(values);
            }
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            // "value" represents the position of the label on the axis (x or y)
            int index = Math.round(value);

            if (index < 0 || index >= mValueCount || index != (int) value)
                return "";

            return mValues[index] + " BMI";
        }

        /**
         * this is only needed if numbers are returned, else return 0
         */

        public int getDecimalDigits() {
            return 0;
        }

        public String[] getValues() {
            return mValues;
        }

        public void setValues(String[] values) {
            if (values == null)
                values = new String[]{};

            this.mValues = values;
            this.mValueCount = values.length;
        }
    }

    public class MyCMYAxisValueFormatter implements IAxisValueFormatter {
        private String[] mValues;
        private float mValueCount = 0;

        public MyCMYAxisValueFormatter() {
        }

        public MyCMYAxisValueFormatter(String[] values) {
            if (values != null) {
                setValues(values);
            }
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            // "value" represents the position of the label on the axis (x or y)
            int index = Math.round(value);

            if (index < 0 || index >= mValueCount || index != (int) value)
                return "";

            return mValues[index] + " cm";
        }

        /**
         * this is only needed if numbers are returned, else return 0
         */

        public int getDecimalDigits() {
            return 0;
        }

        public String[] getValues() {
            return mValues;
        }

        public void setValues(String[] values) {
            if (values == null)
                values = new String[]{};

            this.mValues = values;
            this.mValueCount = values.length;
        }
    }
}
