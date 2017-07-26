package actor;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import vista.AreaGame;

public abstract class Monster {
    private Image image;
    private int ejeX;
    private int ejeY;
    private float levelLive;
    private float levelAtack;
    private float levelDefense;
    private AreaGame areaGame;
    private Robot robot;
    private String url;
    private Rectangle rectangle;
    public static ArrayList<Monster> monsters;
    
    public Monster(AreaGame areaGame, Robot robot, String url) {
        this.ejeX = areaGame.getMaxX() - 50;
        this.ejeY = areaGame.getMaxY() - 50;
        this.areaGame = areaGame;
        this.robot = robot;
        this.url = url;
        getImage(url);
    }
    public Monster(int ejeX, int ejeY, AreaGame areaGame, Robot robot, String url) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.areaGame = areaGame;
        this.robot = robot;
        this.url = url;
        getImage(url);
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public void getImage(String url) {
        ImageIcon icono = new ImageIcon(this.getClass().getResource(url));
        image = icono.getImage();
        rectangle = new Rectangle(ejeX, ejeY, image.getWidth(null), image.getHeight(null));
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
    
    public void paint(Graphics g) {
        g.drawImage(image, ejeX, ejeY, null);
    }
    
    public void perseguir() {
        System.out.println(rectangle);
        System.out.println(robot.getRectangle());
        
            if(robot.getEjeX() > ejeX) {
                if(!ifCollision(this.ejeX + 2, this.ejeY))
                    ejeX += 2;
            }                
            else if(robot.getEjeX() < ejeX) {
                if(!ifCollision(this.ejeX - 2, this.ejeY))
                    ejeX -= 2;
            }                

            if(robot.getEjeY() > ejeY)  {
                if(!ifCollision(this.ejeX, this.ejeY + 2))
                    ejeY += 2;
            }
                
            else if(robot.getEjeY() < ejeY)
                if(!ifCollision(this.ejeX, this.ejeY - 2))
                    ejeY -= 2;       
            
            rectangle.setLocation(ejeX, ejeY);
        
    }

    private boolean ifCollision(int ejeX, int ejeY) {
        Rectangle tmp = new Rectangle(ejeX, ejeY, rectangle.width, rectangle.height);
        for(int i = 0; i < monsters.size(); i++) {
            if(!monsters.get(i).equals(this))
                if(tmp.intersects(monsters.get(i).getRectangle()))
                    return true;
        }
        return tmp.intersects(robot.getRectangle());
    }
    

    
    
}
