package com.myclass.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Controller
@RequestMapping("login")
public class LoginController {
    
    @RequestMapping(value="", method=RequestMethod.GET)
    public String index() {
        return "login/index";
    }
    
    /*
     * @RequestMapping(value="", method=RequestMethod.POST) public String
     * login(HttpServletRequest req, ModelMap model) { // @RequestParam("email")
     * String email; // @RequestParam("password") String password; String email =
     * req.getParameter("email"); String password = req.getParameter("password");
     * 
     * if(email.equals("admin@gmail.com") && password.equals("123456")) { return
     * "redirect:/wellcome"; } else model.addAttribute("message", "Sai Id/Pass");
     * return "login/index"; }
     */
    
    @RequestMapping(value="", method=RequestMethod.POST)
    public String login(@RequestParam ("email") String email, 
                        @RequestParam ("password") String password,
                        ModelMap model) {
        if(email.equals("admin@gmail.com") && password.equals("123456")) {
            return "redirect:/wellcome";
        }
        else
        model.addAttribute("message", "Sai Id/Pass");
        return "login/index";
    }

}
