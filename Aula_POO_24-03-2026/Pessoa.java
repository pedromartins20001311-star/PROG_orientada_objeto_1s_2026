/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author pedrocosta.borges
 */
public class Pessoa {

    public static void main(String[] args) {
        Pessoa1 p1 = new Pessoa1();
        p1.setNome("Pedro");
        p1.setIdade(19);
        System.out.println("nome:" + p1.getNome() + "sua idade e:" + p1.getIdade());
        p1.getNome();
        
        Pessoa1 p2 = new Pessoa1("Joao silva", 60);
        System.out.println("Nome:" + p2.getNome() + "sua idade e:" + p2.getIdade());
        
        Calculadora c = new Calculadora();
        c.somar(p1.getIdade(), p2.getIdade());
        System.out.println("A soma das idadades é" + c.somar(p1.getIdade(), p2.getIdade()));
        
        
        System.out.println("Soma de dois numeros: " + Calculadora.somar1(65.7, 88));
        
        double[] notas = {10.1, 8.2, 5.2, 7.2, 11.2, 27.1};
        System.out.println("media dos valores é:" + Calculadora.calcularMedia(notas));
    }
    
        
}
