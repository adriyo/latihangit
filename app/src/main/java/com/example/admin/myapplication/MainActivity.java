package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.admin.myapplication.model.MenuMakananModel;
import com.example.admin.myapplication.model.MenuMakananResponse;
import com.example.admin.myapplication.rest.apiClient;
import com.example.admin.myapplication.rest.apiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    List<MenuMakananModel> listMenu;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface apiService = apiClient.getClient().create(apiInterface.class);
        Call<MenuMakananResponse> call = apiService.getMenuMakanan();
        call.enqueue(new Callback<MenuMakananResponse>() {
            @Override
            public void onResponse(Call<MenuMakananResponse> call, Response<MenuMakananResponse> response) {
                listMenu = response.body().getListMenu();
                Log.e(TAG, "status code : " + response.code());
                Log.e(TAG, "size : " + listMenu.size());



            }

            @Override
            public void onFailure(Call<MenuMakananResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
