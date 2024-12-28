package com.ccristian.springboot.springmvc.app.controllers;

import com.ccristian.springboot.springmvc.app.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class UserController {

    @GetMapping({"/view","/","/another"})
    public String view(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("message", "Esta es una aplicación de ejemplo usando Spring Boot!!!");
        model.addAttribute("user", new User("Cristian","Cirstaldo"));
        return "view";
    }
}
