package com.anurag.Portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{

    @GetMapping({"","/","/home"})
    public String showHomepage ()
    {

        return "home";
    }
}
