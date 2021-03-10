package com.example.exchangeweb.controllers;

import com.example.exchangeweb.model.ActionModel;
import com.example.exchangeweb.service.ExchangeSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class ExchangeController {


    ActionModel actionModel = new ActionModel();

    @Autowired
    private ExchangeSimple calculateSimple;

    @RequestMapping("/exchangesite")
    public String getCalculatorPage(Model model) {
        model.addAttribute("actionModel", actionModel);
        return "exchangesite";
    }

    @RequestMapping(value = "/exchangesite", params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("actionModel") ActionModel actionModel, Model model) throws IOException {
        model.addAttribute("result", calculateSimple.add(actionModel));
        return "exchangesite";
    }


    @RequestMapping(value = "/exchangesite", params = "clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("actionModel") ActionModel actionModel, Model model) {
        model.addAttribute("actionModel", calculateSimple.clearSimple(actionModel));
        model.addAttribute("result", 0);
        return "exchangesite";
    }


}