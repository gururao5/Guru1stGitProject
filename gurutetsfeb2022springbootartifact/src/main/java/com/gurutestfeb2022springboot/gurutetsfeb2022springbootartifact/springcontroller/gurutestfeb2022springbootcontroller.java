package com.gurutestfeb2022springboot.gurutetsfeb2022springbootartifact.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class gurutestfeb2022springbootcontroller {
	@RequestMapping("/welcome")
	//@ResponseBody
	public String returnWelcomePage()
	{
	//	System.out.println("HI FROM GYRY");
		return "welcome.jsp";
	}
}


