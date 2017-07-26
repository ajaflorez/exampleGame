package malos;

import java.util.Random;

public class MonsterAgua extends Monster implements Runnable{

    public MonsterAgua() {
        super();
    }
    public MonsterAgua(int velocidad) {
        super(velocidad);
    }
    
    
    @Override
    public void run() {
        int aleatorio;
        // Creo un objeto Random para generar numeros aleatorio entre 0 y 10
        Random ran = new Random();
        
        try {
            for(int i =  0; i < 10; i++) {
                // llamo al siguiente numero aleatorio
                avanzar();
                Thread.sleep(1000 / getVelocidad());               
                
                System.out.println(this);
                
            }            
        }
        catch(Exception e) {        }        
    }

    @Override
    public void Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
