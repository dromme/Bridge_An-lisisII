/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import interfaces.IColor;
import patronbridge.AbstractFigura;

/**
 *
 * @author Meli
 */
public class Circulo extends AbstractFigura {

    public Circulo(IColor icolor) {
        super(icolor);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo...");
        icolor.pintar();
    }

}
