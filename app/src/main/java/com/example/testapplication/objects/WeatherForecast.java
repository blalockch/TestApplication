package com.example.testapplication.objects;

import com.example.testapplication.RestBase;
import com.example.testapplication.RestCallback;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WeatherForecast extends RestBase implements Serializable {

    public static String endpoint = "data/2.5/";

    private int dt;

    private Main main;

    private List<Weather> weather;

    private Clouds clouds;

    private Wind wind;

    private int visibility;

    private int pop;

    private Sys sys;

    private Date dt_txt;

    public void setDt(int dt){
        this.dt = dt;
    }
    public int getDt(){
        return this.dt;
    }
    public void setMain(Main main){
        this.main = main;
    }
    public Main getMain(){
        return this.main;
    }
    public void setWeather(List<Weather> weather){
        this.weather = weather;
    }
    public List<Weather> getWeather(){
        return this.weather;
    }
    public void setClouds(Clouds clouds){
        this.clouds = clouds;
    }
    public Clouds getClouds(){
        return this.clouds;
    }
    public void setWind(Wind wind){
        this.wind = wind;
    }
    public Wind getWind(){
        return this.wind;
    }
    public void setVisibility(int visibility){
        this.visibility = visibility;
    }
    public int getVisibility(){
        return this.visibility;
    }
    public void setPop(int pop){
        this.pop = pop;
    }
    public int getPop(){
        return this.pop;
    }
    public void setSys(Sys sys){
        this.sys = sys;
    }
    public Sys getSys(){
        return this.sys;
    }
    public void setDt_txt(Date dt_txt){
        this.dt_txt = dt_txt;
    }
    public Date getDt_txt(){
        return this.dt_txt;
    }
    public static void GetList(final RestCallback restCallback, String searchCity) {
        GetListBase(searchCity, restCallback, endpoint);
    }
}
