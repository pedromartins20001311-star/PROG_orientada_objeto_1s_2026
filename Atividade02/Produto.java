/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02;

/**
 *
 * @author pedrocosta.borges
 */
public class Produto {
    private String name;
    private double price;
    private int quantEstoque;
    
    public Produto(String name, double price, int quant){
        this.name = name;
        this.price = price;
        this.quantEstoque = quant;
    }
    public void exbirInformacoes(){
        System.out.println("Nome do produto: "  + name);
        System.out.println("Preco do produto: "  + price);
        System.out.println("Quantidade do produto: "  + quantEstoque);
    }
    
    public void adicionarAoEstoque(int quant){
        quantEstoque += quant;
        
    }
    
    public void removerDoEstoque(int quant){
        quantEstoque -= quant;
    }
}
