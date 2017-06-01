package com.kp.mwi.gizianak.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mwi on 6/1/17.
 */

public class DataKesimpulan implements Parcelable {
    private String nama, jk, status;
    private int titikX, titikY, umur;
    private byte[] foto;
    private boolean adaFoto;

    public DataKesimpulan(String nama, String jk, String status, int titikX, int titikY, int umur, byte[] foto) {
        this.nama = nama;
        this.jk = jk;
        this.status = status;
        this.titikX = titikX;
        this.titikY = titikY;
        this.umur = umur;
        this.foto = foto;
        adaFoto = true;
    }

    public DataKesimpulan(String nama, String jk, String status, int titikX, int titikY, int umur) {
        this.nama = nama;
        this.jk = jk;
        this.status = status;
        this.titikX = titikX;
        this.titikY = titikY;
        this.umur = umur;
        adaFoto = false;
    }

    protected DataKesimpulan(Parcel in) {
        nama = in.readString();
        jk = in.readString();
        status = in.readString();
        titikX = in.readInt();
        titikY = in.readInt();
        umur = in.readInt();
        foto = in.createByteArray();
        adaFoto = in.readByte() != 0;
    }

    public static final Creator<DataKesimpulan> CREATOR = new Creator<DataKesimpulan>() {
        @Override
        public DataKesimpulan createFromParcel(Parcel in) {
            return new DataKesimpulan(in);
        }

        @Override
        public DataKesimpulan[] newArray(int size) {
            return new DataKesimpulan[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTitikX() {
        return titikX;
    }

    public void setTitikX(int titikX) {
        this.titikX = titikX;
    }

    public int getTitikY() {
        return titikY;
    }

    public void setTitikY(int titikY) {
        this.titikY = titikY;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
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
        dest.writeString(nama);
        dest.writeString(jk);
        dest.writeString(status);
        dest.writeInt(titikX);
        dest.writeInt(titikY);
        dest.writeInt(umur);
        dest.writeByteArray(foto);
        dest.writeByte((byte) (adaFoto ? 1 : 0));
    }
}
