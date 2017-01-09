package com.example.admin.myapplication.rest;

import com.example.admin.myapplication.model.MenuMakananResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Admin on 1/6/2017.
 */

public interface apiInterface {
    @GET("db")
    Call<MenuMakananResponse> getMenuMakanan();
}
