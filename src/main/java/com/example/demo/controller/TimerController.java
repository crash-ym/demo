package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimerController {
	
	 @RequestMapping("time")
	    public String time(){
	    	Date date = new Date();
	    	System.out.print(date.toString());
	        return date.toLocaleString();
	    }

}
