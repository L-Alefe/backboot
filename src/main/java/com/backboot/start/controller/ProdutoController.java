package com.backboot.start.controller;

import com.backboot.start.models.ProdutoModel;
import com.backboot.start.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("produtos")
    public List<ProdutoModel> getProduto () {
        return produtoRepository.findAll();
    }
}
