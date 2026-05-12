/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author pedro da costa
 */
public abstract class ProvaUniversidade {

    protected double av1;
    protected double av2;
    protected double av3;

    protected double pesoAV1;
    protected double pesoAV2;
    protected double pesoAV3;

    protected double mediaMinima;

    protected boolean realizouProvaFinal;

    protected double media;

    // CONSTRUTOR
    public ProvaUniversidade(double av1, double av2, double av3) {

        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    // MÉTODO ABSTRATO
    public abstract double calcularMedia();

    // MÉTODO ABSTRATO
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    // VERIFICA APROVAÇÃO
    public boolean aprovado() {

        return media >= mediaMinima;
    }

    // RETORNA MÉDIA
    public double getMedia() {

        return media;
    }
    }
