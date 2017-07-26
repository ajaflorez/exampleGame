package actor;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import vista.AreaGame;

public class Robot {
    private Image image;
    private int ejeX;
    private int ejeY;
    private float levelLive;
    private float levelAtack;
    private float levelDefense;
    private AreaGame areaGame;
    private Rectangle rectangle;
    private ArrayList<Monster> monsters;

    public Robot(AreaGame areaGame, ArrayList<Monster> monsters) {
        this.ejeX = areaGame.getMinX() + 50;
        this.ejeY = areaGame.getMinY() + 50;
        this.areaGame = areaGame;
        this.monsters = monsters;
        this.getImage();
    }
    public Robot(int ejeX, int ejeY, AreaGame areaGame, ArrayList<Monster> monsters) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.areaGame = areaGame;
        this.monsters = monsters;
        getImage();
    }
    
    public void getImage() {
        ImageIcon icono = new ImageIcon(this.getClass().getResource("/image/robot.png"));
        image = icono.getImage();
        rectangle = new Rectangle(ejeX, ejeY, image.getWidth(null), image.getHeight(null));
    }
    public void paint(Graphics g) {
        g.drawImage(image, ejeX, ejeY, null);
    }
    public void moveUp() {
        if(!ifCollision(this.ejeX, this.ejeY - 3)) {
            if(this.ejeY >= areaGame.getMinY() + 5) {
                this.ejeY-=3;
                rectangle.setLocation(ejeX, ejeY);
            }
        }
    }
    public void moveDown() {
        if(!ifCollision(this.ejeX, this.ejeY + 3)) {
            if(this.ejeY <= areaGame.getMaxY()) {
                this.ejeY+=3;
                rectangle.setLocation(ejeX, ejeY);
            }
        }
    }
    public void moveRight() {
        if(this.ejeX <= areaGame.getMaxX() && !ifCollision(this.ejeX + 3, this.ejeY)) {
            this.ejeX+=3;
            rectangle.setLocation(ejeX, ejeY);
        }
            
    }
    public void moveLeft() {
        if(this.ejeX >= areaGame.getMinX() + 5 && !ifCollision(this.ejeX - 3, this.ejeY)) {
            this.ejeX-=3;
            rectangle.setLocation(ejeX, ejeY);
        }
            
    }

    public int getEjeX() {
        return ejeX;
    }
    public int getEjeY() {
        return ejeY;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    private boolean ifCollision(int ejeX, int ejeY) {
        Rectangle tmp = new Rectangle(ejeX, ejeY, rectangle.width, rectangle.height);
        for(int i = 0; i < monsters.size(); i++) {
            if(tmp.intersects(monsters.get(i).getRectangle())) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
