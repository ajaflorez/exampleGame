package actor;

import vista.AreaGame;

public class MonsterFuego extends Monster{

    public MonsterFuego(AreaGame areaGame, Robot robot) {
        super(areaGame, robot, "/image/monster1.png");
    }

    public MonsterFuego(int ejeX, int ejeY, AreaGame areaGame, Robot robot) {
        super(ejeX, ejeY, areaGame, robot, "/image/monster1.png");
    }
    
   
    
}
