package com.employee.managerBackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "welcome"; // Restituisce la vista `welcome.html` dalla cartella `src/main/resources/templates`.
    }
}
