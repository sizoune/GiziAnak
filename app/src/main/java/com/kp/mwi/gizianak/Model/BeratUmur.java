package com.kp.mwi.gizianak.Model;

/**
 * Created by mwi on 5/28/17.
 */

public class BeratUmur {
    private double berat, umur, ideal, persentase;
    private String gizi, keterangan, kelamin;


    public BeratUmur(float berat, float umur, String kelamin) {
        this.berat = berat;
        this.umur = umur;
        this.kelamin = kelamin;
    }

    public void BBumur() {

        /*UNTUK TITIK A 0-5 Tahun LAKI-LAKI*/
        if ((berat >= 5) && (umur == 0) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 6) && (umur >= 0) && (umur <= 0.5) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 7) && (umur >= 0) && (umur <= 1) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 8) && (umur >= 0) && (umur <= 2) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 9) && (umur >= 0) && (umur <= 3) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 10) && (umur >= 0) && (umur <= 4) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 11) && (umur >= 0) && (umur <= 6) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 12) && (umur >= 0) && (umur <= 8) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 13) && (umur >= 0) && (umur <= 11) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 14) && (umur >= 0) && (umur <= 14) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 15) && (umur >= 0) && (umur <= 17) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 16) && (umur >= 0) && (umur <= 20) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 17) && (umur >= 0) && (umur <= 24) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 18) && (umur >= 0) && (umur <= 27) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 19) && (umur >= 0) && (umur <= 30) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 20) && (umur >= 0) && (umur <= 33) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 21) && (umur >= 0) && (umur <= 37) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 22) && (umur >= 0) && (umur <= 41) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 23) && (umur >= 0) && (umur <= 44) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 24) && (umur >= 0) && (umur <= 47) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 25) && (umur >= 0) && (umur <= 51) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 26) && (umur >= 0) && (umur <= 54) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 27) && (umur >= 0) && (umur <= 57) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 28) && (umur >= 0) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }


        /*UNTUK TITIK B 0-5 Tahun LAKI-LAKI*/
        else if ((berat == 6) && (umur == 1) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 7) && (umur == 2) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur == 3) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur == 4) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur >= 5) && (umur <= 6) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur >= 7) && (umur <= 9) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 12) && (umur >= 9) && (umur <= 12) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 13) && (umur >= 12) && (umur <= 16) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 14) && (umur >= 15) && (umur <= 19) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 15) && (umur >= 18) && (umur <= 23) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 16) && (umur >= 21) && (umur <= 27) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 17) && (umur >= 25) && (umur <= 31) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 18) && (umur >= 28) && (umur <= 35) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 19) && (umur >= 31) && (umur <= 39) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 20) && (umur >= 34) && (umur <= 43) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 21) && (umur >= 38) && (umur <= 47) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 22) && (umur >= 42) && (umur <= 51) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 23) && (umur >= 45) && (umur <= 55) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 24) && (umur >= 48) && (umur <= 59) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 25) && (umur >= 52) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 26) && (umur >= 55) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 27) && (umur >= 58) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK C 0-5 Tahun LAKI-LAKI*/
        else if ((berat == 2) && (umur == 0) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 3) && (umur >= 0) && (umur <= 1) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 4) && (umur >= 0) && (umur <= 1) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 5) && (umur >= 1) && (umur <= 3) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 6) && (umur >= 2) && (umur <= 5) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 7) && (umur >= 3) && (umur <= 8) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 8) && (umur >= 4) && (umur <= 13) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 9) && (umur >= 5) && (umur <= 20) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 10) && (umur >= 7) && (umur <= 26) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 11) && (umur >= 10) && (umur <= 34) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 12) && (umur >= 13) && (umur <= 42) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 13) && (umur >= 17) && (umur <= 50) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 14) && (umur >= 20) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 15) && (umur >= 24) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 16) && (umur >= 28) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 17) && (umur >= 32) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 18) && (umur >= 36) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 19) && (umur >= 40) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 20) && (umur >= 44) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 21) && (umur >= 48) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 22) && (umur >= 52) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 23) && (umur >= 56) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 24) && (umur == 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        }

        /*UNTUK TITIK D 0-5 Tahun LAKI-LAKI*/
        else if ((berat == 2) && (umur == 0) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 3) && (umur == 1) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 4) && (umur == 2) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 5) && (umur == 4) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 6) && (umur > 5) && (umur <= 7) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 7) && (umur > 8) && (umur <= 12) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur > 13) && (umur <= 19) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur > 20) && (umur <= 27) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur > 26) && (umur <= 36) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur > 34) && (umur <= 46) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 12) && (umur > 42) && (umur <= 56) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 13) && (umur > 50) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK E 0-5 Tahun LAKI-LAKI*/
        else if ((berat == 0) && (umur >= 0) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 2) && (umur >= 1) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 3) && (umur >= 2) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 4) && (umur >= 3) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 5) && (umur >= 5) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 6) && (umur >= 8) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 7) && (umur >= 13) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur >= 20) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur >= 28) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur >= 37) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur >= 47) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 12) && (umur >= 57) && (umur <= 60) && (kelamin.equals("L"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK A 0-5 Tahun PEREMPUAN*/
        else if ((berat >= 5) && (umur == 0) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 6) && (umur >= 0) && (umur <= 1) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 8) && (umur >= 0) && (umur <= 2) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 9) && (umur >= 0) && (umur <= 3) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 10) && (umur >= 0) && (umur <= 5) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 11) && (umur >= 0) && (umur <= 7) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 12) && (umur >= 0) && (umur <= 9) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 13) && (umur >= 0) && (umur <= 12) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 14) && (umur >= 0) && (umur <= 15) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 15) && (umur >= 0) && (umur <= 18) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 16) && (umur >= 0) && (umur <= 21) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 17) && (umur >= 0) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 18) && (umur >= 0) && (umur <= 27) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 19) && (umur >= 0) && (umur <= 30) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 20) && (umur >= 0) && (umur <= 33) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 21) && (umur >= 0) && (umur <= 36) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 22) && (umur >= 0) && (umur <= 39) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 23) && (umur >= 0) && (umur <= 42) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 24) && (umur >= 0) && (umur <= 45) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 25) && (umur >= 0) && (umur <= 48) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 26) && (umur >= 0) && (umur <= 50) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 27) && (umur >= 0) && (umur <= 53) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 28) && (umur >= 0) && (umur <= 56) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 29) && (umur >= 0) && (umur <= 58) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 30) && (umur >= 0) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }


        /*UNTUK TITIK B 0-5 Tahun PEREMPUAN*/
        else if ((berat == 7) && (umur == 2) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur == 3) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur >= 4) && (umur <= 5) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur >= 6) && (umur <= 7) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur >= 8) && (umur <= 10) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 12) && (umur >= 10) && (umur <= 13) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 13) && (umur >= 13) && (umur <= 17) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 14) && (umur >= 16) && (umur <= 21) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 15) && (umur >= 19) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 16) && (umur >= 22) && (umur <= 28) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 17) && (umur >= 25) && (umur <= 32) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 18) && (umur >= 28) && (umur <= 35) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 19) && (umur >= 31) && (umur <= 39) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 20) && (umur >= 34) && (umur <= 43) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 21) && (umur >= 37) && (umur <= 46) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 22) && (umur >= 40) && (umur <= 50) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 23) && (umur >= 43) && (umur <= 53) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 24) && (umur >= 46) && (umur <= 57) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 25) && (umur >= 49) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 26) && (umur >= 51) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 27) && (umur >= 54) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 28) && (umur >= 57) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 29) && (umur >= 59) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }

        /*UNTUK TITIK C 0-5 Tahun PEREMPUAN*/
        else if ((berat == 3) && (umur >= 0) && (umur <= 1) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 4) && (umur >= 0) && (umur <= 2) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 5) && (umur >= 1) && (umur <= 4) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 6) && (umur >= 2) && (umur <= 7) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 7) && (umur >= 3) && (umur <= 12) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 8) && (umur >= 4) && (umur <= 18) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 9) && (umur >= 6) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 10) && (umur >= 8) && (umur <= 30) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 11) && (umur >= 11) && (umur <= 38) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 12) && (umur >= 14) && (umur <= 46) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 13) && (umur >= 18) && (umur <= 54) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 14) && (umur >= 16) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 15) && (umur >= 25) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 16) && (umur >= 29) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 17) && (umur >= 33) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 18) && (umur >= 36) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 19) && (umur >= 40) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 20) && (umur >= 44) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 21) && (umur >= 47) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 22) && (umur >= 51) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 23) && (umur >= 54) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat == 24) && (umur >= 58) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        }



        /*UNTUK TITIK D 0-5 Tahun PEREMPUAN*/
        else if ((berat == 2) && (umur == 0) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 4) && (umur == 3) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 5) && (umur >= 5) && (umur <= 6) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 6) && (umur >= 8) && (umur <= 11) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 7) && (umur >= 13) && (umur <= 17) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur >= 19) && (umur <= 24) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur >= 25) && (umur <= 31) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur >= 31) && (umur <= 40) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur >= 40) && (umur <= 50) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 12) && (umur >= 48) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 13) && (umur >= 56) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }


        /*UNTUK TITIK E 0-5 Tahun PEREMPUAN*/
        else if ((berat == 1) && (umur >= 0) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 2) && (umur >= 1) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 3) && (umur >= 2) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 4) && (umur >= 4) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 5) && (umur >= 7) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 6) && (umur >= 12) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 7) && (umur >= 18) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur >= 25) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur >= 32) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur >= 41) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur >= 51) && (umur <= 60) && (kelamin.equals("P"))) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }

        /*BERAT TERDAHAP UMUR 5 - 18 TAHUN*/
        else if (umur == 61) {
            ideal = 18;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 72) {
            ideal = 21;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 84) {
            ideal = 23;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 96) {
            ideal = 25;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 108) {
            ideal = 29;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 120) {
            ideal = 32;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 132) {
            ideal = 36;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 144) {
            ideal = 40;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 156) {
            ideal = 46;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 168) {
            ideal = 51;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 180) {
            ideal = 56;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 192) {
            ideal = 61;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 216) {
            ideal = 67;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 204) {
            ideal = 65;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 65) {
            ideal = 20;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 77) {
            ideal = 22;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 89) {
            ideal = 24;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 101) {
            ideal = 27;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 113) {
            ideal = 30;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 125) {
            ideal = 34;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 137) {
            ideal = 38;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 149) {
            ideal = 43;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 161) {
            ideal = 48;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 173) {
            ideal = 54;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 185) {
            ideal = 59;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 197) {
            ideal = 63;
            persentase = (berat / ideal) * 100;
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
        } else if (umur == 209) {
            ideal = 66;
            persentase = (berat / ideal) * 100;
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

    public double getUmur() {
        return umur;
    }

    public void setUmur(double umur) {
        this.umur = umur;
    }

    public double getIdeal() {
        return ideal;
    }

    public void setIdeal(double ideal) {
        this.ideal = ideal;
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


}
