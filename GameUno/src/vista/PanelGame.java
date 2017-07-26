
package vista;

import actor.Monster;
import actor.MonsterAgua;
import actor.MonsterFuego;
import actor.MonsterTierra;
import actor.Robot;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import listener.KeyEscuchaRobot;

public class PanelGame extends JPanel {
    Robot robot;        
    Monster monster1;
    Monster monster2;
    Monster monster3;
    
    Timer timer;
    AreaGame areaGame;
    ArrayList<Monster> monsters;
    
    Image imgMonster;
    // CONSTANTES
    static int DELAY = 50;
    
    
    public PanelGame() {
        this.setBackground(Color.BLACK);
        areaGame = new AreaGame(0, 0, 640, 450);
        monsters = new ArrayList<Monster>();
        Monster.monsters = monsters;
               
        
        robot = new Robot(areaGame, monsters);  
        monster1 = new MonsterAgua(areaGame, robot);
        monster2 = new MonsterFuego(300, 250, areaGame, robot);
        monster3 = new MonsterTierra(200, 250, areaGame, robot);
        
        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
        
        KeyEscuchaRobot keyEscucha = new KeyEscuchaRobot(robot);
        this.addKeyListener(keyEscucha);
        
        timer = new Timer(DELAY, new ActionListener() {
            // Aqui se coloca el contenido del Juego
            @Override
            public void actionPerformed(ActionEvent e) {
                monster1.perseguir();
                monster2.perseguir();
                monster3.perseguir();
                repaint();
            }
        });

        timer.start();
        this.setFocusable(true);    // Establece el focus al objeto actual        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        robot.paint(g);        
        monster1.paint(g);
        monster2.paint(g);
        monster3.paint(g);
        
    }
    
    
}




