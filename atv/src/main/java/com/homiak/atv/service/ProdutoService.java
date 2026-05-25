package com.homiak.security.service;

import com.homiak.atv.models.ProdutoModel;
import com.homiak.atv.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel criarPessoa(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }
}