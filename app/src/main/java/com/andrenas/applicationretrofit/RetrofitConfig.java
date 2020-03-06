package com.andrenas.applicationretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig(){
        this.retrofit = new Retrofit.Builder().baseUrl("https://viacep.com.br/ws/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

    }


    public CEPservice getCEPservice() {
        return this.retrofit.create(CEPservice.class);
    }
}
