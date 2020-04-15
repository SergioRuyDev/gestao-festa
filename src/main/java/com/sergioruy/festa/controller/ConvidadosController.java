package com.sergioruy.festa.controller;

import com.sergioruy.festa.model.Convidado;
import com.sergioruy.festa.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

    @Autowired
    private ConvidadosRepository convidadosRepository;


    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("/ListaConvidados");
        modelAndView.addObject("convidados", convidadosRepository.findAll());
        modelAndView.addObject(new Convidado());
        return modelAndView;
    }

    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidadosRepository.save(convidado);
        return "redirect:/convidados";
    }

    @DeleteMapping
    public String deletar(Convidado convidado) {
        this.convidadosRepository.delete(convidado);
        return "redirect:/convidados";
    }
}
