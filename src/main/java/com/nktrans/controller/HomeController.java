package com.nktrans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by scelac on 8/4/16.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("russian", "Добрый день");
        model.addAttribute("pageContent", "content/hello-world");
        return "hello";
    }
}
