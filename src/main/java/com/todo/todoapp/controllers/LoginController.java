package com.todo.todoapp.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Página de login
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam String username, @RequestParam String password, Authentication authentication, RedirectAttributes redirectAttributes) {
        // Puedes agregar lógica de validación aquí, si es necesario

        // Redirigir al dashboard después de un login exitoso
        if (authentication.isAuthenticated()) {
            return "redirect:/dashboard"; // Redirige a dashboard
        } else {
            redirectAttributes.addFlashAttribute("error", "Credenciales incorrectas");
            return "redirect:/login"; // Redirige de vuelta al login si la autenticación falla
        }
    }
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Página del dashboard
    }
}
