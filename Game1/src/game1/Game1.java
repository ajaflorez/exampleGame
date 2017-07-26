package game1;

import malos.MonsterAgua;
import malos.MonsterFuego;

public class Game1 {

    public static void main(String[] args) {
        MonsterAgua agua = new MonsterAgua(5);
        agua.start();
        
        MonsterAgua agua2 = new MonsterAgua(3);
        agua2.start();
        
        MonsterAgua agua3 = new MonsterAgua(1);
        agua3.start();
        
        MonsterFuego fuego = new MonsterFuego();
        fuego.girarIzquierda();
        fuego.start();
        
        MonsterFuego fuego2 = new MonsterFuego();
        fuego2.girarDerecha();
        fuego2.start();
        /*agua.avanzar(10);
        agua.girarDerecha();
        agua.avanzar(10);
        agua.retroceder(10);*/

        
    }
    
}
