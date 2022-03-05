package com.project.travgether.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {

	@RequestMapping("/viewboard")
	public String viewBoard() throws Exception {
		return "/accompany_board/viewboard";
	}

}
