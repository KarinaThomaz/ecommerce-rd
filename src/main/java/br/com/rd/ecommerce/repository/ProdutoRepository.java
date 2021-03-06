package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.Categoria;
import br.com.rd.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByTitulo (String titulo);
    List<Produto> findByFabricante(String fabricante);
    List<Produto> findByDescricao(String descricao);
    List<Produto> findByCor(String cor);
    List<Produto> findByValor(Double valor);
    List<Produto> findByCategoria (Categoria categoria);
}
