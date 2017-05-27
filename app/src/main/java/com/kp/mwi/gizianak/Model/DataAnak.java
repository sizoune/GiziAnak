package com.kp.mwi.gizianak.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;

/**
 * Created by mwi on 5/25/17.
 */

public class DataAnak extends SugarRecord implements Parcelable {
    private String uniqid, nama, jenisKelamin, tglLahir;
    private int berat, tinggi;
    private byte[] foto;
    private boolean adaFoto;

    public DataAnak() {
    }

    public DataAnak(String nama, String jenisKelamin, String tglLahir, int berat, int tinggi) {
        this.uniqid = nama.replaceAll("\\s", "") + tglLahir.replaceAll("\\s", "");
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tglLahir = tglLahir;
        this.berat = berat;
        this.tinggi = tinggi;
        adaFoto = false;
    }

    public DataAnak(String nama, String jenisKelamin, String tglLahir, int berat, int tinggi, byte[] foto) {
        this.uniqid = nama.replaceAll("\\s", "") + tglLahir.replaceAll("\\s", "");
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tglLahir = tglLahir;
        this.berat = berat;
        this.tinggi = tinggi;
        this.foto = foto;
        adaFoto = true;
    }

    protected DataAnak(Parcel in) {
        uniqid = in.readString();
        nama = in.readString();
        jenisKelamin = in.readString();
        tglLahir = in.readString();
        berat = in.readInt();
        tinggi = in.readInt();
        foto = in.createByteArray();
        adaFoto = in.readByte() != 0;
    }

    public static final Creator<DataAnak> CREATOR = new Creator<DataAnak>() {
        @Override
        public DataAnak createFromParcel(Parcel in) {
            return new DataAnak(in);
        }

        @Override
        public DataAnak[] newArray(int size) {
            return new DataAnak[size];
        }
    };

    public String getUniqid() {
        return uniqid;
    }

    public void setUniqid(String uniqid) {
        this.uniqid = uniqid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public boolean isAdaFoto() {
        return adaFoto;
    }

    public void setAdaFoto(boolean adaFoto) {
        this.adaFoto = adaFoto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uniqid);
        dest.writeString(nama);
        dest.writeString(jenisKelamin);
        dest.writeString(tglLahir);
        dest.writeInt(berat);
        dest.writeInt(tinggi);
        dest.writeByteArray(foto);
        dest.writeByte((byte) (adaFoto ? 1 : 0));
    }
}
