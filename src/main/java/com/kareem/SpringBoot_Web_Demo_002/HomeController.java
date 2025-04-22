package com.kareem.SpringBoot_Web_Demo_002;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Video 203
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("HomeController.home() called");
        return "index.jsp";
    }
}
