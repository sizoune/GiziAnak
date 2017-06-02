package com.kp.mwi.gizianak.Model;

/**
 * Created by mwi on 5/29/17.
 */

public class TBUmur {
    private double umur, tinggi, ideal, persentase;
    private String perawakan, keterangan, kelamin;

    public TBUmur(double umur, double tinggi, String kelamin) {
        this.umur = umur;
        this.tinggi = tinggi;
        this.kelamin = kelamin;
    }

    public void TBUmur(){

        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK A LAKI-LAKI*/
        if ((tinggi >= 55)  && (umur == 0) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 60)  && (umur >= 0) && (umur <= 1) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 65)  && (umur >= 0) && (umur <= 2) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 68)  && (umur >= 0) && (umur <= 3) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 70)  && (umur >= 0) && (umur <= 4) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 72)  && (umur >= 0) && (umur <= 5) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 74)  && (umur >= 0) && (umur <= 6) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 76)  && (umur >= 0) && (umur <= 7) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 77)  && (umur >= 0) && (umur <= 8) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 79)  && (umur >= 0) && (umur <= 9) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 80)  && (umur >= 0) && (umur <= 10) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 82)  && (umur >= 0) && (umur <= 11) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 83)  && (umur >= 0) && (umur <= 12) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 84)  && (umur >= 0) && (umur <= 13) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 86)  && (umur >= 0) && (umur <= 14) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 87)  && (umur >= 0) && (umur <= 15) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 88)  && (umur >= 0) && (umur <= 16) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89)  && (umur >= 0) && (umur <= 17) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91)  && (umur >= 0) && (umur <= 18) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92)  && (umur >= 0) && (umur <= 19) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93)  && (umur >= 0) && (umur <= 20) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94)  && (umur >= 0) && (umur <= 21) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95)  && (umur >= 0) && (umur <= 22) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96)  && (umur >= 0) && (umur <= 23) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 97)  && (umur >= 0) && (umur <= 25) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98)  && (umur >= 0) && (umur <= 26) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99)  && (umur >= 0) && (umur <= 27) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100)  && (umur >= 0) && (umur <= 28) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 101)  && (umur >= 0) && (umur <= 29) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 102)  && (umur >= 0) && (umur <= 30) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 103)  && (umur >= 0) && (umur <= 31) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 104)  && (umur >= 0) && (umur <= 32) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 105)  && (umur >= 0) && (umur <= 33) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 106)  && (umur >= 0) && (umur <= 35) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 107)  && (umur >= 0) && (umur <= 36) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 108)  && (umur >= 0) && (umur <= 37) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 109)  && (umur >= 0) && (umur <= 38) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 110)  && (umur >= 0) && (umur <= 40) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 111)  && (umur >= 0) && (umur <= 41) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 112)  && (umur >= 0) && (umur <= 42) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 113)  && (umur >= 0) && (umur <= 44) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 114)  && (umur >= 0) && (umur <= 45) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 115)  && (umur >= 0) && (umur <= 46) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 116)  && (umur >= 0) && (umur <= 48) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 117)  && (umur >= 0) && (umur <= 50) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 118)  && (umur >= 0) && (umur <= 51) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 119)  && (umur >= 0) && (umur <= 53) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 120)  && (umur >= 0) && (umur <= 54) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 121)  && (umur >= 0) && (umur <= 56) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 122)  && (umur >= 0) && (umur <= 57) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 123)  && (umur >= 0) && (umur <= 59) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 124)  && (umur >= 0) && (umur <= 60) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }


        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK B LAKI-LAKI*/
        else if ((tinggi == 54)  && (umur == 0) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi == 59)  && (umur == 1) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 62) && (tinggi <= 63) && (umur == 2) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 66) && (tinggi <= 67) && (umur == 3) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 68) && (tinggi <= 69) && (umur == 4) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 70) && (tinggi <= 71) && (umur == 5) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 72) && (tinggi <= 73) && (umur == 6) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 74) && (tinggi <= 75) && (umur == 7) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 75) && (tinggi <= 76) && (umur == 8) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 77) && (tinggi <= 78) && (umur == 9) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 78) && (tinggi <= 79) && (umur == 10) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 79) && (tinggi <= 81) && (umur == 11) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 81) && (tinggi <= 82) && (umur == 12) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 82) && (tinggi <= 83) && (umur == 13) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 83) && (tinggi <= 85) && (umur == 14) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 84) && (tinggi <= 86) && (umur == 16) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 87) && (tinggi <= 88) && (umur == 17) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89) && (tinggi <= 88) && (umur == 18) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89) && (tinggi <= 91) && (umur == 19) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 90) && (tinggi <= 92) && (umur == 20) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91) && (tinggi <= 93) && (umur == 21) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92) && (tinggi <= 94) && (umur == 22) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93) && (tinggi <= 95) && (umur == 23) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94) && (tinggi <= 96) && (umur == 24) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94) && (tinggi <= 96) && (umur == 25) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95) && (tinggi <= 97) && (umur == 26) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96) && (tinggi <= 98) && (umur == 27) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 97) && (tinggi <= 99) && (umur == 28) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98) && (tinggi <= 100) && (umur == 29) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99) && (tinggi <= 101) && (umur == 30) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100) && (tinggi <= 102) && (umur == 31) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 101) && (tinggi <= 103) && (umur == 32) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 101) && (tinggi <= 104) && (umur == 33) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 102) && (tinggi <= 105) && (umur == 34) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 103) && (tinggi <= 105) && (umur == 35) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 104) && (tinggi <= 106) && (umur == 36) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 104) && (tinggi <= 107) && (umur == 37) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 105) && (tinggi <= 108) && (umur == 38) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 106) && (tinggi <= 109) && (umur == 39) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 107) && (tinggi <= 109) && (umur == 40) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 107) && (tinggi <= 110) && (umur == 41) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 108) && (tinggi <= 111) && (umur == 42) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 109) && (tinggi <= 112) && (umur == 43) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 109) && (tinggi <= 112) && (umur == 44) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 110) && (tinggi <= 113) && (umur == 45) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 111) && (tinggi <= 114) && (umur == 46) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 111) && (tinggi <= 114) && (umur == 47) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 112) && (tinggi <= 115) && (umur == 48) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 112) && (tinggi <= 116) && (umur == 49) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 113) && (tinggi <= 116) && (umur == 50) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 114) && (tinggi <= 117) && (umur == 51) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 114) && (tinggi <= 118) && (umur == 52) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 115) && (tinggi <= 118) && (umur == 53) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 116) && (tinggi <= 119) && (umur == 54) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 116) && (tinggi <= 120) && (umur == 55) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 117) && (tinggi <= 120) && (umur == 56) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 117) && (tinggi <= 121) && (umur == 57) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 118) && (tinggi <= 122) && (umur == 58) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 119) && (tinggi <= 122) && (umur == 59) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 119) && (tinggi <= 123) && (umur == 60) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }


        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK C LAKI-LAKI*/
        else if ((tinggi >= 46)  && (tinggi <= 53)  && (umur == 0) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 51)  && (tinggi <= 58)  && (umur == 1) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 55)  && (tinggi <= 61)  && (umur == 2) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 57)  && (tinggi <= 65)  && (umur == 3) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 60)  && (tinggi <= 67)  && (umur == 4) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 62)  && (tinggi <= 69)  && (umur == 5) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 63)  && (tinggi <= 71)  && (umur == 6) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 65)  && (tinggi <= 73)  && (umur == 7) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 66)  && (tinggi <= 74)  && (umur == 8) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 68)  && (tinggi <= 76)  && (umur == 9) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 69)  && (tinggi <= 77)  && (umur == 10) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 70)  && (tinggi <= 78)  && (umur == 11) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 71)  && (tinggi <= 80)  && (umur == 12) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 72)  && (tinggi <= 81)  && (umur == 13) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 73)  && (tinggi <= 82)  && (umur == 14) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 74)  && (tinggi <= 83)  && (umur == 15) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 75)  && (tinggi <= 85)  && (umur == 16) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 76)  && (tinggi <= 86)  && (umur == 17) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 77)  && (tinggi <= 87)  && (umur == 18) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 78)  && (tinggi <= 88)  && (umur == 19) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 79)  && (tinggi <= 89)  && (umur == 20) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 80)  && (tinggi <= 90)  && (umur == 21) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 80)  && (tinggi <= 91)  && (umur == 22) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 81)  && (tinggi <= 92)  && (umur == 23) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 82)  && (tinggi <= 93)  && (umur == 24) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 82)  && (tinggi <= 93)  && (umur == 25) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 83)  && (tinggi <= 94)  && (umur == 26) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 83)  && (tinggi <= 95)  && (umur == 27) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 84)  && (tinggi <= 96)  && (umur == 28) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 85)  && (tinggi <= 97)  && (umur == 29) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 85)  && (tinggi <= 98)  && (umur == 30) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 86)  && (tinggi <= 99)  && (umur == 31) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 87)  && (tinggi <= 100)  && (umur == 32) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 87)  && (tinggi <= 100)  && (umur == 33) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 88)  && (tinggi <= 101)  && (umur == 34) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 88)  && (tinggi <= 103)  && (umur == 35) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89)  && (tinggi <= 103)  && (umur == 36) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89)  && (tinggi <= 103)  && (umur == 37) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 90)  && (tinggi <= 104)  && (umur == 38) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91)  && (tinggi <= 105)  && (umur == 39) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91)  && (tinggi <= 105)  && (umur == 40) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92)  && (tinggi <= 106)  && (umur == 41) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92)  && (tinggi <= 107)  && (umur == 42) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93)  && (tinggi <= 108)  && (umur == 43) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93)  && (tinggi <= 108)  && (umur == 44) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94)  && (tinggi <= 109)  && (umur == 45) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94)  && (tinggi <= 110)  && (umur == 46) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95)  && (tinggi <= 110)  && (umur == 47) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95)  && (tinggi <= 111)  && (umur == 48) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96)  && (tinggi <= 111)  && (umur == 49) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96)  && (tinggi <= 112)  && (umur == 50) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 97)  && (tinggi <= 113)  && (umur == 51) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 97)  && (tinggi <= 113)  && (umur == 52) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98)  && (tinggi <= 114)  && (umur == 53) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98)  && (tinggi <= 115)  && (umur == 54) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99)  && (tinggi <= 115)  && (umur == 55) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99)  && (tinggi <= 116)  && (umur == 56) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99)  && (tinggi <= 116)  && (umur == 57) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100)  && (tinggi <= 117)  && (umur == 58) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 101)  && (tinggi <= 118)  && (umur == 59) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 101)  && (tinggi <= 119)  && (umur == 60) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }


        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK D LAKI-LAKI*/
        else if ((tinggi == 44)  && (umur == 0) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 49)  && (tinggi <= 50)  && (umur == 1) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 53)  && (tinggi <= 54)  && (umur == 2) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 55)  && (tinggi <= 56)  && (umur == 3) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 58)  && (tinggi <= 59)  && (umur == 4) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 60)  && (tinggi <= 61)  && (umur == 5) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 61)  && (tinggi <= 62)  && (umur == 6) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 63)  && (tinggi <= 64)  && (umur == 7) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 64)  && (tinggi <= 65)  && (umur == 8) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 65)  && (tinggi <= 67)  && (umur == 9) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 66)  && (tinggi <= 68)  && (umur == 10) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 68)  && (tinggi <= 69)  && (umur == 11) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 69)  && (tinggi <= 70)  && (umur == 12) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 70)  && (tinggi <= 71)  && (umur == 13) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 71)  && (tinggi <= 72)  && (umur == 14) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 72)  && (tinggi <= 73)  && (umur == 15) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 73)  && (tinggi <= 74)  && (umur == 16) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 73)  && (tinggi <= 75)  && (umur == 17) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 74)  && (tinggi <= 76)  && (umur == 18) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 75)  && (tinggi <= 77)  && (umur == 19) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 76)  && (tinggi <= 78)  && (umur == 20) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 77)  && (tinggi <= 79)  && (umur == 21) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 77)  && (tinggi <= 79)  && (umur == 22) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 78)  && (tinggi <= 80)  && (umur == 23) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 79)  && (tinggi <= 81)  && (umur == 24) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 79)  && (tinggi <= 81)  && (umur == 25) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 79)  && (tinggi <= 82)  && (umur == 26) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 80)  && (tinggi <= 82)  && (umur == 27) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 81)  && (tinggi <= 83)  && (umur == 28) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 81)  && (tinggi <= 84)  && (umur == 29) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 82)  && (tinggi <= 84)  && (umur == 30) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 82)  && (tinggi <= 85)  && (umur == 31) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 83)  && (tinggi <= 86)  && (umur == 32) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 83)  && (tinggi <= 86)  && (umur == 33) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 84)  && (tinggi <= 87)  && (umur == 34) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 85)  && (tinggi <= 87)  && (umur == 35) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 85)  && (tinggi <= 88)  && (umur == 36) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 86)  && (tinggi <= 88)  && (umur == 37) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 86)  && (tinggi <= 89)  && (umur == 38) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 87)  && (tinggi <= 90)  && (umur == 39) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 87)  && (tinggi <= 90)  && (umur == 40) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 88)  && (tinggi <= 91)  && (umur == 41) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 88)  && (tinggi <= 91)  && (umur == 42) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 89)  && (tinggi <= 92)  && (umur == 43) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 89)  && (tinggi <= 92)  && (umur == 44) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 90)  && (tinggi <= 93)  && (umur == 45) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 90)  && (tinggi <= 93)  && (umur == 46) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 91)  && (tinggi <= 94)  && (umur == 47) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 91)  && (tinggi <= 94)  && (umur == 48) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 91)  && (tinggi <= 95)  && (umur == 49) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 92)  && (tinggi <= 95)  && (umur == 50) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 92)  && (tinggi <= 96)  && (umur == 51) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 93)  && (tinggi <= 96)  && (umur == 52) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 93)  && (tinggi <= 97)  && (umur == 53) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 94)  && (tinggi <= 97)  && (umur == 54) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 94)  && (tinggi <= 98)  && (umur == 55) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 94)  && (tinggi <= 98)  && (umur == 56) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 95)  && (tinggi <= 98)  && (umur == 57) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 95)  && (tinggi <= 99)  && (umur == 58) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 96)  && (tinggi <= 100)  && (umur == 59) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 96)  && (tinggi <= 100)  && (umur == 60) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }


        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK E LAKI-LAKI*/
        else if ((tinggi >= 0)  && (tinggi <= 43)  && (umur == 0) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 48)  && (umur == 1) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 52)  && (umur == 2) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 54)  && (umur == 3) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 57)  && (umur == 4) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 59)  && (umur == 5) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 60)  && (umur == 6) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 62)  && (umur == 7) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 63)  && (umur == 8) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 64)  && (umur == 9) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 65)  && (umur == 10) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 67)  && (umur == 11) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 68)  && (umur == 12) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 69)  && (umur == 13) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 70)  && (umur == 14) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 71)  && (umur == 15) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 72)  && (umur == 16) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 72)  && (umur == 17) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 73)  && (umur == 18) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 74)  && (umur == 19) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 75)  && (umur == 20) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 76)  && (umur == 21) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 76)  && (umur == 22) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 77)  && (umur == 23) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 77)  && (umur == 24) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 78)  && (umur == 25) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 78)  && (umur == 26) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 79)  && (umur == 27) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 80)  && (umur == 28) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 80)  && (umur == 29) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 81)  && (umur == 30) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 81)  && (umur == 31) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 82)  && (umur == 32) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 82)  && (umur == 33) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 83)  && (umur == 34) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 84)  && (umur == 35) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 84)  && (umur == 36) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 85)  && (umur == 37) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 85)  && (umur == 38) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 86)  && (umur == 39) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 86)  && (umur == 40) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 87)  && (umur == 41) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 87)  && (umur == 42) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 88)  && (umur == 43) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 88)  && (umur == 44) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 89)  && (umur == 45) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 89)  && (umur == 46) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 90)  && (umur == 47) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 90)  && (umur == 48) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 90)  && (umur == 49) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 91)  && (umur == 50) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 91)  && (umur == 51) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 92)  && (umur == 52) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 92)  && (umur == 53) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 93)  && (umur == 54) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 93)  && (umur == 55) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 93)  && (umur == 56) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 94)  && (umur == 57) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 94)  && (umur == 58) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 95)  && (umur == 59) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 95)  && (umur == 60) && (kelamin.equals("L"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }



        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK A PEREMPUAN*/
        else if ((tinggi >= 55)  && (umur == 0) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 60)  && (umur == 1) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 63)  && (umur == 2) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 66)  && (umur == 3) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 69)  && (umur == 4) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 71)  && (umur == 5) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 73)  && (umur == 6) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 74)  && (umur == 7) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 76)  && (umur == 8) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 77)  && (umur == 9) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 79)  && (umur == 10) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 80)  && (umur == 11) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 82)  && (umur == 12) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 83)  && (umur == 13) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 84)  && (umur == 14) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 86)  && (umur == 15) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 87)  && (umur == 16) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 88)  && (umur == 17) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 90)  && (umur == 18) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91)  && (umur == 19) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92)  && (umur == 20) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93)  && (umur == 21) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94)  && (umur == 22) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95)  && (umur == 23) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96)  && (umur == 24) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96)  && (umur == 25) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98)  && (umur == 26) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99)  && (umur == 27) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100)  && (umur == 28) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100)  && (umur == 29) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 101)  && (umur == 30) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 102)  && (umur == 31) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 103)  && (umur == 32) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 104)  && (umur == 33) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 105)  && (umur == 34) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 106)  && (umur == 35) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 107)  && (umur == 36) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 107)  && (umur == 37) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 108)  && (umur == 38) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 109)  && (umur == 39) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 110)  && (umur == 40) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 111)  && (umur == 41) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 111)  && (umur == 42) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 112)  && (umur == 43) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 113)  && (umur == 44) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 114)  && (umur == 45) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 114)  && (umur == 46) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 115)  && (umur == 47) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 116)  && (umur == 48) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 117)  && (umur == 49) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 117)  && (umur == 50) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 118)  && (umur == 51) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 119)  && (umur == 52) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 119)  && (umur == 53) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 120)  && (umur == 54) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 121)  && (umur == 55) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 121)  && (umur == 56) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 122)  && (umur == 57) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 123)  && (umur == 58) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 123)  && (umur == 59) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 124)  && (umur == 60) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }

        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK B PEREMPUAN*/
        else if ((tinggi >= 53)  && (tinggi <= 54)  && (umur == 0) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 58 ) && (tinggi <= 59 )  && (umur == 1) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 61 ) && (tinggi <= 62 )  && (umur == 2) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 64 ) && (tinggi <= 65 )  && (umur == 3) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 66 ) && (tinggi <= 68 )  && (umur == 4) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 68 ) && (tinggi <= 70 )  && (umur == 5) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 70 ) && (tinggi <= 72 )  && (umur == 6) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 72 ) && (tinggi <= 73 )  && (umur == 7) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 74 ) && (tinggi <= 75 )  && (umur == 8) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 75 ) && (tinggi <= 76 )  && (umur == 9) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 77 ) && (tinggi <= 78 )  && (umur == 10) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 78 ) && (tinggi <= 79 )  && (umur == 11) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 79 ) && (tinggi <= 81 )  && (umur == 12) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 81 ) && (tinggi <= 82 )  && (umur == 13) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 82 ) && (tinggi <= 83 )  && (umur == 14) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 83 ) && (tinggi <= 85 )  && (umur == 15) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 85 ) && (tinggi <= 86 )  && (umur == 16) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 86 ) && (tinggi <= 87 )  && (umur == 17) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 87 ) && (tinggi <= 89 )  && (umur == 18) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 88 ) && (tinggi <= 90 )  && (umur == 19) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89 ) && (tinggi <= 91 )  && (umur == 20) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 90 ) && (tinggi <= 92 )  && (umur == 21) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91 ) && (tinggi <= 93 )  && (umur == 22) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92 ) && (tinggi <= 94 )  && (umur == 23) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93 ) && (tinggi <= 95 )  && (umur == 24) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93 ) && (tinggi <= 96 )  && (umur == 25) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94 ) && (tinggi <= 97 )  && (umur == 26) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95 ) && (tinggi <= 98 )  && (umur == 27) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96 ) && (tinggi <= 99 )  && (umur == 28) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 97 ) && (tinggi <= 99 )  && (umur == 29) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98 ) && (tinggi <= 100 )  && (umur == 30) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99 ) && (tinggi <= 101 )  && (umur == 31) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100 ) && (tinggi <= 102 )  && (umur == 32) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100 ) && (tinggi <= 103 )  && (umur == 33) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 101) && (tinggi <= 104 )  && (umur == 34) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 102 ) && (tinggi <= 105 )  && (umur == 35) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 103 ) && (tinggi <= 106 )  && (umur == 36) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 104 ) && (tinggi <= 106 )  && (umur == 37) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 104 ) && (tinggi <= 107 )  && (umur == 38) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 105 ) && (tinggi <= 108 )  && (umur == 39) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 106 ) && (tinggi <= 109 )  && (umur == 40) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 107 ) && (tinggi <= 110 )  && (umur == 41) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 107 ) && (tinggi <= 110 )  && (umur == 42) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 108 ) && (tinggi <= 111 )  && (umur == 43) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 109 ) && (tinggi <= 112 )  && (umur == 44) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 110 ) && (tinggi <= 113 )  && (umur == 45) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 110 ) && (tinggi <= 113 )  && (umur == 46) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 111 ) && (tinggi <= 114 )  && (umur == 47) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 112 ) && (tinggi <= 115 )  && (umur == 48) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 112 ) && (tinggi <= 116 )  && (umur == 49) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 113 ) && (tinggi <= 116 )  && (umur == 50) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 114 ) && (tinggi <= 117 )  && (umur == 51) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 114 ) && (tinggi <= 118 )  && (umur == 52) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 115 ) && (tinggi <= 118 )  && (umur == 53) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 116 ) && (tinggi <= 119 )  && (umur == 54) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 116 ) && (tinggi <= 120 )  && (umur == 55) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 117 ) && (tinggi <= 120 )  && (umur == 56) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 117 ) && (tinggi <= 121 )  && (umur == 57) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 118 ) && (tinggi <= 122 )  && (umur == 58) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 118 ) && (tinggi <= 122 )  && (umur == 59) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 119 ) && (tinggi <= 123 )  && (umur == 60) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Tinggi";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }



        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK C PEREMPUAN*/
        else if ((tinggi >= 46)  && (tinggi <= 52)  && (umur == 0) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 50)  && (tinggi <= 57)  && (umur == 1) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 53)  && (tinggi <= 60)  && (umur == 2) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 56)  && (tinggi <= 63)  && (umur == 3) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 58)  && (tinggi <= 65)  && (umur == 4) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 60)  && (tinggi <= 67)  && (umur == 5) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 61)  && (tinggi <= 69)  && (umur == 6) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 63)  && (tinggi <= 71)  && (umur == 7) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 64)  && (tinggi <= 73)  && (umur == 8) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 65)  && (tinggi <= 74)  && (umur == 9) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 67)  && (tinggi <= 76)  && (umur == 10) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 68)  && (tinggi <= 77)  && (umur == 11) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 69)  && (tinggi <= 78)  && (umur == 12) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 70)  && (tinggi <= 80)  && (umur == 13) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 71)  && (tinggi <= 81)  && (umur == 14) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 72)  && (tinggi <= 82)  && (umur == 15) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 73)  && (tinggi <= 83)  && (umur == 16) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 74)  && (tinggi <= 85)  && (umur == 17) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 75)  && (tinggi <= 86)  && (umur == 18) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 76)  && (tinggi <= 87)  && (umur == 19) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 77)  && (tinggi <= 88)  && (umur == 20) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 78)  && (tinggi <= 89)  && (umur == 21) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 79)  && (tinggi <= 90)  && (umur == 22) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 79)  && (tinggi <= 91)  && (umur == 23) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 80)  && (tinggi <= 92)  && (umur == 24) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 80)  && (tinggi <= 92)  && (umur == 25) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 81)  && (tinggi <= 93)  && (umur == 26) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 82) && (tinggi <= 94) && (umur == 27) && (kelamin.equals("P"))) {
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya.";
        }
        else if ((tinggi >= 82)  && (tinggi <= 95)  && (umur == 28) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 83)  && (tinggi <= 96)  && (umur == 29) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 84)  && (tinggi <= 97)  && (umur == 30) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 85)  && (tinggi <= 98)  && (umur == 31) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 85)  && (tinggi <= 99)  && (umur == 32) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 86)  && (tinggi <= 99)  && (umur == 33) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 86)  && (tinggi <= 100)  && (umur == 34) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 87)  && (tinggi <= 101)  && (umur == 35) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 88)  && (tinggi <= 102)  && (umur == 36) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 88)  && (tinggi <= 103)  && (umur == 37) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89)  && (tinggi <= 103)  && (umur == 38) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 89)  && (tinggi <= 104)  && (umur == 39) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 90)  && (tinggi <= 105)  && (umur == 40) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91)  && (tinggi <= 106)  && (umur == 41) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 91)  && (tinggi <= 107)  && (umur == 42) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92)  && (tinggi <= 107)  && (umur == 43) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 92)  && (tinggi <= 108)  && (umur == 44) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93)  && (tinggi <= 109)  && (umur == 45) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 93)  && (tinggi <= 109)  && (umur == 46) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94)  && (tinggi <= 110)  && (umur == 47) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 94)  && (tinggi <= 111)  && (umur == 48) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95)  && (tinggi <= 111)  && (umur == 49) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 95)  && (tinggi <= 112)  && (umur == 50) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96)  && (tinggi <= 113)  && (umur == 51) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 96)  && (tinggi <= 113)  && (umur == 52) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 97)  && (tinggi <= 114)  && (umur == 53) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 97)  && (tinggi <= 115)  && (umur == 54) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98)  && (tinggi <= 115)  && (umur == 55) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 98)  && (tinggi <= 116)  && (umur == 56) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99)  && (tinggi <= 116)  && (umur == 57) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 99)  && (tinggi <= 117)  && (umur == 58) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100)  && (tinggi <= 118)  && (umur == 59) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }
        else if ((tinggi >= 100)  && (tinggi <= 118)  && (umur == 60) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan IDEAL";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN IDEAL"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
            ;
        }




        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK D PEREMPUAN*/
        else if ((tinggi >= 44)  && (tinggi <= 45)  && (umur == 0) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 48)  && (tinggi <= 49)  && (umur == 1) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 51)  && (tinggi <= 52)  && (umur == 2) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 54)  && (tinggi <= 55)  && (umur == 3) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 56)  && (tinggi <= 57)  && (umur == 4) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 57)  && (tinggi <= 59)  && (umur == 5) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 59)  && (tinggi <= 60)  && (umur == 6) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 60)  && (tinggi <= 62)  && (umur == 7) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 62)  && (tinggi <= 63)  && (umur == 8) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 63)  && (tinggi <= 64)  && (umur == 9) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 64)  && (tinggi <= 66)  && (umur == 10) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 65)  && (tinggi <= 67)  && (umur == 11) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 66)  && (tinggi <= 68)  && (umur == 12) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 67)  && (tinggi <= 69)  && (umur == 13) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 68)  && (tinggi <= 70)  && (umur == 14) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 69)  && (tinggi <= 71)  && (umur == 15) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 70)  && (tinggi <= 72)  && (umur == 16) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 71)  && (tinggi <= 73)  && (umur == 17) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 72)  && (tinggi <= 74)  && (umur == 18) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 73)  && (tinggi <= 75)  && (umur == 19) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 74)  && (tinggi <= 76)  && (umur == 20) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 75)  && (tinggi <= 77)  && (umur == 21) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 75)  && (tinggi <= 78)  && (umur == 22) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 76)  && (tinggi <= 78)  && (umur == 23) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 77)  && (tinggi <= 79)  && (umur == 24) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 77)  && (tinggi <= 79)  && (umur == 25) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 77)  && (tinggi <= 80)  && (umur == 26) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 78)  && (tinggi <= 81)  && (umur == 27) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 79)  && (tinggi <= 81)  && (umur == 28) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 80)  && (tinggi <= 82)  && (umur == 29) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 80)  && (tinggi <= 83)  && (umur == 30) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 81)  && (tinggi <= 84)  && (umur == 31) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 81)  && (tinggi <= 84)  && (umur == 32) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 82)  && (tinggi <= 85)  && (umur == 33) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 83)  && (tinggi <= 85)  && (umur == 34) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 83)  && (tinggi <= 86)  && (umur == 35) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 84)  && (tinggi <= 87)  && (umur == 36) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 84)  && (tinggi <= 87)  && (umur == 37) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 85)  && (tinggi <= 88)  && (umur == 38) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 85)  && (tinggi <= 88)  && (umur == 39) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 86)  && (tinggi <= 89)  && (umur == 40) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 86)  && (tinggi <= 90)  && (umur == 41) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 87)  && (tinggi <= 90)  && (umur == 42) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 88)  && (tinggi <= 91)  && (umur == 43) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 88)  && (tinggi <= 91)  && (umur == 44) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 89)  && (tinggi <= 92)  && (umur == 45) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 89)  && (tinggi <= 92)  && (umur == 46) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 89)  && (tinggi <= 93)  && (umur == 47) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 90)  && (tinggi <= 93)  && (umur == 48) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 90)  && (tinggi <= 94)  && (umur == 49) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 91)  && (tinggi <= 95)  && (umur == 50) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 91)  && (tinggi <= 96)  && (umur == 51) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 92)  && (tinggi <= 95)  && (umur == 52) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 92)  && (tinggi <= 96)  && (umur == 53) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 93)  && (tinggi <= 96)  && (umur == 54) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 93)  && (tinggi <= 97)  && (umur == 55) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 94)  && (tinggi <= 97)  && (umur == 56) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 94)  && (tinggi <= 98)  && (umur == 57) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 94)  && (tinggi <= 98)  && (umur == 58) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 95)  && (tinggi <= 99)  && (umur == 59) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 95)  && (tinggi <= 99)  && (umur == 60) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }


        /*TINGGI BADAN TERDAHAP UMUR 0 - 5 TAHUN TITIK E PEREMPUAN*/
        else if ((tinggi >= 0)  && (tinggi <= 43)  && (umur == 0) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 47)  && (umur == 1) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 50)  && (umur == 2) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 53)  && (umur == 3) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 55)  && (umur == 4) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 56)  && (umur == 5) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 58)  && (umur == 6) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 59)  && (umur == 7) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 61)  && (umur == 8) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 62)  && (umur == 9) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 63)  && (umur == 10) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 64)  && (umur == 11) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 65)  && (umur == 12) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 66)  && (umur == 13) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 67)  && (umur == 14) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 68)  && (umur == 15) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 69)  && (umur == 16) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 70)  && (umur == 17) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 71)  && (umur == 18) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 72)  && (umur == 19) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 73)  && (umur == 20) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 74)  && (umur == 21) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 74)  && (umur == 22) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 75)  && (umur == 23) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 76)  && (umur == 24) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 76)  && (umur == 25) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 76)  && (umur == 26) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 77)  && (umur == 27) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 78)  && (umur == 28) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 79)  && (umur == 29) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 79)  && (umur == 30) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 80)  && (umur == 31) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 80)  && (umur == 32) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 81)  && (umur == 33) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 82)  && (umur == 34) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 82)  && (umur == 35) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 83)  && (umur == 36) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 83)  && (umur == 37) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 84)  && (umur == 38) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 84)  && (umur == 39) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 85)  && (umur == 40) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 85)  && (umur == 41) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 86)  && (umur == 42) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 86)  && (umur == 43) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 87)  && (umur == 44) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 87)  && (umur == 45) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 88)  && (umur == 46) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 88)  && (umur == 47) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 89)  && (umur == 48) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 89)  && (umur == 49) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 90)  && (umur == 50) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 90)  && (umur == 51) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 91)  && (umur == 52) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 91)  && (umur == 53) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 92)  && (umur == 54) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 92)  && (umur == 55) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 93)  && (umur == 56) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 93)  && (umur == 57) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 93)  && (umur == 58) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 94)  && (umur == 59) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }
        else if ((tinggi >= 0)  && (tinggi <= 94)  && (umur == 60) && (kelamin.equals("P"))  ){
            perawakan = "Perawakan Pendek Sekali";
            keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK SEKALI"
                    + "\n" + "\n"
                    + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                    + "\n" + "\n"
                    + "Segera konsultasikan dengan dokter anak anda";
        }


        /*TINGGI BADAN TERDAHAP UMUR 5 - 18 TAHUN*/
        else if ( umur == 61 ){
            ideal = 109;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 72 ){
            ideal = 115;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 84 ){
            ideal = 122;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 96 ){
            ideal = 128;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 108 ){
            ideal = 133;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 120 ){
            ideal = 139;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 132 ){
            ideal = 143;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 144 ){
            ideal = 149;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 156 ){
            ideal = 156;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 168 ){
            ideal = 164;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 180 ){
            ideal = 170;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 192 ){
            ideal = 173;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 204 ){
            ideal = 175;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 216 ){
            ideal = 176;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }

        else if ( umur == 65  ){
            ideal = 112;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 77  ){
            ideal = 118;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 89  ){
            ideal = 125;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 101  ){
            ideal = 130;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 113  ){
            ideal = 136;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 125  ){
            ideal = 141;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 137  ){
            ideal = 146;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 149  ){
            ideal = 152;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 161  ){
            ideal = 160;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 173  ){
            ideal = 167;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 185  ){
            ideal = 172;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 197  ){
            ideal = 175;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }
        else if ( umur == 209  ){
            ideal = 176;
            persentase = (tinggi/ideal)*100;
            if (persentase < 90 ){
                perawakan = "Perawakan Pendek";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN PENDEK"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase >=90) && (persentase <= 110)){
                perawakan = "Perawakan Sedang";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN SEDANG"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                        + "\n" + "\n"
                        + "Segera konsultasikan dengan dokter anak anda";
            }
            else if ((persentase > 110)){
                perawakan = "Perawakan Tinggi";
                keterangan = "Tinggi badan anak Anda termasuk PERAWAKAN TINGGI"
                        + "\n" + "\n"
                        + "Silahkan menggunakan kurva BERAT BADAN terhadap PANJANG/TINGGI BADAN untuk menentukan status gizinya."
                ;
            }
        }

        else if ( umur > 216 ){
            keterangan = "Mohon maaf untuk saat ini , aplikasi ini hanya bisa digunakan untuk anak umur 0 - 18 tahun";
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
