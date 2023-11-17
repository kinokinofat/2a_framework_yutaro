package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {

    @RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
    public String third() {
        return "gitlogin";
    }

    @RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
    public String third(String id, String pwd) {
        System.out.println(id);
        System.out.println(pwd);
        if (id.equals("gitlogin") && pwd.equals("gitpw")) {
            return "redirect:/gititemlist";
        } else {
            return "redirect:/gitlogin";
        }
    }

   
}
