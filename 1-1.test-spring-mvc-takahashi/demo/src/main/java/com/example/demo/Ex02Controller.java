package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Ex02Controller {

    @RequestMapping("/show")
    public String showCompanyIntroduction() {
        return "redirect:/exam02/showCompanyIntroduction";
    }

    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction2() {
        return "exam-02";
    }
}
