package com.backboot.start.controller;
import com.backboot.start.models.CategoriaModel;
import com.backboot.start.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("categorias")
    public List<CategoriaModel> getCategoria () {
        return categoriaRepository.findAll();
    }

    @GetMapping("categorias/{id}")
    public List<CategoriaModel> getCategoriaPorId (@PathVariable(value="id") Long id) {
        return categoriaRepository.findAllById(Collections.singleton(id));
    }

    @DeleteMapping("categorias/excluir/{id}")
    public Boolean deleteCategoriaPorId (@PathVariable(value="id") Long id) {
        categoriaRepository.deleteById(id);
        return true;
    }

    @PostMapping("categorias/inserir")
    public CategoriaModel salvarProduto(@RequestBody CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }

    @PutMapping("categorias/update")
    public CategoriaModel atualizaProduto(@RequestBody CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }

    @GetMapping("categorias/nome/{descricao}")
    public CategoriaModel getCategoriaPorDescricao (@PathVariable(value="descricao") String descricao) {
        return categoriaRepository.findByDescricao(descricao);
    }
}
