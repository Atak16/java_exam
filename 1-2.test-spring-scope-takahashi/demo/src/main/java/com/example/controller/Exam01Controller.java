package com.example.controller;

import java.text.AttributedCharacterIterator.Attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Loginform;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @RequestMapping("")
    public String index() {
        return "exam01";
    }

    @RequestMapping("/exam01-succcess")
    @ModelAttribute
    public String login(Loginform loginform ,Model model) {
        if ("yamada@sample.com".equals(loginform.getName()) && "password".equals(loginform.getPassword())) {
            model.addAttribute("成功", login);
        } else {
            model.addAttribute("失敗", login);
        }
        return "exam01-login";
    }
}
