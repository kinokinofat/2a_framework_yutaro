package com.example.demo.controller;


	import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

	@Controller
	public class gitItemListController {
	    @RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	    public String doEditGet() {
	        return "gititemedit";
	    }

	    @RequestMapping(path = "/gititemedit", method = RequestMethod.POST)
	    public String doEditPost() {
	        return "gititemedit";
	        }
	    }

	   



