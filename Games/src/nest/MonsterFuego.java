
package nest;

import java.util.ArrayList;

public class MonsterFuego extends Monster {
    
    ArrayList<Humano> estomago;

    public MonsterFuego() {
        estomago = new ArrayList();        
    }   
    
    @Override
    public void Atacar(Humano human) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Comer(Humano human) {
        human.setEstado(estadoLife.DIGERIDO);
        estomago.add(human);
    }
    public void digerir() {
        Humano tmp;
        float descuento;
        for(int i=0; i < estomago.size();i++) {
            tmp = estomago.get(i);
            descuento = this.getLevelAtack() * 1 / tmp.getLevelDefense();
            tmp.setLevelLife(tmp.getLevelLife() - descuento);  
        }
    }
    
    public void verEstomago() {        
        for(int i=0; i < estomago.size();i++) {
            System.out.println(estomago.get(i));
        }       
        
    }
    
}
