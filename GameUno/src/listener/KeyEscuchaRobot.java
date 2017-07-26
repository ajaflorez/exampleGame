package listener;

import actor.Robot;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEscuchaRobot extends KeyAdapter{
    Robot robot;

    public KeyEscuchaRobot(Robot robot) {
        this.robot = robot;
    }   

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP)
            robot.moveUp();
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            robot.moveDown();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            robot.moveRight();
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            robot.moveLeft();
    }
    
    
    
}
