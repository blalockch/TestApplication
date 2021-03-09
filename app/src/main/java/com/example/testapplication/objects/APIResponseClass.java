package com.example.testapplication.objects;

import java.io.Serializable;
import java.util.ArrayList;

public class APIResponseClass implements Serializable {
    private String cod;

    private int message;

    private int cnt;

    private ArrayList<WeatherForecast> list;

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCod() {
        return this.cod;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getMessage() {
        return this.message;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getCnt() {
        return this.cnt;
    }

    public void setList(ArrayList<WeatherForecast> list) {
        this.list = list;
    }

    public ArrayList<WeatherForecast> getList() {
        return this.list;
    }
}
