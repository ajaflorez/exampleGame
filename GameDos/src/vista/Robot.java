/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author juan
 */
public class Robot {
    Image image;
    private int ejeX;
    private int ejeY;
    public Robot() {
        ImageIcon icoRobot = new ImageIcon(this.getClass().getResource("/image/robot1.png"));
        image = icoRobot.getImage();        
        ejeX = 100;
        ejeY = 100;
    }
    public void paint(Graphics g) {
        g.drawImage(image, ejeX, ejeY, null);
    }
    public void moveUp() {
        ejeY-=5;
    }
    public void moveDown() {
        ejeY+=5;
    }
    public void moveLeft() {
        ejeX-=5;
    }
    public void moveRight() {
        ejeX+=5;
    }
    
    
}
