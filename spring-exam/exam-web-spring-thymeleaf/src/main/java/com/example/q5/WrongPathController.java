package com.example.q5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Q5. 正しいパスを指定して、hello.htmlが表示されるようにしなさい。
 */
@Controller
public class WrongPathController {
	@GetMapping("/q5")
	public String gotoq5(){
		
		return "hello";
	}

}
