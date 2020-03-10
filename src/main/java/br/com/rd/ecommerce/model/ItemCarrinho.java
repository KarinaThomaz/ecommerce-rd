package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_carrinho_item")
public class ItemCarrinho {

    @Id
    @Column(name="id_item")
    private Long idItem;

    @Column(name="vl_produto")
    private BigDecimal valor;

    @Column(name="vl_frete")
    private BigDecimal frete;

    @Column(name="nr_quantidade")
    private Integer quantidade;


//    @JoinColumn(name="id_produto")
    //private Produto idProduto;

    @ManyToOne
    @JoinColumn(name="carrinho")
    private Carrinho carrinho;
}
