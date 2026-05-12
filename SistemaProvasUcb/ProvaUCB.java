/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author pedro da costa
 */
public class ProvaUCB extends ProvaUniversidade {
    
    public ProvaUCB(double av1, double av2, double av3) {

        super(av1, av2, av3);

        this.pesoAV1 = 1;
        this.pesoAV2 = 1;
        this.pesoAV3 = 1;

        this.mediaMinima = 7;
    }

    @Override
    public double calcularMedia() {

        media = (av1 + av2 + av3) / 3;

        return media;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {

        return null;
    }
}
