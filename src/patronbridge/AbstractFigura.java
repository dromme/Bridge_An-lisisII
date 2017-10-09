/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge;
import interfaces.IColor;

/**
 *
 * @author Meli
 */
public abstract class AbstractFigura {
    protected IColor icolor;

    public AbstractFigura(IColor icolor) {
        this.icolor = icolor;
    }
    public abstract void dibujar();
    
}
