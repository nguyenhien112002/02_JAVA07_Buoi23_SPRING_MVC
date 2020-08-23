package com.myclass.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("home")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Xin chào");
        return "home/index"; //tương đương lệnh forward trong dụ án Servlet
    }
}
