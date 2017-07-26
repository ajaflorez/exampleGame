package my.tdl.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import my.project.gop.main.GameWindow;
import my.project.gop.main.IDGameLoop;
import my.project.gop.main.SpriteSheet;
import my.tdl.gameloop.GameLoop;

public class Main {
    
    public static void main(String[] args) {
        GameWindow frame = new GameWindow("TheDlooter", 1280, 720);
        frame.setFullScreen(0);
        frame.add(new GameLoop(1280, 700));
        frame.setVisible(true);
        
    
    }
    
}
