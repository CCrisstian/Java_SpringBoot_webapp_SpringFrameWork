package com.ccristian.springboot.springmvc.app.controllers;

import com.ccristian.springboot.springmvc.app.entities.User;
import com.ccristian.springboot.springmvc.app.services.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/users")
@SessionAttributes({"user"})
public class UserController {

    private final UserService service;

    public UserController(UserService service) { /*Para inyectar de forma automática UserService*/
        this.service = service;
    }

    // Mapea las solicitudes GET que se hacen a las rutas "/view" y "/another" a este método.
    @GetMapping({"/view", "/another"})
    public String view(Model model) {
        model.addAttribute("title", "1 - Spring Boot - MVC");
        model.addAttribute("message", "Esta es una aplicación de ejemplo usando Spring Boot!!!");
        model.addAttribute("user", new User("Cristian", "Cirstaldo"));
        return "view";
    }
    //El valor retornado por el método mapeado con @GetMapping, debe ser el nombre de la vista que se va a renderizar.
    //En Spring Boot con Thymeleaf, el valor retornado es el nombre de la plantilla (sin la extensión .html)


    /*URL para visualizar el proyecto http://localhost:8080/ o http://localhost:8080*/
    @GetMapping
    public String list(Model model) {
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", service.findAll());
        return "list";
    }

    @GetMapping("/form")    /*El formulario (form) se 'visualiza' con el método Get*/
    public String form(Model model) {
        model.addAttribute("title", "Crear Usuario");
        model.addAttribute("user", new User());
        return "form";
    }

    @GetMapping("/form/{id}")   /*form se 'visualiza' con el método Get pero en este caso con el objetivo de 'editar'*/
    public String form(@PathVariable Long id, Model model, RedirectAttributes redirect) {

        Optional<User> optionalUser = service.finById(id);

        if (optionalUser.isPresent()) {
            model.addAttribute("title", "EDITAR Usuario");
            model.addAttribute("user", optionalUser.get());
            return "form";
        } else {
            redirect.addFlashAttribute("error",
                    "El usuario con el id: " + id + " NO EXISTE en la Base de Datos");
            return "redirect:/users";
        }
    }

    @PostMapping    /*El formulario (form) se 'maneja' con el método Post*/
    public String form(@Valid User user, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("title", "Validando Formulario");
            return "form";
        }

        String message = user.getId() != null && user.getId() > 0 ?
                "El usuario: " + user.getName() + " se ha ACTUALIZADO con éxito!"
                :"El usuario: " + user.getName() + " se ha CREADO con éxito!";

        service.save(user);
        status.setComplete();
        redirect.addFlashAttribute("success", message);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {

        Optional<User> optionalUser = service.finById(id);

        if (optionalUser.isPresent()) {
            service.remove(id);
            redirect.addFlashAttribute("success",
                    "El usuario: " + optionalUser.get().getName() + " se ha ELIMINADO con éxito!");
            return "redirect:/users";
        }

        redirect.addFlashAttribute("error",
                "El usuario con el id: " + optionalUser.get().getId() + " NO EXISTE en el sistema");
        return "redirect:/users";
    }
}
