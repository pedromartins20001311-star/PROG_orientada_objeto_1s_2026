/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author pedro da costa
 */
public abstract class ProvaFinalUniversidade {
    

    protected double notaFinal;
    protected double pesoFinal;

    protected boolean realizouProva;
    

    protected ProvaUniversidade provaUniversidade;

    public ProvaFinalUniversidade(ProvaUniversidade provaUniversidade) {

        this.provaUniversidade = provaUniversidade;
    }

    public abstract boolean habilitadoRealizarProva();
}



