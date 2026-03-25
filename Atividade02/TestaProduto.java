/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade02;

/**
 *
 * @author pedrocosta.borges
 */
public class TestaProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto("Monitor 72", 900, 10);
        Produto p2 = new Produto("Placa de video 9080", 800, 10);
        Produto p3 = new Produto("Garrafa", 5, 15);
        
        
        p1.exbirInformacoes();
        System.out.println("********************************");
        p2.exbirInformacoes();
        System.out.println("********************************");
        p3.exbirInformacoes();
        System.out.println("********************************");
        
        p1.adicionarAoEstoque(10);
        p1.exbirInformacoes();
        System.out.println("********************************");
        p2.adicionarAoEstoque(12);
        p2.exbirInformacoes();
        System.out.println("********************************");
        p3.adicionarAoEstoque(33);
        p3.exbirInformacoes();
        System.out.println("********************************");
        
        p1.removerDoEstoque(8);
        p1.exbirInformacoes();
        System.out.println("********************************");
        p2.removerDoEstoque(11);
        p2.exbirInformacoes();
        System.out.println("********************************");
        p3.removerDoEstoque(7);
        p3.exbirInformacoes();
        System.out.println("********************************");
        
    }
}
