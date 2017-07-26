/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nest;

/**
 *
 * @author sistemas-16
 */
public class MosterAgua extends Monster {

    @Override
    public void Atacar(Humano human) {
        float descuento;
        descuento = this.getLevelAtack() * 1 / human.getLevelDefense();
        human.setLevelLife(human.getLevelLife() - descuento);        
    }

    @Override
    public void Comer(Humano human) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
