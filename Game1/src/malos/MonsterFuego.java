package malos;

public class MonsterFuego extends Monster implements Runnable{
    
    @Override
    public void run() {
        try {
            for(int i=0;i <15;i++) {
                retroceder(1);
                Thread.sleep(100);
                System.out.println(this);
            }
        }
        catch(Exception e) {}
        
    }

    @Override
    public void Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
