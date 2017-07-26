package actor;

import vista.AreaGame;

public class MonsterAgua extends Monster{

    public MonsterAgua(AreaGame areaGame, Robot robot) {
        super(areaGame, robot, "/image/monster.png");
    }

    public MonsterAgua(int ejeX, int ejeY, AreaGame areaGame, Robot robot) {
        super(ejeX, ejeY, areaGame, robot,"/image/monster.png");
    }


    
}
