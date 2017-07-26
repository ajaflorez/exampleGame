/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author juan
 */
public class KeyEscucha extends KeyAdapter {
    Robot robot;

    public KeyEscucha(Robot robot) {
        this.robot = robot;
    }
    
    

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP) 
            this.robot.moveUp();
        if(key == KeyEvent.VK_DOWN) 
            this.robot.moveDown();
        if(key == KeyEvent.VK_LEFT) 
            this.robot.moveLeft();
        if(key == KeyEvent.VK_RIGHT) 
            this.robot.moveRight();
        
    }
    
    
}
