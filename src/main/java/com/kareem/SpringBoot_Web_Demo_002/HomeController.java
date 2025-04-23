package com.kareem.SpringBoot_Web_Demo_002;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Called Home page");
        return "html/index";
    }

    @RequestMapping("submitForm")
    public ModelAndView add(
            @RequestParam("numberOne")
            int number1,
            @RequestParam("numberTwo")
            int number2, ModelAndView modelAndView) {

        System.out.println("Called result page");

        int result = number1 + number2;
        System.out.println(result);

        modelAndView.addObject("result", result);
        modelAndView.setViewName("html/result");


        return modelAndView;

    }
}
