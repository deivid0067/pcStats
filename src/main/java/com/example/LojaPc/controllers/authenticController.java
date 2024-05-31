package com.example.LojaPc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LojaPc.models.User;
import com.example.LojaPc.services.UserService;

@Controller

public class authenticController {
    @Autowired
    UserService service;

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro.html";
    }

    @PostMapping("/cadastro")
    public String cadastroUsuario(@RequestParam String name,
            @RequestParam String username,
            @RequestParam String email, 
            @RequestParam String password,
            @RequestParam String confirm) {

            User user = new User();
            user.setNome(name);
            user.setUsuario(username);
            user.setEmail(email);
            user.setSenha(new BCryptPasswordEncoder().encode(password));
            service.save(user);

        return "redirect:/login";
    }

}
