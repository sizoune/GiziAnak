package com.kp.mwi.gizianak.Model;

/**
 * Created by mwi on 6/2/17.
 */

public class BBTinggi {
    private double berat, tinggi, umur, idealberat, idealtinggi, bmi, temp1, temp2;
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
        else if (umur == 61) {
            idealberat = 18;
            idealtinggi = 109;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 72) {
            idealberat = 21;
            idealtinggi = 116;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 84) {
            idealberat = 23;
            idealtinggi = 122;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 96) {
            idealberat = 25;
            idealtinggi = 128;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 108) {
            idealberat = 29;
            idealtinggi = 134;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 120) {
            idealberat = 32;
            idealtinggi = 139;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 132) {
            idealberat = 36;
            idealtinggi = 143;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 144) {
            idealberat = 40;
            idealtinggi = 149;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 156) {
            idealberat = 46;
            idealtinggi = 156;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 168) {
            idealberat = 51;
            idealtinggi = 164;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 180) {
            idealberat = 56;
            idealtinggi = 170;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 192) {
            idealberat = 61;
            idealtinggi = 174;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 216) {
            idealberat = 67;
            idealtinggi = 176;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 204) {
            idealberat = 64;
            idealtinggi = 175;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 65) {
            idealberat = 20;
            idealtinggi = 112;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 77) {
            idealberat = 22;
            idealtinggi = 118;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 89) {
            idealberat = 24;
            idealtinggi = 125;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 101) {
            idealberat = 27;
            idealtinggi = 130;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 113) {
            idealberat = 30;
            idealtinggi = 136;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 125) {
            idealberat = 34;
            idealtinggi = 141;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 137) {
            idealberat = 38;
            idealtinggi = 146;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 149) {
            idealberat = 43;
            idealtinggi = 152;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 161) {
            idealberat = 48;
            idealtinggi = 160;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 173) {
            idealberat = 54;
            idealtinggi = 167;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 185) {
            idealberat = 59;
            idealtinggi = 172;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 197) {
            idealberat = 63;
            idealtinggi = 175;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 209) {
            idealberat = 66;
            idealtinggi = 176;
            idealtinggi = idealtinggi / 100;
            tinggi = tinggi / 100;
            temp1 = berat / (tinggi * tinggi);
            temp2 = idealberat / (idealtinggi * idealtinggi);
            bmi = (temp1 / temp2) * 100;
            if (bmi <= 70) {
                gizi = "Gizi Buruk";
                keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 70) && (bmi <= 90)) {
                gizi = "Gizi Kurang";
                keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if ((bmi > 90) && (bmi <= 110)) {
                gizi = "Gizi Baik";
                keterangan = "Anak Anda termasuk dalam GIZI BAIK "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                ;
            } else if ((bmi > 110) && (bmi <= 120)) {
                gizi = "Gizi Lebih";
                keterangan = "Anak Anda termasuk dalam GIZI LEBIH "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            } else if (bmi > 120) {
                gizi = "Obesitas";
                keterangan = "Anak Anda termasuk dalam OBESITAS "
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anda";
            }
        } else if (umur == 216) {
            keterangan = "Mohon maaf untuk saat ini , aplikasi ini hanya bisa digunakan untuk anak umur 0 - 18 tahun";
        }

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

    public double getTemp1() {
        return temp1;
    }

    public void setTemp1(double temp1) {
        this.temp1 = temp1;
    }

    public double getTemp2() {
        return temp2;
    }

    public void setTemp2(double temp2) {
        this.temp2 = temp2;
    }
}
