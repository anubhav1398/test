package com.example.androiddrinkshop.Retrofit;

import com.example.androiddrinkshop.Model.CheckUserResponse;
import com.example.androiddrinkshop.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IDrinkShopAPI {
    @FormUrlEncoded
    @POST("checkuser.php")
    Call<CheckUserResponse> checkUserExixts(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("register.php")
    Call<User> registerNewUser(@Field("phone") String phone, @Field("name") String name, @Field("birthdate") String birthdate, @Field("address") String address);
}
