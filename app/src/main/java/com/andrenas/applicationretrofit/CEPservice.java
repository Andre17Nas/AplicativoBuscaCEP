package com.andrenas.applicationretrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CEPservice {


    @GET("{cep}/json")
    Call<CEP> buscarCEP(@Path("cep") String cep);



}
