package com.kp.mwi.gizianak.Model;

import android.content.Intent;
import android.util.Log;

/**
 * Created by mwi on 6/2/17.
 */

public class BBTinggi {
    private double berat, tinggi, umur, idealberat, idealtinggi, bmi, umurideal, persentase;
    private String gizi, keterangan, kelamin;

    public BBTinggi(double berat, double tinggi, double umur, String kelamin) {
        this.berat = berat;
        this.tinggi = tinggi;
        this.umur = umur;
        this.kelamin = kelamin;
    }


    public void hitungBMI() {
        tinggi = tinggi / 100;
        bmi = berat / (tinggi * tinggi);
        bmi = Math.round(bmi);
        Log.e("bmi", Double.toString(bmi));
    }


    public void BBTinggi() {

        /*UNTUK TITIK A 0-5 Tahun LAKI-LAKI*/
        if ((bmi >= 16) && (umur == 0) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18) && (umur >= 0) && (umur <= 1) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18) && (umur >= 43) && (umur <= 57) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.2) && (umur >= 35) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.4) && (umur >= 30) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.6) && (umur >= 26) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.6) && (umur >= 20) && (umur <= 24) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.8) && (umur >= 18) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19) && (umur >= 17) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.2) && (umur >= 0) && (umur <= 2) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.2) && (umur >= 15) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.4) && (umur >= 14) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.6) && (umur >= 12) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.8) && (umur >= 0) && (umur <= 3) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.8) && (umur >= 11) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 20) && (umur >= 10) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 20.2) && (umur >= 0) && (umur <= 4) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 20.2) && (umur >= 8) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 20.4) && (umur >= 0) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK B 0-5 Tahun LAKI-LAKI*/
        else if ((bmi >= 14.8) && (bmi <= 15.8) && (umur == 0) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 16.4) && (bmi <= 17.4) && (umur == 1) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18) && (bmi <= 19) && (umur == 2) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 16.8) && (umur >= 41) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 16.8) && (umur >= 41) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17) && (umur >= 34) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.2) && (umur >= 29) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.2) && (umur >= 22) && (umur <= 24) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.4) && (umur >= 20) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.6) && (umur >= 18) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.8) && (umur >= 16) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18) && (umur >= 14) && (umur <= 41) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.2) && (umur >= 13) && (umur <= 34) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.4) && (umur >= 11) && (umur <= 22) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.6) && (umur >= 10) && (umur <= 19) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.8) && (umur >= 2) && (umur <= 4) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.8) && (umur >= 8) && (umur <= 17) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19) && (umur >= 2) && (umur <= 16) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.2) && (umur >= 3) && (umur <= 14) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.4) && (umur >= 3) && (umur <= 13) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.6) && (umur >= 3) && (umur <= 11) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.8) && (umur >= 4) && (umur <= 10) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 20) && (umur >= 4) && (umur <= 9) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 20.2) && (umur >= 5) && (umur <= 7) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }


        /*UNTUK TITIK C 0-5 Tahun LAKI-LAKI*/
        else if ((bmi >= 12.2) && (bmi <= 14.6) && (umur == 0) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 13.6) && (bmi <= 16.2) && (umur == 1) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 15) && (bmi <= 17.8) && (umur == 2) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 15.8) && (bmi <= 18.6) && (umur == 3) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14) && (umur >= 53) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.2) && (umur >= 43) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.4) && (umur >= 35) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.6) && (umur >= 23) && (umur <= 24) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.6) && (umur >= 29) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.8) && (umur >= 19) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15) && (umur >= 17) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.2) && (umur >= 15) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.4) && (umur >= 13) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.6) && (umur >= 1) && (umur <= 3) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.6) && (umur >= 11) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.8) && (umur >= 1) && (umur <= 4) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.8) && (umur >= 9) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16) && (umur >= 1) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.2) && (umur >= 1) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.4) && (umur >= 2) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.6) && (umur >= 2) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.8) && (umur >= 2) && (umur <= 40) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17) && (umur >= 2) && (umur <= 33) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.2) && (umur >= 2) && (umur <= 21) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.2) && (umur >= 25) && (umur <= 27) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.4) && (umur >= 2) && (umur <= 19) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.6) && (umur >= 2) && (umur <= 17) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.8) && (umur >= 2) && (umur <= 15) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18) && (umur >= 3) && (umur <= 13) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18.2) && (umur >= 3) && (umur <= 12) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18.4) && (umur >= 3) && (umur <= 10) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18.6) && (umur >= 4) && (umur <= 9) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18.8) && (umur >= 5) && (umur <= 7) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        }


        /*UNTUK TITIK D 0-5 Tahun LAKI-LAKI*/
        else if ((bmi >= 11.2) && (bmi <= 12) && (umur == 0) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 12.6) && (bmi <= 13.4) && (umur == 1) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 13.8) && (bmi <= 14.8) && (umur == 2) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13) && (umur >= 59) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.2) && (umur >= 48) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.4) && (umur >= 39) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.6) && (umur >= 32) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.8) && (umur >= 21) && (umur <= 24) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.8) && (umur >= 27) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14) && (umur >= 18) && (umur <= 52) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.2) && (umur >= 15) && (umur <= 41) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.4) && (umur >= 13) && (umur <= 34) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.6) && (umur >= 11) && (umur <= 22) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.6) && (umur >= 25) && (umur <= 28) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.8) && (umur >= 2) && (umur <= 5) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.8) && (umur >= 9) && (umur <= 18) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 15) && (umur >= 3) && (umur <= 16) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 15.2) && (umur >= 3) && (umur <= 14) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 15.4) && (umur >= 3) && (umur <= 12) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 15.6) && (umur >= 4) && (umur <= 10) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 15.8) && (umur >= 5) && (umur <= 8) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 14.4) && (bmi <= 14.6) && (umur == 3) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK E 0-5 Tahun LAKI-LAKI*/
        else if ((bmi >= 0) && (bmi <= 11) && (umur >= 0) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 0) && (bmi <= 12.4) && (umur >= 1) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 0) && (bmi <= 12.8) && (umur >= 2) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13) && (umur >= 2) && (umur <= 58) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.2) && (umur >= 2) && (umur <= 47) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.4) && (umur >= 2) && (umur <= 38) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.6) && (umur >= 2) && (umur <= 31) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.8) && (umur >= 3) && (umur <= 20) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.8) && (umur >= 25) && (umur <= 26) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14) && (umur >= 3) && (umur <= 17) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.2) && (umur >= 3) && (umur <= 14) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.4) && (umur >= 4) && (umur <= 12) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.6) && (umur >= 4) && (umur <= 10) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.8) && (umur >= 6) && (umur <= 8) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }




        /*UNTUK TITIK A 0-5 Tahun PEREMPUAN*/
        else if ((bmi >= 15.8) && (umur == 0) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 17.4) && (umur == 1) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.8) && (umur == 2) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.4) && (umur == 3) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.8) && (umur == 4) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 20) && (umur == 5) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.2) && (umur >= 36) && (umur <= 42) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.4) && (umur >= 28) && (umur <= 53) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.4) && (umur >= 21) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.6) && (umur >= 18) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.8) && (umur >= 17) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19) && (umur >= 15) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.2) && (umur >= 14) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.4) && (umur >= 12) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.6) && (umur >= 11) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 19.8) && (umur >= 10) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 20) && (umur >= 8) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 20.2) && (umur >= 0) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK B 0-5 Tahun PEREMPUAN*/
        else if ((bmi >= 14.6) && (bmi <= 15.6) && (umur == 0) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 16) && (bmi <= 17.2) && (umur == 1) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 17.4) && (bmi <= 18.6) && (umur == 2) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18) && (bmi <= 19.2) && (umur == 3) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 18.4) && (bmi <= 19.6) && (umur == 4) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 16.8) && (umur >= 39) && (umur <= 48) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17) && (umur >= 29) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17) && (umur >= 21) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.2) && (umur >= 19) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.4) && (umur >= 16) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.6) && (umur >= 15) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 17.8) && (umur >= 13) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18) && (umur >= 12) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.2) && (umur >= 10) && (umur <= 35) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.2) && (umur >= 44) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.4) && (umur >= 9) && (umur <= 21) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.4) && (umur >= 25) && (umur <= 27) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.6) && (umur >= 2) && (umur <= 17) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 18.8) && (umur >= 3) && (umur <= 16) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19) && (umur >= 3) && (umur <= 14) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.2) && (umur >= 3) && (umur <= 13) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.4) && (umur >= 4) && (umur <= 11) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.6) && (umur >= 4) && (umur <= 10) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 19.8) && (umur >= 5) && (umur <= 9) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 20) && (umur >= 6) && (umur <= 7) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }


        /*UNTUK TITIK C 0-5 Tahun PEREMPUAN*/
        else if ((bmi >= 12) && (bmi <= 14.4) && (umur == 0) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 13.2) && (bmi <= 15.8) && (umur == 1) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 14.4) && (bmi <= 17.2) && (umur == 2) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 15) && (bmi <= 17.8) && (umur == 3) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 15.2) && (bmi <= 18.2) && (umur == 4) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi >= 15.2) && (bmi <= 18.2) && (umur == 4) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14) && (umur >= 42) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.2) && (umur >= 22) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.2) && (umur >= 32) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.4) && (umur >= 18) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.6) && (umur >= 16) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 14.8) && (umur >= 13) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15) && (umur >= 13) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.2) && (umur >= 10) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.4) && (umur >= 1) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.6) && (umur >= 1) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 15.8) && (umur >= 1) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16) && (umur >= 2) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.2) && (umur >= 2) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.4) && (umur >= 2) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.6) && (umur >= 2) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.8) && (umur >= 2) && (umur <= 38) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 16.8) && (umur >= 49) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17) && (umur >= 2) && (umur <= 20) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17) && (umur >= 25) && (umur <= 28) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.2) && (umur >= 2) && (umur <= 18) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.4) && (umur >= 3) && (umur <= 15) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.6) && (umur >= 3) && (umur <= 14) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 17.8) && (umur >= 3) && (umur <= 12) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18) && (umur >= 4) && (umur <= 11) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18.2) && (umur >= 4) && (umur <= 9) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((bmi == 18.4) && (umur >= 5) && (umur <= 8) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        }


        /*UNTUK TITIK D 0-5 Tahun PEREMPUAN*/
        else if ((bmi >= 11) && (bmi <= 11.8) && (umur == 0) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 12) && (bmi <= 13) && (umur == 1) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 13.2) && (bmi <= 14.2) && (umur == 2) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 13.8) && (bmi <= 14.8) && (umur == 3) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 12.8) && (umur == 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13) && (umur >= 44) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.2) && (umur == 24) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.2) && (umur >= 36) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.4) && (umur >= 27) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.4) && (umur >= 19) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.6) && (umur >= 16) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.8) && (umur >= 13) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14) && (umur >= 11) && (umur <= 41) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.2) && (umur >= 9) && (umur <= 21) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.2) && (umur >= 25) && (umur <= 31) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.4) && (umur >= 3) && (umur <= 17) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.6) && (umur >= 3) && (umur <= 15) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14.8) && (umur >= 3) && (umur <= 12) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 15) && (umur >= 4) && (umur <= 11) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 15.2) && (umur >= 5) && (umur <= 9) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK E 0-5 Tahun PEREMPUAN*/
        else if ((bmi >= 0) && (bmi <= 10.8) && (umur == 0) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 0) && (bmi <= 10.6) && (umur >= 0) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 0) && (bmi <= 11.8) && (umur >= 1) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi >= 0) && (bmi <= 12.6) && (umur >= 2) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 12.8) && (umur >= 2) && (umur <= 58) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13) && (umur >= 2) && (umur <= 43) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.2) && (umur >= 3) && (umur <= 23) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.2) && (umur >= 25) && (umur <= 35) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.4) && (umur >= 3) && (umur <= 18) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.4) && (umur == 25) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.6) && (umur >= 3) && (umur <= 15) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 13.8) && (umur >= 4) && (umur <= 12) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((bmi == 14) && (umur >= 6) && (umur <= 8) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*BERAT TERDAHAP UMUR 5 - 18 TAHUN*/
        else if ((tinggi == 112) && (umur >= 66)) {
            idealberat = 20;
            umurideal = 66;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 113) && (umur >= 66)) {
            idealberat = 20;
            umurideal = 66;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 114) && (umur >= 66)) {
            idealberat = 21;
            umurideal = 72;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 115) && (umur >= 66)) {
            idealberat = 21;
            umurideal = 72;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 116) && (umur >= 66)) {
            idealberat = 21;
            umurideal = 72;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 117) && (umur >= 66)) {
            idealberat = 21;
            umurideal = 72;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 118) && (umur >= 66)) {
            idealberat = 22;
            umurideal = 78;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 119) && (umur >= 66)) {
            idealberat = 22;
            umurideal = 78;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 120) && (umur >= 66)) {
            idealberat = 22;
            umurideal = 78;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 121) && (umur >= 66)) {
            idealberat = 23;
            umurideal = 84;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 122) && (umur >= 66)) {
            idealberat = 23;
            umurideal = 84;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 123) && (umur >= 66)) {
            idealberat = 23;
            umurideal = 84;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 124) && (umur >= 66)) {
            idealberat = 24;
            umurideal = 90;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 125) && (umur >= 66)) {
            idealberat = 24;
            umurideal = 90;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 126) && (umur >= 66)) {
            idealberat = 24;
            umurideal = 90;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 127) && (umur >= 66)) {
            idealberat = 25;
            umurideal = 96;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 128) && (umur >= 66)) {
            idealberat = 25;
            umurideal = 96;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 129) && (umur >= 66)) {
            idealberat = 25;
            umurideal = 96;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 130) && (umur >= 66)) {
            idealberat = 27;
            umurideal = 102;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 131) && (umur >= 66)) {
            idealberat = 27;
            umurideal = 102;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 132) && (umur >= 66)) {
            idealberat = 27;
            umurideal = 102;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 133) && (umur >= 66)) {
            idealberat = 29;
            umurideal = 108;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 134) && (umur >= 66)) {
            idealberat = 29;
            umurideal = 108;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 135) && (umur >= 66)) {
            idealberat = 29;
            umurideal = 108;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 136) && (umur >= 66)) {
            idealberat = 30;
            umurideal = 114;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 137) && (umur >= 66)) {
            idealberat = 30;
            umurideal = 114;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 138) && (umur >= 66)) {
            idealberat = 30;
            umurideal = 114;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 139) && (umur >= 66)) {
            idealberat = 32;
            umurideal = 120;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 140) && (umur >= 66)) {
            idealberat = 32;
            umurideal = 120;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 141) && (umur >= 66)) {
            idealberat = 34;
            umurideal = 126;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 142) && (umur >= 66)) {
            idealberat = 34;
            umurideal = 126;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 143) && (umur >= 66)) {
            idealberat = 36;
            umurideal = 132;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 144) && (umur >= 66)) {
            idealberat = 36;
            umurideal = 132;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 145) && (umur >= 66)) {
            idealberat = 36;
            umurideal = 132;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 146) && (umur >= 66)) {
            idealberat = 38;
            umurideal = 138;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 147) && (umur >= 66)) {
            idealberat = 38;
            umurideal = 138;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 148) && (umur >= 66)) {
            idealberat = 38;
            umurideal = 138;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 149) && (umur >= 66)) {
            idealberat = 40;
            umurideal = 144;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 150) && (umur >= 66)) {
            idealberat = 40;
            umurideal = 144;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 151) && (umur >= 66)) {
            idealberat = 40;
            umurideal = 144;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 152) && (umur >= 66)) {
            idealberat = 43;
            umurideal = 150;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 153) && (umur >= 66)) {
            idealberat = 43;
            umurideal = 150;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 154) && (umur >= 66)) {
            idealberat = 43;
            umurideal = 150;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 155) && (umur >= 66)) {
            Log.e("masuk sini", "masuk");
            idealberat = 45;
            umurideal = 156;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 156) && (umur >= 66)) {
            idealberat = 45;
            umurideal = 156;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 157) && (umur >= 66)) {
            idealberat = 45;
            umurideal = 156;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 158) && (umur >= 66)) {
            idealberat = 45;
            umurideal = 156;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 159) && (umur >= 66)) {
            idealberat = 48;
            umurideal = 162;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 160) && (umur >= 66)) {
            idealberat = 48;
            umurideal = 162;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 161) && (umur >= 66)) {
            idealberat = 48;
            umurideal = 162;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 162) && (umur >= 66)) {
            idealberat = 48;
            umurideal = 162;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 163) && (umur >= 66)) {
            idealberat = 51;
            umurideal = 168;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 164) && (umur >= 66)) {
            idealberat = 51;
            umurideal = 168;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 165) && (umur >= 66)) {
            idealberat = 51;
            umurideal = 168;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 166) && (umur >= 66)) {
            idealberat = 51;
            umurideal = 168;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 167) && (umur >= 66)) {
            idealberat = 54;
            umurideal = 174;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 168) && (umur >= 66)) {
            idealberat = 54;
            umurideal = 174;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 169) && (umur >= 66)) {
            idealberat = 56;
            umurideal = 180;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 170) && (umur >= 66)) {
            idealberat = 56;
            umurideal = 180;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 171) && (umur >= 66)) {
            idealberat = 56;
            umurideal = 180;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 172) && (umur >= 66)) {
            idealberat = 59;
            umurideal = 186;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 173) && (umur >= 66)) {
            idealberat = 61;
            umurideal = 192;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 174) && (umur >= 66)) {
            idealberat = 64;
            umurideal = 198;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 175) && (umur >= 66)) {
            idealberat = 65;
            umurideal = 204;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 176) && (umur >= 66)) {
            idealberat = 66;
            umurideal = 210;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi == 177) && (umur >= 66)) {
            idealberat = 70;
            umurideal = 234;
            persentase = (berat / idealberat) * 100;
            if (persentase <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 70) && (persentase <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((persentase > 90) && (persentase <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((persentase > 110) && (persentase <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (persentase > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if ((tinggi < 112) && (umur >= 66)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((tinggi > 177) && (umur >= 66)) {
            gizi = "Gizi Lebih";
            keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }


    }

    public double getUmurideal() {
        return umurideal;
    }

    public void setUmurideal(double umurideal) {
        this.umurideal = umurideal;
    }


    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getUmur() {
        return umur;
    }

    public void setUmur(double umur) {
        this.umur = umur;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getGizi() {
        return gizi;
    }

    public void setGizi(String gizi) {
        this.gizi = gizi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public double getIdealberat() {
        return idealberat;
    }

    public void setIdealberat(double idealberat) {
        this.idealberat = idealberat;
    }

    public double getIdealtinggi() {
        return idealtinggi;
    }

    public void setIdealtinggi(double idealtinggi) {
        this.idealtinggi = idealtinggi;
    }

    public double getPersentase() {
        return persentase;
    }

    public void setPersentase(double persentase) {
        this.persentase = persentase;
    }

}
