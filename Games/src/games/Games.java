package games;

import nest.Humano;
import nest.MosterAgua;

public class Games {

    public static void main(String[] args) {
        nest.MosterAgua nesi = new MosterAgua();
        nest.Humano pepe = new Humano("Pepe");
        nest.MonsterFuego pac = new nest.MonsterFuego();
        nest.Humano pez = new Humano("Pez");
        
        System.out.println(nesi);
        System.out.println(pepe);
        
        nesi.Atacar(pepe);
        pepe.Atacar(nesi);
        
        System.out.println(pepe);
        System.out.println(nesi);
        
        pac.Comer(pez);
        pac.Comer(pepe);
        pac.digerir();
        pac.verEstomago();
        
        System.out.println(pez);
        System.out.println(pepe);
        
        pez = pepe;
        
        System.out.println(pez);
        System.out.println(pepe);
        
        nesi.Atacar(pepe);
        nesi.Atacar(pez);
        
        System.out.println(pepe);
        
        
        
        
    }
    
}
