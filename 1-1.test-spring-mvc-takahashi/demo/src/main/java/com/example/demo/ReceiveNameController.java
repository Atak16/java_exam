package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ReceiveForm;

@Controller
@RequestMapping("/yamada")
public class ReceiveNameController {

    // @RequestMapping("")
    // public String index() {
    //     return "name-form";
    // }

    // @RequestMapping("taro")
    // public String taro(String name) {
    //     System.out.println(name);
    //     return "finished";
    // }

    @ModelAttribute
    public ReceiveForm setUpForm() {
        return new ReceiveForm();
    } 

    @RequestMapping("") 
    public String index() {
        return "name-form";
    }

    @RequestMapping("/taro") 
        public String taro(ReceiveForm receiveForm) {
            System.out.println(receiveForm.getName());
            return "finished";
        }
    }
