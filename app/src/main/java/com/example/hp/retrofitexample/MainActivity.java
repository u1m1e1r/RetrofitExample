package com.example.hp.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyService.baseusl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyService api = retrofit.create(MyService.class);
        Call<List<JsonObjectClass>> call = api.getHeroes();

        call.enqueue(new Callback<List<JsonObjectClass>>() {
            @Override
            public void onResponse(Call<List<JsonObjectClass>> call, Response<List<JsonObjectClass>> response) {
                List<JsonObjectClass> heroes = response.body();

                for(JsonObjectClass h : heroes){
                    Log.d("name" , h.getFirst_name());
                }
            }

            @Override
            public void onFailure(Call<List<JsonObjectClass>> call, Throwable t) {

            }
        });
    }
}
