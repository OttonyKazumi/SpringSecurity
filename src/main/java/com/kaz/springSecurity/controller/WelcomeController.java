package com.kaz.springSecurity.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "htt p://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST}) // Aplica CORS para todos os métodos desse controlador
public class WelcomeController {

    @GetMapping("/public")
    public String publico() {
        return "Acesso publico";
    }

    @GetMapping("/user")
    public String user() {
        return "Authorize USER";
    }

    @GetMapping("/adm")
    public String adm() {
        return "Authorize ADM";
    }

}
