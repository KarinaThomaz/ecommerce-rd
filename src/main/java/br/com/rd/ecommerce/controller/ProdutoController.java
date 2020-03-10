package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Produto;
import br.com.rd.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/create-produto")
    public Produto save(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @GetMapping("/find-produto/list")
    public List<Produto> find(){
    return produtoRepository.findAll();
    }
}
