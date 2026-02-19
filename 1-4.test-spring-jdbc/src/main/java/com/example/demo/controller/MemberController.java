package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.MemberRepository;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("members", repository.findAll());
		//member.findAll().forEach(system.out::println)
		return "member";
	}
}
