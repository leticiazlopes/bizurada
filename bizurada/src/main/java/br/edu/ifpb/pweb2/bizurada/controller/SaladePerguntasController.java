package br.edu.ifpb.pweb2.bizurada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaladePerguntasController {
    @RequestMapping("/sala-de-perguntas")
    public String showHomePage() {
        return "saladeperguntas";
    }

}
