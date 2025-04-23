package com.kareem.SpringBoot_Web_Demo_002;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Video 203
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Called Home page");
        return "html/index";
    }

    @RequestMapping("submitForm")
    public String add(@RequestParam("numberOne")
                      int number1,
                      @RequestParam("numberTwo")
                      int number2, Model model) {
        System.out.println("Called result page");

        int result = number1 + number2;
        System.out.println(result);
        model.addAttribute("result",result);


        return "html/result";

    }
}
