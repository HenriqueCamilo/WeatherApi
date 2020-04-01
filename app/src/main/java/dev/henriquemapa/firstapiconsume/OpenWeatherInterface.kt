package dev.henriquemapa.firstapiconsume

import dev.henriquemapa.firstapiconsume.model.OpenWeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherInterface {

    @GET("data/2.5/weather?")

                                /* parametro do meu get "tudo que vemd epois do ?"*/
    fun getCurrentWeatherByCity(@Query("q") city:String, /*o "q" na api é cidade, com uma var chamada city do tipo string*/
                                @Query("APPID") app_ID: String, /*o "APPID" na api é a apikey, com uma var chamada app_ID*/
                                @Query("units") units:String = "metric") /*units com um valor ja definido como metric para celsius*/
                                : Call<OpenWeatherResponse>

}