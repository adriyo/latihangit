package com.example.admin.myapplication.model;


import com.google.gson.annotations.SerializedName;

/**
 * Created by ADMIN on 11/1/2016.
 */

public class MenuMakananModel {
    @SerializedName("error")
    boolean error;

    @SerializedName("id_menu")
    String idMenu;

    @SerializedName("id_warung")
    String idWarung;

    @SerializedName("nama_menu")
    String namaMenu;

    @SerializedName("nama_warung")
    String namaWarung;

    @SerializedName("alamat")
    String alamat;

    @SerializedName("harga")
    String harga;

    @SerializedName("url")
    private String url;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public String getIdWarung() {
        return idWarung;
    }

    public void setIdWarung(String idWarung) {
        this.idWarung = idWarung;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public void setNamaWarung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
