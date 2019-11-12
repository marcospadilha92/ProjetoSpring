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

    private LivroRepository livroRepository;

    @Autowired
    public LivroController( LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @GetMapping
    public List<Livro> listar(){
        return livroRepository.findAll();
    }

    @PostMapping(value = "/")
    public String adicionaLivroAutor(@PathVariable("autor") String autor, Livro livro) {
        livro.setAutor(autor);
        livroRepository.save(livro);
        return "redirect:/";
    }
}