package com.example.hp.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by HP on 10/29/2017.
 */

public interface MyService {
    String baseusl = "https://my.api.mockaroo.com/";
    @POST("omarapi.json?key=dc5a0cc0")
    Call<List<JsonObjectClass>> getHeroes();
}
