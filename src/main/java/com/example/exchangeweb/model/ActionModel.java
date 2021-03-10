package com.example.exchangeweb.model;

public class ActionModel {


    private String action;
    private int a;
    private int b;


    public ActionModel() {
    }


    public ActionModel(String operation) {
        this.action = operation;
    }

    public ActionModel(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


}
