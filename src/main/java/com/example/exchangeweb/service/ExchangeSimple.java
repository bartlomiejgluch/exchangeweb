package com.example.exchangeweb.service;


import com.example.exchangeweb.model.ActionJson;
import com.example.exchangeweb.model.ActionModel;

import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class ExchangeSimple {

    public double add(ActionModel model) throws IOException {

        ActionJson actionJson = new ActionJson();
        actionJson.getJsonData();
        double valueToCalculate = actionJson.valueCurrency;
        System.out.println(valueToCalculate);
        double results = model.getA() * valueToCalculate;
        return results;
    }


    public ActionModel clearSimple(ActionModel model) {
        model.setA(0);
        model.setB(0);
        return model;
    }


}






