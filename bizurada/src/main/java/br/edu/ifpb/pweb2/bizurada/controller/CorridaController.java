package br.edu.ifpb.pweb2.bizurada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.bizurada.services.CorridaService;

@Controller
@RequestMapping("/corrida")
public class CorridaController {

    @Autowired
    private CorridaService corridaService;
    
    @GetMapping
    public ModelAndView listAll(ModelAndView model) {
        model.addObject("corridas", corridaService.findAll());
        model.setViewName("corridas/list");
        return model;
    }
}