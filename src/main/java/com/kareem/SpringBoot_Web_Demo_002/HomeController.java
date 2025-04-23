package com.kareem.SpringBoot_Web_Demo_002;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Video 203
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Called Home page");
        return "html/index.jsp";
    }
    @RequestMapping("submitForm")
    public String add(int numberOne , int numberTwo , HttpSession session){
        System.out.println("Called result page");

        int result = numberOne + numberTwo;
        System.out.println(result);

        session.setAttribute("resultX",result);


        return "html/result.jsp";

    }
}
