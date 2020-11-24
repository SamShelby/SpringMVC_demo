package com.mvc.controllers;

import com.mvc.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
//@RequestMapping("SpringDocker/main") // when deploying
public class MainController {

    @Autowired
    public GreetingService greetingService;

    @RequestMapping("/")
    public String message(Model model){
        model.addAttribute("message",this.greetingService.greet());
        return "hello";  //view name
    }
}
