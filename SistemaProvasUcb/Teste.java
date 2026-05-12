/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova.teste;
import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;

public class Teste {

    public static void main(String[] args) {

        // OBJETO UCB
        ProvaUCB ucb = new ProvaUCB(8, 7, 9);

        ucb.calcularMedia();

        System.out.println("===== UCB =====");

        System.out.println("Média: " + ucb.getMedia());

        if (ucb.aprovado()) {

            System.out.println("Aluno aprovado");

        } else {

            System.out.println("Aluno reprovado");
        }

        System.out.println();

        // OBJETO FAFIFO
        ProvaFafifo fafifo = new ProvaFafifo(5, 4, 8);

        fafifo.calcularMedia();

        System.out.println("===== FAFIFO =====");

        System.out.println("Média: " + fafifo.getMedia());

        if (fafifo.aprovado()) {

            System.out.println("Aluno aprovado");

        } else {

            System.out.println("Aluno reprovado");
        }
    }
}