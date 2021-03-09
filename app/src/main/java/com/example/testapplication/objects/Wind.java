package com.example.testapplication.objects;

import java.io.Serializable;

public class Wind implements Serializable {
    private double speed;

    private int deg;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public int getDeg() {
        return this.deg;
    }
}