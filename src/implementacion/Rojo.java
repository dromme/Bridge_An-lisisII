/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import interfaces.IColor;

/**
 *
 * @author Meli
 */
public class Rojo implements IColor{

    @Override
    public void pintar() {
        System.out.println("Pintando rojo");
    }
    
}
