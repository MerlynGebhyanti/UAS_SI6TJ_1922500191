package com.example.uassi6tj1922500191.dtadosen;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface DtaDosenJsonPlaceHolderAPI {
    @GET("dtadosen.php")
    Call<List<DosenPost>> getPosts(

    );
    @GET("dtadosen.php")
    Call<List<DosenPost>> getPosts(@QueryMap Map<String, String> parameters);
}

