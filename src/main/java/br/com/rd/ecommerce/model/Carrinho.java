package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_carrinho")
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carrinho;

    @Column(name="dt_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtPedido;

    @NotNull
    @Column(name="nr_frete")
    private BigDecimal frete;

    @NotNull
    @Column(name="nr_total_compra")
    private BigDecimal total_compra;

    @NotNull
    @Column(name="ds_forma_pagamento")
    private String formaPagamento;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "carrinho")
    List<ItemCarrinho> itensCarrinho;
}
