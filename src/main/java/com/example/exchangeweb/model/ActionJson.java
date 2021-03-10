package com.example.exchangeweb.model;


import com.example.exchangeweb.dto.JsonDto;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ActionJson {

    public String currency;
    public double valueCurrency;


    public void getJsonData() throws IOException {


        String sURL = "http://api.nbp.pl/api/exchangerates/rates/a/gbp/?format=json";

        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        System.out.println(root.toString());

        Gson gson = new Gson();

        JsonDto jsonDto = gson.fromJson(root.toString(), JsonDto.class);

        currency = jsonDto.currency;
        valueCurrency = jsonDto.rates[0].mid;

    }
}
