package com.backboot.start.controller;
import com.backboot.start.models.CategoriaModel;
import com.backboot.start.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("/categorias")
    public List<CategoriaModel> listaCategoria () {
        return categoriaRepository.findAll();
    }
}
