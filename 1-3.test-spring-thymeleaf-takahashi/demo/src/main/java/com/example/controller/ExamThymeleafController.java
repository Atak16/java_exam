package com.example.controller;

import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ThymeleafForm;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/ex-thymeleaf")
public class ExamThymeleafController {
    @ModelAttribute
    public ThymeleafForm thymeleafForm() {
        return new ThymeleafForm();
    }
    @RequestMapping("")
    public String index() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String input(ThymeleafForm thymeleafForm, Model model) {
        Member member = new Member();
        member.setName(thymeleafForm.getName());
        member.setAge(thymeleafForm.getAgeInt());
        member.setHobbyList(thymeleafForm.getHobbyList());
        model.addAttribute("member", member);
        return "ex-thymeleaf-result";
    }
}
