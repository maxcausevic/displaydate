package com.mcausevic.DisplayDate;

import java.util.Date;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class DisplayDate {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
    }
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date",new Date());
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time",new Date());
		return "time.jsp";
	}
}