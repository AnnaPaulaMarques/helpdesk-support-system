package com.soulcode.Projeto.Spring.HelpDesk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String mostrarPaginaInicial() {
        return "index"; // Isso renderizará o arquivo index.html localizado em resources/templates
    }
}

