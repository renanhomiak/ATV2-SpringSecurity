package com.homiak.atv.controllers;

import com.homiak.atv.models.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.homiak.security.service.ProdutoService;
import java.util.List;

@RequestMapping(path = "/produtos")
// Define a rota base "/produtos" para todos os endpoints da classe.

@RestController
// Define a classe como um controlador REST para receber requisições HTTP.
public class ProdutoController {

    @Autowired
    // Injeta automaticamente uma instância do serviço na classe.
    private ProdutoService produtoService;

    @GetMapping
    // Mapeia requisições HTTP GET para este metodo
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }

    @PostMapping
    // Mapeia requisições HTTP POST para este metodo
    public ProdutoModel criarPessoa(@RequestBody ProdutoModel produtoModel){
        return produtoService.criarPessoa(produtoModel);
    }

}