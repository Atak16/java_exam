package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/name-form")
public class ReceiveNameController {

    @RequestMapping("/show-company-introduction")
    public String showSelfIntroduction() {
        return "finished.html";
    }
}
