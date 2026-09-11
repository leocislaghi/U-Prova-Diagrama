package com.sistemaavaliacao.cadastroproduto.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProdutoTeste {

    @Test
    public void deveCalcularLucroAlimento() {
        Produto produto = new Produto("Arroz", 100, 2, "Alimento");

        assertEquals(15, produto.calcularPercentualLucro());
    }

    @Test
    public void deveCalcularLucroEletrico() {
        Produto produto = new Produto("Chuveiro", 100, 2, "Elétrico");

        assertEquals(25, produto.calcularPercentualLucro());
    }

    @Test
    public void deveCalcularLucroAutomotivo() {
        Produto produto = new Produto("Óleo", 100, 2, "Automotivo");

        assertEquals(30, produto.calcularPercentualLucro());
    }

    @Test
    public void deveCalcularLucroLimpeza() {
        Produto produto = new Produto("Detergente", 100, 2, "Limpeza");

        assertEquals(20, produto.calcularPercentualLucro());
    }

    @Test
    public void deveCalcularLucroOutros() {
        Produto produto = new Produto("Caderno", 100, 2, "Outros");

        assertEquals(10, produto.calcularPercentualLucro());
    }

    @Test
    public void deveCalcularPrecoVendaAlimento() {
        Produto produto = new Produto("Arroz", 100, 2, "Alimento");

        assertEquals(115, produto.calcularPrecoVenda());
    }

    @Test
    public void deveCalcularPrecoVendaEletrico() {
        Produto produto = new Produto("Chuveiro", 200, 2, "Elétrico");

        assertEquals(250, produto.calcularPrecoVenda());
    }

    @Test
    public void deveCalcularPrecoVendaAutomotivo() {
        Produto produto = new Produto("Óleo", 100, 2, "Automotivo");

        assertEquals(130, produto.calcularPrecoVenda());
    }

    @Test
    public void deveCalcularPrecoVendaLimpeza() {
        Produto produto = new Produto("Detergente", 50, 2, "Limpeza");

        assertEquals(60, produto.calcularPrecoVenda());
    }

    @Test
    public void deveCalcularPrecoVendaOutros() {
        Produto produto = new Produto("Caderno", 100, 2, "Outros");

        assertEquals(110, produto.calcularPrecoVenda());
    }

    @Test
    public void deveCalcularValorTotal() {
        Produto produto = new Produto("Arroz", 100, 3, "Alimento");

        assertEquals(345, produto.calcularValorTotal());
    }

    @Test
    public void deveRetornarNome() {
        Produto produto = new Produto("Arroz", 100, 3, "Alimento");

        assertEquals("Arroz", produto.getNome());
    }

    @Test
    public void deveRetornarPrecoCusto() {
        Produto produto = new Produto("Arroz", 100, 3, "Alimento");

        assertEquals(100, produto.getPrecoCusto());
    }

    @Test
    public void deveRetornarQuantidade() {
        Produto produto = new Produto("Arroz", 100, 3, "Alimento");

        assertEquals(3, produto.getQuantidade());
    }

    @Test
    public void deveRetornarCategoria() {
        Produto produto = new Produto("Arroz", 100, 3, "Alimento");

        assertEquals("Alimento", produto.getCategoria());
    }
}