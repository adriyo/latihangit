package com.example.admin.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ADMIN on 11/1/2016.
 */

public class MenuMakananResponse {
    @SerializedName("error")
    private boolean error;

    @SerializedName("menu_makanan")
    private List<MenuMakananModel> listMenu;

    public MenuMakananResponse(boolean error, List<MenuMakananModel> listMenu) {
        this.error = error;
        this.listMenu = listMenu;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<MenuMakananModel> getListMenu() {
        return listMenu;
    }

    public void setListMenu(List<MenuMakananModel> listMenu) {
        this.listMenu = listMenu;
    }
}
