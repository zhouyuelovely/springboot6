package com.example.springboot6.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sp")
public class IndexCtrl {

    @RequestMapping("/springboot6")
    public String Index(){
        return "看我的springboot";
    }


    @RequestMapping("/login")
    public ModelAndView Login(ModelAndView model){
        model.setViewName("login");
        return model;

    }

    @RequestMapping("/boot")
    public String Boot(){
        return "看我的springbootbsdfjklj";
    }
}
