package com.myclass.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@Controller
@RequestMapping("wellcome")
public class WellcomeController {
    @RequestMapping(value="", method=RequestMethod.GET)
    public String index() {
        return "wellcome/index";
    }
}