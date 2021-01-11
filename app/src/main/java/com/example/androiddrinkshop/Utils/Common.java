package com.example.androiddrinkshop.Utils;

import com.example.androiddrinkshop.Retrofit.IDrinkShopAPI;
import com.example.androiddrinkshop.Retrofit.RetrofitClient;

import retrofit2.Retrofit;

public class Common {
    //localhost ip  192.168.43.60 for emulator 10.0.2.2
    private static final String BASE_URL="http://192.168.43.60/drinkshop/";

    public static IDrinkShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
