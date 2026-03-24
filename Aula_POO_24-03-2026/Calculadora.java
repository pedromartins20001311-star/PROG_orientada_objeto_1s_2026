/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author pedrocosta.borges
 */
public class Calculadora {
   public int somar(int a, int b){
       return a + b;
   }
   
   public int somar(int a, int b, int c){
       return a + b + c;
   }
   
   public double somar(double a, double b){
       return a + b;
   }
   public static int somar1(double a, int b){
       return (int) (a + b);
       
       

        
    
   }
    public static double calcularMedia(double[] valores){
        double soma = 0;
        for(double valor : valores){
            soma += valor;
        }
        
        return soma / valores.length;
        
    }
    
    
}