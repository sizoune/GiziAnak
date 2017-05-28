package com.kp.mwi.gizianak.Model;

/**
 * Created by mwi on 5/29/17.
 */

public class TBUmur {
    private double umur, tinggi, ideal, persentase;
    private String perawakan, keterangan;

    public TBUmur(double umur, double tinggi) {
        this.umur = umur;
        this.tinggi = tinggi;
    }

    public void TBUmur() {
        if (umur == 24) {
            ideal = 86;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 36) {
            ideal = 95;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 48) {
            ideal = 102;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 60) {
            ideal = 109;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 72) {
            ideal = 115;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 84) {
            ideal = 122;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 96) {
            ideal = 128;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 108) {
            ideal = 133;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 120) {
            ideal = 139;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 132) {
            ideal = 143;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 144) {
            ideal = 149;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 156) {
            ideal = 156;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 168) {
            ideal = 164;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 180) {
            ideal = 170;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 192) {
            ideal = 173;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 204) {
            ideal = 175;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 216) {
            ideal = 176;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 29) {
            ideal = 91;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 41) {
            ideal = 98;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 53) {
            ideal = 105;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 65) {
            ideal = 112;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 77) {
            ideal = 118;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 89) {
            ideal = 125;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 101) {
            ideal = 130;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 113) {
            ideal = 136;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 125) {
            ideal = 141;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 137) {
            ideal = 146;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 149) {
            ideal = 152;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 161) {
            ideal = 160;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 173) {
            ideal = 167;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 185) {
            ideal = 172;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 197) {
            ideal = 175;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur == 209) {
            ideal = 176;
            persentase = (tinggi / ideal) * 100;
            if (persentase < 90) {
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase >= 90) && (persentase <= 110)) {
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            } else if ((persentase > 110)) {
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        } else if (umur > 216) {
            keterangan = "Mohon maaf untuk saat ini , aplikasi ini hanya bisa digunakan untuk anak umur 0 - 18 tahun";
        } else {
            keterangan = "Untuk 0-2 tahun belum tersedia";

        }
    }


    public double getUmur() {
        return umur;
    }

    public void setUmur(double umur) {
        this.umur = umur;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public String getPerawakan() {
        return perawakan;
    }

    public void setPerawakan(String perawakan) {
        this.perawakan = perawakan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }


}
