package com.spring.controller;

import com.spring.entity.Livro;
import com.spring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping(value = "/")
    public List<Livro> listar(){
        return livroRepository.findAll();
    }

    @PostMapping(value = "/")
    public String adicionaLivroAutor(@RequestBody Livro livro) {
        livroRepository.save(livro);
        return "redirect:/";
    }
}