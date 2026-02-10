package com.spring.spring_project.UI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "UI Home");
        return "index";
    }

    @GetMapping("/somepage")
    public String somepage(Model model) {
        model.addAttribute("title", "Somepage");
        return "somepage";
    }
}