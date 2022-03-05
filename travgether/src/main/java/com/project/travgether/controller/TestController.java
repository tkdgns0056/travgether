package com.project.travgether.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    
	@RequestMapping("/jsp")
    public String jsp() throws Exception {
        return "test";
    }

	
}
