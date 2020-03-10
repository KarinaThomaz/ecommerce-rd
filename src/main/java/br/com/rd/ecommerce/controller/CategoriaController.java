package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Categoria;
import br.com.rd.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping("/create-categoria")
    public Categoria save(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    @GetMapping("/find-categoria/list")
    public List<Categoria> find() {
        return categoriaRepository.findAll();
    }
}
