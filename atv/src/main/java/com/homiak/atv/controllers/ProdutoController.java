package com.homiak.atv.controllers;

import com.homiak.atv.models.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.homiak.security.service.ProdutoService;
import java.util.List;

@RequestMapping(path = "/produtos")
@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }

    @PostMapping
    public ProdutoModel criarPessoa(@RequestBody ProdutoModel produtoModel){
        return produtoService.criarPessoa(produtoModel);
    }

}