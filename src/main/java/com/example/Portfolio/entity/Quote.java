package com.example.Portfolio.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Quote {

    private String q;
    private String a;
    private String h;

    public Quote() {
    }

    public String getQ() {
        return q;
    }

    public String getA() {
        return a;
    }

    public String getH() {
        return h;
    }
}
