/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import patronbridge.AbstractFigura;
import interfaces.IColor;

/**
 *
 * @author Meli
 */
public class Rectangulo extends AbstractFigura {

    public Rectangulo(IColor icolor) {
        super(icolor);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo...");
        icolor.pintar();
    }

  

    
}
