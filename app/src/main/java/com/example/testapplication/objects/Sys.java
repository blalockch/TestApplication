package com.example.testapplication.objects;

import java.io.Serializable;

public class Sys implements Serializable {
    private String pod;

    public void setPod(String pod) {
        this.pod = pod;
    }

    public String getPod() {
        return this.pod;
    }
}
