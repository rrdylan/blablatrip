package com.formation.blablatrip.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
 //extends permet de récup /admin -> ex: /admin/utilisateur
public class AdminUtilisateurController
        extends AdminBaseController {

    @GetMapping("/utilisateur")
    public String index(Model model){
        model.addAttribute("content", "utilisateur/index.html");
        return "admin/index.html";
    }
}
