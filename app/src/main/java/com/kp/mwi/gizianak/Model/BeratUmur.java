package com.kp.mwi.gizianak.Model;

/**
 * Created by mwi on 5/28/17.
 */

public class BeratUmur {
    private double berat, umur, ideal, persentase;
    private String gizi, keterangan;

    public BeratUmur(float berat, float umur) {
        this.berat = berat;
        this.umur = umur;
    }

    public void BBumur() {

        /*UNTUK TITIK A 0-5 Tahun*/
        if ((berat >= 5) && (berat <= 28) && (umur == 0)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 6) && (berat <= 28) && (umur >= 0) && (umur <= 0.5)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 7) && (berat <= 28) && (umur >= 0) && (umur <= 1)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 8) && (berat <= 28) && (umur >= 0) && (umur <= 2)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 9) && (berat <= 28) && (umur >= 0) && (umur <= 3)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 10) && (berat <= 28) && (umur >= 0) && (umur <= 4)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 11) && (berat <= 28) && (umur >= 0) && (umur <= 6)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 12) && (berat <= 28) && (umur >= 0) && (umur <= 8)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 13) && (berat <= 28) && (umur >= 0) && (umur <= 11)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 14) && (berat <= 28) && (umur >= 0) && (umur <= 14)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 15) && (berat <= 28) && (umur >= 0) && (umur <= 17)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 16) && (berat <= 28) && (umur >= 0) && (umur <= 20)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 17) && (berat <= 28) && (umur >= 0) && (umur <= 24)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 18) && (berat <= 28) && (umur >= 0) && (umur <= 27)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 19) && (berat <= 28) && (umur >= 0) && (umur <= 30)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 20) && (berat <= 28) && (umur >= 0) && (umur <= 33)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 21) && (berat <= 28) && (umur >= 0) && (umur <= 37)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 22) && (berat <= 28) && (umur >= 0) && (umur <= 41)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 23) && (berat <= 28) && (umur >= 0) && (umur <= 44)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 24) && (berat <= 28) && (umur >= 0) && (umur <= 47)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 25) && (berat <= 28) && (umur >= 0) && (umur <= 51)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 26) && (berat <= 28) && (umur >= 0) && (umur <= 54)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 27) && (berat <= 28) && (umur >= 0) && (umur <= 57)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 28) && (umur >= 0) && (umur <= 60)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 28) && (umur == 60)) {
            gizi = "Obesitas";
            keterangan = "Anak Anda memiliki masalah pertumbuhan ( berat badan lebih atau obesitas) "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }


        /*UNTUK TITIK B 0-5 Tahun*/
        else if ((berat < 5) && (berat > 4.5) && (umur == 0)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 6) && (umur == 1)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 7) && (umur == 2)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur == 3)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur == 4)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur >= 5) && (umur <= 6)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur >= 8) && (umur <= 9)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 12) && (umur >= 9) && (umur <= 12)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 13) && (umur >= 12) && (umur <= 16)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 14) && (umur >= 15) && (umur <= 19)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 15) && (umur >= 18) && (umur <= 23)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 16) && (umur >= 21) && (umur <= 26)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 17) && (umur >= 24) && (umur <= 31)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 18) && (umur >= 28) && (umur <= 35)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 19) && (umur >= 31) && (umur <= 39)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 20) && (umur >= 34) && (umur <= 43)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 21) && (umur >= 38) && (umur <= 47)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 22) && (umur >= 41) && (umur <= 51)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 23) && (umur >= 45) && (umur <= 55)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 24) && (umur >= 48) && (umur <= 59)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda mungkin memiliki masalah pertumbuhan "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK C 0-5 Tahun*/
        else if ((berat >= 3) && (berat <= 4) && (umur == 0)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 4) && (berat <= 6) && (umur == 1)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 5) && (berat <= 7) && (umur >= 2) && (umur <= 3)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 6) && (berat <= 8) && (umur >= 3) && (umur <= 5)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 7) && (berat <= 9) && (umur >= 5) && (umur <= 8)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 8) && (berat <= 10) && (umur >= 8) && (umur <= 13)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 9) && (berat <= 11) && (umur >= 10) && (umur <= 19)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 10) && (berat <= 12) && (umur >= 12) && (umur <= 26)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 11) && (berat <= 13) && (umur >= 16) && (umur <= 34)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 12) && (berat <= 14) && (umur >= 20) && (umur <= 42)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 13) && (berat <= 15) && (umur >= 24) && (umur <= 50)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 14) && (berat <= 16) && (umur >= 32) && (umur < 59)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 15) && (berat <= 17) && (umur >= 32) && (umur <= 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 16) && (berat <= 18) && (umur >= 32) && (umur <= 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 17) && (berat <= 19) && (umur >= 40) && (umur <= 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 18) && (berat <= 20) && (umur >= 44) && (umur <= 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 19) && (berat <= 21) && (umur >= 48) && (umur <= 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 20) && (berat <= 22) && (umur >= 52) && (umur <= 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 21) && (berat <= 23) && (umur >= 56) && (umur <= 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        } else if ((berat >= 22) && (berat <= 24) && (umur == 60)) {
            gizi = "Gizi Baik";
            keterangan = "Anak Anda memiliki berat badan SESUAI usianya "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
            ;
        }

        /*UNTUK TITIK D 0-5 Tahun*/
        else if ((berat == 3) && (umur == 1)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 4) && (umur == 2)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 6) && (umur == 6)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 6) && (umur >= 5) && (umur <= 6)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 7) && (umur >= 9) && (umur <= 11)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 8) && (umur >= 14) && (umur <= 18)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 9) && (umur >= 21) && (umur <= 25)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 10) && (umur >= 27) && (umur <= 34)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 11) && (umur >= 35) && (umur <= 44)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 12) && (umur >= 43) && (umur <= 54)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 13) && (umur >= 50) && (umur <= 60)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat == 14) && (umur >= 59) && (umur <= 60)) {
            gizi = "Gizi Kurang";
            keterangan = "Anak Anda termasuk dalam GIZI KURANG "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        }



        /*UNTUK TITIK E 0-5 Tahun*/
        else if ((berat >= 0) && (berat <= 2) && (umur >= 0) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 3) && (umur >= 1) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 4) && (umur >= 2) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 5) && (umur >= 4) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 6) && (umur >= 7) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 7) && (umur >= 12) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 8) && (umur >= 19) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 9) && (umur >= 27) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 10) && (umur >= 36) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 11) && (umur >= 46) && (umur <= 60)) {
            gizi = "Gizi Buruk";
            keterangan = "Anak Anda termasuk dalam GIZI BURUK "
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva berat badan terhadap panjang/tinggi atau IMT terhadap umur untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anda";
        } else if ((berat >= 0) && (berat <= 12) && (umur >= 56) && (umur <= 60)) {
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
        } else if (umur > 204) {
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
}
