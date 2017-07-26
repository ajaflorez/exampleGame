/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actor;

import vista.AreaGame;

/**
 *
 * @author sistemas-16
 */
public class MonsterTierra extends Monster{

    public MonsterTierra(AreaGame areaGame, Robot robot) {
        super(areaGame, robot, "/image/monster2.png");
    }

    public MonsterTierra(int ejeX, int ejeY, AreaGame areaGame, Robot robot) {
        super(ejeX, ejeY, areaGame, robot, "/image/monster2.png");
    }
    
   
    
}
