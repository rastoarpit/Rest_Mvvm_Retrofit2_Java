package com.rastoarpit.restmvvmretrofit2java.requests;

import com.rastoarpit.restmvvmretrofit2java.util.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    private static RecipeApi recipeApi = retrofit.create(RecipeApi.class); 

    public  RecipeApi getRecipeApi(){
        return recipeApi;
    }
}
