package com.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
        @RequestMapping("/signin")
        public String signin()
        {
            return "login.html";
        }
}
