package com.ccristian.springboot.springmvc.app.controllers;

import com.ccristian.springboot.springmvc.app.entities.User;
import com.ccristian.springboot.springmvc.app.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping({"/view", "/another"})
    public String view(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("message", "Esta es una aplicación de ejemplo usando Spring Boot!!!");
        model.addAttribute("user", new User("Cristian", "Cirstaldo"));
        return "view";
    }

    @GetMapping({"", "/"})
    public String list(Model model) {
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", service.findAll());
        return "list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("title", "Crear Usuario");
        model.addAttribute("user", new User());
        return "form";
    }

    @GetMapping("/form/{id}")
    public String form(@PathVariable Long id, Model model, RedirectAttributes redirect) {
        Optional<User> optionalUser = service.finById(id);
        if (optionalUser.isPresent()) {
            model.addAttribute("title", "EDITAR Usuario");
            model.addAttribute("user", optionalUser.get());
            return "form";
        } else {
            redirect.addFlashAttribute("error", "El usuario con el id: " + id + " NO EXISTE en la Base de Datos");
            return "redirect:/users";
        }
    }

    @PostMapping
    public String form(User user, Model model, RedirectAttributes redirect) {
        String message = user.getId()!= null && user.getId() > 0 ?
                "El usuario: " + user.getName() + " se ha ACTUALIZADO con éxito!"
                : "El usuario: " + user.getName() + " se ha CREADO con éxito!";
        service.save(user);
        redirect.addFlashAttribute("success", message);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {
        Optional<User> optionalUser = service.finById(id);
        if (optionalUser.isPresent()) {
            service.remove(id);
            redirect.addFlashAttribute("success", "El usuario: " + optionalUser.get().getName() + " se ha ELIMINADO con éxito!");
            return "redirect:/users";
        }
        redirect.addFlashAttribute("error", "El usuario con el id: " + optionalUser.get().getId() + " no existe en el sistema");
        return "redirect:/users";
    }
}
