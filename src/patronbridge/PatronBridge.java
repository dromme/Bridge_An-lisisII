/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge;

import implementacion.Circulo;
import implementacion.Negro;
import implementacion.Rojo;

/**
 *
 * @author Meli
 */
public class PatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFigura figura = new Circulo(new Negro());
        figura.dibujar();
        figura.icolor = new Rojo();
        figura.dibujar();
    }

}
