package com.ahn.templateExm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/templateExam")
    public String templateExam(Model model, @RequestParam String name){
        model.addAttribute("name",name);
        return "templateExam";
    }
}
